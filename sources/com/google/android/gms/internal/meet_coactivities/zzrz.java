package com.google.android.gms.internal.meet_coactivities;

import p.bhn0;
import p.k220;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
final class zzrz extends zzsc {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzrz(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr == null) {
            bhn0.i("buffer");
            throw null;
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            k220.q("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)});
            throw null;
        }
        this.zzc = bArr;
        this.zze = i;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final int zza() {
        return this.zzd - this.zze;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzb(byte b) throws zzsa {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            this.zze = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzsa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzsa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i2)), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzd(int i, boolean z) throws zzsa {
        zzs(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zze(int i, zzrr zzrrVar) throws zzsa {
        zzs((i << 3) | 2);
        zzf(zzrrVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzf(zzrr zzrrVar) throws zzsa {
        zzs(zzrrVar.zzd());
        zzrrVar.zzh(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzg(int i, int i2) throws zzsa {
        zzs((i << 3) | 5);
        zzh(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzh(int i) throws zzsa {
        try {
            byte[] bArr = this.zzc;
            int i2 = this.zze;
            int i3 = i2 + 1;
            this.zze = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.zze = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.zze = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.zze = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzsa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzi(int i, long j) throws zzsa {
        zzs((i << 3) | 1);
        zzj(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzj(long j) throws zzsa {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            int i2 = i + 1;
            this.zze = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.zze = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.zze = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.zze = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.zze = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.zze = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.zze = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.zze = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzsa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzk(int i, int i2) throws zzsa {
        zzs(i << 3);
        zzl(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzl(int i) throws zzsa {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzm(byte[] bArr, int i, int i2) {
        zzc(bArr, 0, i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzn(zzuf zzufVar) throws zzsa {
        zzs(zzufVar.zzz());
        zzufVar.zzS(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzo(int i, String str) throws zzsa {
        zzs((i << 3) | 2);
        zzp(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzp(String str) throws zzsa {
        int i = this.zze;
        try {
            int iZzz = zzsc.zzz(str.length() * 3);
            int iZzz2 = zzsc.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzs(zzvp.zzc(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzvp.zzb(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + iZzz2;
            this.zze = i3;
            int iZzb = zzvp.zzb(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzs((iZzb - i) - iZzz2);
            this.zze = iZzb;
        } catch (zzvo e) {
            this.zze = i;
            zzD(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzsa(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzq(int i, int i2) throws zzsa {
        zzs((i << 3) | i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzr(int i, int i2) throws zzsa {
        zzs(i << 3);
        zzs(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzs(int i) throws zzsa {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.zzc;
            if (i2 == 0) {
                int i3 = this.zze;
                this.zze = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.zze;
                    this.zze = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzsa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            }
            throw new zzsa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzt(int i, long j) throws zzsa {
        zzs(i << 3);
        zzu(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zzsa */
    @Override // com.google.android.gms.internal.meet_coactivities.zzsc
    public final void zzu(long j) throws zzsa {
        if (!zzsc.zzd || this.zzd - this.zze < 10) {
            while (true) {
                long j2 = j & (-128);
                byte[] bArr = this.zzc;
                if (j2 == 0) {
                    int i = this.zze;
                    this.zze = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        int i2 = this.zze;
                        this.zze = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzsa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                    }
                }
                throw new zzsa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = (int) j;
            byte[] bArr2 = this.zzc;
            if (j3 == 0) {
                int i4 = this.zze;
                this.zze = i4 + 1;
                zzvm.zzn(bArr2, i4, (byte) i3);
                return;
            } else {
                int i5 = this.zze;
                this.zze = i5 + 1;
                zzvm.zzn(bArr2, i5, (byte) ((i3 | 128) & 255));
                j >>>= 7;
            }
        }
    }
}
