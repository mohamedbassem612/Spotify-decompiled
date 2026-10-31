package com.google.android.gms.internal.meet_coactivities;

import p.hx30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzcy implements hx30 {
    final /* synthetic */ String zza;

    public zzcy(zzda zzdaVar, String str) {
        this.zza = str;
    }

    public final void onFailure(Throwable th) {
        zzda.zza.zzd().zzg(th).zzh("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$1", "onFailure", 991, "MeetIpcManagerImpl.java").zzs("%s unsuccessful - thread %s", this.zza, Thread.currentThread().getName());
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        zzda.zza.zzb().zzh("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$1", "onSuccess", 986, "MeetIpcManagerImpl.java").zzs("%s successful - thread %s", this.zza, Thread.currentThread().getName());
    }
}
