package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.zzbp;
import java.util.List;
import p.bsd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
class zzbb extends zzbp {
    final bsd1 zza;
    final /* synthetic */ zzbc zzb;

    public zzbb(zzbc zzbcVar, bsd1 bsd1Var) {
        this.zzb = zzbcVar;
        this.zza = bsd1Var;
    }

    public void zzb(int i, Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onCancelInstall(%d)", new Object[]{Integer.valueOf(i)});
    }

    public void zzc(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onDeferredInstall", new Object[0]);
    }

    public void zzd(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onDeferredLanguageInstall", new Object[0]);
    }

    public void zze(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onDeferredLanguageUninstall", new Object[0]);
    }

    public void zzf(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onDeferredUninstall", new Object[0]);
    }

    public void zzg(int i, Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onGetSession(%d)", new Object[]{Integer.valueOf(i)});
    }

    public void zzh(List list) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onGetSessionStates", new Object[0]);
    }

    public void zzi(int i, Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onStartInstall(%d)", new Object[]{Integer.valueOf(i)});
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzj(int i, Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onCompleteInstall(%d)", new Object[]{Integer.valueOf(i)});
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzk(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzl(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        int i = bundle.getInt("error_code");
        zzbc.zzb.zzb("onError(%d)", new Object[]{Integer.valueOf(i)});
        this.zza.c(new SplitInstallException(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzm(Bundle bundle) {
        this.zzb.zza.zzu(this.zza);
        zzbc.zzb.zzd("onGetSplitsForAppUpdate", new Object[0]);
    }
}
