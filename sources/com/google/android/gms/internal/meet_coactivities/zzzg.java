package com.google.android.gms.internal.meet_coactivities;

import java.util.Map;
import p.cwl1;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zzzg extends zzys {
    static {
        zzaah.zza(new zzzf());
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(zzd(), "policy");
        rl1VarR0.j(5, "priority");
        rl1VarR0.l("available", true);
        return rl1VarR0.toString();
    }

    public abstract int zzb();

    public zzaah zzc(Map map) {
        throw null;
    }

    public abstract String zzd();

    public abstract boolean zze();
}
