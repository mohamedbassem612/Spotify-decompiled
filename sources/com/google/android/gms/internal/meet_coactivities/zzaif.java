package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaif implements Runnable {
    final /* synthetic */ List zza;
    final /* synthetic */ zzaiu zzb;

    public zzaif(zzaiu zzaiuVar, List list) {
        this.zza = list;
        this.zzb = zzaiuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzald zzaldVar;
        SocketAddress socketAddressZzb = this.zzb.zzk.zzb();
        this.zzb.zzk.zze(this.zza);
        this.zzb.zzl = this.zza;
        zzxa zzxaVarZza = this.zzb.zzu.zza();
        zzxa zzxaVar = zzxa.READY;
        if ((zzxaVarZza == zzxaVar || this.zzb.zzu.zza() == zzxa.CONNECTING) && !this.zzb.zzk.zzh(socketAddressZzb)) {
            zzxa zzxaVarZza2 = this.zzb.zzu.zza();
            zzaiu zzaiuVar = this.zzb;
            if (zzxaVarZza2 == zzxaVar) {
                zzaldVar = zzaiuVar.zzt;
                zzaiuVar.zzt = null;
                this.zzb.zzk.zzd();
                zzaiu.zzA(this.zzb, zzxa.IDLE);
            } else {
                zzaiuVar.zzs.zzm(zzabe.zzk.zze("InternalSubchannel closed pending transport due to address change"));
                this.zzb.zzs = null;
                this.zzb.zzk.zzd();
                zzaiu.zzE(this.zzb);
                zzaldVar = null;
            }
        } else {
            zzaldVar = null;
        }
        if (zzaldVar != null) {
            zzaiu zzaiuVar2 = this.zzb;
            if (zzaiuVar2.zzo != null) {
                zzaiuVar2.zzp.zzm(zzabe.zzk.zze("InternalSubchannel closed transport early due to address change"));
                this.zzb.zzo.zza();
                this.zzb.zzo = null;
                this.zzb.zzp = null;
            }
            this.zzb.zzp = zzaldVar;
            zzaiu zzaiuVar3 = this.zzb;
            zzaiuVar3.zzo = zzaiuVar3.zzj.zza(new zzaie(this), 5L, TimeUnit.SECONDS, zzaiuVar3.zze);
        }
    }
}
