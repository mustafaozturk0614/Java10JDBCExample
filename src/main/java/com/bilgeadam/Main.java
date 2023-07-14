package com.bilgeadam;

import com.bilgeadam.repository.FutbolcuRepository;
import com.bilgeadam.repository.TakimRepository;
import com.bilgeadam.repository.entity.Futbolcu;
import com.bilgeadam.repository.entity.Takim;
import com.bilgeadam.utility.ConnectionProvider;

/*
    futbolAppDb
    --Futbolcu
    --Takım


 */
public class Main {
    public static void main(String[] args) {

        Takim takim= Takim.builder().ad("Beşiktaş").build();
        ConnectionProvider connectionProvider=new ConnectionProvider();
        TakimRepository takimRepository=new TakimRepository(connectionProvider);
        FutbolcuRepository futbolcuRepository=new FutbolcuRepository(connectionProvider);
       takimRepository.save(takim);
        System.out.println(takim);
        Futbolcu futbolcu=Futbolcu.builder().ad("Mustafa").mevki("Defans").formaNo(3).takim_id(takim.getId()).build();
        futbolcuRepository.save(futbolcu);


    }
}