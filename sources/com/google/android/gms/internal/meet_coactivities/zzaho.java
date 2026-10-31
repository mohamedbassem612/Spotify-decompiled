package com.google.android.gms.internal.meet_coactivities;

import p.cwl1;
import p.dm5;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
class zzaho extends zzaan {
    private final zzaan zza;

    public zzaho(zzaan zzaanVar) {
        dm5.s(zzaanVar, "delegate can not be null");
        this.zza = zzaanVar;
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zza, "delegate");
        return rl1VarR0.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public final String zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public final void zzb() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public void zzd(zzaaj zzaajVar) {
        this.zza.zzd(zzaajVar);
    }
}
