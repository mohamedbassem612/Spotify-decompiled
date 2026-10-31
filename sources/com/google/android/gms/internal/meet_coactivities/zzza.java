package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p.cwl1;
import p.dm5;
import p.rl1;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzza {
    private final List zza;
    private final zzvz zzb;
    private final Object zzc;

    public /* synthetic */ zzza(List list, zzvz zzvzVar, Object obj, zzyz zzyzVar) {
        dm5.s(list, "addresses");
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        dm5.s(zzvzVar, "attributes");
        this.zzb = zzvzVar;
        this.zzc = obj;
    }

    public static zzyy zzb() {
        return new zzyy();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzza)) {
            return false;
        }
        zzza zzzaVar = (zzza) obj;
        return zno1.k(this.zza, zzzaVar.zza) && zno1.k(this.zzb, zzzaVar.zzb) && zno1.k(this.zzc, zzzaVar.zzc);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zza, "addresses");
        rl1VarR0.m(this.zzb, "attributes");
        rl1VarR0.m(this.zzc, "loadBalancingPolicyConfig");
        return rl1VarR0.toString();
    }

    public final zzvz zza() {
        return this.zzb;
    }

    public final zzyy zzc() {
        zzyy zzyyVar = new zzyy();
        zzyyVar.zza(this.zza);
        zzyyVar.zzb(this.zzb);
        zzyyVar.zzc(this.zzc);
        return zzyyVar;
    }

    public final Object zzd() {
        return this.zzc;
    }

    public final List zze() {
        return this.zza;
    }
}
