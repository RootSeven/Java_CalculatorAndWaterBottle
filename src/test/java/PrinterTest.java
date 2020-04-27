import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer = new Printer();

    @Test
    public void numberOfSheets(){
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void canPrintCopies() {
        printer.printCopies( 2, 5 );
        assertEquals( 90, printer.getNumberOfSheets() );
    }

    @Test
    public void doesNotRunIfInsufficientPaper() {
        printer.printCopies( 200, 5 );
        assertEquals( 100, printer.getNumberOfSheets() );
    }

    @Test
    public void canGetTonerVolume() {
        assertEquals( 3000, printer.getToner() );
    }

    @Test
    public void canReduceToner() {
        printer.printCopies(1, 5);
        assertEquals( 2995, printer.getToner());
    }

}
