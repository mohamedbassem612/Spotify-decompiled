package p;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class v61 extends yca {
    public final o4a h;
    public final long i;
    public final long j;
    public final long k;
    public final short l;
    public final short m;
    public final float n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b380 f160p;
    public final rdd1 q;
    public float r;
    public int s;
    public int t;
    public long u;
    public tjh0 v;

    /* JADX WARN: Multi-variable type inference failed */
    public v61(pnf1 pnf1Var, int[] iArr, o4a o4aVar, long j, long j2, long j3, int i, int i2, float f, float f2, b380 b380Var, rdd1 rdd1Var, m mVar) {
        super(pnf1Var, iArr, mVar);
        if (j3 < j) {
            oon1.H("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.h = o4aVar;
        this.i = j * 1000;
        this.j = j2 * 1000;
        this.k = j3 * 1000;
        this.l = i;
        this.m = i2;
        this.n = f;
        this.o = f2;
        this.f160p = b380.p(b380Var);
        this.q = rdd1Var;
        this.r = 1.0f;
        this.t = 0;
        this.u = -9223372036854775807L;
    }

    public static long A(List list) {
        if (!list.isEmpty()) {
            tjh0 tjh0Var = (tjh0) hr80.r(list);
            long j = tjh0Var.g;
            if (j != -9223372036854775807L) {
                long j2 = tjh0Var.h;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static void w(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            v280 v280Var = (v280) arrayList.get(i);
            if (v280Var != null) {
                v280Var.c(new t61(j, jArr[i]));
            }
        }
    }

    @Override // p.qp00
    public int c() {
        return this.s;
    }

    @Override // p.yca, p.qp00
    public void g() {
        this.v = null;
    }

    @Override // p.yca, p.qp00
    public final void i(float f) {
        this.r = f;
    }

    @Override // p.qp00
    public final Object j() {
        return null;
    }

    @Override // p.qp00
    public void l(long j, long j2, long j3, List list, vjh0[] vjh0VarArr) {
        long jA;
        this.q.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.s;
        int i2 = 0;
        if (i >= vjh0VarArr.length || !vjh0VarArr[i].next()) {
            int length = vjh0VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    jA = A(list);
                    break;
                }
                vjh0 vjh0Var = vjh0VarArr[i3];
                if (vjh0Var.next()) {
                    jA = vjh0Var.b() - vjh0Var.a();
                    break;
                }
                i3++;
            }
        } else {
            vjh0 vjh0Var2 = vjh0VarArr[this.s];
            jA = vjh0Var2.b() - vjh0Var2.a();
        }
        long jZ = z();
        int i4 = this.t;
        if (i4 == 0) {
            this.t = 1;
            this.s = y(jElapsedRealtime, jZ);
            return;
        }
        int i5 = this.s;
        if (!list.isEmpty()) {
            ie30 ie30Var = ((tjh0) hr80.r(list)).d;
            while (true) {
                if (i2 >= this.b) {
                    i2 = -1;
                    break;
                } else if (this.d[i2] == ie30Var) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i2 = -1;
            break;
        }
        if (i2 != -1) {
            i4 = ((tjh0) hr80.r(list)).e;
            i5 = i2;
        }
        int iY = y(jElapsedRealtime, jZ);
        if (iY != i5 && !a(i5, jElapsedRealtime)) {
            long jMin = this.i;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jA != -9223372036854775807L ? j3 - jA : j3) * this.o), jMin);
            }
            if ((iY < i5 && j2 < jMin) || (iY > i5 && j2 >= this.j)) {
                iY = i5;
            }
        }
        if (iY != i5) {
            i4 = 3;
        }
        this.t = i4;
        this.s = iY;
    }

    @Override // p.yca, p.qp00
    public void p() {
        this.u = -9223372036854775807L;
        this.v = null;
    }

    @Override // p.yca, p.qp00
    public int q(long j, List list) {
        int i;
        int i2;
        this.q.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.u;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((tjh0) hr80.r(list)).equals(this.v))) {
            return list.size();
        }
        this.u = jElapsedRealtime;
        this.v = list.isEmpty() ? null : (tjh0) hr80.r(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long J = zoi1.J(this.r, ((tjh0) list.get(size - 1)).g - j);
        long j3 = this.k;
        if (J >= j3) {
            A(list);
            ie30 ie30Var = this.d[y(jElapsedRealtime, z())];
            for (int i3 = 0; i3 < size; i3++) {
                tjh0 tjh0Var = (tjh0) list.get(i3);
                ie30 ie30Var2 = tjh0Var.d;
                if (zoi1.J(this.r, tjh0Var.g - j) >= j3 && ie30Var2.k < ie30Var.k && (i = ie30Var2.x) != -1 && i <= this.m && (i2 = ie30Var2.w) != -1 && i2 <= this.l && i < ie30Var.x) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // p.qp00
    public final int t() {
        return this.t;
    }

    public boolean x(ie30 ie30Var, int i, long j) {
        return ((long) i) <= j;
    }

    public final int y(long j, long j2) {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            if (j == Long.MIN_VALUE || !a(i2, j)) {
                ie30 ie30Var = this.d[i2];
                if (x(ie30Var, ie30Var.k, j2)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    public final long z() {
        long jF = (long) (((long) (this.h.f() * this.n)) / this.r);
        b380 b380Var = this.f160p;
        if (b380Var.isEmpty()) {
            return jF;
        }
        int i = 1;
        while (i < b380Var.size() - 1 && ((t61) b380Var.get(i)).a < jF) {
            i++;
        }
        t61 t61Var = (t61) b380Var.get(i - 1);
        t61 t61Var2 = (t61) b380Var.get(i);
        long j = t61Var.a;
        float f = (jF - j) / (t61Var2.a - j);
        long j2 = t61Var.b;
        return j2 + ((long) (f * (t61Var2.b - j2)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v61(pnf1 pnf1Var, int[] iArr, o4a o4aVar) {
        this(pnf1Var, iArr, o4aVar, 10000L, 25000L, 25000L, 1279, 719, 0.7f, 0.75f, bg11.e, rdd1.a, yca.g);
        w280 w280Var = b380.b;
    }
}
