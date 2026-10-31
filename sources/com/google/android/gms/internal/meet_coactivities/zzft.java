package com.google.android.gms.internal.meet_coactivities;

import j$.time.Duration;
import p.bhn0;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
final class zzft extends zzgf {
    private boolean zza;
    private Duration zzb;
    private Duration zzc;
    private boolean zzd;
    private byte zze;

    @Override // com.google.android.gms.internal.meet_coactivities.zzgf
    public final zzgf zza(boolean z) {
        this.zzd = z;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzgf
    public final zzgf zzb(boolean z) {
        this.zza = z;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzgf
    public final zzgf zzc(Duration duration) {
        if (duration != null) {
            this.zzb = duration;
            return this;
        }
        bhn0.i("Null heartbeatFrequency");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzgf
    public final zzgf zzd(Duration duration) {
        if (duration != null) {
            this.zzc = duration;
            return this;
        }
        bhn0.i("Null seekDeterminationThreshold");
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzgf
    public final zzgg zze() {
        if (this.zze == 3 && this.zzb != null && this.zzc != null) {
            return new zzfv(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zze & 1) == 0) {
            sb.append(" disableHeartbeating");
        }
        if (this.zzb == null) {
            sb.append(" heartbeatFrequency");
        }
        if (this.zzc == null) {
            sb.append(" seekDeterminationThreshold");
        }
        if ((this.zze & 2) == 0) {
            sb.append(" alwaysOverride");
        }
        eg.m("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
