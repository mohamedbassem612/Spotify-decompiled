package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p.dm5;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaey {
    private String zza = "unknown-authority";
    private zzvz zzb = zzvz.zza;
    private String zzc;
    private zzxv zzd;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaey)) {
            return false;
        }
        zzaey zzaeyVar = (zzaey) obj;
        return this.zza.equals(zzaeyVar.zza) && this.zzb.equals(zzaeyVar.zzb) && zno1.k((Object) null, (Object) null) && zno1.k(this.zzd, zzaeyVar.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, this.zzd});
    }

    public final zzvz zza() {
        return this.zzb;
    }

    public final zzaey zzb(String str) {
        dm5.s(str, "authority");
        this.zza = str;
        return this;
    }

    public final zzaey zzc(zzvz zzvzVar) {
        dm5.s(zzvzVar, "eagAttributes");
        this.zzb = zzvzVar;
        return this;
    }

    public final zzaey zzd(zzxv zzxvVar) {
        this.zzd = zzxvVar;
        return this;
    }

    public final zzaey zze(String str) {
        this.zzc = null;
        return this;
    }

    public final String zzf() {
        return this.zza;
    }
}
