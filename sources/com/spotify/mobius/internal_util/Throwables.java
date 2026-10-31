package com.spotify.mobius.internal_util;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class Throwables {
    public static void a(Exception exc) {
        if (!(exc instanceof RuntimeException)) {
            throw new RuntimeException(exc);
        }
        throw ((RuntimeException) exc);
    }
}
