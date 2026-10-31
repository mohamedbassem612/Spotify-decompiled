package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import java.util.List;
import p.cwl1;
import p.dm5;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzyr {
    private final List zza;
    private final zzvz zzb;
    private final Object[][] zzc;

    public /* synthetic */ zzyr(List list, zzvz zzvzVar, Object[][] objArr, zzyq zzyqVar) {
        dm5.s(list, "addresses are not set");
        this.zza = list;
        dm5.s(zzvzVar, "attrs");
        this.zzb = zzvzVar;
        dm5.s(objArr, "customOptions");
        this.zzc = objArr;
    }

    public static zzyo zzb() {
        return new zzyo();
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zza, "addrs");
        rl1VarR0.m(this.zzb, "attrs");
        rl1VarR0.m(Arrays.deepToString(this.zzc), "customOptions");
        return rl1VarR0.toString();
    }

    public final zzvz zza() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zza;
    }
}
