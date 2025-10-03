public class EjecutarConverter {
    public static void main(String[] args) {
        
        Converter ASCII = new ASCIIConverter();
        Converter PostScript = new PostScriptConverter();
        Converter PDF = new PDFConverter();
        Converter Word = new WordConverter();

        Reader lector1 = new Reader("LINE", ASCII);
        lector1.parseInput();

        Reader lector2 = new Reader("LINE", PDF);
        lector2.parseInput();

        Reader lector3 = new Reader("PARAGRAPH", PostScript);
        lector3.parseInput();

        Reader lector4 = new Reader("TABLE", Word);
        lector4.parseInput();

    }
}
