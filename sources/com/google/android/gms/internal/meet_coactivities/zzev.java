package com.google.android.gms.internal.meet_coactivities;

import android.net.Uri;
import p.eg;
import p.fqn1;
import p.u02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class zzev implements Runnable {
    public final /* synthetic */ zzez zza;
    public final /* synthetic */ zzr zzb;

    public /* synthetic */ zzev(zzez zzezVar, zzr zzrVar) {
        this.zza = zzezVar;
        this.zzb = zzrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u02 u02VarZzd = ((zzil) zzfa.zzz(this.zza.zza).get()).zzd();
        zzr zzrVar = this.zzb;
        if (zzrVar == null) {
            eg.f("Empty collaboration starting state proto");
            return;
        }
        fqn1 fqn1Var = new fqn1((byte) 14);
        fqn1Var.b = zzrVar.zzd();
        fqn1Var.c = Uri.parse(zzrVar.zze());
        fqn1Var.d = Uri.parse(zzrVar.zzf());
        fqn1Var.c();
        u02VarZzd.getClass();
    }
}
