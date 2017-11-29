package com.readOperation.utill;

import com.Validator.checkForAppropriateData;
import com.data.vo.FlightInfo;
import com.readOperation.ReadIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Created by kumararv on 29/11/17.
 */
public class ReadTestFile implements ReadIO{
    @Override
    public Collection<FlightInfo> readData(String path){

        FileInputStream inputStream = null;
        Scanner sc = null;
        List<FlightInfo> list = new ArrayList<>();
        try {
            inputStream = new FileInputStream(path);
            sc = new Scanner(inputStream);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if(checkForAppropriateData.validateString(line)) {
                    FlightInfo flightinfo = new FlightInfo();
                    System.out.println(line);
                    StringTokenizer st = new StringTokenizer(line, "|");
                    List<String> alist = new ArrayList();
                    while (st.hasMoreTokens()) {
                        alist.add(st.nextToken());
                    }
                    flightinfo.setFlight_Status(alist.get(0));
                    flightinfo.setDep_Loc(alist.get(1));
                    flightinfo.setArr_Loc(alist.get(2));
                    flightinfo.setValidTill(alist.get(3));
                    flightinfo.setDeptTime(alist.get(4));
                    flightinfo.setArrivalTime(alist.get(5));
                    flightinfo.setDistasnce(alist.get(6));
                    list.add(flightinfo);
                }
            }
            // note that Scanner suppresses exceptions
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (sc != null) {
                sc.close();
            }
        }
        return list;
    }
}
