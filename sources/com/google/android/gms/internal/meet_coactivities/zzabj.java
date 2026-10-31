package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzabj implements Runnable {
    final Runnable zza;
    boolean zzb;
    boolean zzc;

    public zzabj(Runnable runnable) {
        dm5.s(runnable, "task");
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zzc = true;
        this.zza.run();
    }
}
