package plateforme;

import appli.data.IDescription;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import plugins.DescriptionPlugins;

public class Loader {

    private static Loader loader = null;
    private final String NOM_REPERTOIRE = "D:\\DOCUMENTS\\DEVELOPPEMENT\\NET BEANS\\Projet_Architecture_modulaire\\src\\appli\\config";
    private final ArrayList<IDescription> lstDescPlugins;

    private Loader() {
        this.lstDescPlugins = new ArrayList<>();
    }

    public static Loader getInstance() {
        if (loader == null) {
            loader = new Loader();
        }
        return loader;
    }

    private void loadPluginsDescriptions() {
        File file = new File(NOM_REPERTOIRE);
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                Properties p = new Properties();
                try {
                    InputStream is = new FileInputStream(f);
                    p.load(is);
                    String nom = p.getProperty("nom");
                    String contrainte = p.getProperty("contrainte");
                    String classe = p.getProperty("class");
                    DescriptionPlugins desc = new DescriptionPlugins(nom, classe, contrainte);
                    this.lstDescPlugins.add(desc);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    public ArrayList<IDescription> getPluginsDescriptions(Class<?> contrainte) {
        ArrayList<IDescription> lstPluginDescriptions = new ArrayList<>();
        for (IDescription iDesc : this.lstDescPlugins) {
            Class<?> cl;
            try {
                
// TODO éviter d(utiliser des Class.forName dans cette fonction, comparer le nom complet 
// du paramètre en entrée avec la contrainte de description, si bon instancier la bonne valeur

// TODO déplacer le classForName de la classe dans la fonction getPlugin (à la limite plus besoin de l'attribut classe 
// dans la description
                cl = Class.forName(iDesc.getDescContrainte());
                if (contrainte.isAssignableFrom(cl)) {
                    iDesc.setContrainte(cl);
                    iDesc.setClasse(Class.forName(iDesc.getDescClasse()));
                    lstPluginDescriptions.add(iDesc);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lstPluginDescriptions;
    }

    public Optional<Object> getPlugin(IDescription desc) {
        Object o = null;
        if(desc.getContrainte().isAssignableFrom(desc.getClasse())){
            try {                
                o = desc.getClasse().newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Optional.ofNullable(o);
        
    }
}
