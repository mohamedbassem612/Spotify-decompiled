package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import p.bsd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzal extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ Collection zza;
    final /* synthetic */ Collection zzb;
    final /* synthetic */ com.google.android.play.core.splitinstall.internal.zzn zzc;
    final /* synthetic */ bsd1 zzd;
    final /* synthetic */ zzbc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzbc zzbcVar, bsd1 bsd1Var, Collection collection, Collection collection2, com.google.android.play.core.splitinstall.internal.zzn zznVar, bsd1 bsd1Var2) {
        super(bsd1Var);
        this.zze = zzbcVar;
        this.zza = collection;
        this.zzb = collection2;
        this.zzc = zznVar;
        this.zzd = bsd1Var2;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        ArrayList arrayListZzn = zzbc.zzn(this.zza);
        arrayListZzn.addAll(zzbc.zzm(this.zzb));
        try {
            this.zzc.zzb(2);
            this.zze.zza.zze().zzj(this.zze.zzd, arrayListZzn, zzbc.zzb(this.zzc), new zzba(this.zze, this.zzd));
        } catch (RemoteException e) {
            zzbc.zzb.zzc(e, "startInstall(%s,%s)", new Object[]{this.zza, this.zzb});
            this.zzd.c(new RuntimeException(e));
        }
    }
}
