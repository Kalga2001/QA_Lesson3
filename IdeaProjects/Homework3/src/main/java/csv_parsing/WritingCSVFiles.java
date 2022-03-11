package csv_parsing;


import java.io.FileWriter;

    class WritingCSVFileExample
    {
        public static void main(String[] args) throws Exception
        {
            String csv = "StudentInfo.csv";
            CSVWriter writer = new CSVWriter(new FileWriter(csv));

            //Create record
            String [] record = "4,David,Miller,Australia,30".split(",");
            //Write the record to file
            writer.writeNext(record);

            //close the writer
            writer.close();
        }
    }

