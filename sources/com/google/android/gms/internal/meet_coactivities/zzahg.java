package com.google.android.gms.internal.meet_coactivities;

import java.util.Random;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzahg {
    private final Random zza = new Random();
    private final long zzb = 1000000000;
    private final long zzc = 120000000000L;
    private long zzd = 1000000000;

    public final long zza() {
        long j = this.zzd;
        double d = j;
        this.zzd = Math.min((long) (1.6d * d), this.zzc);
        double d2 = 0.2d * d;
        double d3 = d * (-0.2d);
        dm5.m(d2 >= d3);
        return j + ((long) ((this.zza.nextDouble() * (d2 - d3)) + d3));
    }
}
