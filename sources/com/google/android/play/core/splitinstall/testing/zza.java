package com.google.android.play.core.splitinstall.testing;

import java.util.Map;
import p.bhn0;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zza extends zzu {
    private Integer zza;
    private Map zzb;

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final zzu zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final zzu zzb(Map map) {
        if (map != null) {
            this.zzb = map;
            return this;
        }
        bhn0.i("Null splitInstallErrorCodeByModule");
        return null;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final zzv zzc() {
        if (this.zzb != null) {
            return new zzc(this.zza, this.zzb, null);
        }
        eg.m("Missing required properties: splitInstallErrorCodeByModule");
        return null;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final Map zzd() {
        Map map = this.zzb;
        if (map != null) {
            return map;
        }
        eg.m("Property \"splitInstallErrorCodeByModule\" has not been set");
        return null;
    }
}
