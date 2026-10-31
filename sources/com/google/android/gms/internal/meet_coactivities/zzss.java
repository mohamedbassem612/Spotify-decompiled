package com.google.android.gms.internal.meet_coactivities;

import p.bhn0;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
final class zzss implements zzud {
    private static final zzss zza = new zzss();

    private zzss() {
    }

    public static zzss zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzud
    public final zzuc zzb(Class cls) {
        if (!zzsz.class.isAssignableFrom(cls)) {
            hhg1.n("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (zzuc) zzsz.zzC(cls.asSubclass(zzsz.class)).zzi(3, null, null);
        } catch (Exception e) {
            bhn0.o("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzud
    public final boolean zzc(Class cls) {
        return zzsz.class.isAssignableFrom(cls);
    }
}
