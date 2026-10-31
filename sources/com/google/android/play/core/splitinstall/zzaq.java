package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import p.bsd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaq extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ int zza;
    final /* synthetic */ bsd1 zzb;
    final /* synthetic */ zzbc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(zzbc zzbcVar, bsd1 bsd1Var, int i, bsd1 bsd1Var2) {
        super(bsd1Var);
        this.zzc = zzbcVar;
        this.zza = i;
        this.zzb = bsd1Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        try {
            ?? Zze = this.zzc.zza.zze();
            zzbc zzbcVar = this.zzc;
            Zze.zzh(zzbcVar.zzd, this.zza, new zzay(zzbcVar, this.zzb));
        } catch (RemoteException e) {
            zzbc.zzb.zzc(e, "getSessionState(%d)", new Object[]{Integer.valueOf(this.zza)});
            this.zzb.c(new RuntimeException(e));
        }
    }
}
