/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaskzalbanii;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leszek
 */
public class Radio 
{
    List<StacjaRadiowa> listaStacji = new ArrayList<>();
    StacjaRadiowa aktualnaStacja;
    int stacjaGrajaca;
    void wlacz()
    {
        System.out.println("Radioone wlaczone, gra muzyka");
        this.aktualnaStacja = listaStacji.get(0);
        this.stacjaGrajaca = 0;
    }
    void wylacz()
    {
        System.out.println("Wylaczam radio");
    }
    void zmien_stacje()
    {
        this.stacjaGrajaca++;
        if ( this.stacjaGrajaca>8) this.stacjaGrajaca = 0;
        this.aktualnaStacja = listaStacji.get(stacjaGrajaca);
        System.out.println("Teraz gra:" + this.aktualnaStacja.nazwa + "Na czestotliwosci " + this.aktualnaStacja.czestotliwosc);
    }
    void zapisz_stacje(StacjaRadiowa stacja)
    {
        listaStacji.add(stacja);
    }
    void usun_stacje()
    {
        listaStacji.remove(stacjaGrajaca);
    }
    public Radio()
    {
        StacjaRadiowa stacja;
        stacja = new StacjaRadiowa("Radio1",100.0);
        this.zapisz_stacje(stacja);
        stacja = new StacjaRadiowa("Radio1",100.0);
        this.zapisz_stacje(stacja);
        stacja = new StacjaRadiowa("Radio2",101.0);
        this.zapisz_stacje(stacja);
        stacja = new StacjaRadiowa("Radio3",87.0);
        this.zapisz_stacje(stacja);
        stacja = new StacjaRadiowa("Radio4",108.0);
        this.zapisz_stacje(stacja);
        stacja = new StacjaRadiowa("Radio5",103.70);
        this.zapisz_stacje(stacja);
    }

    Object listaStacji(StacjaRadiowa aktualnaStacja) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
