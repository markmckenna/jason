package com.lantopia.jason.test;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author Mark McKenna &lt;mark.mckenna@redspace.com&gt;
 */
public class BasicJsonTests {
    private InputStream stream;

    @Before
    public void readJsonDocument() {
        stream = ClassLoader.getSystemResourceAsStream("basic.json");
    }

    @Test
    public void parseBasicJson() {

    }
}
