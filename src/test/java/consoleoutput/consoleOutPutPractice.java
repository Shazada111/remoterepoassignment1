package consoleoutput;

public class consoleOutPutPractice {
    public static void main(String[] args) {

        System.out.print("10%\r");
        //ConsoleOutput.sleep(2);
        System.out.print("20%\r");
        //ConsoleOutput.sleep(2);
        System.out.print("30%\r");
        //ConsoleOutput.sleep(2);
        System.out.print("40%\r");
        //ConsoleOutput.sleep(2);
        System.out.print("50%\r");
    }
        public static void sleep ( int second){
            try {
                Thread.sleep(second * 1000);
            } catch (InterruptedException ignore) {
            } // Ignore.
        }
    }

