/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119011.reihanwiyanda.no3;

/**
 *
 * @author Reihan Wiyanda
 */
public class RnB extends MusicGenre implements Jazz, Blues {
    @Override
    public void genreJazz(String artistName) {
        System.out.print("Chad Baker adalah musisi Jazz");
    }
    
    @Override
    public void genreBlues(String artistName) {
        artistName = "Jimmy Hendrik";
        System.out.print(artistName + "adalah musisi Blues");
    }
}
