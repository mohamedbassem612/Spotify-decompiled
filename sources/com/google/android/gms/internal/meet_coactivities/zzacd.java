package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzacd {
    Context zza;
    zzalf zzb;
    zzabu zzc = zzabu.zza();
    final zzalf zzd = zzaor.zzc(zzahx.zzj);
    zzaby zze = zzabx.zzb();
    zzabs zzf = zzabs.zza;
    final zzabv zzg = zzabv.zza;
    final zzada zzh = zzade.zzb;

    public final zzacd zza(zzabs zzabsVar) {
        dm5.s(zzabsVar, "bindServiceFlags");
        this.zzf = zzabsVar;
        return this;
    }

    public final zzacd zzb(zzabu zzabuVar) {
        dm5.s(zzabuVar, "channelCredentials");
        this.zzc = zzabuVar;
        return this;
    }

    public final zzacd zzc(zzalf zzalfVar) {
        dm5.s(zzalfVar, "offloadExecutorPool");
        this.zzb = zzalfVar;
        return this;
    }

    public final zzacd zzd(zzaby zzabyVar) {
        dm5.s(zzabyVar, "securityPolicy");
        this.zze = zzabyVar;
        return this;
    }

    public final zzacd zze(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final /* synthetic */ zzaez zzf() {
        return new zzacf(this, null);
    }
}
