package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import p.bhn0;
import p.eg;
import p.ihc;
import p.jc9;
import p.k220;
import p.ot11;
import p.qwg;

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
        int iU0;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int iE = ot11.E(i3);
            int iF = ot11.F(i3);
            if (iF == 0) {
                iU0 = qwg.U0(iE, ((Long) this.c[i2]).longValue());
            } else if (iF == 1) {
                ((Long) this.c[i2]).getClass();
                iU0 = qwg.x0(iE);
            } else if (iF != 2) {
                if (iF == 3) {
                    iA = ((k) this.c[i2]).a() + (qwg.R0(iE) * 2) + iA;
                } else {
                    if (iF != 5) {
                        bhn0.p(InvalidProtocolBufferException.b());
                        return 0;
                    }
                    ((Integer) this.c[i2]).getClass();
                    iU0 = qwg.w0(iE);
                }
            } else {
                iU0 = qwg.r0(iE, (ihc) this.c[i2]);
            }
            iA = iU0 + iA;
        }
        this.d = iA;
        return iA;
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

    public final void d(jc9 jc9Var) {
        if (this.a == 0) {
            return;
        }
        jc9Var.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int iE = ot11.E(i2);
            int iF = ot11.F(i2);
            if (iF == 0) {
                jc9Var.M(iE, ((Long) obj).longValue());
            } else if (iF == 1) {
                jc9Var.E(iE, ((Long) obj).longValue());
            } else if (iF == 2) {
                jc9Var.v(iE, (ihc) obj);
            } else if (iF == 3) {
                jc9Var.Z(iE);
                ((k) obj).d(jc9Var);
                jc9Var.z(iE);
            } else {
                if (iF != 5) {
                    eg.j(InvalidProtocolBufferException.b());
                    return;
                }
                jc9Var.C(iE, ((Integer) obj).intValue());
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
