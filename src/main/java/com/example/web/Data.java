package com.example.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@lombok.Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Data implements Serializable {
    private String dbHost;
    private String dbUser;
    private String dbPwd;
    private String msg;
}
