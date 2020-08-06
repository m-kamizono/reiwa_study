package jp.co.c4c.db.dto;

/**
 * クラスマスター Dtoクラス
 */
public class M_ClsDto {

    public static final String TBL = "M_CLS";

    /** クラスID */
    private int clsId;
    /** クラス名 */
    private String clsName;

    /**
     * クラスIDを取得する
     * @return クラスID
     */
    public int getClsId() {
        return clsId;
    }
    /**
     * クラスIDを設定する
     * @param clsId クラスID
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
