package com.qhnx.dao.impl;

import com.qhnx.Config.DruidUtils;
import com.qhnx.dao.ITranRecordDao;
import com.qhnx.model.monitor;

import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import java.sql.SQLException;

import java.util.List;

public class TranRecordDaoImpl implements ITranRecordDao {


    /**
     * 查找所有
     *
     * @return
     */

    @Override

    public List<monitor> findAll() {

        QueryRunner runner = new QueryRunner(DruidUtils.getDataSource());
        List<monitor>  list = null;

        try {
            /**
             * db2:
             */
            //String SQL = "SELECT ROW_NUMBER() OVER (order by ID asc) AS rn,monitor.* from (SELECT ROW_NUMBER() OVER (order by ID desc) AS rn,tab.* from (SELECT * FROM TRANREC_MONITOR) tab fetch first 100 rows only ) monitor";
            /**
             * mysql
             */
            String SQL = "SELECT ROW_NUMBER() OVER (order by ID asc) AS rn,monitor.* from (SELECT ROW_NUMBER() OVER (order by ID desc) AS rn,tab.* from (SELECT * FROM TRANREC_MONITOR) tab limit 100 ) monitor";

            list = runner.query(SQL, new BeanListHandler<>(monitor.class));


        } catch (SQLException e) {
            e.printStackTrace();


        }
        return list;

    }

}
