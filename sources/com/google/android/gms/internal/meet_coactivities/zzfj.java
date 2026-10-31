package com.google.android.gms.internal.meet_coactivities;

import p.hx30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzfj implements hx30 {
    final /* synthetic */ zzfm zza;

    public zzfj(zzfm zzfmVar) {
        this.zza = zzfmVar;
    }

    public final void onFailure(Throwable th) {
        zzfm.zza.zze().zzh("com/google/android/meet/addons/internal/AddonSessionBuilderImpl$2", "onFailure", 248, "AddonSessionBuilderImpl.java").zzo("Session future failed; not setting initial collaboration starting state.");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        zzfm zzfmVar = this.zza;
        zzfmVar.zzc.zzS(zzfmVar.zzi);
    }
}
