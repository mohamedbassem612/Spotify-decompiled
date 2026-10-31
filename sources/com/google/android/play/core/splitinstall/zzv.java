package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzv implements zzf {
    final /* synthetic */ SplitInstallSessionState zza;
    final /* synthetic */ Intent zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzx zzd;

    public zzv(zzx zzxVar, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.zzd = zzxVar;
        this.zza = splitInstallSessionState;
        this.zzb = intent;
        this.zzc = context;
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zza() {
        zzx.zzh(this.zzd, this.zza, 5, 0);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzb(int i) {
        zzx.zzh(this.zzd, this.zza, 6, i);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzc() {
        if (this.zzb.getBooleanExtra("triggered_from_app_after_verification", false)) {
            zzx.zzf(this.zzd).zzb("Splits copied and verified more than once.", new Object[0]);
        } else {
            this.zzb.putExtra("triggered_from_app_after_verification", true);
            this.zzc.sendBroadcast(this.zzb);
        }
    }
}
