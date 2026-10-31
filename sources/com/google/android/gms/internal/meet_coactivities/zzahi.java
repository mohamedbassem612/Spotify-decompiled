package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzahi implements zzaex {
    final zzabe zza;
    private final zzaev zzb;

    public zzahi(zzabe zzabeVar, zzaev zzaevVar) {
        dm5.n(!zzabeVar.zzj(), "error must not be OK");
        this.zza = zzabeVar;
        this.zzb = zzaevVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyn
    public final zzyj zzc() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaex
    public final zzaeu zzd(zzaac zzaacVar, zzzw zzzwVar, zzwe zzweVar, zzwr[] zzwrVarArr) {
        return new zzahh(this.zza, this.zzb, zzwrVarArr);
    }
}
