package com.readOperation;

import com.data.vo.FlightInfo;

import java.util.Collection;

/**
 * Created by kumararv on 29/11/17.
 */
public interface ReadIO {
    Collection<FlightInfo> readData(String path);
}
