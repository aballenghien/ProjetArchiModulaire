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
            if (contrainte.getName().equals(iDesc.getDescClasse())) {
                lstPluginDescriptions.add(iDesc);
            }

        }
        return lstPluginDescriptions;
    }

    public Optional<Object> getPlugin(IDescription desc) {
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
        return Optional.ofNullable(o);

    }
}
