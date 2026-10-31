package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzwm extends zzwf {
    private final zzwf zza;
    private final zzwk zzb;

    public /* synthetic */ zzwm(zzwf zzwfVar, zzwk zzwkVar, zzwl zzwlVar) {
        this.zza = zzwfVar;
        dm5.s(zzwkVar, "interceptor");
        this.zzb = zzwkVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwf
    public final zzwj zza(zzaac zzaacVar, zzwe zzweVar) {
        return this.zzb.zza(zzaacVar, zzweVar, this.zza);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwf
    public final String zzb() {
        return this.zza.zzb();
    }
}
