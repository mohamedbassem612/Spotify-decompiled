package com.google.android.gms.internal.meet_coactivities;

import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum zzab implements zztb {
    DISABLED_REASON_UNSPECIFIED(0),
    DISALLOWED_BY_HOST(1),
    UNRECOGNIZED(-1);

    private final int zze;

    zzab(int i) {
        this.zze = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zztb
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zze;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
