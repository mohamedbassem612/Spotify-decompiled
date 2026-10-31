package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzajy extends zzaaj {
    final zzajv zza;
    final zzaan zzb;
    final /* synthetic */ zzakp zzc;

    public zzajy(zzakp zzakpVar, zzajv zzajvVar, zzaan zzaanVar) {
        this.zzc = zzakpVar;
        dm5.s(zzajvVar, "helperImpl");
        this.zza = zzajvVar;
        dm5.s(zzaanVar, "resolver");
        this.zzb = zzaanVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaaj
    public final void zza(zzabe zzabeVar) {
        dm5.n(!zzabeVar.zzj(), "the error status must not be OK");
        zzajw zzajwVar = new zzajw(this, zzabeVar);
        zzabm zzabmVar = this.zzc.zzd;
        zzabmVar.zzc(zzajwVar);
        zzabmVar.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaaj
    public final void zzb(zzaal zzaalVar) {
        zzajx zzajxVar = new zzajx(this, zzaalVar);
        zzabm zzabmVar = this.zzc.zzd;
        zzabmVar.zzc(zzajxVar);
        zzabmVar.zzb();
    }
}
