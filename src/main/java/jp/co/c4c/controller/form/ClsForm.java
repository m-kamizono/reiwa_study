package jp.co.c4c.controller.form;

import java.util.List;

import jp.co.c4c.db.dto.M_ClsDto;

/**
 * クラス詳細 Formクラス
 */
public class ClsForm {

    /** クラスDtoリスト */
    private List<M_ClsDto> clsDtoList;
    /** クラスDto */
    private M_ClsDto clsDto;
    /** クラスID */
    private int clsId;
    /** クラス名 */
    private String clsName;

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
    /**
     * クラスDtoを取得する
     * @return クラスDto
     */
    public M_ClsDto getClsDto() {
        return clsDto;
    }
    /**
     * クラスIDを設定する
     * @param clsDto クラスDto
     */
    public void setClsDto(M_ClsDto clsDto) {
        this.clsDto = clsDto;
    }
    /**
     * クラスIDを取得する
     * @return クラスID
     */
    public int getClsId() {
        return clsId;
    }
    /**
     * クラスIDを設定する
     * @param clsId クラスId
     */
    public void setClsId(int clsId) {
        this.clsId = clsId;
    }
    /**
     * クラス名を取得する
     * @return クラス名
     */
    public String getClsName() {
        return clsName;
    }
    /**
     * クラス名を設定する
     * @param clsName クラス名
     */
    public void setClsName(String clsName) {
        this.clsName = clsName;
    }

}
