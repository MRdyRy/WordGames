/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordGames;

/**
 *
 * @author user
 */
public class wordModels {
    private String basicWord;
    private String soal;
    private String jawaban;
    private String hint;

    public wordModels() {
    }

    public wordModels(String basicWord,String hint) {
        this.basicWord = basicWord;
        this.hint = hint;
    }

    
    /**
     * @return the basicWord
     */
    public String getBasicWord() {
        return basicWord;
    }

    /**
     * @param basicWord the basicWord to set
     */
    public void setBasicWord(String basicWord) {
        this.basicWord = basicWord;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }

    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }
}
