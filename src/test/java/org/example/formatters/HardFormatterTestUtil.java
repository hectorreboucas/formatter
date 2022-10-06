package org.example.formatters;

import org.example.formatters.HardFormatter;
import org.example.formatters.IFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HardFormatterTestUtil {

    @Test
    void FormattingHardWithLimit10(){
        IFormatter formatter = new HardFormatter();
        var text = "This is what hard justification looks like.";
        var expectedResult = "This is wh\nat hard ju\nstificatio\nn looks li\nke.";
        var result = formatter.format(text, 10);
        assertEquals(expectedResult, result);
    }
}