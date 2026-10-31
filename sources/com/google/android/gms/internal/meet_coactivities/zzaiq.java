package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaiq implements Runnable {
    final /* synthetic */ zzabe zza;
    final /* synthetic */ zzais zzb;

    public zzaiq(zzais zzaisVar, zzabe zzabeVar) {
        this.zza = zzabeVar;
        this.zzb = zzaisVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb.zzc.zzu.zza() == zzxa.SHUTDOWN) {
            return;
        }
        zzais zzaisVar = this.zzb;
        zzald zzaldVar = zzaisVar.zzc.zzt;
        zzafa zzafaVar = zzaisVar.zza;
        zzais zzaisVar2 = this.zzb;
        if (zzaldVar == zzafaVar) {
            zzaisVar2.zzc.zzt = null;
            this.zzb.zzc.zzk.zzd();
            zzaiu.zzA(this.zzb.zzc, zzxa.IDLE);
            return;
        }
        zzaiu zzaiuVar = zzaisVar2.zzc;
        if (zzaiuVar.zzs == zzaisVar2.zza) {
            dm5.A(zzaiuVar.zzu.zza() == zzxa.CONNECTING, "Expected state is CONNECTING, actual state is %s", this.zzb.zzc.zzu.zza());
            this.zzb.zzc.zzk.zzc();
            boolean zZzg = this.zzb.zzc.zzk.zzg();
            zzais zzaisVar3 = this.zzb;
            if (zZzg) {
                zzaiu.zzE(zzaisVar3.zzc);
                return;
            }
            zzaisVar3.zzc.zzs = null;
            this.zzb.zzc.zzk.zzd();
            zzaiu.zzD(this.zzb.zzc, this.zza);
        }
    }
}
