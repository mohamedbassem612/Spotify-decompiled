package com.google.android.gms.internal.meet_coactivities;

import p.bid0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzbq extends zzby {
    private final bid0 zza;
    private final bid0 zzb;

    public /* synthetic */ zzbq(bid0 bid0Var, bid0 bid0Var2, zzbo zzboVar) {
        this.zza = bid0Var;
        this.zzb = bid0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzby) {
            zzby zzbyVar = (zzby) obj;
            if (this.zza.equals(zzbyVar.zzb()) && this.zzb.equals(zzbyVar.zza())) {
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
        return "IpcExecutors{outgoingIpcExecutor=" + this.zza + ", incomingIpcExecutor=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzby
    public final bid0 zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzby
    public final bid0 zzb() {
        return this.zza;
    }
}
