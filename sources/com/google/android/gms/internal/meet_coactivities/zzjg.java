package com.google.android.gms.internal.meet_coactivities;

import p.bhn0;
import p.cy30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzjg extends zzjt {
    private final Object zza;
    private final Object zzb;

    public zzjg(Object obj, Object obj2) {
        if (obj == null) {
            bhn0.i("Null state");
            throw null;
        }
        this.zza = obj;
        if (obj2 != null) {
            this.zzb = obj2;
        } else {
            bhn0.i("Null metadata");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzjt) {
            zzjt zzjtVar = (zzjt) obj;
            if (this.zza.equals(zzjtVar.zzb()) && this.zzb.equals(zzjtVar.zza())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        return this.zzb.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return cy30.p("ThinLocalStateResult{state=", this.zza.toString(), ", metadata=", this.zzb.toString(), "}");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjt
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjt
    public final Object zzb() {
        return this.zza;
    }
}
