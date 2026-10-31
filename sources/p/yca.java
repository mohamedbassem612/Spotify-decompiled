package p;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class yca implements qp00 {
    public static final m g = new m(3);
    public final pnf1 a;
    public final int b;
    public final int[] c;
    public final ie30[] d;
    public final long[] e;
    public int f;

    public yca(pnf1 pnf1Var, int[] iArr, Comparator comparator) {
        ie30[] ie30VarArr;
        int i = 0;
        dm5.y(iArr.length > 0);
        pnf1Var.getClass();
        this.a = pnf1Var;
        int length = iArr.length;
        this.b = length;
        this.d = new ie30[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            ie30VarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            ie30VarArr[i2] = pnf1Var.d[iArr[i2]];
            i2++;
        }
        comparator.getClass();
        Arrays.sort(ie30VarArr, comparator);
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = pnf1Var.b(this.d[i]);
                i++;
            }
        }
    }

    @Override // p.qp00
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // p.qp00
    public final void d() {
        Arrays.fill(this.e, 0L);
    }

    @Override // p.qp00
    public final ie30 e(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            yca ycaVar = (yca) obj;
            if (this.a.equals(ycaVar.a) && Arrays.equals(this.c, ycaVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p.qp00
    public final int f(int i) {
        return this.c[i];
    }

    @Override // p.qp00
    public final boolean h(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zA) {
            zA = (i2 == i || a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], zoi1.a(jElapsedRealtime, j));
        return true;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.f = iHashCode;
        return iHashCode;
    }

    @Override // p.qp00
    public final int length() {
        return this.c.length;
    }

    @Override // p.qp00
    public final int m(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p.qp00
    public final pnf1 n() {
        return this.a;
    }

    @Override // p.qp00
    public int q(long j, List list) {
        return list.size();
    }

    @Override // p.qp00
    public final int r() {
        return this.c[c()];
    }

    @Override // p.qp00
    public final ie30 s() {
        return this.d[c()];
    }

    @Override // p.qp00
    public void g() {
    }

    @Override // p.qp00
    public void p() {
    }

    @Override // p.qp00
    public void i(float f) {
    }

    @Override // p.qp00
    public final void o(boolean z) {
    }

    public yca(int i, pnf1 pnf1Var, int[] iArr) {
        this(pnf1Var, iArr, g);
    }
}
