package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzbd implements zzan {
    public static void zzc(ClassLoader classLoader, Set set) {
        zzay.zzc(classLoader, set, new zzbb());
    }

    public static boolean zzd(ClassLoader classLoader, File file, File file2, boolean z) {
        return zzat.zze(classLoader, file, file2, z, new zzav(), "path", new zzbc());
    }

    public final void zza(ClassLoader classLoader, Set set) {
        zzc(classLoader, set);
    }

    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z) {
        return zzd(classLoader, file, file2, z);
    }
}
