package com.spring.experiments.service;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;
import com.spring.experiments.service.response.VerifyTokenResponse;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AuthService {

    public VerifyTokenResponse verifyToken(String email, String token)
            throws FirebaseAuthException {

        FirebaseAuth auth = FirebaseAuth.getInstance();
        System.out.println(auth);
        System.out.println(token);
        // token comes from the client app (shown above)
        FirebaseToken decodedToken = auth.verifyIdToken(token);
        System.out.println(decodedToken);

        if (decodedToken == null) {
            throw new IllegalArgumentException("Token null");
        }

        String tokenEmail = decodedToken.getEmail();
        if (!tokenEmail.equals(email)) {
            throw new IllegalArgumentException("This token is not valid for the given email");
        }

        String issuer = decodedToken.getIssuer();
        String name = decodedToken.getName();
        String uid = decodedToken.getUid();
        boolean isEmailVerified = decodedToken.isEmailVerified();
        Map<String, Object> claims = decodedToken.getClaims();

        return new VerifyTokenResponse(email, issuer, name, uid, isEmailVerified, claims);
    }
}
