package com.comscore.util;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ObfuscationChecker {
    private static final String a = "com.comscore.util";
    private static final String b = "ObfuscationChecker";

    public boolean isCodeObfuscated() {
        return (a.equals(getClass().getPackage().getName()) && b.equals(getClass().getSimpleName())) ? false : true;
    }
}
