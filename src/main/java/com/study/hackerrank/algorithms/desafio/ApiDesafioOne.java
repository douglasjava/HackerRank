package com.study.hackerrank.algorithms.desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiDesafioOne {


    public static void main(String[] args) {
        System.out.println(getResult(2011, "Barcelona"));

    }

    private static int getResult(int year, String team) {
        Integer sumInteger = 0;
        try {

            HttpURLConnection con = (HttpURLConnection) new URL("https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team1=" + team + "&page=1").openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
            String linha = br.readLine();
            Integer total1 = Integer.valueOf(linha.split("total_pages")[1].split("[:]")[1].substring(0, 1));
            for (int i = 0; i < total1; i++) {
                con = (HttpURLConnection) new URL("https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team1=" + team + "&page=" + i).openConnection();
                br = new BufferedReader(new InputStreamReader((con.getInputStream())));
                linha = br.readLine();
                for (String s : linha.split(",")) {
                    if (s.contains("team1goals")) {
                        String vl = s.replaceAll("\"", "")
                                .replace("}", "")
                                .replace("]", "").split("[:]")[1];
                        sumInteger += Integer.valueOf(vl);
                    }
                }
            }

            con = (HttpURLConnection) new URL("https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team2=" + team + "&page=1").openConnection();
            br = new BufferedReader(new InputStreamReader((con.getInputStream())));
            linha = br.readLine();
            Integer total2 = Integer.valueOf(linha.split("total_pages")[1].split("[:]")[1].substring(0, 1));
            for (int i = 0; i < total2; i++) {
                con = (HttpURLConnection) new URL("https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team2=" + team + "&page=" + i).openConnection();
                br = new BufferedReader(new InputStreamReader((con.getInputStream())));
                linha = br.readLine();
                for (String s : linha.split(",")) {
                    if (s.contains("team2goals")) {
                        String vl = s.replaceAll("\"", "")
                                .replace("}", "")
                                .replace("]", "").split("[:]")[1];
                        sumInteger += Integer.valueOf(vl);
                    }
                }
            }

        } catch (Exception e) {

        }

        return sumInteger;

    }

}
