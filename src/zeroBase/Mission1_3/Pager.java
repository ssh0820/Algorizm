package zeroBase.Mission1_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Pager {

    final long pageUnit = 10;
    final long pageSize = 10;

    long pageNo;

    public Pager(long pageCount) {
        pageNo = (long) Math.ceil(pageCount/pageUnit);
    }

    public String html(long pageIndex) throws IOException {

        int pageindex = (int)(Math.ceil(pageIndex / pageUnit));

        int temp = (int) Math.ceil(pageIndex/pageSize);
        int startPage = (temp-1)*10 + 1;
        int lastPage = temp*10;

        StringBuilder sb = new StringBuilder();
        String result = "";

        sb.append("<a href='javascript:void(0);'>[처음]</a>\n").append("<a href='javascript:void(0);'>[이전]</a>\n\n");

        for (int i= startPage; i <= lastPage; i++) {
            if (i == pageNo + 1) {
                break;
            } else if (i == pageindex) {
                sb.append("<a href='javascript:void(0);' class='on'>").append(i).append("</a>\n");
            } else {
                sb.append("<a href='javascript:void(0);'>").append(i).append("</a>\n");
            }
        }
        sb.append("<a href='javascript:void(0);'>[다음]</a>\n").append("<a href='javascript:void(0);'>[마지막]</a>\n");

        result = sb.toString();
        htmlDoc(result);

        return result;
    }

    public void htmlDoc(String str) throws IOException{
        File file = new File("pagenation.html");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        " <head>\n" +
                        " <title>document</title>\n" +
                        " <style>\n" +
                        " .on {color:red}\n" +
                        " </style>\n" +
                        " </head>\n" +
                        " <body>\n" +
                        str +
                        " </body>\n" +
                        "</html>\n"
        );

        writer.close(); //까먹으면 html 파일에 내용 안 써지는구나
    }
}



