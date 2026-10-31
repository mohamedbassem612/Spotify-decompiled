package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzeu implements Runnable {
    public final /* synthetic */ zzez zza;
    public final /* synthetic */ zzpy zzb;

    public /* synthetic */ zzeu(zzez zzezVar, zzpy zzpyVar) {
        this.zza = zzezVar;
        this.zzb = zzpyVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.meet_coactivities.zzhe, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        zzez zzezVar = this.zza;
        zzpy zzpyVar = this.zzb;
        if (zzpyVar.zzs()) {
            if (zzfa.zzx(zzezVar.zza).isPresent()) {
                ((zzhu) zzfa.zzx(zzezVar.zza).get()).zzd(zzpyVar);
                return;
            } else {
                zzfa.zzl().zze().zzh("com/google/android/meet/addons/internal/AddonClientImpl$LiveSharingIpcHandler", "lambda$handleStateUpdates$0", 1083, "AddonClientImpl.java").zzo("Received a co-doing update, but beginCoDoing() was never called.");
                return;
            }
        }
        if (zzpyVar.zzt()) {
            if (zzfa.zzy(zzezVar.zza).isPresent()) {
                zzfa.zzy(zzezVar.zza).get().zzd(zzpyVar);
            } else {
                zzfa.zzl().zze().zzh("com/google/android/meet/addons/internal/AddonClientImpl$LiveSharingIpcHandler", "lambda$handleStateUpdates$0", 1091, "AddonClientImpl.java").zzo("Received a co-watching update, but beginCoWatching() was never called.");
            }
        }
    }
}
