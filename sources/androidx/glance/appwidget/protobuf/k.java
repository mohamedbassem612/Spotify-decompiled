package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import p.bhn0;
import p.eg;
import p.fhc;
import p.fp8;
import p.k220;
import p.owg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k {
    public static final k f = new k(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public k(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(int i) {
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

    public final int b() {
        int iK0;
        int iM0;
        int iK1;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iK1 = owg.k0(i5) + 8;
                } else if (i6 == 2) {
                    iK1 = owg.i0(i5, (fhc) this.c[i3]);
                } else if (i6 == 3) {
                    iK0 = owg.k0(i5) * 2;
                    iM0 = ((k) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        bhn0.p(new InvalidProtocolBufferException$InvalidWireTypeException());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    iK1 = owg.k0(i5) + 4;
                }
                i2 = iK1 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iK0 = owg.k0(i5);
                iM0 = owg.m0(jLongValue);
            }
            i2 = iM0 + iK0 + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            k220.c();
            return;
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(fp8 fp8Var) {
        if (this.a == 0) {
            return;
        }
        fp8Var.getClass();
        owg owgVar = (owg) fp8Var.b;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                owgVar.D0(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                owgVar.u0(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                owgVar.r0(i3, (fhc) obj);
            } else if (i4 == 3) {
                owgVar.A0(i3, 3);
                ((k) obj).d(fp8Var);
                owgVar.A0(i3, 4);
            } else {
                if (i4 != 5) {
                    eg.j(new InvalidProtocolBufferException$InvalidWireTypeException());
                    return;
                }
                owgVar.s0(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        int i = this.a;
        if (i == kVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = kVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = kVar.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
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
}
