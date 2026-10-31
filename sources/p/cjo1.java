package p;

import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.internal.play_billing.zzgb;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cjo1 {
    public static final cjo1 f = new cjo1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public cjo1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static cjo1 b() {
        return new cjo1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iO;
        int iP;
        int iO2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iO3 = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        n5o1 n5o1Var = (n5o1) this.c[i2];
                        int iO4 = x6o1.o(i6);
                        int iE = n5o1Var.e();
                        iO3 = lqn1.o(iE, iE, iO4, iO3);
                    } else if (i5 == 3) {
                        int iO5 = x6o1.o(i4 << 3);
                        iO = iO5 + iO5;
                        iP = ((cjo1) this.c[i2]).a();
                    } else {
                        if (i5 != 5) {
                            bhn0.p(new zzgb());
                            return 0;
                        }
                        ((Integer) this.c[i2]).getClass();
                        iO2 = x6o1.o(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iO2 = x6o1.o(i4 << 3) + 8;
                }
                iO3 = iO2 + iO3;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iO = x6o1.o(i7);
                iP = x6o1.p(jLongValue);
            }
            iO3 = iP + iO + iO3;
        }
        this.d = iO3;
        return iO3;
    }

    public final void c(int i, Object obj) {
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

    public final void d(qeh1 qeh1Var) throws zzfa {
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    x6o1Var.m(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    x6o1Var.f(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    x6o1Var.c(i4, (n5o1) obj);
                } else if (i3 == 3) {
                    x6o1Var.j(i4, 3);
                    ((cjo1) obj).d(qeh1Var);
                    x6o1Var.j(i4, 4);
                } else {
                    if (i3 != 5) {
                        eg.j(new zzgb());
                        return;
                    }
                    x6o1Var.d(i4, ((Integer) obj).intValue());
                }
            }
        }
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
        if (obj != null && (obj instanceof cjo1)) {
            cjo1 cjo1Var = (cjo1) obj;
            int i = this.a;
            if (i == cjo1Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = cjo1Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.c;
                Object[] objArr2 = cjo1Var.c;
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
