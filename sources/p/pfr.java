package p;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentMediaFormat;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pfr implements o8u0, w2i0, n4a, c9v {
    public final rdd1 a;
    public final dqe1 b;
    public final oqe1 c;
    public final cp31 d;
    public final SparseArray e;
    public h9d0 f;
    public r8u0 g;
    public wdd1 h;
    public boolean i;

    public pfr(rdd1 rdd1Var) {
        rdd1Var.getClass();
        this.a = rdd1Var;
        this.f = new h9d0(zoi1.D());
        dqe1 dqe1Var = new dqe1();
        this.b = dqe1Var;
        this.c = new oqe1();
        cp31 cp31Var = new cp31();
        cp31Var.a = dqe1Var;
        w280 w280Var = b380.b;
        cp31Var.b = bg11.e;
        cp31Var.c = gg11.g;
        this.d = cp31Var;
        this.e = new SparseArray();
    }

    public final void A(tqh0 tqh0Var) {
        a0(I(), 15, new n7o((byte) 25));
    }

    public final void B(k0g1 k0g1Var) {
        a0(I(), 19, new lfr((byte) 29));
    }

    public final void C(o3g1 o3g1Var) {
        a0(I(), 2, new n7o((byte) 23));
    }

    public final void C0(sqe1 sqe1Var, int i) {
        r8u0 r8u0Var = this.g;
        r8u0Var.getClass();
        cp31 cp31Var = this.d;
        cp31Var.d = cp31.z(r8u0Var, (b380) cp31Var.b, (p2i0) cp31Var.e, (dqe1) cp31Var.a);
        cp31Var.O(r8u0Var.d0());
        a0(I(), 0, new n7o((byte) 7));
    }

    public final void D(int i, p2i0 p2i0Var, qqh0 qqh0Var) {
        a0(T(i, p2i0Var), ContentMediaFormat.PARTIAL_CONTENT_EPISODE, new lfr((byte) 13));
    }

    public final void E(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var, int i2) {
        a0(T(i, p2i0Var), 1000, new lfr((byte) 16));
    }

    public final void E0(boolean z) {
        a0(I(), 7, new n7o((byte) 13));
    }

    public final void F(int i, p2i0 p2i0Var, qqh0 qqh0Var) {
        tz3 tz3VarT = T(i, p2i0Var);
        a0(tz3VarT, ContentMediaFormat.PARTIAL_CONTENT_GENERIC, new uk4(tz3VarT, qqh0Var, (byte) 11));
    }

    public final void H(int i) {
        a0(I(), 4, new n7o((byte) 21));
    }

    public final tz3 I() {
        return M((p2i0) this.d.d);
    }

    public final void J(int i, yoh0 yoh0Var) {
        a0(I(), 1, new n7o((byte) 8));
    }

    public final void K(boolean z) {
        a0(I(), 9, new n7o((byte) 29));
    }

    public final tz3 M(p2i0 p2i0Var) {
        this.g.getClass();
        sqe1 sqe1Var = p2i0Var == null ? null : (sqe1) ((gg11) this.d.c).get(p2i0Var);
        if (p2i0Var != null && sqe1Var != null) {
            return S(sqe1Var, sqe1Var.g(p2i0Var.a, this.b).c, p2i0Var);
        }
        int iQ0 = this.g.Q0();
        sqe1 sqe1VarD0 = this.g.d0();
        if (iQ0 >= sqe1VarD0.o()) {
            sqe1VarD0 = sqe1.a;
        }
        return S(sqe1VarD0, iQ0, null);
    }

    public final void N(int i, p2i0 p2i0Var, twa twaVar) {
        a0(T(i, p2i0Var), 1023, new lfr((byte) 22));
    }

    public final void O(int i, boolean z) {
        a0(I(), 30, new n7o((byte) 17));
    }

    public final void P(long j) {
        a0(I(), 16, new lfr((byte) 17));
    }

    public final tz3 S(sqe1 sqe1Var, int i, p2i0 p2i0Var) {
        p2i0 p2i0Var2 = sqe1Var.p() ? null : p2i0Var;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = sqe1Var.equals(this.g.d0()) && i == this.g.Q0();
        long jN0 = 0;
        if (p2i0Var2 == null || !p2i0Var2.c()) {
            if (z) {
                jN0 = this.g.K0();
            } else if (!sqe1Var.p()) {
                jN0 = zoi1.n0(sqe1Var.n(i, this.c, 0L).l);
            }
        } else if (z && this.g.X() == p2i0Var2.b && this.g.D0() == p2i0Var2.c) {
            jN0 = this.g.v();
        }
        return new tz3(jElapsedRealtime, sqe1Var, i, p2i0Var2, jN0, this.g.d0(), this.g.Q0(), (p2i0) this.d.d, this.g.v(), this.g.p());
    }

    public final tz3 T(int i, p2i0 p2i0Var) {
        this.g.getClass();
        if (p2i0Var != null) {
            return ((sqe1) ((gg11) this.d.c).get(p2i0Var)) != null ? M(p2i0Var) : S(sqe1.a, i, p2i0Var);
        }
        sqe1 sqe1VarD0 = this.g.d0();
        if (i >= sqe1VarD0.o()) {
            sqe1VarD0 = sqe1.a;
        }
        return S(sqe1VarD0, i, null);
    }

    public final void U(int i, p2i0 p2i0Var) {
        a0(T(i, p2i0Var), 1026, new lfr((byte) 24));
    }

    public final void V(int i, p2i0 p2i0Var, int i2) {
        tz3 tz3VarT = T(i, p2i0Var);
        a0(tz3VarT, 1022, new lfr(i2, tz3VarT));
    }

    public final tz3 W() {
        return M((p2i0) this.d.f);
    }

    public final void X(int i, int i2) {
        a0(W(), 24, new lfr((byte) 0));
    }

    public final void Y(po7 po7Var) {
        a0(W(), 20, new n7o((byte) 11));
    }

    @Override // p.n4a
    public final void a(int i, long j, long j2) {
        cp31 cp31Var = this.d;
        tz3 tz3VarM = M(((b380) cp31Var.b).isEmpty() ? null : (p2i0) hr80.r((b380) cp31Var.b));
        a0(tz3VarM, ContentMediaFormat.PARTIAL_CONTENT_MOVIE, new mfr(tz3VarM, i, j, j2));
    }

    public final void a0(tz3 tz3Var, int i, e9d0 e9d0Var) {
        this.e.put(i, tz3Var);
        this.f.h(i, e9d0Var);
    }

    public final void b(z1k1 z1k1Var) {
        tz3 tz3VarW = W();
        a0(tz3VarW, 25, new kfr(tz3VarW, z1k1Var));
    }

    public final void c0(r8u0 r8u0Var, Looper looper) {
        dm5.y(this.g == null || ((b380) this.d.b).isEmpty());
        r8u0Var.getClass();
        this.g = r8u0Var;
        this.h = this.a.a(looper, (Handler.Callback) null);
        h9d0 h9d0Var = this.f;
        uk4 uk4Var = new uk4(this, r8u0Var, (byte) 10);
        rdd1 rdd1Var = this.a;
        dm5.y(rdd1Var != null);
        this.f = new h9d0((CopyOnWriteArraySet) h9d0Var.f, looper, looper.getThread(), rdd1Var, uk4Var, h9d0Var.b);
    }

    public final void d(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var) {
        a0(T(i, p2i0Var), ContentMediaFormat.FULL_CONTENT_GENERIC, new lfr((byte) 25));
    }

    public final void e0(boolean z) {
        a0(I(), 3, new ofr((byte) 1));
    }

    public final void g0(int i, boolean z) {
        a0(I(), 5, new n7o((byte) 18));
    }

    public final void h(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var) {
        a0(T(i, p2i0Var), ContentMediaFormat.FULL_CONTENT_EPISODE, new lfr((byte) 23));
    }

    public final void h0(float f) {
        a0(W(), 22, new n7o((byte) 9));
    }

    public final void i(int i) {
        a0(W(), 21, new n7o((byte) 24));
    }

    public final void j0(p8u0 p8u0Var, p8u0 p8u0Var2, int i) {
        if (i == 1) {
            this.i = false;
        }
        r8u0 r8u0Var = this.g;
        r8u0Var.getClass();
        cp31 cp31Var = this.d;
        cp31Var.d = cp31.z(r8u0Var, (b380) cp31Var.b, (p2i0) cp31Var.e, (dqe1) cp31Var.a);
        tz3 tz3VarI = I();
        a0(tz3VarI, 11, new mp5(tz3VarI, i, p8u0Var, p8u0Var2));
    }

    public final void k(boolean z) {
        a0(W(), 23, new lfr((byte) 19));
    }

    public final void l(List list) {
        tz3 tz3VarI = I();
        a0(tz3VarI, 27, new ifr(tz3VarI, list));
    }

    public final void n(PlaybackException playbackException) {
        p2i0 p2i0Var;
        tz3 tz3VarI = (!(playbackException instanceof ExoPlaybackException) || (p2i0Var = ((ExoPlaybackException) playbackException).O0) == null) ? I() : M(p2i0Var);
        a0(tz3VarI, 10, new jfr(tz3VarI, playbackException));
    }

    public final void n0(tqh0 tqh0Var) {
        a0(I(), 14, new lfr((byte) 8));
    }

    public final void o(qeo qeoVar) {
        a0(I(), 27, new lfr((byte) 1));
    }

    public final void onRepeatModeChanged(int i) {
        a0(I(), 8, new n7o((byte) 27));
    }

    public final void p0(m8u0 m8u0Var) {
        a0(I(), 13, new n7o((byte) 6));
    }

    public final void q(int i, p2i0 p2i0Var) {
        a0(T(i, p2i0Var), 1025, new lfr((byte) 26));
    }

    public final void q0(xqt xqtVar) {
        a0(I(), 29, new n7o((byte) 22));
    }

    public final void r0(k2u0 k2u0Var) {
        a0(I(), 12, new n7o((byte) 14));
    }

    public final void t0(long j) {
        a0(I(), 17, new ofr((byte) 0));
    }

    public final void u(hjj0 hjj0Var) {
        a0(I(), 28, new n7o((byte) 12));
    }

    public final void v(int i, p2i0 p2i0Var, d2e0 d2e0Var, qqh0 qqh0Var, IOException iOException, boolean z) {
        tz3 tz3VarT = T(i, p2i0Var);
        a0(tz3VarT, ContentMediaFormat.FULL_CONTENT_MOVIE, new uk4(tz3VarT, d2e0Var, qqh0Var, iOException, z));
    }

    public final void v0(int i, boolean z) {
        a0(I(), -1, new n7o((byte) 10));
    }

    public final void w(int i) {
        a0(I(), 6, new n7o((byte) 15));
    }

    public final void x0(PlaybackException playbackException) {
        p2i0 p2i0Var;
        a0((!(playbackException instanceof ExoPlaybackException) || (p2i0Var = ((ExoPlaybackException) playbackException).O0) == null) ? I() : M(p2i0Var), 10, new n7o((byte) 16));
    }

    public final void y(int i, p2i0 p2i0Var, Exception exc) {
        tz3 tz3VarT = T(i, p2i0Var);
        a0(tz3VarT, SemanticState.ReadOnly, new thn(tz3VarT, exc, (byte) 5));
    }

    public final void y0(long j) {
        a0(I(), 18, new lfr((byte) 27));
    }

    public final void z(int i, p2i0 p2i0Var) {
        a0(T(i, p2i0Var), 1027, new lfr((byte) 14));
    }

    public final void R() {
    }

    public final void b0(int i) {
    }

    public final void w0(n8u0 n8u0Var) {
    }

    public final void x(boolean z) {
    }
}
