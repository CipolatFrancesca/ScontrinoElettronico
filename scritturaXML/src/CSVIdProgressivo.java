import java.io.*;

public class CSVIdProgressivo {
    int idProgressivo;
    public CSVIdProgressivo(){ }


    File file=new File("E:\\_scontrino\\scritturaXML\\file.csv");

    public int readId()  {
        try {
            FileReader fr=new FileReader(file);
            BufferedReader bf=new BufferedReader(fr);
            String line=bf.readLine();
            idProgressivo=Integer.parseInt(line);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return idProgressivo;
    }

    public void writeId (int line) {
        try {
            FileWriter  fw = new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(line);
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}