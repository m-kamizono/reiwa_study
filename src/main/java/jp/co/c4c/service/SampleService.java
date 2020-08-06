package jp.co.c4c.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.c4c.db.dao.M_ClsDao;
import jp.co.c4c.db.dto.M_ClsDto;

@Component
public class SampleService {

    @Autowired
    private M_ClsDao m_clsDao;

    @Transactional
    public List<M_ClsDto> getClsDtoList() {
        return m_clsDao.selectAll();
    }

}
