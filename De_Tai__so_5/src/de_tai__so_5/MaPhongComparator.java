/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

import java.util.Comparator;

/**
 *
 * @author phuon
 */
public class MaPhongComparator implements Comparator<DatPhong>{

   @Override
    public int compare(DatPhong o1, DatPhong o2) {
        return o1.getMaPhong()-o2.getMaPhong();
    }

    
}
