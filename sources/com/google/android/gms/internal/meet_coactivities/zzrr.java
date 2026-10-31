package com.google.android.gms.internal.meet_coactivities;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p.cy30;
import p.eg;
import p.gvg;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zzrr implements Iterable, Serializable {
    public static final zzrr zzb = new zzrq(zzth.zzb);
    private int zza = 0;

    static {
        int i = zzre.zza;
    }

    public static int zzi(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            eg.g(gvg.e(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            eg.g(cy30.i(i, "Beginning index larger than ending index: ", i2, ", "));
            return 0;
        }
        eg.g(cy30.i(i2, "End index: ", i3, " >= "));
        return 0;
    }

    public static zzrr zzk(byte[] bArr, int i, int i2) {
        zzi(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzrq(bArr2);
    }

    public static zzrr zzl(String str) {
        return new zzrq(str.getBytes(zzth.zza));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzf = this.zza;
        if (iZzf == 0) {
            int iZzd = zzd();
            iZzf = zzf(iZzd, 0, iZzd);
            if (iZzf == 0) {
                iZzf = 1;
            }
            this.zza = iZzf;
        }
        return iZzf;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzrj(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return l1d.n(zzd() <= 50 ? zzvd.zza(this) : zzvd.zza(zzg(0, 47)).concat("..."), "\">", l1d.s(zzd(), "<ByteString@", hexString, " size=", " contents=\""));
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zzrr zzg(int i, int i2);

    public abstract void zzh(zzri zzriVar);

    public final int zzj() {
        return this.zza;
    }

    public final boolean zzm() {
        return zzd() == 0;
    }

    public final byte[] zzn() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzth.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
