package eindopdracht;
import java.io.BufferedReader;
import java.io.FileReader;                                                      //imports
import java.io.IOException;
import java.util.*;
import javax.swing.JFileChooser;

public class VirusLogica  {
JFileChooser fileChooser;

    public static ArrayList<Virus> inlezen(String PATHWAY){
        ArrayList<Virus> VirusLijst = new ArrayList();                          //aanmaken van de viruslijst
        BufferedReader br = null;
	FileReader fr = null;                                                   //het geopende bestand lezen 
        try{
        fr = new FileReader(PATHWAY);
	br = new BufferedReader(fr);
        String sCurrentLine;
        
	while ((sCurrentLine = br.readLine()) != null) {                        //een loop zodat hij over elke regel gaat, en de gegevens opsplitst en opslaat
            if (sCurrentLine.startsWith("virus")){
                                                                                //eerste line wegvangen
            }
            else{
            String[] array  = sCurrentLine.split("\t",-1);                      //het splitten van de regel
            String b = (array[7]);                                              //het probleem dat er geen host id instaat wegvangen, door lege waardes een 0 te geven
            if (array[7].equals("")){
                b = "0";
            }
            Virus tijdelijk = new Virus(array[0],array[1],array[2],array[3],array[4],array[5],array[6],b,array[8],array[9],array[10],array[11]);        //het aanmaken van een nieuw virus
            VirusLijst.add(tijdelijk);                                          //het nieuwe virus toevoegen in de viruslijst

            }
        }
        } catch (IOException e) {                                               //io erreor wegvangen door een exception
        e.printStackTrace();}
        
        return VirusLijst;
}

    
    
}
