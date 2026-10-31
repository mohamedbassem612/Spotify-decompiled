package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p.cwl1;
import p.dm5;
import p.rl1;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaah {
    private final zzabe zza;
    private final Object zzb;

    private zzaah(zzabe zzabeVar) {
        this.zzb = null;
        dm5.s(zzabeVar, "status");
        this.zza = zzabeVar;
        dm5.o(!zzabeVar.zzj(), "cannot use OK status: %s", zzabeVar);
    }

    public static zzaah zza(Object obj) {
        return new zzaah(obj);
    }

    public static zzaah zzb(zzabe zzabeVar) {
        return new zzaah(zzabeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaah.class == obj.getClass()) {
            zzaah zzaahVar = (zzaah) obj;
            if (zno1.k(this.zza, zzaahVar.zza) && zno1.k(this.zzb, zzaahVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        if (this.zzb != null) {
            rl1 rl1VarR0 = cwl1.r0(this);
            rl1VarR0.m(this.zzb, "config");
            return rl1VarR0.toString();
        }
        rl1 rl1VarR1 = cwl1.r0(this);
        rl1VarR1.m(this.zza, "error");
        return rl1VarR1.toString();
    }

    public final zzabe zzc() {
        return this.zza;
    }

    public final Object zzd() {
        return this.zzb;
    }

    private zzaah(Object obj) {
        dm5.s(obj, "config");
        this.zzb = obj;
        this.zza = null;
    }
}
