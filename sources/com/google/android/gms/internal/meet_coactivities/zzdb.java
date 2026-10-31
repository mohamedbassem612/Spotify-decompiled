package com.google.android.gms.internal.meet_coactivities;

import p.j0o1;
import p.m02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzdb {
    public static Throwable zza(Throwable th) {
        zzaaz zzaazVarZza = zzabe.zzc(th).zza();
        if (zzaazVarZza.equals(zzaaz.UNIMPLEMENTED)) {
            return j0o1.D(m02.b);
        }
        return zzaazVarZza.equals(zzaaz.UNAVAILABLE) ? j0o1.D(m02.c) : th;
    }
}
