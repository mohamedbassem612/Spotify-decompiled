package com.google.android.gms.internal.meet_coactivities;

import p.cy30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzmd implements zzll {
    private final zzll zza;
    private final Object zzb;

    private zzmd(zzll zzllVar, Object obj) {
        zzpj.zza(zzllVar, "log site key");
        this.zza = zzllVar;
        zzpj.zza(obj, "log site qualifier");
        this.zzb = obj;
    }

    public static zzll zza(zzll zzllVar, Object obj) {
        return new zzmd(zzllVar, obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzmd)) {
            return false;
        }
        zzmd zzmdVar = (zzmd) obj;
        return this.zza.equals(zzmdVar.zza) && this.zzb.equals(zzmdVar.zzb);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ this.zzb.hashCode();
    }

    public final String toString() {
        return cy30.p("SpecializedLogSiteKey{ delegate='", this.zza.toString(), "', qualifier='", this.zzb.toString(), "' }");
    }
}
