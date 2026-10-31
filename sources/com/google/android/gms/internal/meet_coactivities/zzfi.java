package com.google.android.gms.internal.meet_coactivities;

import p.h0s0;
import p.hx30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzfi implements hx30 {
    final /* synthetic */ h0s0 zza;
    final /* synthetic */ zzfm zzb;

    public zzfi(zzfm zzfmVar, h0s0 h0s0Var) {
        this.zza = h0s0Var;
        this.zzb = zzfmVar;
    }

    public final void onFailure(Throwable th) {
        zzfm.zza.zze().zzh("com/google/android/meet/addons/internal/AddonSessionBuilderImpl$1", "onFailure", 224, "AddonSessionBuilderImpl.java").zzo("Session future failed; not setting participant metadata.");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        zzfm zzfmVar = this.zzb;
        zzfmVar.zzc.zzU(zzfmVar.zzh, this.zza);
    }
}
