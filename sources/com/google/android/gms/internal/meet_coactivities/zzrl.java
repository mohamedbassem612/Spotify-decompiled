package com.google.android.gms.internal.meet_coactivities;

import p.cy30;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzrl extends zzrq {
    private final int zzc;

    public zzrl(byte[] bArr, int i, int i2) {
        super(bArr);
        zzrr.zzi(0, i2, bArr.length);
        this.zzc = i2;
    }

    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzrq) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(f4i1.c(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(cy30.i(i, "Index > length: ", i2, ", "));
    }

    public final byte zzb(int i) {
        return ((zzrq) this).zza[i];
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzrq) this).zza, 0, bArr, 0, i3);
    }
}
