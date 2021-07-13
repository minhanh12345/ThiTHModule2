import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteToFile {
    public static void writeFile(String path, List<DanhBa> products) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = "Phone Number,Group, Name, Gender, Address, Date of Birth, Email";
            bufferedWriter.write(str);
            for (DanhBa s : products) {
                bufferedWriter.newLine();
                bufferedWriter.write(s.writes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert bufferedWriter != null;
            bufferedWriter.close();
        }
    }

    public static List<DanhBa> readFile(String path) throws IOException {
        BufferedReader bufferedReader = null;
        List<DanhBa> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line= bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 6) {
                    list.add(new DanhBa(str[0], str[1], str[2], str[3], str[4], str[5], str[6]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert bufferedReader != null;
            bufferedReader.close();
        }
        return list;
    }
}
