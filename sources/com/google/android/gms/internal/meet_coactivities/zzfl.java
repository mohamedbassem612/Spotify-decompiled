package com.google.android.gms.internal.meet_coactivities;

import p.hx30;
import p.r02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzfl implements hx30 {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzfm zza;

    public zzfl(zzfm zzfmVar) {
        this.zza = zzfmVar;
    }

    public final void onFailure(Throwable th) {
        zzfm.zza.zze().zzh("com/google/android/meet/addons/internal/AddonSessionBuilderImpl$3", "onFailure", 267, "AddonSessionBuilderImpl.java").zzo("Session future failed; not registering disconnect listener.");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        final r02 r02Var = (r02) obj;
        this.zza.zzc.zzQ(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzfk
            @Override // java.lang.Runnable
            public final void run() {
                ((zzfs) r02Var).zzc();
            }
        });
    }
}
