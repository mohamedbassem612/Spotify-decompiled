package com.google.android.gms.internal.meet_coactivities;

import p.bhn0;
import p.f4i1;
import p.j380;
import p.mno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzjf extends zzjp {
    private final j380 zza;

    public zzjf(j380 j380Var) {
        if (j380Var != null) {
            this.zza = j380Var;
        } else {
            bhn0.i("Null intentCounterMap");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjp)) {
            return false;
        }
        j380 j380Var = this.zza;
        j380 j380VarZza = ((zzjp) obj).zza();
        j380Var.getClass();
        return mno1.l(j380VarZza, j380Var);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        return f4i1.f("WatchingStateMetadata{intentCounterMap=", this.zza.toString(), "}");
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjp
    public final j380 zza() {
        return this.zza;
    }
}
