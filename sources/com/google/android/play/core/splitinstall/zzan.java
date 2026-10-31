package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import java.util.List;
import p.bsd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzan extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ List zza;
    final /* synthetic */ bsd1 zzb;
    final /* synthetic */ zzbc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzbc zzbcVar, bsd1 bsd1Var, List list, bsd1 bsd1Var2) {
        super(bsd1Var);
        this.zzc = zzbcVar;
        this.zza = list;
        this.zzb = bsd1Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        try {
            this.zzc.zza.zze().zzd(this.zzc.zzd, zzbc.zzn(this.zza), zzbc.zzo(), new zzau(this.zzc, this.zzb));
        } catch (RemoteException e) {
            zzbc.zzb.zzc(e, "deferredInstall(%s)", new Object[]{this.zza});
            this.zzb.c(new RuntimeException(e));
        }
    }
}
