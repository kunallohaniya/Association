import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ProcessBasedMultitasking {
    public static void main(String[] args) {
        try{
//            process 1
            ProcessBuilder processBuilder1 = new ProcessBuilder("echo", "Hello form Process 1");
            Process process1 = processBuilder1.start();
            printProcessOutput(process1);
//            process 2
            ProcessBuilder processBuilder2 = new ProcessBuilder("echo", "Hello from Process 2");
            Process process2 = processBuilder2.start();
            printProcessOutput(process2);

        } catch (Exception e) {
            e.printStackTrace();
    }
}

    private static void printProcessOutput(Process process) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
