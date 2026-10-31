package com.google.android.gms.internal.meet_coactivities;

import p.hx30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzcz implements hx30 {
    final /* synthetic */ String zza;

    public zzcz(String str) {
        this.zza = str;
    }

    public final void onFailure(Throwable th) {
        zzda.zza.zze().zzg(th).zzh("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$2", "onFailure", 1023, "MeetIpcManagerImpl.java").zzp("IPC call for %s failed.", this.zza);
    }

    public final void onSuccess(Object obj) {
        zzda.zza.zzb().zzh("com/google/android/libraries/communications/sdk/sync/ipc/MeetIpcManagerImpl$2", "onSuccess", 1018, "MeetIpcManagerImpl.java").zzp("IPC call for %s succeeded.", this.zza);
    }
}
