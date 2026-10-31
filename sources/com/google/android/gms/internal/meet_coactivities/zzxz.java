package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p.cwl1;
import p.dm5;
import p.rl1;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzxz {
    public final String zza;
    public final zzxx zzb;
    public final long zzc;
    public final zzyn zzd;
    public final zzyn zze;

    public /* synthetic */ zzxz(String str, zzxx zzxxVar, long j, zzyn zzynVar, zzyn zzynVar2, zzxy zzxyVar) {
        this.zza = str;
        dm5.s(zzxxVar, "severity");
        this.zzb = zzxxVar;
        this.zzc = j;
        this.zzd = null;
        this.zze = zzynVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzxz) {
            zzxz zzxzVar = (zzxz) obj;
            if (zno1.k(this.zza, zzxzVar.zza) && zno1.k(this.zzb, zzxzVar.zzb) && this.zzc == zzxzVar.zzc && zno1.k((Object) null, (Object) null) && zno1.k(this.zze, zzxzVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Long.valueOf(this.zzc), null, this.zze});
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zza, "description");
        rl1VarR0.m(this.zzb, "severity");
        rl1VarR0.k(this.zzc, "timestampNanos");
        rl1VarR0.m((Object) null, "channelRef");
        rl1VarR0.m(this.zze, "subchannelRef");
        return rl1VarR0.toString();
    }
}
