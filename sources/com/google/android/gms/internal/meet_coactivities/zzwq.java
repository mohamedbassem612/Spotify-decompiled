package com.google.android.gms.internal.meet_coactivities;

import p.cwl1;
import p.dm5;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzwq {
    private final zzwe zza;
    private final int zzb;
    private final boolean zzc;

    public zzwq(zzwe zzweVar, int i, boolean z) {
        dm5.s(zzweVar, "callOptions");
        this.zza = zzweVar;
        this.zzb = i;
        this.zzc = z;
    }

    public static zzwp zza() {
        return new zzwp();
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zza, "callOptions");
        rl1VarR0.j(this.zzb, "previousAttempts");
        rl1VarR0.l("isTransparentRetry", this.zzc);
        return rl1VarR0.toString();
    }
}
