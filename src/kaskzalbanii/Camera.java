/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaskzalbanii;

/**
 *
 * @author Hejmej
 */
public class Camera {
    
    void wlacz()
    {
        System.out.println("Podgląd włączony");
    }
    
    void record()
    {
        System.out.println("Nagrywam Obraz");
    }
    
    void stop_record()
    {
        System.out.println("Koniec nagrywania obrazu");
    }
    
    Camera_record zapisz()
    {
        Camera_record nagranie = new Camera_record(true);
        System.out.println("Zapisuje nagranie do pliku");
        
        return nagranie;
    }
    void wylacz()
    {
        System.out.println("Podgląd wyłączony");
    }
    
    public Camera()
            {
                
            }
}
