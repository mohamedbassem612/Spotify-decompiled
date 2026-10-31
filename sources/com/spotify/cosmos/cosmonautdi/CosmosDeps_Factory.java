package com.spotify.cosmos.cosmonautdi;

import p.jly0;
import p.kly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CosmosDeps_Factory implements jly0 {
    private final jly0 ioSchedulerProvider;
    private final jly0 jsonProvider;
    private final jly0 rxRouterProvider;
    private final jly0 subscriptionTrackerProvider;

    private CosmosDeps_Factory(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4) {
        this.ioSchedulerProvider = jly0Var;
        this.subscriptionTrackerProvider = jly0Var2;
        this.rxRouterProvider = jly0Var3;
        this.jsonProvider = jly0Var4;
    }

    public static CosmosDeps_Factory create(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4) {
        return new CosmosDeps_Factory(jly0Var, jly0Var2, jly0Var3, jly0Var4);
    }

    public static CosmosDeps newInstance(kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4) {
        return new CosmosDeps(kly0Var, kly0Var2, kly0Var3, kly0Var4);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CosmosDeps m1270get() {
        return newInstance(this.ioSchedulerProvider, this.subscriptionTrackerProvider, this.rxRouterProvider, this.jsonProvider);
    }
}
