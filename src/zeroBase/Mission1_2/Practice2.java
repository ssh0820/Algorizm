package zeroBase.Mission1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
        public static void input(int[] coordinate, boolean isMyCo, BufferedReader br) throws IOException {
            String[] xy = {"", ""};
            String[] str = {"", ""};
            int idx = isMyCo ? 0 : 1;
            String inputStr;
            for (int i = 0; i < coordinate.length; i++) {
                System.out.println(str[idx] + "좌표 " + xy[i] + "값을 입력해 주세요.");
                inputStr = br.readLine();
                coordinate[i] = Integer.parseInt(inputStr);
            }
        }
        public static void inputTenCo(int[][] coordinates, int[] myCoordinate, double[] distance, BufferedReader br) throws IOException{

            int cnt = 0;
            int[] temp = new int[2];

            for (int i = 0; i < coordinates.length; i++) {
                while(cnt < i + 1) {
                    System.out.println((cnt + 1) + "/10 번째 입력");
                    input(temp, false, br);

                    boolean check = true;
                    for (int j = 0; j < i; j++) {
                        if(coordinates[j][0] == temp[0] && coordinates[j][1] == temp[1]) {
                            check =false;
                            System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해 주세요.");
                            break;
                        }
                    }
                    if(check) {
                        coordinates[i][0] = temp[0];
                        coordinates[i][1] = temp[1];
                        distance[i] = Math.sqrt(Math.pow(temp[0] - myCoordinate[0], 2) + Math.pow(temp[1] - myCoordinate[1], 2));
                        cnt++;
                    }
                }
            }
        }
        public static void main(String[] args) throws IOException {

            int[] myCoordinate = new int[2];
            int[][] coordinates = new int[10][2];
            double[] distance = new double[10];

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input(myCoordinate, true, br);
            inputTenCo(coordinates, myCoordinate, distance, br);

            double min = Double.MAX_VALUE;
            int idx = -1;
            for (int i = 0; i < distance.length; i++) {
                if(distance[i] < min) {
                    min = distance[i];
                    idx = i;
                }
            }

            for (int i = 0; i < coordinates.length; i++) {
                System.out.printf("(%d, %d) => %.6f\n", coordinates[i][0], coordinates[i][1], distance[i]);
            }
            System.out.println("제일 가까운 좌표:");
            System.out.printf("(%d, %d) => %.6f\n", coordinates[idx][0], coordinates[idx][1], distance[idx]);
        }
}
