package p;

import com.google.android.gms.internal.wearable.zzcm;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vun1 {
    public static final boolean e = n9o1.d;
    public y1t0 a;
    public final byte[] b;
    public final int c;
    public int d;

    public vun1(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            hhg1.n(cy30.i(length, "Array range is invalid. Buffer.length=", i, ", offset=0, length="));
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int q(int i) {
        return gvg.b(i, 9, 352) >>> 6;
    }

    public static int r(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void a(int i, int i2) throws zzcm {
        l((i << 3) | i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void b(int i, int i2) throws zzcm {
        l(i << 3);
        k(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void c(int i, int i2) throws zzcm {
        l(i << 3);
        l(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void d(int i, int i2) throws zzcm {
        l((i << 3) | 5);
        m(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void e(int i, long j) throws zzcm {
        l(i << 3);
        n(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void f(int i, long j) throws zzcm {
        l((i << 3) | 1);
        o(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void g(int i, boolean z) throws zzcm {
        l(i << 3);
        j(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void h(int i, String str) throws zzcm {
        l((i << 3) | 2);
        int i2 = this.d;
        try {
            int iQ = q(str.length() * 3);
            int iQ2 = q(str.length());
            byte[] bArr = this.b;
            if (iQ2 != iQ) {
                l(jao1.b(str));
                int i3 = this.d;
                this.d = jao1.c(str, bArr, i3, bArr.length - i3);
            } else {
                int i4 = i2 + iQ2;
                this.d = i4;
                int iC = jao1.c(str, bArr, i4, bArr.length - i4);
                this.d = i2;
                l((iC - i2) - iQ2);
                this.d = iC;
            }
        } catch (IndexOutOfBoundsException e2) {
            throw new zzcm("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void i(int i, gun1 gun1Var) throws zzcm {
        l((i << 3) | 2);
        l(gun1Var.c());
        gun1Var.f(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void j(byte b) throws zzcm {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i = i2;
                throw new zzcm(i, this.c, 1, e);
            }
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void k(int i) throws zzcm {
        if (i >= 0) {
            l(i);
        } else {
            n(i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void l(int i) throws zzcm {
        int i2;
        int i3 = this.d;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.b;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.d = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzcm(i2, this.c, 1, e2);
                }
            }
            throw new zzcm(i2, this.c, 1, e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void m(int i) throws zzcm {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzcm(i2, this.c, 4, e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void n(long j) throws zzcm {
        int i;
        int i2 = this.d;
        byte[] bArr = this.b;
        int i3 = this.c;
        if (!e || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i = i4;
                    throw new zzcm(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                throw new zzcm(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                n9o1.c.k(n9o1.e + ((long) i2), bArr, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            n9o1.c.k(n9o1.e + ((long) i2), bArr, (byte) j);
        }
        this.d = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void o(long j) throws zzcm {
        int i = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.d = i + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzcm(i, this.c, 8, e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void p(int i, byte[] bArr, int i2) throws zzcm {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzcm(this.d, this.c, i2, e2);
        }
    }
}
