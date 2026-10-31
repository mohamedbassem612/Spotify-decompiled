package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicLong;
import p.dm5;
import p.pze0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzyj {
    private static final AtomicLong zza = new AtomicLong();
    private final String zzb;
    private final String zzc;
    private final long zzd;

    public zzyj(String str, String str2, long j) {
        dm5.s(str, "typeName");
        dm5.n(!str.isEmpty(), "empty type");
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j;
    }

    public static zzyj zzb(Class cls, String str) {
        dm5.s(cls, "type");
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return zzc(simpleName, str);
    }

    public static zzyj zzc(String str, String str2) {
        return new zzyj(str, str2, zza.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        sb.append("<");
        StringBuilder sb2 = new StringBuilder(pze0.h(this.zzd, ">", sb));
        if (this.zzc != null) {
            sb2.append(": (");
            sb2.append(this.zzc);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public final long zza() {
        return this.zzd;
    }
}
