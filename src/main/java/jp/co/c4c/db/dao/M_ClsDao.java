package jp.co.c4c.db.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.co.c4c.db.dto.M_ClsDto;
import jp.sf.amateras.mirage.SqlManager;
import jp.sf.amateras.mirage.SqlResource;
import jp.sf.amateras.mirage.StringSqlResource;

@Component
public class M_ClsDao {

    @Autowired
    public SqlManager sqlManager;

    public List<M_ClsDto> selectAll() {
        final SqlResource sqlSrc = new StringSqlResource("select * from " + M_ClsDto.TBL + " order by cls_id asc;");
        return sqlManager.getResultList(M_ClsDto.class, sqlSrc);
    }

}
