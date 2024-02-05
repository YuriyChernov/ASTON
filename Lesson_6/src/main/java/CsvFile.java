import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CsvFile {
    public void save(AppData data, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            String headerLine = String.join(";", AppData.getHeader());
            writer.write(headerLine);
            writer.newLine();

            for (int[] row : AppData.getData()) {
                StringBuilder dataLine = new StringBuilder();
                for (int value : row) {
                    dataLine.append(value).append(";");
                }

                writer.write(dataLine.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AppData data = new AppData();
        data.setHeader(new String[]{"Value1", "Value2", "Value3"});
        data.setData(new int[][]{{100, 200, 300}, {400, 500, 600}});

        CsvFile csvFile = new CsvFile();
        String fileName = "data.csv";
        csvFile.save(data, fileName);
        data.load(fileName);

        System.out.println(Arrays.toString(AppData.getHeader()));
        for (int[] row : AppData.getData()) {
            System.out.println(Arrays.toString(row));
        }
    }
}