package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzamf implements Runnable {
    final /* synthetic */ zzami zza;

    public /* synthetic */ zzamf(zzami zzamiVar, zzame zzameVar) {
        this.zza = zzamiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzami zzamiVar = this.zza;
        zzamg zzamgVar = null;
        if (!zzamiVar.zzf) {
            zzamiVar.zzg = null;
            return;
        }
        long jZzk = zzamiVar.zzk();
        long j = zzamiVar.zze - jZzk;
        zzami zzamiVar2 = this.zza;
        if (j > 0) {
            zzamiVar2.zzg = zzamiVar2.zza.schedule(new zzamh(zzamiVar2, zzamgVar), zzamiVar2.zze - jZzk, TimeUnit.NANOSECONDS);
            return;
        }
        zzamiVar2.zzf = false;
        this.zza.zzg = null;
        this.zza.zzc.run();
    }
}
