package com.google.android.gms.internal.meet_coactivities;

import p.hx30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzeq implements hx30 {
    final /* synthetic */ zzfa zza;

    public zzeq(zzfa zzfaVar) {
        this.zza = zzfaVar;
    }

    public final void onFailure(Throwable th) {
        zzfa.zzl().zzd().zzg(th).zzh("com/google/android/meet/addons/internal/AddonClientImpl$1", "onFailure", 357, "AddonClientImpl.java").zzo("connectMeeting call to IpcManager failed.");
        zzfa.zzK(this.zza);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        zzfa.zzl().zzb().zzh("com/google/android/meet/addons/internal/AddonClientImpl$1", "onSuccess", 349, "AddonClientImpl.java").zzo("connectMeeting call to IpcManager succeeded.");
        zzfa.zzG(this.zza, new zzip());
    }
}
