package com.spotify.mobius.android;

import com.spotify.mobius.Init;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class MobiusAndroid {
    public static MobiusLoop.Controller a(MobiusLoop.Factory factory, Object obj) {
        return Mobius.c(factory, obj, MainThreadWorkRunner.a());
    }

    public static MobiusLoop.Controller b(MobiusLoop.Factory factory, Object obj, Init init) {
        return Mobius.b(factory, obj, init, MainThreadWorkRunner.a());
    }
}
