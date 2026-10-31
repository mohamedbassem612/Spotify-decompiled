package com.google.android.gms.internal.meet_coactivities;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzajx implements Runnable {
    final /* synthetic */ zzaal zza;
    final /* synthetic */ zzajy zzb;

    public zzajx(zzajy zzajyVar, zzaal zzaalVar) {
        this.zza = zzaalVar;
        this.zzb = zzajyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzalb zzalbVar;
        zzajy zzajyVar = this.zzb;
        zzakp zzakpVar = zzajyVar.zzc;
        if (zzakpVar.zzC != zzajyVar.zzb) {
            return;
        }
        zzaal zzaalVar = this.zza;
        List listZze = zzaalVar.zze();
        zzakpVar.zzU.zzb(1, "Resolved address: {0}, config={1}", listZze, zzaalVar.zza());
        zzakp zzakpVar2 = this.zzb.zzc;
        if (zzakpVar2.zzah != 2) {
            zzakpVar2.zzU.zzb(2, "Address resolved: {0}", listZze);
            this.zzb.zzc.zzah = 2;
        }
        zzaal zzaalVar2 = this.zza;
        zzaah zzaahVarZzb = zzaalVar2.zzb();
        zzanw zzanwVar = (zzanw) zzaalVar2.zza().zzc(zzanz.zza);
        zzyf zzyfVar = (zzyf) this.zza.zza().zzc(zzyf.zza);
        zzalb zzalbVar2 = (zzaahVarZzb == null || zzaahVarZzb.zzd() == null) ? null : (zzalb) zzaahVarZzb.zzd();
        zzabe zzabeVarZzc = zzaahVarZzb != null ? zzaahVarZzb.zzc() : null;
        zzakp zzakpVar3 = this.zzb.zzc;
        if (zzakpVar3.zzZ) {
            if (zzalbVar2 != null) {
                if (zzyfVar != null) {
                    zzakpVar3.zzW.zzg(zzyfVar);
                    if (zzalbVar2.zza() != null) {
                        this.zzb.zzc.zzU.zza(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    zzakpVar3.zzW.zzg(zzalbVar2.zza());
                }
            } else if (zzabeVarZzc == null) {
                zzalbVar2 = zzakp.zzf;
                zzakpVar3.zzW.zzg(null);
            } else {
                if (!zzakpVar3.zzY) {
                    zzakpVar3.zzU.zza(2, "Fallback to error due to invalid first service config without default config");
                    this.zzb.zza(zzaahVarZzb.zzc());
                    if (zzanwVar != null) {
                        zzanwVar.zza(zzaahVarZzb.zzc());
                        return;
                    }
                    return;
                }
                zzalbVar2 = zzakpVar3.zzX;
            }
            if (!zzalbVar2.equals(this.zzb.zzc.zzX)) {
                this.zzb.zzc.zzU.zzb(2, "Service config changed{0}", zzalbVar2 == zzakp.zzf ? " to empty" : "");
                this.zzb.zzc.zzX = zzalbVar2;
                this.zzb.zzc.zzaf.zza = zzalbVar2.zzc();
            }
            try {
                this.zzb.zzc.zzY = true;
            } catch (RuntimeException e) {
                zzakp.zza.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved", "run", f4i1.f("[", String.valueOf(this.zzb.zzc.zzc()), "] Unexpected exception from parsing service config"), (Throwable) e);
            }
            zzalbVar = zzalbVar2;
        } else {
            if (zzalbVar2 != null) {
                zzakpVar3.zzU.zza(2, "Service config from name resolver discarded by channel settings");
            }
            zzajy zzajyVar2 = this.zzb;
            zzalbVar = zzakp.zzf;
            if (zzyfVar != null) {
                zzajyVar2.zzc.zzU.zza(2, "Config selector from name resolver discarded by channel settings");
            }
            this.zzb.zzc.zzW.zzg(zzalbVar.zza());
        }
        zzaal zzaalVar3 = this.zza;
        zzajy zzajyVar3 = this.zzb;
        zzakp zzakpVar4 = zzajyVar3.zzc;
        zzvz zzvzVarZza = zzaalVar3.zza();
        if (zzajyVar3.zza == zzakpVar4.zzE) {
            zzvw zzvwVarZzb = zzvzVarZza.zzb();
            zzvwVarZzb.zza(zzyf.zza);
            Map mapZze = zzalbVar.zze();
            if (mapZze != null) {
                zzvwVarZzb.zzb(zzze.zza, mapZze);
                zzvwVarZzb.zzc();
            }
            zzvz zzvzVarZzc = zzvwVarZzb.zzc();
            zzadw zzadwVar = this.zzb.zza.zza;
            zzyy zzyyVarZzb = zzza.zzb();
            zzyyVarZzb.zza(listZze);
            zzyyVarZzb.zzb(zzvzVarZzc);
            zzyyVarZzb.zzc(zzalbVar.zzd());
            zzabe zzabeVarZzb = zzadwVar.zzb(zzyyVarZzb.zzd());
            if (zzanwVar != null) {
                zzanwVar.zza(zzabeVarZzb);
            }
        }
    }
}
