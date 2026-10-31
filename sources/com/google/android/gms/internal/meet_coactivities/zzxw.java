package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzxw {
    private String zza;
    private zzxx zzb;
    private Long zzc;
    private zzyn zzd;

    public final zzxw zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzxw zzb(zzxx zzxxVar) {
        this.zzb = zzxxVar;
        return this;
    }

    public final zzxw zzc(zzyn zzynVar) {
        this.zzd = zzynVar;
        return this;
    }

    public final zzxw zzd(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    public final zzxz zze() {
        dm5.s(this.zza, "description");
        dm5.s(this.zzb, "severity");
        dm5.s(this.zzc, "timestampNanos");
        return new zzxz(this.zza, this.zzb, this.zzc.longValue(), null, this.zzd, null);
    }
}
