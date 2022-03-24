import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        int paddingNumber = length - 1;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            boolean charFlag = true;
            paddingNumber -= 1;
            for (int j = 0; j < i + length; j++) {
                if (paddingNumber >= j) {
                    sb.append(" ");
                } else {
                    if (charFlag) {
                        sb.append("*");
                        charFlag = false;
                    } else {
                        sb.append(" ");
                        charFlag = true;
                    }
                }
            }
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
