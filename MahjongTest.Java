import java.io.IOException;

import src.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class MahjongTest {

    @BeforeAll
    public static void initParser() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    void testScore(){
        Score scoreOne = new Score(12,'E',true);
        assertEquals(12, scoreOne.getScore());
        assertTrue(scoreOne.getMahjong());
        assertEquals('E',scoreOne.getWind());
    }
} 