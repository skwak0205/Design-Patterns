package proxy_pattern;

public class Main {
    public static void main(String[] args) {
        PrintableSubject p = new PrinterProxy("Simple");

        // 프록시 실행
        System.out.println(p.getPrinterName());

        // realSubject 실행
        p.print("프린트 요청");
    }
}
