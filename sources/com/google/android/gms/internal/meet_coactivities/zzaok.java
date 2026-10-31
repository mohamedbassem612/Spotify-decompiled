package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p.cwl1;
import p.dm5;
import p.rl1;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaok {
    final zzzg zza;
    final Object zzb;

    public zzaok(zzzg zzzgVar, Object obj) {
        dm5.s(zzzgVar, "provider");
        this.zza = zzzgVar;
        this.zzb = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaok.class == obj.getClass()) {
            zzaok zzaokVar = (zzaok) obj;
            if (zno1.k(this.zza, zzaokVar.zza) && zno1.k(this.zzb, zzaokVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zza, "provider");
        rl1VarR0.m(this.zzb, "config");
        return rl1VarR0.toString();
    }
}
