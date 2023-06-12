package zeroBase.Mission1_3;

import java.io.IOException;

public class Practice3 {
    public static void main(String[] args) throws IOException {
        long totalCount = 127;
        long pageIndex = 11;

        Pager pager = new Pager(totalCount);
        System.out.println(pager.html(pageIndex));

    }
}
