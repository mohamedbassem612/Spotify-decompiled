package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Executor;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzajn implements Executor {
    private final zzalf zza;
    private Executor zzb;

    public zzajn(zzalf zzalfVar) {
        dm5.s(zzalfVar, "executorPool");
        this.zza = zzalfVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zza().execute(runnable);
    }

    public final synchronized Executor zza() {
        Executor executor;
        executor = this.zzb;
        if (executor == null) {
            Executor executor2 = (Executor) this.zza.zza();
            dm5.t("%s.getObject()", executor2, this.zzb);
            executor = executor2;
            this.zzb = executor;
        }
        return executor;
    }

    public final synchronized void zzb() {
        Executor executor = this.zzb;
        if (executor != null) {
            this.zza.zzb(executor);
            this.zzb = null;
        }
    }
}
