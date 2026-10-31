package p;

import com.google.android.gms.internal.cast.zzxo;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fhp1 extends ppo1 {
    public static final Logger i = Logger.getLogger(fhp1.class.getName());
    public static final boolean j = dcn1.e;
    public i2i1 e;
    public final byte[] f;
    public final int g;
    public int h;

    public fhp1(byte[] bArr, int i2) {
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            hhg1.n(cy30.i(length, "Array range is invalid. Buffer.length=", i2, ", offset=0, length="));
            throw null;
        }
        this.f = bArr;
        this.h = 0;
        this.g = i2;
    }

    public static int L(int i2) {
        return gvg.b(i2, 9, 352) >>> 6;
    }

    public static int M(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int N(String str) {
        int length;
        try {
            length = gcn1.a(str);
        } catch (ecn1 unused) {
            length = str.getBytes(mip1.a).length;
        }
        return L(length) + length;
    }

    public final void A(int i2, int i3) throws zzxo {
        G((i2 << 3) | 5);
        H(i3);
    }

    public final void B(int i2, long j2) throws zzxo {
        G(i2 << 3);
        I(j2);
    }

    public final void C(int i2, long j2) throws zzxo {
        G((i2 << 3) | 1);
        J(j2);
    }

    public final void D(int i2, String str) throws zzxo {
        G((i2 << 3) | 2);
        int i3 = this.h;
        try {
            int iL = L(str.length() * 3);
            int iL2 = L(str.length());
            int i4 = this.g;
            byte[] bArr = this.f;
            if (iL2 != iL) {
                G(gcn1.a(str));
                int i5 = this.h;
                this.h = gcn1.b(str, bArr, i5, i4 - i5);
            } else {
                int i6 = i3 + iL2;
                this.h = i6;
                int iB = gcn1.b(str, bArr, i6, i4 - i6);
                this.h = i3;
                G((iB - i3) - iL2);
                this.h = iB;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(e);
        } catch (ecn1 e2) {
            this.h = i3;
            i.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(mip1.a);
            try {
                int length = bytes.length;
                G(length);
                K(bytes, length);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzxo(e3);
            }
        }
    }

    public final void E(int i2, ahp1 ahp1Var) throws zzxo {
        G((i2 << 3) | 2);
        G(ahp1Var.d());
        K(ahp1Var.b, ahp1Var.d());
    }

    public final void F(int i2) throws zzxo {
        if (i2 >= 0) {
            G(i2);
        } else {
            I(i2);
        }
    }

    public final void G(int i2) throws zzxo {
        int i3;
        int i4 = this.h;
        while (true) {
            int i5 = i2 & (-128);
            byte[] bArr = this.f;
            if (i5 == 0) {
                i3 = i4 + 1;
                bArr[i4] = (byte) i2;
                this.h = i3;
                return;
            } else {
                i3 = i4 + 1;
                try {
                    bArr[i4] = (byte) (i2 | 128);
                    i2 >>>= 7;
                    i4 = i3;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzxo(i3, this.g, 1, e);
                }
            }
            throw new zzxo(i3, this.g, 1, e);
        }
    }

    public final void H(int i2) throws zzxo {
        int i3 = this.h;
        try {
            byte[] bArr = this.f;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            bArr[i3 + 3] = (byte) (i2 >> 24);
            this.h = i3 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(i3, this.g, 4, e);
        }
    }

    public final void I(long j2) throws zzxo {
        int i2;
        int i3 = this.h;
        byte[] bArr = this.f;
        int i4 = this.g;
        if (!j || i4 - i3 < 10) {
            while ((j2 & (-128)) != 0) {
                int i5 = i3 + 1;
                try {
                    bArr[i3] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i3 = i5;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i2 = i5;
                    throw new zzxo(i2, i4, 1, e);
                }
            }
            i2 = i3 + 1;
            try {
                bArr[i3] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzxo(i2, i4, 1, e);
            }
        } else {
            while ((j2 & (-128)) != 0) {
                dcn1.c.k(dcn1.f + ((long) i3), bArr, (byte) (((int) j2) | 128));
                j2 >>>= 7;
                i3++;
            }
            i2 = i3 + 1;
            dcn1.c.k(dcn1.f + ((long) i3), bArr, (byte) j2);
        }
        this.h = i2;
    }

    public final void J(long j2) throws zzxo {
        int i2 = this.h;
        try {
            byte[] bArr = this.f;
            bArr[i2] = (byte) j2;
            bArr[i2 + 1] = (byte) (j2 >> 8);
            bArr[i2 + 2] = (byte) (j2 >> 16);
            bArr[i2 + 3] = (byte) (j2 >> 24);
            bArr[i2 + 4] = (byte) (j2 >> 32);
            bArr[i2 + 5] = (byte) (j2 >> 40);
            bArr[i2 + 6] = (byte) (j2 >> 48);
            bArr[i2 + 7] = (byte) (j2 >> 56);
            this.h = i2 + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(i2, this.g, 8, e);
        }
    }

    public final void K(byte[] bArr, int i2) throws zzxo {
        try {
            System.arraycopy(bArr, 0, this.f, this.h, i2);
            this.h += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzxo(this.h, this.g, i2, e);
        }
    }

    public final void x(int i2, int i3) throws zzxo {
        G((i2 << 3) | i3);
    }

    public final void y(int i2, int i3) throws zzxo {
        G(i2 << 3);
        F(i3);
    }

    public final void z(int i2, int i3) throws zzxo {
        G(i2 << 3);
        G(i3);
    }
}
