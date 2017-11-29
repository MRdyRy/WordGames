/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordGames;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author user
 */
public class WordModel {

    private String soal;
    private String soal2;
    private String hint;
    private String Jawaban;

    public WordModel() {
    }

    public WordModel(String soal, String hint) {
        this.soal2 = soal;
        this.hint = hint;
    }

    public String createSoal() {
        soal2 = soal2.toUpperCase();
        String[] ArraySoal = soal2.split(",");
        Arrays.sort(ArraySoal);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < ArraySoal.length; i++) {
            s.append(ArraySoal[i]);
        }
        String soal = s.toString();
        return soal;
    }
    
    public String shuffleSoal()
    {
        soal2 = soal2.toUpperCase();
        String[]arraySoal = soal2.split("");
        List<String>soalHuruf = Arrays.asList(arraySoal);
        Collections.shuffle(soalHuruf);
        StringBuilder bs = new StringBuilder();
        for (String HurufSoal : soalHuruf) {
            bs.append(HurufSoal);
        }
        return bs.toString();
    }

    
    public boolean cekAnswer()
    {
        boolean isTrue = false;
        if(Jawaban.equalsIgnoreCase(soal2))
            return true;
        return isTrue;
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

    /**
     * @return the Jawaban
     */
    public String getJawaban() {
        return Jawaban;
    }

    /**
     * @param Jawaban the Jawaban to set
     */
    public void setJawaban(String Jawaban) {
        this.Jawaban = Jawaban;
    }

    /**
     * @return the soal2
     */
    public String getSoal2() {
        return soal2;
    }

    /**
     * @param soal2 the soal2 to set
     */
    public void setSoal2(String soal2) {
        this.soal2 = soal2;
    }
}
