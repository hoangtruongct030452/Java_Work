/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

import java.util.Comparator;

/**
 *
 * @author PC Market
 */
public class SapXepMaHoaDon implements Comparator<HoaDon>{

    @Override
    public int compare(HoaDon o1, HoaDon o2) {
        return o1.getMaHoaDon().compareTo(o2.getMaHoaDon());
    }

 
}
