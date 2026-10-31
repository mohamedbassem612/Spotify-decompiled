package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p.cwl1;
import p.rl1;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzalb {
    private final zzaky zza;
    private final Map zzb;
    private final Map zzc;
    private final zzanr zzd;
    private final Object zze;
    private final Map zzf;

    public zzalb(zzaky zzakyVar, Map map, Map map2, zzanr zzanrVar, Object obj, Map map3) {
        this.zza = zzakyVar;
        this.zzb = Collections.unmodifiableMap(new HashMap(map));
        this.zzc = Collections.unmodifiableMap(new HashMap(map2));
        this.zzd = zzanrVar;
        this.zze = obj;
        this.zzf = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzalb.class == obj.getClass()) {
            zzalb zzalbVar = (zzalb) obj;
            if (zno1.k(this.zza, zzalbVar.zza) && zno1.k(this.zzb, zzalbVar.zzb) && zno1.k(this.zzc, zzalbVar.zzc) && zno1.k(this.zzd, zzalbVar.zzd) && zno1.k(this.zze, zzalbVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze});
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zza, "defaultMethodConfig");
        rl1VarR0.m(this.zzb, "serviceMethodMap");
        rl1VarR0.m(this.zzc, "serviceMap");
        rl1VarR0.m(this.zzd, "retryThrottling");
        rl1VarR0.m(this.zze, "loadBalancingConfig");
        return rl1VarR0.toString();
    }

    public final zzyf zza() {
        if (this.zzc.isEmpty() && this.zzb.isEmpty() && this.zza == null) {
            return null;
        }
        return new zzala(this, null);
    }

    public final zzaky zzb(zzaac zzaacVar) {
        zzaky zzakyVar = (zzaky) this.zzb.get(zzaacVar.zzf());
        if (zzakyVar == null) {
            zzakyVar = (zzaky) this.zzc.get(zzaacVar.zzg());
        }
        return zzakyVar == null ? this.zza : zzakyVar;
    }

    public final zzanr zzc() {
        return this.zzd;
    }

    public final Object zzd() {
        return this.zze;
    }

    public final Map zze() {
        return this.zzf;
    }
}
