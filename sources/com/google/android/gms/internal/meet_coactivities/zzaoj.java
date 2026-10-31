package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import java.util.Map;
import p.cwl1;
import p.dm5;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaoj {
    private final String zza;
    private final Map zzb;

    public zzaoj(String str, Map map) {
        dm5.s(str, "policyName");
        this.zza = str;
        dm5.s(map, "rawConfigValue");
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaoj) {
            zzaoj zzaojVar = (zzaoj) obj;
            if (this.zza.equals(zzaojVar.zza) && this.zzb.equals(zzaojVar.zzb)) {
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
        rl1VarR0.m(this.zza, "policyName");
        rl1VarR0.m(this.zzb, "rawConfigValue");
        return rl1VarR0.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final Map zzb() {
        return this.zzb;
    }
}
