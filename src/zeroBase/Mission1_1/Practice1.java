package zeroBase.Mission1_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice1 {

    public static void main(String[] args) {

        try {
            File file = new File("index.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(
                    "<!DOCTYPE html>\n" +
                            "<html>\n" +
                            "  <head>\n" +
                            "    <meta charset = \"UTF-8\">\n" +
                            "    <style>\n" +
                            "      table {border-collapse:collapse; width:100%}\n" +
                            "      th, td {border:solid 1px #000;}\n" +
                            "    </style>\n" +
                            "    <title>document</title>\n" +
                            "  </head>\n" +
                            "  <body>\n" +
                            "    <h1>자바 환경정보</h1>\n" +
                            "    <table>\n" +
                            "      <thead>\n" +
                            "        <tr>\n" +
                            "          <th>키</th>\n" +
                            "          <th>값</th>\n" +
                            "        </tr>\n" +
                            "      </thead>\n" +
                            "      <tbody>\n"
            );
            StringBuilder sb = new StringBuilder();
            for(Object k : System.getProperties().keySet()) {
                String key = k.toString();
                String value = System.getProperty(key);
                sb.append(
                        "        <tr>\n" +
                        "          <td>" + key + "</td>\n" +
                        "          <td>" + value + "</td>\n" +
                        "        </tr>\n"
                );
            }
            writer.write(sb.toString());
            writer.write(
                    "      </tbody>\n" +
                        "    </table>\n" +
                        "  </body>\n" +
                        "</html>"
            );
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
