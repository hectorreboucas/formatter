package org.example.formatters;

import org.example.formatters.IFormatter;
import org.example.formatters.RightFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightFormatterTestUtil {

    @Test
    void FormattingRightWithLimit10(){
        IFormatter formatter = new RightFormatter();
        var text = "This text should be right aligned ";
        var expectedResult = " This text\n should be\n     right\n   aligned";
        var result = formatter.format(text, 10);
        assertEquals(expectedResult, result);
    }

    @Test
    void FormattingRightWithLimit20(){
        IFormatter formatter = new RightFormatter();
        var text = "This text should be right aligned ";
        var expectedResult = " This text should be\n       right aligned";
        var result = formatter.format(text, 20);
        assertEquals(expectedResult, result);
    }

}