package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p.cwl1;
import p.dm5;
import p.rl1;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzyw {
    private static final zzyw zza = new zzyw(null, null, zzabe.zza, false);
    private final zzzb zzb;
    private final zzwo zzc = null;
    private final zzabe zzd;
    private final boolean zze;

    private zzyw(zzzb zzzbVar, zzwo zzwoVar, zzabe zzabeVar, boolean z) {
        this.zzb = zzzbVar;
        dm5.s(zzabeVar, "status");
        this.zzd = zzabeVar;
        this.zze = z;
    }

    public static zzyw zza(zzabe zzabeVar) {
        dm5.n(!zzabeVar.zzj(), "drop status shouldn't be OK");
        return new zzyw(null, null, zzabeVar, true);
    }

    public static zzyw zzb(zzabe zzabeVar) {
        dm5.n(!zzabeVar.zzj(), "error status shouldn't be OK");
        return new zzyw(null, null, zzabeVar, false);
    }

    public static zzyw zzc() {
        return zza;
    }

    public static zzyw zzd(zzzb zzzbVar, zzwo zzwoVar) {
        dm5.s(zzzbVar, "subchannel");
        return new zzyw(zzzbVar, null, zzabe.zza, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzyw)) {
            return false;
        }
        zzyw zzywVar = (zzyw) obj;
        return zno1.k(this.zzb, zzywVar.zzb) && zno1.k(this.zzd, zzywVar.zzd) && zno1.k((Object) null, (Object) null) && this.zze == zzywVar.zze;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzd, null, Boolean.valueOf(this.zze)});
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zzb, "subchannel");
        rl1VarR0.m((Object) null, "streamTracerFactory");
        rl1VarR0.m(this.zzd, "status");
        rl1VarR0.l("drop", this.zze);
        return rl1VarR0.toString();
    }

    public final zzzb zze() {
        return this.zzb;
    }

    public final zzabe zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze;
    }
}
