package com.google.android.gms.internal.meet_coactivities;

import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzajg extends zzans {
    final /* synthetic */ zzaac zza;
    final /* synthetic */ zzwe zzb;
    final /* synthetic */ zzxf zzc;
    final /* synthetic */ zzaji zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzajg(zzaji zzajiVar, zzaac zzaacVar, zzzw zzzwVar, zzwe zzweVar, zzant zzantVar, zzahy zzahyVar, zzxf zzxfVar) {
        this.zza = zzaacVar;
        this.zzb = zzweVar;
        this.zzc = zzxfVar;
        this.zzd = zzajiVar;
        zzakp zzakpVar = zzajiVar.zzb;
        super(zzaacVar, zzzwVar, zzakpVar.zzaa, zzakpVar.zzab, zzakpVar.zzac, zzakp.zzI(zzakpVar, zzweVar), zzajiVar.zzb.zzp.zzb(), zzantVar, zzahyVar, zzajiVar.zza);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzans
    public final zzabe zzo() {
        zzako zzakoVar = this.zzd.zzb.zzM;
        synchronized (zzakoVar.zza) {
            try {
                zzabe zzabeVar = zzakoVar.zzc;
                if (zzabeVar != null) {
                    return zzabeVar;
                }
                zzakoVar.zzb.add(this);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzans
    public final zzaeu zzp(zzzw zzzwVar, zzwo zzwoVar, int i, boolean z) {
        zzwe zzweVarZzf = this.zzb.zzf(zzwoVar);
        zzwr[] zzwrVarArrZzh = zzahx.zzh(zzweVarZzf, zzzwVar, i, z);
        zzxf zzxfVarZza = this.zzc.zza();
        try {
            return this.zzd.zzb.zzL.zzd(this.zza, zzzwVar, zzweVarZzf, zzwrVarArrZzh);
        } finally {
            this.zzc.zze(zzxfVarZza);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzans
    public final void zzq() {
        zzabe zzabeVar;
        zzako zzakoVar = this.zzd.zzb.zzM;
        synchronized (zzakoVar.zza) {
            try {
                zzakoVar.zzb.remove(this);
                if (zzakoVar.zzb.isEmpty()) {
                    zzabeVar = zzakoVar.zzc;
                    zzakoVar.zzb = new HashSet();
                } else {
                    zzabeVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzabeVar != null) {
            zzakoVar.zzd.zzL.zzm(zzabeVar);
        }
    }
}
