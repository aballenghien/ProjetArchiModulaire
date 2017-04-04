package plateforme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Loader {
//	public static Object getPlugin(String filename, ArrayList<Class<?>> contrainte) throws FileNotFoundException,
//			IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//		// charger le fichier
//		Properties p = new Properties();
//		InputStream is = new FileInputStream(filename);
//		p.load(is);
//		ArrayList<Object> listeobjet = new ArrayList<Object>();
//		// cr�er le beans
//		String valeur = p.getProperty("class");
//		String[] test = valeur.split(";");
//		for (String s : test) {
//
//			Class<?> cl = Class.forName(s);
//			for (Class<?> classe : contrainte) {
//
//				if (classe.isAssignableFrom(cl)) {
//					Object o = cl.newInstance();
//					listeobjet.add(o);
//
//				}
//
//			}
//		}
//
//		return listeobjet;
//	}
}
