package com.google.android.gms.internal.meet_coactivities;

import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum zzqy implements zztb {
    UNDEFINED(0),
    HEARTBEAT(1),
    UPDATE(2),
    UNRECOGNIZED(-1);

    private final int zzf;

    zzqy(int i) {
        this.zzf = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zztb
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzf;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
