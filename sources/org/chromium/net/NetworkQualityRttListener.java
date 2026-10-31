package org.chromium.net;

import java.util.concurrent.Executor;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class NetworkQualityRttListener {
    private final Executor mExecutor;

    public NetworkQualityRttListener(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
        } else {
            eg.m("Executor must not be null");
            throw null;
        }
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onRttObservation(int i, long j, int i2);
}
