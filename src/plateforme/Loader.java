package plateforme;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import appli.data.IDescription;
import plugins.DescriptionPlugins;

public class Loader {

    private static Loader loader = null;
    private String repertoireConfig;

    private final ArrayList<IDescription> lstDescPlugins;

    /**
     * Dés la construction du Loader, on charge la liste de toutes les
     * descriptions de plugins founies
     */
    private Loader() {
        this.lstDescPlugins = new ArrayList<>();
    }

    public static Loader getInstance() {
        if (loader == null) {
            loader = new Loader();
        }
        return loader;
    }

    /**
     * Charge la liste de toutes les descriptions de plugins à partir des
     * fichier de config présent dans le répertoire config
     */
    public void loadPluginsDescriptions() {
        File file = new File(repertoireConfig);
        // on récupère tous les fichiers
        File[] files = file.listFiles();
        if (files != null) {
            //pour chaque fichier, on charge une nouvelle description de plugons que l'on ajoute à la liste
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

    /**
     * On récupère les descriptions des plugins qui respecte la contrainte
     * passée en paramètre
     *
     * @param contrainte Class ?
     * @return ArrayList IDescription  
     */
    public ArrayList<IDescription> getPluginsDescriptions(Class<?> contrainte) {
        ArrayList<IDescription> lstPluginDescriptions = new ArrayList<>();
        for (IDescription iDesc : this.lstDescPlugins) {
            if (contrainte.getName().equals(iDesc.getDescContrainte())) {
                lstPluginDescriptions.add(iDesc);
            }

        }
        return lstPluginDescriptions;
    }

    /**
     * Charge un plugins particulier à partir de sa description
     *
     * @param desc IDescription
     * @return Object
     */
    public Object getPlugin(IDescription desc) {
        Object o = null;
        try {

            Class<?> cl = Class.forName(desc.getDescClasse());
            Class<?> contrainte = Class.forName(desc.getDescContrainte());
            if (contrainte.isAssignableFrom(cl)) {
                o = cl.newInstance();
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return o;

    }

    public void setRepertoireConfig(String repertoireConfig) {
        this.repertoireConfig = repertoireConfig;
    }
    
    
}
