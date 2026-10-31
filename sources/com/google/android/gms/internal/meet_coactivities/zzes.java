package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzes implements Runnable {
    public final /* synthetic */ zzez zza;
    public final /* synthetic */ zzl zzb;

    public /* synthetic */ zzes(zzez zzezVar, zzl zzlVar) {
        this.zza = zzezVar;
        this.zzb = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf(this.zzb);
    }
}
