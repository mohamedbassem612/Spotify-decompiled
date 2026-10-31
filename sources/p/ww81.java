package p;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ww81 extends j9a implements ExoPlayer {
    public final yo00 b;
    public final hsk c;

    public ww81(bo00 bo00Var) {
        hsk hskVar = new hsk();
        this.c = hskVar;
        try {
            this.b = new yo00(bo00Var, this);
            hskVar.f();
        } catch (Throwable th) {
            this.c.f();
            throw th;
        }
    }

    public final void A() {
        j1();
        this.b.J1();
    }

    public final void A0(int i, int i2) {
        j1();
        this.b.J1();
    }

    public final void B(int i) {
        j1();
        this.b.J1();
    }

    public final l291 C() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.c0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void C0(qba qbaVar) {
        j1();
        this.b.C0(qbaVar);
    }

    public final void D(int i, int i2, List list) {
        j1();
        this.b.D(i, i2, list);
    }

    public final int D0() {
        j1();
        return this.b.D0();
    }

    public final void E0(k0g1 k0g1Var) {
        j1();
        this.b.E0(k0g1Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final sbu0 G(rbu0 rbu0Var) {
        j1();
        return this.b.G(rbu0Var);
    }

    public final void G0(List list, int i, long j) {
        j1();
        this.b.G0(list, i, j);
    }

    public final void H(int i, int i2) {
        j1();
        this.b.H(i, i2);
    }

    public final void I(SurfaceHolder surfaceHolder) {
        j1();
        this.b.I(surfaceHolder);
    }

    public final long I0() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.q0;
    }

    public final void J(o8u0 o8u0Var) {
        j1();
        this.b.J(o8u0Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final far J0() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.d0;
    }

    public final long K0() {
        j1();
        return this.b.K0();
    }

    public final PlaybackException L() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.t0.f;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final ie30 L0() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.U;
    }

    public final void M(boolean z) {
        j1();
        this.b.M(z);
    }

    public final void M0(int i, List list) {
        j1();
        this.b.M0(i, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void N(qba qbaVar, long j) {
        j1();
        this.b.N(qbaVar, j);
    }

    public final long N0() {
        j1();
        return this.b.N0();
    }

    public final void O() {
        j1();
        this.b.O();
    }

    public final void P(o8u0 o8u0Var) {
        j1();
        this.b.P(o8u0Var);
    }

    public final tqh0 P0() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.S;
    }

    public final int Q0() {
        j1();
        return this.b.Q0();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final ie30 S() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.T;
    }

    public final void S0(int i, int i2, int i3) {
        j1();
        this.b.S0(i, i2, i3);
    }

    public final void T(int i) {
        j1();
        this.b.J1();
    }

    public final o3g1 U() {
        j1();
        return this.b.U();
    }

    public final boolean U0() {
        j1();
        this.b.J1();
        return false;
    }

    public final boolean V0() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.I;
    }

    public final qeo W() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.i0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void W0(qba qbaVar) {
        j1();
        this.b.W0(qbaVar);
    }

    public final int X() {
        j1();
        return this.b.X();
    }

    public final long X0() {
        j1();
        return this.b.X0();
    }

    public final void Y0(int i) {
        j1();
        this.b.J1();
    }

    public final void Z(boolean z) {
        j1();
        this.b.J1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void a0(qba qbaVar) {
        j1();
        this.b.a0(qbaVar);
    }

    public final boolean b() {
        j1();
        return this.b.b();
    }

    public final tqh0 b1() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.R;
    }

    public final float c() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.f0;
    }

    public final int c0() {
        j1();
        return this.b.c0();
    }

    public final void c1(List list) {
        j1();
        this.b.c1(list);
    }

    public final void d() {
        j1();
        this.b.d();
    }

    public final sqe1 d0() {
        j1();
        return this.b.d0();
    }

    public final long d1() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.p0;
    }

    public final void e() {
        j1();
        this.b.e();
    }

    public final Looper e0() {
        j1();
        return this.b.t;
    }

    public final void f0() {
        j1();
        this.b.J1();
    }

    public final void g(float f) {
        j1();
        this.b.g(f);
    }

    public final k0g1 g0() {
        j1();
        return this.b.g0();
    }

    public final void g1(int i, int i2, long j, boolean z) {
        j1();
        this.b.g1(i, i2, j, z);
    }

    public final long getDuration() {
        j1();
        return this.b.getDuration();
    }

    public final int getPlaybackState() {
        j1();
        return this.b.getPlaybackState();
    }

    public final int getRepeatMode() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.H;
    }

    public final void i0(tqh0 tqh0Var) {
        j1();
        this.b.i0(tqh0Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.M;
    }

    public final int j0() {
        j1();
        this.b.J1();
        return 0;
    }

    public final void j1() {
        this.c.b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void k(int i) {
        j1();
        this.b.k(i);
    }

    public final k2u0 l() {
        j1();
        return this.b.l();
    }

    public final void m(k2u0 k2u0Var) {
        j1();
        this.b.m(k2u0Var);
    }

    public final void n(Surface surface) {
        j1();
        this.b.n(surface);
    }

    public final m8u0 n0() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.Q;
    }

    public final boolean o() {
        j1();
        return this.b.o();
    }

    public final void o0(boolean z) {
        j1();
        this.b.o0(z);
    }

    public final long p() {
        j1();
        return this.b.p();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int p0() {
        j1();
        return this.b.p0();
    }

    public final boolean q() {
        j1();
        return this.b.q();
    }

    public final long q0() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.r0;
    }

    public final void r(po7 po7Var, boolean z) {
        j1();
        this.b.r(po7Var, z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final jca s0(int i) {
        j1();
        return this.b.s0(i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        j1();
        this.b.setImageOutput(imageOutput);
    }

    public final void setRepeatMode(int i) {
        j1();
        this.b.setRepeatMode(i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        j1();
        this.b.setScrubbingModeEnabled(z);
    }

    public final void stop() {
        j1();
        this.b.stop();
    }

    public final void t(Surface surface) {
        j1();
        this.b.t(surface);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void t0(uz3 uz3Var) {
        j1();
        this.b.t0(uz3Var);
    }

    public final long v() {
        j1();
        return this.b.v();
    }

    public final int v0() {
        j1();
        return this.b.v0();
    }

    public final z1k1 w0() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.o0;
    }

    public final po7 x0() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.e0;
    }

    public final xqt y0() {
        j1();
        yo00 yo00Var = this.b;
        yo00Var.J1();
        return yo00Var.n0;
    }

    public final void z(int i, boolean z) {
        j1();
        this.b.J1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void z0(uz3 uz3Var) {
        j1();
        this.b.z0(uz3Var);
    }
}
