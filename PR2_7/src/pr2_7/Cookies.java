/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_7;

/**
 *
 * @author Riles175
 */
public class Cookies {
    
    int _thinMintCount;
    int _samoaCount;
    int _chocolateChipCount;
    
    void setThinMint(int count) { _thinMintCount = count; }
    
    void setSamoa(int count) { _samoaCount = count; }
    
    void setChocolateChip(int count) { _chocolateChipCount = count; }
    
    int getThinMint() { return _thinMintCount; }
    
    int getSamoa() { return _samoaCount; }
    
    int getChocolateChip() { return _chocolateChipCount; }
    
    int thinMintSales() { return _thinMintCount*3; }
    
    int samoaSales() { return _samoaCount*4; }
    
    int chocolateChipSales() { return _chocolateChipCount*5; }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
