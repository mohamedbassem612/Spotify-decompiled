package com.spotify.mobius.runners;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class ImmediateWorkRunner implements WorkRunner {
    public boolean a;

    @Override // com.spotify.mobius.disposables.Disposable
    public final synchronized void dispose() {
        this.a = true;
    }

    @Override // com.spotify.mobius.runners.WorkRunner
    public final synchronized void post(Runnable runnable) {
        if (this.a) {
            return;
        }
        runnable.run();
    }
}
