package csv_parsing;


import java.io.FileReader;
import java.util.Arrays;

public class OpenCSVExample {
    public static void main(String[] args) throws Exception
    {
        @SuppressWarnings("resource")

        CSVReader reader = new CSVReader(new FileReader("StudentInfo.csv"), ',' , '"' , 1);

        //Read CSV line by line and use the string array as you want
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                //Verifying the read data here
                System.out.println(Arrays.toString(nextLine));
            }
        }
    }
}


}