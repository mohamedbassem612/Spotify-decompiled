package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import p.n8d0;
import p.u02;
import p.uh7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzeg implements uh7 {
    public final /* synthetic */ zzfa zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ u02 zze;

    public /* synthetic */ zzeg(zzfa zzfaVar, Context context, String str, boolean z, u02 u02Var) {
        this.zza = zzfaVar;
        this.zzb = context;
        this.zzc = str;
        this.zzd = z;
        this.zze = u02Var;
    }

    @Override // p.uh7
    public final n8d0 call() {
        return this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
