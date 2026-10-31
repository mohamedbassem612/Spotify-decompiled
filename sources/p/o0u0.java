package p;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o0u0 {
    public static final p2i0 u = new p2i0(new Object());
    public final sqe1 a;
    public final p2i0 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final qnf1 h;
    public final o0g1 i;
    public final List j;
    public final p2i0 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final k2u0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f105p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public o0u0(sqe1 sqe1Var, p2i0 p2i0Var, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, qnf1 qnf1Var, o0g1 o0g1Var, List list, p2i0 p2i0Var2, boolean z2, int i2, int i3, k2u0 k2u0Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = sqe1Var;
        this.b = p2i0Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = qnf1Var;
        this.i = o0g1Var;
        this.j = list;
        this.k = p2i0Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = k2u0Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.f105p = z3;
    }

    public static o0u0 k(o0g1 o0g1Var) {
        cqe1 cqe1Var = sqe1.a;
        qnf1 qnf1Var = qnf1.d;
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        k2u0 k2u0Var = k2u0.d;
        p2i0 p2i0Var = u;
        return new o0u0(cqe1Var, p2i0Var, -9223372036854775807L, 0L, 1, null, false, qnf1Var, o0g1Var, bg11Var, p2i0Var, false, 1, 0, k2u0Var, 0L, 0L, 0L, 0L, false);
    }

    public final o0u0 a() {
        return new o0u0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.f105p);
    }

    public final o0u0 b(boolean z) {
        return new o0u0(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.f105p);
    }

    public final o0u0 c(p2i0 p2i0Var) {
        return new o0u0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, p2i0Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.f105p);
    }

    public final o0u0 d(p2i0 p2i0Var, long j, long j2, long j3, long j4, qnf1 qnf1Var, o0g1 o0g1Var, List list) {
        return new o0u0(this.a, p2i0Var, j2, j3, this.e, this.f, this.g, qnf1Var, o0g1Var, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.f105p);
    }

    public final o0u0 e(int i, int i2, boolean z) {
        return new o0u0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.f105p);
    }

    public final o0u0 f(ExoPlaybackException exoPlaybackException) {
        return new o0u0(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.f105p);
    }

    public final o0u0 g(k2u0 k2u0Var) {
        return new o0u0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, k2u0Var, this.q, this.r, this.s, this.t, this.f105p);
    }

    public final o0u0 h(int i) {
        return new o0u0(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.f105p);
    }

    public final o0u0 i(boolean z) {
        return new o0u0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final o0u0 j(sqe1 sqe1Var) {
        return new o0u0(sqe1Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.f105p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return zoi1.W(zoi1.n0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
