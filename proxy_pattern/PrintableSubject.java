package proxy_pattern;

public interface PrintableSubject {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String string);
}
