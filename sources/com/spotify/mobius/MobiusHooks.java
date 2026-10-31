package com.spotify.mobius;

import p.k220;
import p.rue0;
import p.vue0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class MobiusHooks {
    public static final rue0 a = vue0.b(MobiusHooks.class);
    public static ErrorHandler b = new k220((byte) 26);

    public interface ErrorHandler {
        void a(RuntimeException runtimeException);
    }
}
