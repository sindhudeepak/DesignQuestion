package com.company;

import com.data.vo.FlightInfo;
import com.readOperation.ReadIO;
import com.readOperation.utill.ReadTestFile;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ReadIO io = new ReadTestFile();
        Collection<FlightInfo> test= io.readData("//Users//kumararv//Documents//SAMPLE.txt");
        System.out.println("Size" + test.size());


    }
}
