package com.google.protobuf;

import java.util.Arrays;
import p.bhn0;
import p.eg;
import p.i6b;
import p.k220;
import p.lwg;
import p.phc;
import p.poz0;
import p.rwg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n {
    public static final n f = new n(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public n(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static n e(n nVar, n nVar2) {
        int i = nVar.a + nVar2.a;
        int[] iArrCopyOf = Arrays.copyOf(nVar.b, i);
        System.arraycopy(nVar2.b, 0, iArrCopyOf, nVar.a, nVar2.a);
        Object[] objArrCopyOf = Arrays.copyOf(nVar.c, i);
        System.arraycopy(nVar2.c, 0, objArrCopyOf, nVar.a, nVar2.a);
        return new n(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final void a() {
        if (this.e) {
            return;
        }
        k220.c();
    }

    public final void b(int i) {
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

    public final int c() {
        int iE;
        int iG;
        int iE2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int iW = poz0.w(i4);
            int iX = poz0.x(i4);
            if (iX != 0) {
                if (iX == 1) {
                    ((Long) this.c[i3]).getClass();
                    iE2 = rwg.e(iW) + 8;
                } else if (iX == 2) {
                    iE2 = rwg.a(iW, (phc) this.c[i3]);
                } else if (iX == 3) {
                    iE = rwg.e(iW) * 2;
                    iG = ((n) this.c[i3]).c();
                } else {
                    if (iX != 5) {
                        bhn0.p(InvalidProtocolBufferException.d());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    iE2 = rwg.e(iW) + 4;
                }
                i2 = iE2 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iE = rwg.e(iW);
                iG = rwg.g(jLongValue);
            }
            i2 = iG + iE + i2;
        }
        this.d = i2;
        return i2;
    }

    public final boolean d(int i, lwg lwgVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZ;
        a();
        int iW = poz0.w(i);
        int iX = poz0.x(i);
        if (iX == 0) {
            f(i, Long.valueOf(lwgVar.r()));
            return true;
        }
        if (iX == 1) {
            f(i, Long.valueOf(lwgVar.o()));
            return true;
        }
        if (iX == 2) {
            f(i, lwgVar.k());
            return true;
        }
        if (iX != 3) {
            if (iX == 4) {
                if (lwgVar.b == 0) {
                    lwgVar.a(0);
                }
                return false;
            }
            if (iX != 5) {
                throw InvalidProtocolBufferException.d();
            }
            f(i, Integer.valueOf(lwgVar.n()));
            return true;
        }
        n nVar = new n();
        do {
            iZ = lwgVar.z();
            if (iZ == 0) {
                break;
            }
        } while (nVar.d(iZ, lwgVar));
        lwgVar.a(poz0.E(iW, 4));
        f(i, nVar);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        int i = this.a;
        if (i == nVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = nVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = nVar.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i, Object obj) {
        a();
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void g(i6b i6bVar) {
        if (this.a == 0) {
            return;
        }
        i6bVar.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int iW = poz0.w(i2);
            int iX = poz0.x(i2);
            if (iX == 0) {
                i6bVar.N(iW, ((Long) obj).longValue());
            } else if (iX == 1) {
                i6bVar.F(iW, ((Long) obj).longValue());
            } else if (iX == 2) {
                i6bVar.t(iW, (phc) obj);
            } else if (iX == 3) {
                i6bVar.b0(iW);
                ((n) obj).g(i6bVar);
                i6bVar.A(iW);
            } else {
                if (iX != 5) {
                    eg.j(InvalidProtocolBufferException.d());
                    return;
                }
                i6bVar.D(iW, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public n() {
        this(0, new int[8], new Object[8], true);
    }
}
