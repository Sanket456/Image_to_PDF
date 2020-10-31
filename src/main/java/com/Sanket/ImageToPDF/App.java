package com.Sanket.ImageToPDF;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;

public class App 
{
    public static void main( String[] args )
    {
     Document document = new Document();
     String output = "C:\\Users\\Sanket Sharma\\Pictures\\Saved Pictures\\PDF.pdf";
     
     try
     {
      FileOutputStream fos = new FileOutputStream(output);
      PdfWriter writer =  PdfWriter.getInstance(document, fos);
      writer.open();
      document.open();
      
      Image im = Image.getInstance(new java.net.URL("https://media.comicbook.com/2020/08/naruto-creator-success-1233687.jpeg?auto=webp&width=1200&height=628&crop=1200:628,smart"));
      im.scalePercent(40);
      document.add(Image.getInstance(im));
      document.close();
      writer.close();
      
     }
     catch(Exception e)
     {
    	e.printStackTrace(); 
     }
     
    }
}
