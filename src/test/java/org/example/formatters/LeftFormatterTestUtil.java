package org.example.formatters;

import org.example.formatters.IFormatter;
import org.example.formatters.LeftFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftFormatterTestUtil {

    @Test
    void FormattingLeftWithLimit10(){
        IFormatter formatter = new LeftFormatter();
        var text = "This text should be left aligned ";
        var expectedResult = "This text\nshould be\nleft\naligned";
        var result = formatter.format(text, 10);
        assertEquals(expectedResult, result);
    }

    @Test
    void FormattingLeftWithLimit20(){
        IFormatter formatter = new LeftFormatter();
        var text = "This text should be left aligned ";
        var expectedResult = "This text should be\nleft aligned";
        var result = formatter.format(text, 20);
        assertEquals(expectedResult, result);
    }

}