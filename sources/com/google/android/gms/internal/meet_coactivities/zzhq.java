package com.google.android.gms.internal.meet_coactivities;

import p.hx30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzhq implements hx30 {
    final /* synthetic */ zzhs zza;

    public zzhq(zzhs zzhsVar) {
        this.zza = zzhsVar;
    }

    public final void onFailure(Throwable th) {
        zzia.zze(th);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        try {
            this.zza.zzc.zzg((zzpy) obj);
        } catch (RuntimeException e) {
            zzia.zze(e);
        }
    }
}
