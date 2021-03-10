package com.tests;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadPdf {


    public static void main(String[] args) throws IOException {


        URL url = new URL("http://www.africau.edu/images/default/sample.pdf");

        InputStream is = url.openStream();
        BufferedInputStream fileParse = new BufferedInputStream(is);
        PDDocument document = null;

        document = PDDocument.load(fileParse);
        String pdfContent = new PDFTextStripper().getText(document);
        System.out.println(pdfContent);

        Assert.assertTrue(pdfContent.contains("This is a small demonstration"));
        Assert.assertTrue(pdfContent.contains("And more text"));
        Assert.assertTrue(pdfContent.contains("Continued on page 2"));





    }
}
