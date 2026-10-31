package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaip implements Runnable {
    final /* synthetic */ zzais zza;

    public zzaip(zzais zzaisVar) {
        this.zza = zzaisVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzc.zzw = null;
        zzais zzaisVar = this.zza;
        zzaiu zzaiuVar = zzaisVar.zzc;
        if (zzaiuVar.zzv != null) {
            dm5.z(zzaiuVar.zzt == null, "Unexpected non-null activeTransport");
            zzais zzaisVar2 = this.zza;
            zzaisVar2.zza.zzm(zzaisVar2.zzc.zzv);
        } else {
            zzafa zzafaVar = zzaisVar.zza;
            if (zzaiuVar.zzs == zzafaVar) {
                zzaiuVar.zzt = zzafaVar;
                this.zza.zzc.zzs = null;
                zzaiu.zzA(this.zza.zzc, zzxa.READY);
            }
        }
    }
}
