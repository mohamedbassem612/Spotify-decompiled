package com.google.android.gms.internal.meet_coactivities;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p.dm5;
import p.v0d1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzakm extends zzadu {
    final zzyr zza;
    final zzyj zzb;
    final zzael zzc;
    final zzaem zzd;
    List zze;
    zzaiu zzf;
    boolean zzg;
    boolean zzh;
    zzabl zzi;
    final /* synthetic */ zzakp zzj;

    public zzakm(zzakp zzakpVar, zzyr zzyrVar) {
        this.zzj = zzakpVar;
        dm5.s(zzyrVar, "args");
        this.zze = zzyrVar.zzc();
        this.zza = zzyrVar;
        zzyj zzyjVarZzc = zzyj.zzc("Subchannel", zzakpVar.zzb());
        this.zzb = zzyjVarZzc;
        zzaem zzaemVar = new zzaem(zzyjVarZzc, 0, zzakpVar.zzv.zza(), "Subchannel for ".concat(String.valueOf(zzyrVar.zzc())));
        this.zzd = zzaemVar;
        this.zzc = new zzael(zzaemVar, zzakpVar.zzv);
    }

    public final String toString() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzb
    public final Object zza() {
        dm5.z(this.zzg, "Subchannel is not started");
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzb
    public final void zzb() {
        this.zzj.zzd.zzd();
        dm5.z(this.zzg, "not started");
        this.zzf.zzh();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzb
    public final void zzc() {
        zzabl zzablVar;
        this.zzj.zzd.zzd();
        if (this.zzf == null) {
            this.zzh = true;
            return;
        }
        if (!this.zzh) {
            this.zzh = true;
        } else {
            if (!this.zzj.zzO || (zzablVar = this.zzi) == null) {
                return;
            }
            zzablVar.zza();
            this.zzi = null;
        }
        zzakp zzakpVar = this.zzj;
        if (zzakpVar.zzO) {
            this.zzf.zzF(zzakp.zzb);
        } else {
            this.zzi = zzakpVar.zzd.zza(new zzaix(new zzakl(this)), 5L, TimeUnit.SECONDS, this.zzj.zzp.zzb());
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzb
    public final void zzd(zzzd zzzdVar) {
        this.zzj.zzd.zzd();
        dm5.z(!this.zzg, "already started");
        dm5.z(!this.zzh, "already shutdown");
        dm5.z(!this.zzj.zzO, "Channel is being terminated");
        this.zzg = true;
        zzakp zzakpVar = this.zzj;
        List listZzc = this.zza.zzc();
        String strZzb = zzakpVar.zzb();
        zzahf zzahfVar = zzakpVar.zzai;
        zzaez zzaezVar = zzakpVar.zzp;
        ScheduledExecutorService scheduledExecutorServiceZzb = zzakpVar.zzp.zzb();
        v0d1 v0d1Var = this.zzj.zzx;
        zzakk zzakkVar = new zzakk(this, zzzdVar);
        zzakp zzakpVar2 = this.zzj;
        zzya zzyaVar = zzakpVar2.zzV;
        zzaek zzaekVarZza = zzakpVar2.zzR.zza();
        zzaem zzaemVar = this.zzd;
        zzyj zzyjVar = this.zzb;
        zzael zzaelVar = this.zzc;
        zzakp zzakpVar3 = this.zzj;
        zzaiu zzaiuVar = new zzaiu(listZzc, strZzb, null, zzahfVar, zzaezVar, scheduledExecutorServiceZzb, v0d1Var, zzakpVar3.zzd, zzakkVar, zzyaVar, zzaekVarZza, zzaemVar, zzyjVar, zzaelVar, zzakpVar3.zzB);
        zzaem zzaemVar2 = this.zzj.zzT;
        zzxw zzxwVar = new zzxw();
        zzxwVar.zza("Child Subchannel started");
        zzxwVar.zzb(zzxx.CT_INFO);
        zzxwVar.zzd(this.zzj.zzv.zza());
        zzxwVar.zzc(zzaiuVar);
        zzaemVar2.zzc(zzxwVar.zze());
        this.zzf = zzaiuVar;
        this.zzj.zzV.zzd(zzaiuVar);
        this.zzj.zzH.add(zzaiuVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzb
    public final void zze(List list) {
        this.zzj.zzd.zzd();
        this.zze = list;
        this.zzf.zzG(list);
    }
}
