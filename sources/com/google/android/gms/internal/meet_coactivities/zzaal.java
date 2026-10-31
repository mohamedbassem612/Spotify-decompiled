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
public final class zzaal {
    private final List zza;
    private final zzvz zzb;
    private final zzaah zzc;

    public zzaal(List list, zzvz zzvzVar, zzaah zzaahVar) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        dm5.s(zzvzVar, "attributes");
        this.zzb = zzvzVar;
        this.zzc = zzaahVar;
    }

    public static zzaak zzc() {
        return new zzaak();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaal)) {
            return false;
        }
        zzaal zzaalVar = (zzaal) obj;
        return zno1.k(this.zza, zzaalVar.zza) && zno1.k(this.zzb, zzaalVar.zzb) && zno1.k(this.zzc, zzaalVar.zzc);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zza, "addresses");
        rl1VarR0.m(this.zzb, "attributes");
        rl1VarR0.m(this.zzc, "serviceConfig");
        return rl1VarR0.toString();
    }

    public final zzvz zza() {
        return this.zzb;
    }

    public final zzaah zzb() {
        return this.zzc;
    }

    public final zzaak zzd() {
        zzaak zzaakVar = new zzaak();
        zzaakVar.zza(this.zza);
        zzaakVar.zzb(this.zzb);
        zzaakVar.zzc(this.zzc);
        return zzaakVar;
    }

    public final List zze() {
        return this.zza;
    }
}
