package com.example.sportsshopmanagement;

import java.io.File;

public class DataFile {
    public final static File UserLogin = new File("src/main/file/UserLogin.txt");
    public final static File UserName = new File("src/main/file/UserName.txt");
    public final static File Income = new File("src/main/file/Income.txt");
    public final static File tempFIle = new File("src/main/file/tempFile.txt");

    public static int CutomerNO = 0;
    public static int CutomerBill = 0;

    public static String CustomerName ;
    public static String CustomerPass ;

}
