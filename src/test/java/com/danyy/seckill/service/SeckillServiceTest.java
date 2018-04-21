package com.danyy.seckill.service;

import com.danyy.seckill.BaseTest;
import com.danyy.seckill.dto.Exposer;
import com.danyy.seckill.entity.Seckill;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;


public class SeckillServiceTest extends BaseTest{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private SeckillService seckillService;

    @Test
    public void getSeckillList() throws Exception {
        List<Seckill> list = seckillService.getSeckillList();
        logger.info("List={}", list);
    }

    @Test
    public void getById() throws Exception {
        long id = 1000l;
        Seckill seckill = seckillService.getById(id);
        logger.info("seckill={}", seckill);
    }

    @Test
    public void exportSeckillUrl() throws Exception {
        long id = 1000;
        Exposer exposer = seckillService.exportSeckillUrl(id);
        logger.info("exposer={}", exposer);
    }

    @Test
    public void executeSeckill() throws Exception {
    }

    @Test
    public void executeSeckillProcedure() throws Exception {
    }

}