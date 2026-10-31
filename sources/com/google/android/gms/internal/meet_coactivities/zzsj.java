package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzsj {
    private final Object zza;
    private final int zzb;

    public zzsj(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzsj)) {
            return false;
        }
        zzsj zzsjVar = (zzsj) obj;
        return this.zza == zzsjVar.zza && this.zzb == zzsjVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
