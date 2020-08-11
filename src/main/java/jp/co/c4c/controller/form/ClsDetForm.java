package jp.co.c4c.controller.form;

/**
 * クラス詳細 Formクラス
 */
public class ClsDetForm {

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
