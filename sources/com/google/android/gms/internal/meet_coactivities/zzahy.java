package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import java.util.Set;
import p.cwl1;
import p.rl1;
import p.t380;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzahy {
    final int zza;
    final long zzb;
    final Set zzc;

    public zzahy(int i, long j, Set set) {
        this.zza = i;
        this.zzb = j;
        this.zzc = t380.p(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahy.class == obj.getClass()) {
            zzahy zzahyVar = (zzahy) obj;
            if (this.zza == zzahyVar.zza && this.zzb == zzahyVar.zzb && zno1.k(this.zzc, zzahyVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.j(this.zza, "maxAttempts");
        rl1VarR0.k(this.zzb, "hedgingDelayNanos");
        rl1VarR0.m(this.zzc, "nonFatalStatusCodes");
        return rl1VarR0.toString();
    }
}
