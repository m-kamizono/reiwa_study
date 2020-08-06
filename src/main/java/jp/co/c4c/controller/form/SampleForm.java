package jp.co.c4c.controller.form;

import java.util.List;

import jp.co.c4c.db.dto.M_ClsDto;

/**
 * サンプル Formクラス
 */
public class SampleForm {

    /** クラスDtoリスト */
    private List<M_ClsDto> clsDtoList;

    /**
     * クラスDtoリストを取得する
     * @return クラスDtoリスト
     */
    public List<M_ClsDto> getClsDtoList() {
        return clsDtoList;
    }
    /**
     * クラスDtoリストを設定する
     * @param clsDtoList クラスDtoリスト
     */
    public void setClsDtoList(List<M_ClsDto> clsDtoList) {
        this.clsDtoList = clsDtoList;
    }

}
