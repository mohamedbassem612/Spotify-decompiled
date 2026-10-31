package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ScheduledFuture;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzabl {
    private final zzabj zza;
    private final ScheduledFuture zzb;

    public /* synthetic */ zzabl(zzabj zzabjVar, ScheduledFuture scheduledFuture, zzabk zzabkVar) {
        dm5.s(zzabjVar, "runnable");
        this.zza = zzabjVar;
        dm5.s(scheduledFuture, "future");
        this.zzb = scheduledFuture;
    }

    public final void zza() {
        this.zza.zzb = true;
        this.zzb.cancel(false);
    }

    public final boolean zzb() {
        zzabj zzabjVar = this.zza;
        return (zzabjVar.zzc || zzabjVar.zzb) ? false : true;
    }
}
