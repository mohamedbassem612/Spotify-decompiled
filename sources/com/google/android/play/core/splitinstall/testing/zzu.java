package com.google.android.play.core.splitinstall.testing;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
abstract class zzu {
    public abstract zzu zza(int i);

    public abstract zzu zzb(Map map);

    public abstract zzv zzc();

    public abstract Map zzd();

    public final zzv zze() {
        zzb(Collections.unmodifiableMap(zzd()));
        return zzc();
    }
}
