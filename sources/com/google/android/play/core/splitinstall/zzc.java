package com.google.android.play.core.splitinstall;

import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzc {
    private zzac zza;

    public /* synthetic */ zzc(zzb zzbVar) {
    }

    public final zzc zza(zzac zzacVar) {
        this.zza = zzacVar;
        return this;
    }

    public final zzp zzb() {
        zzac zzacVar = this.zza;
        zzd zzdVar = null;
        if (zzacVar != null) {
            return new zze(zzacVar, zzdVar);
        }
        eg.m(String.valueOf(zzac.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    private zzc() {
    }
}
