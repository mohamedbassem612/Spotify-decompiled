package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ScheduledExecutorService;
import p.cwl1;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zzapp extends zzyu {
    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(zzf(), "delegate");
        return rl1VarR0.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final zzzb zza(zzyr zzyrVar) {
        return zzf().zza(zzyrVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final zzabm zzb() {
        return zzf().zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final ScheduledExecutorService zzc() {
        return zzf().zzc();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public final void zzd() {
        zzf().zzd();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyu
    public void zze(zzxa zzxaVar, zzzc zzzcVar) {
        throw null;
    }

    public abstract zzyu zzf();
}
