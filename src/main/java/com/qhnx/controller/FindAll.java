package com.qhnx.controller;


import com.qhnx.dao.ITranRecordDao;
import com.qhnx.dao.impl.TranRecordDaoImpl;
import com.qhnx.model.monitor;

import net.sf.json.JSONArray;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@EnableAutoConfiguration

public class FindAll {

    private  Logger logger = Logger.getLogger(FindAll.class);
    private static ITranRecordDao e = new TranRecordDaoImpl();


    @RequestMapping("/findAll")

    public String findAll() {

        List<monitor> list = e.findAll();
        JSONArray json = JSONArray.fromObject(list);

        logger.debug("Controller findAll jsonToString:"+json.toString());
        return json.toString();
    }




}
