package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import java.util.Set;
import p.cwl1;
import p.rl1;
import p.t380;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzant {
    final int zza;
    final long zzb;
    final long zzc;
    final double zzd;
    final Long zze;
    final Set zzf;

    public zzant(int i, long j, long j2, double d, Long l, Set set) {
        this.zza = i;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = d;
        this.zze = l;
        this.zzf = t380.p(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzant)) {
            return false;
        }
        zzant zzantVar = (zzant) obj;
        return this.zza == zzantVar.zza && this.zzb == zzantVar.zzb && this.zzc == zzantVar.zzc && Double.compare(this.zzd, zzantVar.zzd) == 0 && zno1.k(this.zze, zzantVar.zze) && zno1.k(this.zzf, zzantVar.zzf);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), Double.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.j(this.zza, "maxAttempts");
        rl1VarR0.k(this.zzb, "initialBackoffNanos");
        rl1VarR0.k(this.zzc, "maxBackoffNanos");
        rl1VarR0.n("backoffMultiplier", String.valueOf(this.zzd));
        rl1VarR0.m(this.zze, "perAttemptRecvTimeoutNanos");
        rl1VarR0.m(this.zzf, "retryableStatusCodes");
        return rl1VarR0.toString();
    }
}
