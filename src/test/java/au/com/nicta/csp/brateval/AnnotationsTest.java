package au.com.nicta.csp.brateval;

import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import static au.com.nicta.csp.brateval.Annotations.*;
import static org.junit.Assert.*;

public class AnnotationsTest {

    @org.junit.Test
    public void readWithFile() throws IOException {
        Annotations annotations = new Annotations();

        String fileName = Paths.get("data","CoNLL-ST_2002_train","1234.ann").toString();

        Document document = read(this.getClass().getClassLoader().getResource(fileName).getFile());

        Assert.assertEquals("test","test");

    }

    @org.junit.Test
    public void testRead() {
    }

    @org.junit.Test
    public void testRead1() {
    }

    @org.junit.Test
    public void testRead2() {
    }

    @org.junit.Test
    public void testRead3() {
    }

    @org.junit.Test
    public void write() {
    }
}