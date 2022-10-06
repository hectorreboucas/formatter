package org.example.formatters;

import org.example.formatters.CenterFormatter;
import org.example.formatters.IFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenterFormatterTestUtil {
    @Test
    void FormattingLeftWithLimit10(){
        IFormatter formatter = new CenterFormatter();
        var text = "This text should be center aligned ";
        var expectedResult = " This text\n should be\n  center  \n  aligned ";
        var result = formatter.format(text, 10);
        assertEquals(expectedResult, result);
    }

    @Test
    void FormattingLeftWithLimit20(){
        IFormatter formatter = new CenterFormatter();
        var text = "This text should be center aligned ";
        var expectedResult = " This text should be\n   center aligned   ";
        var result = formatter.format(text, 20);
        assertEquals(expectedResult, result);
    }
}