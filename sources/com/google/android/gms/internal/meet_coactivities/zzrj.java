package com.google.android.gms.internal.meet_coactivities;

import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzrj extends zzrk {
    final /* synthetic */ zzrr zza;
    private int zzb = 0;
    private final int zzc;

    public zzrj(zzrr zzrrVar) {
        this.zza = zzrrVar;
        this.zzc = zzrrVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrm
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        hhg1.k();
        return (byte) 0;
    }
}
