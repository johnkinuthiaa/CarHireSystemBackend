package com.carhire.carhire.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtService{
    String secretKey ="46d87a775499780c0b910a00b495a657f48f73020ffcfd415e3963f8e99733192c6afc7ae5c9bd71e06e415b7be868d8fcf189294ad2ddb8b9621dd10626d3e1f4c63deefaf3d0d16501c475dc5ec194a1e043aa82c488725281eff74c7e3b85ce14bac55ed04c70d83b460f981aa917bba7bb392b54aabfc04a9c4be4e3fc0fcad258ab7898d3feef4874e55ec77cef88d1d54afe927fbb82f65fc77d80c3b68808b8d49e1a533f0e1203f31332b944eda343525710dfff54ae0b89091446897bdd8f7244b954eaec4997611a9f3eca8c036b8226abeed628c198633b33c861e2ece558cf34b5aadbbbc27c29a1782552768e692aad71fc5bea3ceb34f81f43";
    Long EXPIRATIONTIME =340000000L;

    public String generateToken(String username){
        Map<String,Object> claims =new HashMap<>();
        return Jwts.builder()
                .claims()
                .add(claims)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis()+EXPIRATIONTIME))
                .and()
                .signWith(generateSecretKey())
                .compact();
    }

    private SecretKey generateSecretKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }


}