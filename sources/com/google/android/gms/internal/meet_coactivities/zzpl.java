package com.google.android.gms.internal.meet_coactivities;

import java.io.Closeable;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzpl implements Closeable {
    private static final ThreadLocal zza = new zzpk();
    private int zzb = 0;

    public static int zza() {
        return ((zzpl) zza.get()).zzb;
    }

    public static zzpl zzc() {
        zzpl zzplVar = (zzpl) zza.get();
        int i = zzplVar.zzb + 1;
        zzplVar.zzb = i;
        if (i != 0) {
            return zzplVar;
        }
        eg.f("Overflow of RecursionDepth (possible error in core library)");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i > 0) {
            this.zzb = i - 1;
        } else {
            eg.f("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }

    public final int zzb() {
        return this.zzb;
    }
}
