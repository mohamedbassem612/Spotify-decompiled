package com.google.android.gms.internal.meet_coactivities;

import p.cwl1;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
abstract class zzahl implements zzaew {
    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(zza(), "delegate");
        return rl1VarR0.toString();
    }

    public abstract zzaew zza();

    @Override // com.google.android.gms.internal.meet_coactivities.zzaew
    public void zzd(zzabe zzabeVar, zzaev zzaevVar, zzzw zzzwVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaew
    public final void zze(zzzw zzzwVar) {
        zza().zze(zzzwVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaov
    public final void zzf(zzaou zzaouVar) {
        zza().zzf(zzaouVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaov
    public final void zzg() {
        zza().zzg();
    }
}
