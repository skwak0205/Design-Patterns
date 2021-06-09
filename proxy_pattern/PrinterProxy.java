package proxy_pattern;

public class PrinterProxy implements PrintableSubject{
    private String name;
    private PrinterRealSubject real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if(real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public synchronized void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize(){
        if(real == null) {
            real = new PrinterRealSubject(name);
        }
    }
}
