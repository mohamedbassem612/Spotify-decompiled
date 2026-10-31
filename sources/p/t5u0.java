package p;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t5u0 {
    public long A;
    public long B;
    public long C;
    public long D;
    public int E;
    public int F;
    public int G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public long N;
    public ie30 O;
    public ie30 P;
    public long Q;
    public long R;
    public float S;
    public final long[] a = new long[16];
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final boolean h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f137p;
    public long q;
    public int r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public t5u0(tz3 tz3Var) {
        List list = Collections.EMPTY_LIST;
        this.b = list;
        this.c = list;
        this.d = list;
        this.e = list;
        this.f = list;
        this.g = list;
        boolean z = false;
        this.G = 0;
        this.H = tz3Var.a;
        this.i = -9223372036854775807L;
        this.q = -9223372036854775807L;
        p2i0 p2i0Var = tz3Var.d;
        if (p2i0Var != null && p2i0Var.c()) {
            z = true;
        }
        this.h = z;
        this.t = -1L;
        this.s = -1L;
        this.r = -1;
        this.S = 1.0f;
    }

    public static boolean b(int i) {
        return i == 6 || i == 7 || i == 10;
    }

    public final s5u0 a(boolean z) {
        List arrayList;
        long[] jArrCopyOf = this.a;
        List list = this.c;
        if (z) {
            arrayList = list;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, 16);
            long jMax = Math.max(0L, jElapsedRealtime - this.H);
            int i = this.G;
            jArrCopyOf[i] = jArrCopyOf[i] + jMax;
            f(jElapsedRealtime);
            d(jElapsedRealtime);
            c(jElapsedRealtime);
            arrayList = new ArrayList(list);
        }
        long[] jArr = jArrCopyOf;
        int i2 = (this.l || !this.j) ? 1 : 0;
        long j = i2 != 0 ? -9223372036854775807L : jArr[2];
        int i3 = jArr[1] > 0 ? 1 : 0;
        List list2 = this.d;
        List arrayList2 = z ? list2 : new ArrayList(list2);
        List list3 = this.e;
        List arrayList3 = z ? list3 : new ArrayList(list3);
        List list4 = this.b;
        List arrayList4 = z ? list4 : new ArrayList(list4);
        long j2 = this.i;
        boolean z2 = this.J;
        int i4 = !this.j ? 1 : 0;
        boolean z3 = this.k;
        int i5 = i2 ^ 1;
        int i6 = this.m;
        int i7 = this.n;
        int i8 = this.o;
        int i9 = this.f137p;
        long j3 = this.q;
        long j4 = this.u;
        long j5 = this.v;
        long j6 = this.w;
        long j7 = this.x;
        long j8 = this.y;
        long j9 = this.z;
        int i10 = this.r;
        int i11 = i10 == -1 ? 0 : 1;
        long j10 = this.s;
        int i12 = j10 == -1 ? 0 : 1;
        long j11 = this.t;
        int i13 = j11 == -1 ? 0 : 1;
        long j12 = this.A;
        long j13 = this.B;
        long j14 = this.C;
        long j15 = this.D;
        int i14 = this.E;
        return new s5u0(1, jArr, arrayList4, arrayList, j2, z2 ? 1 : 0, i4, z3 ? 1 : 0, i3, j, i5, i6, i7, i8, i9, j3, this.h ? 1 : 0, arrayList2, arrayList3, j4, j5, j6, j7, j8, j9, i11, i12, i10, j10, i13, j11, j12, j13, j14, j15, i14 > 0 ? 1 : 0, i14, this.F, this.f, this.g);
    }

    public final void c(long j) {
        ie30 ie30Var;
        int i;
        if (this.G == 3 && (ie30Var = this.P) != null && (i = ie30Var.k) != -1) {
            long j2 = (long) ((j - this.R) * this.S);
            this.y += j2;
            this.z = (j2 * ((long) i)) + this.z;
        }
        this.R = j;
    }

    public final void d(long j) {
        ie30 ie30Var;
        if (this.G == 3 && (ie30Var = this.O) != null) {
            long j2 = (long) ((j - this.Q) * this.S);
            int i = ie30Var.x;
            if (i != -1) {
                this.u += j2;
                this.v = (((long) i) * j2) + this.v;
            }
            int i2 = ie30Var.k;
            if (i2 != -1) {
                this.w += j2;
                this.x = (j2 * ((long) i2)) + this.x;
            }
        }
        this.Q = j;
    }

    public final void e(tz3 tz3Var, ie30 ie30Var) {
        int i;
        if (Objects.equals(this.P, ie30Var)) {
            return;
        }
        c(tz3Var.a);
        if (ie30Var != null && this.t == -1 && (i = ie30Var.k) != -1) {
            this.t = i;
        }
        this.P = ie30Var;
    }

    public final void f(long j) {
        if (b(this.G)) {
            long j2 = j - this.N;
            long j3 = this.q;
            if (j3 == -9223372036854775807L || j2 > j3) {
                this.q = j2;
            }
        }
    }

    public final void g(tz3 tz3Var, ie30 ie30Var) {
        int i;
        int i2;
        if (Objects.equals(this.O, ie30Var)) {
            return;
        }
        d(tz3Var.a);
        if (ie30Var != null) {
            if (this.r == -1 && (i2 = ie30Var.x) != -1) {
                this.r = i2;
            }
            if (this.s == -1 && (i = ie30Var.k) != -1) {
                this.s = i;
            }
        }
        this.O = ie30Var;
    }

    public final void h(int i, tz3 tz3Var) {
        long j = tz3Var.a;
        dm5.m(j >= this.H);
        long j2 = j - this.H;
        int i2 = this.G;
        long[] jArr = this.a;
        jArr[i2] = jArr[i2] + j2;
        if (this.i == -9223372036854775807L) {
            this.i = j;
        }
        this.l |= ((i2 != 1 && i2 != 2 && i2 != 14) || i == 1 || i == 2 || i == 14 || i == 3 || i == 4 || i == 9 || i == 11) ? false : true;
        this.j |= i == 3 || i == 4 || i == 9;
        this.k = (i == 11) | this.k;
        if (i2 != 4 && i2 != 7 && (i == 4 || i == 7)) {
            this.m++;
        }
        if (i == 5) {
            this.o++;
        }
        if (!b(i2) && b(i)) {
            this.f137p++;
            this.N = j;
        }
        if (b(this.G) && this.G != 7 && i == 7) {
            this.n++;
        }
        f(j);
        this.G = i;
        this.H = j;
    }
}
