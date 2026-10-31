package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzabt extends zzxp {
    private final zzakv zza;
    private final zzacd zzb;

    private zzabt(zzabo zzaboVar, String str, Context context, zzabu zzabuVar) {
        zzacd zzacdVar = new zzacd();
        zzacdVar.zze(context);
        zzacdVar.zzb(zzabuVar);
        this.zzb = zzacdVar;
        if (zzaboVar != null) {
            this.zza = new zzakv(zzaboVar, zzaboVar.zzc(), null, null, zzacdVar, null);
        } else {
            this.zza = new zzakv(null, null, null, zzacdVar, null);
        }
        zze(60L, TimeUnit.SECONDS);
    }

    public static zzabt zzd(zzabo zzaboVar, Context context) {
        dm5.s(zzaboVar, "directAddress");
        return new zzabt(zzaboVar, null, context, zzabu.zza());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzxo, com.google.android.gms.internal.meet_coactivities.zzzl
    public final zzzj zza() {
        this.zzb.zzc(this.zza.zze());
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzxp, com.google.android.gms.internal.meet_coactivities.zzxo
    public final zzzl zzb() {
        return this.zza;
    }

    public final zzabt zze(long j, TimeUnit timeUnit) {
        this.zza.zzd(j, timeUnit);
        return this;
    }

    public final zzabt zzf(zzaby zzabyVar) {
        this.zzb.zzd(zzabyVar);
        return this;
    }

    public final zzabt zzg(zzabs zzabsVar) {
        this.zzb.zza(zzabsVar);
        return this;
    }
}
