/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOp;

import java.awt.geom.Path2D;

/**
 *
 * @author DELL
 */
public class PolyRestok extends PolymorphysmSubtotal{
    Integer hargabeli;
    Integer Qty;
    public PolyRestok(int hargabeli, Integer Qty){
        this.hargabeli = hargabeli;
        this.Qty = Qty;
    }

    public PolyRestok(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int restokpoly(){
        return this.hargabeli * this.Qty;
    }
    
}
