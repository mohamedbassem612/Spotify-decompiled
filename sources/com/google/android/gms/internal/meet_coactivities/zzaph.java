package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaph extends zzapg {
    private final zzwj zza;
    private final boolean zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzaph(zzwj zzwjVar, boolean z) {
        this.zza = zzwjVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public final void zza() {
        this.zza.zzb();
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public final void zzb(Throwable th) {
        this.zza.zza("Cancelled by client with StreamObserver.onError()", th);
        this.zzc = true;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapo
    public final void zzc(Object obj) {
        dm5.z(!this.zzc, "Stream was terminated by error, no further calls are allowed");
        dm5.z(!this.zzd, "Stream is already completed, no further calls are allowed");
        this.zza.zzd(obj);
    }

    public final void zzd(int i) {
        boolean z = this.zzb;
        zzwj zzwjVar = this.zza;
        if (z) {
            zzwjVar.zzc(1);
        } else {
            zzwjVar.zzc(2);
        }
    }
}
