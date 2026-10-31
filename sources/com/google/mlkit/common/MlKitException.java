package com.google.mlkit.common;

import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class MlKitException extends Exception {
    public final byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, Exception exc) {
        super(str, exc);
        zod.p(str, "Provided message must not be empty.");
        this.a = (byte) 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MlKitException(String str, int i) {
        super(str);
        zod.p(str, "Provided message must not be empty.");
        this.a = i;
    }
}
