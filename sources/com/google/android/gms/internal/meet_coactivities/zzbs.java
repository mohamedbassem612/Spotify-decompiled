package com.google.android.gms.internal.meet_coactivities;

import p.bhn0;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzbs extends zzbz {
    private zzca zza;
    private zzl zzb;
    private zzc zzc;

    @Override // com.google.android.gms.internal.meet_coactivities.zzbz
    public final zzbz zza(zzc zzcVar) {
        this.zzc = zzcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzbz
    public final zzbz zzb(zzl zzlVar) {
        this.zzb = zzlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzbz
    public final zzbz zzc(zzca zzcaVar) {
        if (zzcaVar != null) {
            this.zza = zzcaVar;
            return this;
        }
        bhn0.i("Null state");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzbz
    public final zzcb zzd() {
        if (this.zza != null) {
            return new zzbt(this.zza, this.zzb, this.zzc, null);
        }
        eg.m("Missing required properties: state");
        return null;
    }
}
