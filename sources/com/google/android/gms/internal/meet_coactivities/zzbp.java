package com.google.android.gms.internal.meet_coactivities;

import p.bid0;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzbp extends zzbx {
    private bid0 zza;
    private bid0 zzb;

    @Override // com.google.android.gms.internal.meet_coactivities.zzbx
    public final zzbx zza(bid0 bid0Var) {
        this.zzb = bid0Var;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzbx
    public final zzbx zzb(bid0 bid0Var) {
        this.zza = bid0Var;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzbx
    public final zzby zzc() {
        bid0 bid0Var;
        bid0 bid0Var2 = this.zza;
        zzbo zzboVar = null;
        if (bid0Var2 != null && (bid0Var = this.zzb) != null) {
            return new zzbq(bid0Var2, bid0Var, zzboVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" outgoingIpcExecutor");
        }
        if (this.zzb == null) {
            sb.append(" incomingIpcExecutor");
        }
        eg.m("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
