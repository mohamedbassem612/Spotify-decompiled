package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import p.i02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzeb implements Runnable {
    public final /* synthetic */ zzfa zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ i02 zzc;

    public /* synthetic */ zzeb(zzfa zzfaVar, Context context, i02 i02Var) {
        this.zza = zzfaVar;
        this.zzb = context;
        this.zzc = i02Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzL(this.zzb, this.zzc);
    }
}
