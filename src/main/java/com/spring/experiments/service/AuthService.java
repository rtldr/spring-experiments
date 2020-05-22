package com.spring.experiments.service;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;
import com.spring.experiments.service.request.VerifyTokenRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String verifyToken(String email, VerifyTokenRequest tokenRequest)
            throws FirebaseAuthException {
        String token = tokenRequest.getToken();

        // idToken comes from the client app (shown above)
        FirebaseToken decodedToken = FirebaseAuth.getInstance().verifyIdToken(token);
        String uid = decodedToken.getUid();
        return null;
    }
}
