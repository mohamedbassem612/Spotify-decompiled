package com.spotify.mobius.android.runners;

import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class MainThreadWorkRunner extends LooperWorkRunner {
    private MainThreadWorkRunner() {
        super(Looper.getMainLooper());
    }

    public static MainThreadWorkRunner a() {
        return new MainThreadWorkRunner();
    }
}
