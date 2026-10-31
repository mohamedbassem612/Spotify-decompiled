package p;

import com.google.android.gms.internal.wearable.zzcm;
import com.google.android.gms.internal.wearable.zzdu;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n8o1 {
    public static final n8o1 f = new n8o1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public n8o1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static n8o1 a() {
        return new n8o1(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzcm */
    public final void b(y1t0 y1t0Var) throws zzcm {
        vun1 vun1Var = (vun1) y1t0Var.b;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    vun1Var.e(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    vun1Var.f(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    vun1Var.i(i4, (gun1) obj);
                } else if (i3 == 3) {
                    vun1Var.a(i4, 3);
                    ((n8o1) obj).b(y1t0Var);
                    vun1Var.a(i4, 4);
                } else {
                    if (i3 != 5) {
                        eg.j(new zzdu());
                        return;
                    }
                    vun1Var.d(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iQ;
        int iR;
        int iQ2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iE = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        gun1 gun1Var = (gun1) this.c[i2];
                        int iQ3 = vun1.q(i6);
                        int iC = gun1Var.c();
                        iE = lqn1.e(iC, iC, iQ3, iE);
                    } else if (i5 == 3) {
                        int iQ4 = vun1.q(i4 << 3);
                        iQ = iQ4 + iQ4;
                        iR = ((n8o1) this.c[i2]).c();
                    } else {
                        if (i5 != 5) {
                            bhn0.p(new zzdu());
                            return 0;
                        }
                        ((Integer) this.c[i2]).getClass();
                        iQ2 = vun1.q(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iQ2 = vun1.q(i4 << 3) + 8;
                }
                iE = iQ2 + iE;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iQ = vun1.q(i7);
                iR = vun1.r(jLongValue);
            }
            iE = iR + iQ + iE;
        }
        this.d = iE;
        return iE;
    }

    public final void d(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < this.a; i2++) {
            s4o1.a(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void e(int i, Object obj) {
        if (!this.e) {
            k220.c();
            return;
        }
        f(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof n8o1)) {
            n8o1 n8o1Var = (n8o1) obj;
            int i = this.a;
            if (i == n8o1Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = n8o1Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.c;
                Object[] objArr2 = n8o1Var.c;
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

    public final void f(int i) {
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
