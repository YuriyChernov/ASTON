import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppData {
    private static String[] header;
    private static int[][] data;

    public AppData load(String fileName) {
        AppData data = new AppData();


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String headerLine = reader.readLine();
            String[] header = headerLine.split(";");
            data.setHeader(header);

            String line;
            int rowIndex = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                int[] row = new int[parts.length];
                for (int i = 0; i < parts.length; i++) {
                    row[i] = Integer.parseInt(parts[i]);
                }
                getData()[rowIndex] = row;
                rowIndex++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void setHeader(String[] header) {
        AppData.header = header;
    }

    public void setData(int[][] data) {
        AppData.data = data;
    }

    public static String[] getHeader() {
        return header;
    }

    public static int[][] getData() {
        return data;
    }
}
