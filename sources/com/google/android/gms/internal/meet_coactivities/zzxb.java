package com.google.android.gms.internal.meet_coactivities;

import p.dm5;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzxb {
    private final zzxa zza;
    private final zzabe zzb;

    private zzxb(zzxa zzxaVar, zzabe zzabeVar) {
        dm5.s(zzxaVar, "state is null");
        this.zza = zzxaVar;
        dm5.s(zzabeVar, "status is null");
        this.zzb = zzabeVar;
    }

    public static zzxb zzb(zzxa zzxaVar) {
        dm5.n(zzxaVar != zzxa.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new zzxb(zzxaVar, zzabe.zza);
    }

    public static zzxb zzc(zzabe zzabeVar) {
        dm5.n(!zzabeVar.zzj(), "The error status must not be OK");
        return new zzxb(zzxa.TRANSIENT_FAILURE, zzabeVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzxb)) {
            return false;
        }
        zzxb zzxbVar = (zzxb) obj;
        return this.zza.equals(zzxbVar.zza) && this.zzb.equals(zzxbVar.zzb);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ this.zzb.hashCode();
    }

    public final String toString() {
        boolean zZzj = this.zzb.zzj();
        zzxa zzxaVar = this.zza;
        if (zZzj) {
            return zzxaVar.toString();
        }
        return gvg.h(String.valueOf(zzxaVar), "(", String.valueOf(this.zzb), ")");
    }

    public final zzxa zza() {
        return this.zza;
    }

    public final zzabe zzd() {
        return this.zzb;
    }
}
