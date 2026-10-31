package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzeo implements Runnable {
    public final /* synthetic */ zzfa zza;
    public final /* synthetic */ zzrr zzb;
    public final /* synthetic */ Runnable zzc;

    public /* synthetic */ zzeo(zzfa zzfaVar, zzrr zzrrVar, Runnable runnable) {
        this.zza = zzfaVar;
        this.zzb = zzrrVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzP(this.zzb, this.zzc);
    }
}
