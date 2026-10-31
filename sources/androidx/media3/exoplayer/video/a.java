package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import p.dm5;
import p.dzs;
import p.ezs;
import p.fss;
import p.ge30;
import p.ie30;
import p.iir;
import p.ikh0;
import p.l291;
import p.l5u;
import p.ln20;
import p.moj1;
import p.rdd1;
import p.thn;
import p.v1k1;
import p.v4f0;
import p.w1k1;
import p.w4c0;
import p.x1k1;
import p.xoj1;
import p.yoj1;
import p.z1k1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a implements x1k1 {
    public final c a;
    public final xoj1 b;
    public final yoj1 c;
    public final ArrayDeque d;
    public final ln20 e;
    public Surface f;
    public ie30 g;
    public long h;
    public v1k1 i;
    public Executor j;
    public moj1 k;

    public a(c cVar, xoj1 xoj1Var, rdd1 rdd1Var) {
        this.a = cVar;
        this.b = xoj1Var;
        cVar.k = rdd1Var;
        ln20 ln20Var = new ln20(new thn(cVar, (byte) 10));
        this.e = ln20Var;
        this.c = new yoj1(new iir(this), cVar, xoj1Var, ln20Var);
        this.d = new ArrayDeque();
        this.g = new ie30(new ge30());
        this.h = -9223372036854775807L;
        this.i = v1k1.a;
        this.j = new dzs();
        this.k = new ezs();
    }

    @Override // p.x1k1
    public final void a() {
        yoj1 yoj1Var = this.c;
        long j = yoj1Var.i;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            yoj1Var.i = Long.MIN_VALUE;
            yoj1Var.j = Long.MIN_VALUE;
        }
        yoj1Var.k = j;
    }

    @Override // p.x1k1
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // p.x1k1
    public final Surface c() {
        Surface surface = this.f;
        surface.getClass();
        return surface;
    }

    @Override // p.x1k1
    public final boolean d() {
        yoj1 yoj1Var = this.c;
        long j = yoj1Var.k;
        return j != -9223372036854775807L && yoj1Var.j == j;
    }

    @Override // p.x1k1
    public final void e(ikh0 ikh0Var) {
        this.i = ikh0Var;
        this.j = l5u.a;
    }

    @Override // p.x1k1
    public final boolean f(ie30 ie30Var) {
        return true;
    }

    @Override // p.x1k1
    public final boolean g(long j, w1k1 w1k1Var) {
        this.d.add(w1k1Var);
        yoj1 yoj1Var = this.c;
        yoj1Var.f.a(j);
        yoj1Var.i = j;
        yoj1Var.k = -9223372036854775807L;
        this.j.execute(new fss(this, (byte) 8));
        return true;
    }

    @Override // p.x1k1
    public final void h(float f) {
        this.a.g(f);
    }

    @Override // p.x1k1
    public final void i(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // p.x1k1
    public final boolean isInitialized() {
        return true;
    }

    @Override // p.x1k1
    public final void j(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // p.x1k1
    public final boolean k(boolean z) {
        return this.a.b(z);
    }

    @Override // p.x1k1
    public final void l() {
        c cVar = this.a;
        if (cVar.e == 0) {
            cVar.e = 1;
        }
    }

    @Override // p.x1k1
    public final void m(Surface surface, l291 l291Var) {
        this.f = surface;
        this.a.f(surface);
    }

    @Override // p.x1k1
    public final void n() {
        this.b.b();
        c cVar = this.a;
        cVar.d = false;
        cVar.h = -9223372036854775807L;
        e eVar = cVar.b;
        eVar.d = false;
        VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSampler = eVar.c;
        if (videoFrameReleaseHelper$VSyncSampler != null) {
            videoFrameReleaseHelper$VSyncSampler.unregister();
        }
        eVar.a();
    }

    @Override // p.x1k1
    public final void o(int i, long j, List list, ie30 ie30Var) {
        dm5.y(list.isEmpty());
        int i2 = ie30Var.w;
        int i3 = ie30Var.x;
        ie30 ie30Var2 = this.g;
        int i4 = ie30Var2.w;
        yoj1 yoj1Var = this.c;
        if (i2 != i4 || i3 != ie30Var2.x) {
            w4c0 w4c0Var = yoj1Var.d;
            long j2 = yoj1Var.i;
            w4c0Var.a(j2 == -9223372036854775807L ? 0L : j2 + 1, new z1k1(i2, i3));
        }
        float f = ie30Var.B;
        if (f != this.g.B) {
            ln20 ln20Var = this.e;
            ln20Var.f = f;
            ln20Var.a.c();
            ln20Var.b.c();
            ln20Var.c = false;
            ln20Var.d = -9223372036854775807L;
            ln20Var.e = 0;
            ln20Var.c();
        }
        this.g = ie30Var;
        if (j != this.h) {
            if (yoj1Var.f.c == 0) {
                yoj1Var.b.e(i);
                yoj1Var.m = j;
            } else {
                w4c0 w4c0Var2 = yoj1Var.e;
                long j3 = yoj1Var.i;
                w4c0Var2.a(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.h = j;
        }
    }

    @Override // p.x1k1
    public final void p() {
        this.b.b();
        this.a.d();
    }

    @Override // p.x1k1
    public final void q(moj1 moj1Var) {
        this.k = moj1Var;
    }

    @Override // p.x1k1
    public final void r(int i) {
        e eVar = this.a.b;
        if (eVar.i == i) {
            return;
        }
        eVar.i = i;
        eVar.c(true);
    }

    @Override // p.x1k1
    public final void release() {
    }

    @Override // p.x1k1
    public final void s() {
        this.f = null;
        this.a.f(null);
    }

    @Override // p.x1k1
    public final void t(boolean z) {
        if (z) {
            c cVar = this.a;
            cVar.b.b();
            cVar.f = -9223372036854775807L;
            cVar.e = Math.min(cVar.e, 1);
            cVar.h = -9223372036854775807L;
            cVar.m = false;
        }
        this.b.b();
        yoj1 yoj1Var = this.c;
        w4c0 w4c0Var = yoj1Var.d;
        v4f0 v4f0Var = yoj1Var.f;
        v4f0Var.a = 0;
        v4f0Var.b = -1;
        v4f0Var.c = 0;
        yoj1Var.i = -9223372036854775807L;
        yoj1Var.j = -9223372036854775807L;
        yoj1Var.k = -9223372036854775807L;
        w4c0 w4c0Var2 = yoj1Var.e;
        if (w4c0Var2.M() > 0) {
            dm5.m(w4c0Var2.M() > 0);
            while (w4c0Var2.M() > 1) {
                w4c0Var2.B();
            }
            Object objB = w4c0Var2.B();
            objB.getClass();
            yoj1Var.m = ((Long) objB).longValue();
        }
        if (w4c0Var.M() > 0) {
            dm5.m(w4c0Var.M() > 0);
            while (w4c0Var.M() > 1) {
                w4c0Var.B();
            }
            Object objB2 = w4c0Var.B();
            objB2.getClass();
            w4c0Var.a(0L, (z1k1) objB2);
        }
        this.d.clear();
    }

    @Override // p.x1k1
    public final void u(long j, long j2) throws VideoSink$VideoSinkException {
        try {
            this.c.a(j, j2);
        } catch (ExoPlaybackException e) {
            throw new VideoSink$VideoSinkException(e, this.g);
        }
    }

    @Override // p.x1k1
    public final void v(boolean z) {
        this.a.c(z);
    }
}
