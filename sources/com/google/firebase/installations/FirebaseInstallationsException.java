package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class FirebaseInstallationsException extends FirebaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseInstallationsException(String str) {
        super(str);
        zod.p(str, "Detail message must not be empty");
    }
}
