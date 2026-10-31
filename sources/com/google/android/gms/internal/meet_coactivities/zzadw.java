package com.google.android.gms.internal.meet_coactivities;

import p.eg;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzadw {
    final /* synthetic */ zzaee zza;
    private final zzyu zzb;
    private zzze zzc;
    private zzzg zzd;

    public zzadw(zzaee zzaeeVar, zzyu zzyuVar) {
        this.zza = zzaeeVar;
        this.zzb = zzyuVar;
        zzzg zzzgVarZza = zzaeeVar.zza.zza(zzaeeVar.zzb);
        this.zzd = zzzgVarZza;
        if (zzzgVarZza != null) {
            this.zzc = zzzgVarZza.zza(zzyuVar);
        } else {
            eg.m(f4i1.f("Could not find policy '", zzaeeVar.zzb, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            throw null;
        }
    }

    public final zzze zza() {
        return this.zzc;
    }

    public final zzabe zzb(zzza zzzaVar) {
        zzaok zzaokVar = (zzaok) zzzaVar.zzd();
        zzaea zzaeaVar = null;
        if (zzaokVar == null) {
            try {
                zzaee zzaeeVar = this.zza;
                zzaokVar = new zzaok(zzaee.zza(zzaeeVar, zzaeeVar.zzb, "using default policy"), null);
            } catch (zzaed e) {
                this.zzb.zze(zzxa.TRANSIENT_FAILURE, new zzadz(zzabe.zzj.zze(e.getMessage())));
                this.zzc.zze();
                this.zzd = null;
                this.zzc = new zzaeb(zzaeaVar);
                return zzabe.zza;
            }
        }
        if (this.zzd == null || !zzaokVar.zza.zzd().equals(this.zzd.zzd())) {
            this.zzb.zze(zzxa.CONNECTING, new zzady(null));
            this.zzc.zze();
            zzzg zzzgVar = zzaokVar.zza;
            this.zzd = zzzgVar;
            zzze zzzeVar = this.zzc;
            this.zzc = zzzgVar.zza(this.zzb);
            ((zzajv) this.zzb).zzb.zzU.zzb(2, "Load balancer changed from {0} to {1}", zzzeVar.getClass().getSimpleName(), this.zzc.getClass().getSimpleName());
        }
        Object obj = zzaokVar.zzb;
        if (obj != null) {
            ((zzajv) this.zzb).zzb.zzU.zzb(1, "Load-balancing config: {0}", obj);
        }
        zzze zzzeVar2 = this.zzc;
        zzyy zzyyVarZzb = zzza.zzb();
        zzyyVarZzb.zza(zzzaVar.zze());
        zzyyVarZzb.zzb(zzzaVar.zza());
        zzyyVarZzb.zzc(obj);
        return zzzeVar2.zza(zzyyVarZzb.zzd());
    }

    public final void zzc() {
        this.zzc.zze();
        this.zzc = null;
    }
}
