package Glab303132;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo{
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        //Input files
        String[] inputFiles = {"C:\\Users\\edwin.feliz\\projects\\javaProjects\\Javalabs\\src\\Glab303132\\file1.txt",
                "C:\\Users\\edwin.feliz\\projects\\javaProjects\\Javalabs\\src\\Glab303132\\file2.txt"};

        //Files contents will be written in these files
        String outputFile = "C:\\Users\\edwin.feliz\\projects\\javaProjects\\Javalabs\\src\\Glab303132\\OutputExampleTwo.txt";
        //Get channel for output file

        FileOutputStream fos = new FileOutputStream(outputFile);
        WritableByteChannel targetChannel = getWritableByteChannel(fos, inputFiles);

        //finally close the target channel
        targetChannel.close();
        fos.close();
    }

    private static WritableByteChannel getWritableByteChannel(FileOutputStream fos, String[] inputFiles) throws IOException {
        WritableByteChannel targetChannel = fos.getChannel();
        for (String inputFile : inputFiles) {
            //Get channel for input files
            FileInputStream fis = new FileInputStream(inputFile);
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //close the input channel
            inputChannel.close();
            fis.close();
        }
        return targetChannel;
    }
}

