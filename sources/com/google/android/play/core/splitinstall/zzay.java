package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import p.bsd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzay extends zzbb {
    public zzay(zzbc zzbcVar, bsd1 bsd1Var) {
        super(zzbcVar, bsd1Var);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzg(int i, Bundle bundle) {
        super.zzg(i, bundle);
        this.zza.d(SplitInstallSessionState.zzd(bundle));
    }
}
