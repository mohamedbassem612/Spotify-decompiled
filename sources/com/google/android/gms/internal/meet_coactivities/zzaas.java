package com.google.android.gms.internal.meet_coactivities;

import p.cwl1;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
abstract class zzaas extends zzwj {
    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(zzf(), "delegate");
        return rl1VarR0.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public void zza(String str, Throwable th) {
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzb() {
        zzf().zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzc(int i) {
        zzf().zzc(i);
    }

    public abstract zzwj zzf();
}
