package com.google.android.gms.internal.meet_coactivities;

import p.i0c1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzagz implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzaha zzb;

    public zzagz(zzaha zzahaVar, boolean z) {
        this.zza = z;
        this.zzb = zzahaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza) {
            zzahd zzahdVar = this.zzb.zza;
            zzahdVar.zzf = true;
            if (zzahdVar.zzt > 0) {
                i0c1 i0c1Var = zzahdVar.zzv;
                i0c1Var.a = false;
                i0c1Var.a();
            }
        }
        this.zzb.zza.zzA = false;
    }
}
