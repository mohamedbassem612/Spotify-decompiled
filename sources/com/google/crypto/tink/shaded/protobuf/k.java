package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import p.bhn0;
import p.eg;
import p.k220;
import p.ohc;
import p.qxy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
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

    public static k b() {
        return new k(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iH;
        int iJ;
        int iD;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int iX = qxy0.x(i4);
            int iY = qxy0.y(i4);
            if (iY != 0) {
                if (iY == 1) {
                    ((Long) this.c[i3]).getClass();
                    iD = c.d(iX);
                } else if (iY == 2) {
                    iD = c.a(iX, (ohc) this.c[i3]);
                } else if (iY == 3) {
                    iH = c.h(iX) * 2;
                    iJ = ((k) this.c[i3]).a();
                } else {
                    if (iY != 5) {
                        bhn0.p(InvalidProtocolBufferException.b());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    iD = c.c(iX);
                }
                i2 = iD + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iH = c.h(iX);
                iJ = c.j(jLongValue);
            }
            i2 = iJ + iH + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            k220.c();
            return;
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final void d(d dVar) {
        if (this.a == 0) {
            return;
        }
        dVar.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int iX = qxy0.x(i2);
            int iY = qxy0.y(i2);
            if (iY == 0) {
                dVar.u(iX, ((Long) obj).longValue());
            } else if (iY == 1) {
                dVar.m(iX, ((Long) obj).longValue());
            } else if (iY == 2) {
                dVar.d(iX, (ohc) obj);
            } else if (iY == 3) {
                dVar.G(iX);
                ((k) obj).d(dVar);
                dVar.h(iX);
            } else {
                if (iY != 5) {
                    eg.j(InvalidProtocolBufferException.b());
                    return;
                }
                dVar.k(iX, ((Integer) obj).intValue());
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
