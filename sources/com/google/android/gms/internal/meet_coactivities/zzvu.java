package com.google.android.gms.internal.meet_coactivities;

import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzvu {
    public static zzsh zza(Duration duration) {
        return zzvt.zza(duration.getSeconds(), duration.getNano());
    }

    public static Duration zzb(zzsh zzshVar) {
        zzsh zzshVarZza = zzvt.zza(zzshVar.zzd(), zzshVar.zzc());
        return Duration.ofSeconds(zzshVarZza.zzd(), zzshVarZza.zzc());
    }
}
