package com.google.android.gms.internal.meet_coactivities;

import p.cwl1;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
class zzahn extends zzzj {
    private final zzzj zza;

    public zzahn(zzzj zzzjVar) {
        this.zza = zzzjVar;
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zza, "delegate");
        return rl1VarR0.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwf
    public final zzwj zza(zzaac zzaacVar, zzwe zzweVar) {
        return this.zza.zza(zzaacVar, zzweVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwf
    public final String zzb() {
        return this.zza.zzb();
    }
}
