package com.google.android.gms.internal.meet_coactivities;

import p.cwl1;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
abstract class zzahm implements zzafa {
    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(zza(), "delegate");
        return rl1VarR0.toString();
    }

    public abstract zzafa zza();

    @Override // com.google.android.gms.internal.meet_coactivities.zzyn
    public final zzyj zzc() {
        return zza().zzc();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaex
    public zzaeu zzd(zzaac zzaacVar, zzzw zzzwVar, zzwe zzweVar, zzwr[] zzwrVarArr) {
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzald
    public final Runnable zze(zzalc zzalcVar) {
        return zza().zze(zzalcVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzald
    public void zzm(zzabe zzabeVar) {
        zza().zzm(zzabeVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzafa
    public final zzvz zzo() {
        return zza().zzo();
    }
}
