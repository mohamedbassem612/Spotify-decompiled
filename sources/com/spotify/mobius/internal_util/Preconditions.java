package com.spotify.mobius.internal_util;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class Preconditions {
    public static void a(Object[] objArr) {
        for (Object obj : objArr) {
            obj.getClass();
        }
    }

    public static void b(Object obj) {
        obj.getClass();
    }
}
