package com.google.android.gms.internal.meet_coactivities;

import p.txg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzdx implements Runnable {
    public final /* synthetic */ zzfa zza;
    public final /* synthetic */ txg zzb;

    public /* synthetic */ zzdx(zzfa zzfaVar, txg txgVar) {
        this.zza = zzfaVar;
        this.zzb = txgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzN(this.zzb);
    }
}
