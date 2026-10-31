package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzajm implements zzalc {
    final /* synthetic */ zzakp zza;

    public /* synthetic */ zzajm(zzakp zzakpVar, zzajl zzajlVar) {
        this.zza = zzakpVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzalc
    public final zzvz zza(zzvz zzvzVar) {
        return zzvzVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzalc
    public final void zzb(boolean z) {
        zzakp zzakpVar = this.zza;
        zzakpVar.zze.zzc(zzakpVar.zzL, z);
        if (z) {
            this.zza.zzU();
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzalc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzalc
    public final void zzd(zzabe zzabeVar) {
        dm5.z(this.zza.zzN.get(), "Channel must have been shut down");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzalc
    public final void zze() {
        dm5.z(this.zza.zzN.get(), "Channel must have been shut down");
        this.zza.zzO = true;
        this.zza.zzaf(false);
        zzakp.zzP(this.zza);
    }
}
