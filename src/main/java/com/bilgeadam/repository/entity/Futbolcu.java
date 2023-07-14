package com.bilgeadam.repository.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Futbolcu {
    private Long id;
    private String ad;
    private String mevki;
    private int formaNo;
    private Long deger;
    private Long takim_id;
}
