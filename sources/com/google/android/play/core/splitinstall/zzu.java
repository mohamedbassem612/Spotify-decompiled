package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzbr;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzu {
    private static zzp zza;

    public static synchronized zzp zza(Context context) {
        zzp zzpVarZzb;
        zzpVarZzb = zza;
        if (zzpVarZzb == null) {
            zzc zzcVar = new zzc(null);
            zzcVar.zza(new zzac(zzbr.zza(context)));
            zzpVarZzb = zzcVar.zzb();
            zza = zzpVarZzb;
        }
        return zzpVarZzb;
    }
}
