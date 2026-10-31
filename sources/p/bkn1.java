package p;

import com.google.android.recaptcha.internal.zzalr;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bkn1 {
    public static final bkn1 f = new bkn1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public bkn1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static bkn1 a() {
        return new bkn1(0, new int[8], new Object[8], true);
    }

    public final void b(ltf1 ltf1Var) {
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    w4c0Var.f0(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    w4c0Var.g0(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    w4c0Var.i0(i3, (ain1) obj);
                } else if (i4 == 3) {
                    w4c0Var.b0(i3, 3);
                    ((bkn1) obj).b(ltf1Var);
                    w4c0Var.b0(i3, 4);
                } else {
                    if (i4 != 5) {
                        eg.j(new zzalr());
                        return;
                    }
                    w4c0Var.e0(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iNumberOfLeadingZeros;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iNumberOfLeadingZeros = ((352 - (Integer.numberOfLeadingZeros(i4 << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(((Long) this.c[i2]).longValue()) * 9)) >>> 6);
            } else if (i5 == 1) {
                ((Long) this.c[i2]).getClass();
                iNumberOfLeadingZeros = ((352 - (Integer.numberOfLeadingZeros(i4 << 3) * 9)) >>> 6) + 8;
            } else if (i5 != 2) {
                if (i5 == 3) {
                    int iNumberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(i4 << 3) * 9)) >>> 6;
                    iG = x0d.g(iNumberOfLeadingZeros2, iNumberOfLeadingZeros2, ((bkn1) this.c[i2]).c(), iG);
                } else {
                    if (i5 != 5) {
                        bhn0.p(new zzalr());
                        return 0;
                    }
                    ((Integer) this.c[i2]).getClass();
                    iNumberOfLeadingZeros = ((352 - (Integer.numberOfLeadingZeros(i4 << 3) * 9)) >>> 6) + 4;
                }
            } else {
                int i6 = i4 << 3;
                ain1 ain1Var = (ain1) this.c[i2];
                int iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(i6) * 9;
                int iF = ain1Var.f();
                iNumberOfLeadingZeros = ((352 - iNumberOfLeadingZeros3) >>> 6) + (gvg.b(iF, 9, 352) >>> 6) + iF;
            }
            iG = iNumberOfLeadingZeros + iG;
        }
        this.d = iG;
        return iG;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            k220.c();
            return;
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bkn1)) {
            bkn1 bkn1Var = (bkn1) obj;
            int i = this.a;
            if (i == bkn1Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = bkn1Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.c;
                Object[] objArr2 = bkn1Var.c;
                int i3 = this.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
