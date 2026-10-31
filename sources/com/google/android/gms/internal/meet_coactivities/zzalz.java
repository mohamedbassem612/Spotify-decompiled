package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p.dm5;
import p.gvg;
import p.l1d;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzalz extends zzyx {
    private final zzwe zza;
    private final zzzw zzb;
    private final zzaac zzc;
    private final zzyv zzd;

    public zzalz(zzaac zzaacVar, zzzw zzzwVar, zzwe zzweVar, zzyv zzyvVar) {
        dm5.s(zzaacVar, "method");
        this.zzc = zzaacVar;
        dm5.s(zzzwVar, "headers");
        this.zzb = zzzwVar;
        dm5.s(zzweVar, "callOptions");
        this.zza = zzweVar;
        dm5.s(zzyvVar, "pickDetailsConsumer");
        this.zzd = zzyvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzalz.class == obj.getClass()) {
            zzalz zzalzVar = (zzalz) obj;
            if (zno1.k(this.zza, zzalzVar.zza) && zno1.k(this.zzb, zzalzVar.zzb) && zno1.k(this.zzc, zzalzVar.zzc) && zno1.k(this.zzd, zzalzVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    public final String toString() {
        zzwe zzweVar = this.zza;
        zzzw zzzwVar = this.zzb;
        return l1d.n(String.valueOf(zzweVar), "]", gvg.n("[method=", String.valueOf(this.zzc), " headers=", String.valueOf(zzzwVar), " callOptions="));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyx
    public final zzwe zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyx
    public final zzzw zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzyx
    public final zzaac zzc() {
        return this.zzc;
    }
}
