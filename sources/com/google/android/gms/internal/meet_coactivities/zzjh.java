package com.google.android.gms.internal.meet_coactivities;

import p.bhn0;
import p.cy30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzjh extends zzju {
    private final zzpy zza;
    private final int zzb;

    public zzjh(int i, zzpy zzpyVar) {
        this.zzb = i;
        if (zzpyVar != null) {
            this.zza = zzpyVar;
        } else {
            bhn0.i("Null update");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzju) {
            zzju zzjuVar = (zzju) obj;
            if (this.zzb == zzjuVar.zzb() && this.zza.equals(zzjuVar.zza())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        return this.zza.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        return cy30.p("ThinLocalStateUpdateResult{outcome=", this.zzb != 1 ? "UPDATED" : "NO_OP", ", update=", this.zza.toString(), "}");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzju
    public final zzpy zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzju
    public final int zzb() {
        return this.zzb;
    }
}
