package p;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import androidx.media3.exoplayer.video.a;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r7u0 implements x1k1 {
    public final int a;
    public b380 b;
    public ie30 c;
    public boolean d;
    public long e;
    public long f;
    public int g;
    public v1k1 h;
    public Executor i;
    public boolean j;
    public final /* synthetic */ u7u0 k;

    public r7u0(u7u0 u7u0Var, Context context) {
        this.k = u7u0Var;
        this.a = zoi1.Q(context) ? 1 : 5;
        w280 w280Var = b380.b;
        this.b = bg11.e;
        this.f = -9223372036854775807L;
        this.h = v1k1.a;
        this.i = u7u0.B;
    }

    @Override // p.x1k1
    public final void a() {
        long j = this.f;
        u7u0 u7u0Var = this.k;
        u7u0Var.x = j;
        if (u7u0Var.w >= j) {
            u7u0Var.e.a();
            u7u0Var.y = true;
        }
    }

    @Override // p.x1k1
    public final void b() {
        if (this.j) {
            u7u0 u7u0Var = this.k;
            long j = u7u0Var.w;
            u7u0Var.f(false);
            npj1 npj1Var = u7u0Var.f147p;
            npj1Var.getClass();
            npj1Var.b();
            u7u0Var.w = j;
        }
    }

    @Override // p.x1k1
    public final Surface c() {
        dm5.y(this.j);
        npj1 npj1Var = this.k.f147p;
        npj1Var.getClass();
        return npj1Var.f(0);
    }

    @Override // p.x1k1
    public final boolean d() {
        if (!this.j) {
            return false;
        }
        u7u0 u7u0Var = this.k;
        return u7u0Var.u == 0 && u7u0Var.y && u7u0Var.e.d();
    }

    @Override // p.x1k1
    public final void e(ikh0 ikh0Var) {
        this.h = ikh0Var;
        this.i = l5u.a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[Catch: GlException -> 0x0043, TryCatch #0 {GlException -> 0x0043, blocks: (B:14:0x002b, B:16:0x0031, B:18:0x0037, B:23:0x0049, B:28:0x005a, B:30:0x0060, B:35:0x0080, B:25:0x0050), top: B:54:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: GlException -> 0x0043, TryCatch #0 {GlException -> 0x0043, blocks: (B:14:0x002b, B:16:0x0031, B:18:0x0037, B:23:0x0049, B:28:0x005a, B:30:0x0060, B:35:0x0080, B:25:0x0050), top: B:54:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080 A[Catch: GlException -> 0x0043, TRY_LEAVE, TryCatch #0 {GlException -> 0x0043, blocks: (B:14:0x002b, B:16:0x0031, B:18:0x0037, B:23:0x0049, B:28:0x005a, B:30:0x0060, B:35:0x0080, B:25:0x0050), top: B:54:0x002b }] */
    @Override // p.x1k1
    public final boolean f(ie30 ie30Var) throws VideoSink$VideoSinkException {
        boolean zR;
        dm5.y(!this.j);
        u7u0 u7u0Var = this.k;
        a aVar = u7u0Var.e;
        dm5.y(u7u0Var.v == 0);
        x8h x8hVarA = ie30Var.H;
        if (x8hVarA == null || !x8hVarA.f()) {
            x8hVarA = x8h.h;
        }
        int i = x8hVarA.c;
        if (i == 7) {
            try {
                if (Build.VERSION.SDK_INT >= 34 || !fn31.Q()) {
                    if (i == 6) {
                        zR = fn31.Q();
                    } else if (i == 7) {
                        zR = fn31.R("EGL_EXT_gl_colorspace_bt2020_hlg");
                    } else {
                        zR = true;
                    }
                    if (zR && Build.VERSION.SDK_INT >= 29) {
                        Locale locale = Locale.US;
                        oon1.H("Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                        x8hVarA = x8h.h;
                    } else if (i != 2 || i == 10) {
                        x8hVarA = x8h.h;
                    }
                } else {
                    w8h w8hVarA = x8hVarA.a();
                    w8hVarA.c = 6;
                    x8hVarA = w8hVarA.a();
                }
            } catch (GlUtil.GlException e) {
                throw new VideoSink$VideoSinkException(e, ie30Var);
            }
        } else {
            if (i == 6) {
                zR = fn31.Q();
            } else if (i == 7) {
                zR = fn31.R("EGL_EXT_gl_colorspace_bt2020_hlg");
            } else {
                zR = true;
            }
            if (zR) {
                if (i != 2) {
                    x8hVarA = x8h.h;
                } else {
                    x8hVarA = x8h.h;
                }
            } else if (i != 2) {
                x8hVarA = x8h.h;
            } else {
                x8hVarA = x8h.h;
            }
        }
        x8h x8hVar = x8hVarA;
        rdd1 rdd1Var = u7u0Var.g;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        wdd1 wdd1VarA = rdd1Var.a(looperMyLooper, (Handler.Callback) null);
        u7u0Var.o = wdd1VarA;
        try {
            npj1 npj1VarA = u7u0Var.b.a(u7u0Var.a, x8hVar, u7u0Var, new wo00(wdd1VarA, (byte) 0), 0L, false);
            u7u0Var.f147p = npj1VarA;
            npj1VarA.e(u7u0Var.n);
            u7u0Var.f147p.h(u7u0Var.m);
            u7u0Var.f147p.j();
            Pair pair = u7u0Var.t;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                l291 l291Var = (l291) pair.second;
                u7u0Var.g(surface, l291Var.a, l291Var.b);
            }
            aVar.getClass();
            p7u0 p7u0Var = new p7u0(u7u0Var);
            wdd1 wdd1Var = u7u0Var.o;
            Objects.requireNonNull(wdd1Var);
            wo00 wo00Var = new wo00(wdd1Var, (byte) 1);
            aVar.i = p7u0Var;
            aVar.j = wo00Var;
            u7u0Var.v = (byte) 1;
            try {
                npj1 npj1Var = u7u0Var.f147p;
                npj1Var.getClass();
                npj1Var.l(0);
                u7u0Var.A++;
                this.j = true;
                return true;
            } catch (VideoFrameProcessingException e2) {
                throw new VideoSink$VideoSinkException(e2, ie30Var);
            }
        } catch (VideoFrameProcessingException e3) {
            throw new VideoSink$VideoSinkException(e3, ie30Var);
        }
    }

    @Override // p.x1k1
    public final boolean g(long j, w1k1 w1k1Var) {
        int i;
        dm5.y(this.j);
        long j2 = j + this.e;
        u7u0 u7u0Var = this.k;
        xoj1 xoj1Var = u7u0Var.j;
        long j3 = xoj1Var.a;
        long j4 = j3 == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - j3) * xoj1Var.c) + xoj1Var.b);
        if (j4 != -9223372036854775807L) {
            long j5 = u7u0Var.i;
            if (j5 != -9223372036854775807L && j4 < j5 && (i = this.g) < 2) {
                this.g = i + 1;
                ((jkh0) w1k1Var).b();
                return true;
            }
        }
        int i2 = u7u0Var.z;
        if (i2 != -1 && i2 == u7u0Var.A) {
            npj1 npj1Var = u7u0Var.f147p;
            npj1Var.getClass();
            if (npj1Var.k(0) < this.a) {
                npj1 npj1Var2 = u7u0Var.f147p;
                npj1Var2.getClass();
                if (npj1Var2.c(0)) {
                    this.f = j2;
                    ((jkh0) w1k1Var).a(j2 * 1000);
                    this.g = 0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p.x1k1
    public final void h(float f) {
        u7u0 u7u0Var = this.k;
        u7u0Var.j.c(f);
        u7u0Var.e.h(f);
    }

    @Override // p.x1k1
    public final void i(long j) {
        this.e = j;
    }

    @Override // p.x1k1
    public final boolean isInitialized() {
        return this.j;
    }

    @Override // p.x1k1
    public final void j(List list) {
        b380 b380Var = this.b;
        b380Var.getClass();
        if (z1p1.j(b380Var, list)) {
            return;
        }
        this.b = b380.p(list);
        ie30 ie30Var = this.c;
        if (ie30Var != null) {
            w(ie30Var);
        }
    }

    @Override // p.x1k1
    public final boolean k(boolean z) {
        boolean z2 = false;
        boolean z3 = z && this.j;
        u7u0 u7u0Var = this.k;
        a aVar = u7u0Var.e;
        if (z3 && u7u0Var.u == 0) {
            z2 = true;
        }
        return aVar.a.b(z2);
    }

    @Override // p.x1k1
    public final void l() {
        u7u0 u7u0Var = this.k;
        a aVar = u7u0Var.e;
        if (u7u0Var.k.M() == 0) {
            aVar.l();
            return;
        }
        w4c0 w4c0Var = new w4c0();
        boolean z = true;
        while (u7u0Var.k.M() > 0) {
            t7u0 t7u0Var = (t7u0) u7u0Var.k.B();
            t7u0Var.getClass();
            if (z) {
                int i = t7u0Var.b;
                if (i == 0 || i == 1) {
                    t7u0Var = new t7u0(0, t7u0Var.a, t7u0Var.c);
                } else {
                    aVar.l();
                }
                z = false;
            }
            w4c0Var.a(t7u0Var.c, t7u0Var);
        }
        u7u0Var.k = w4c0Var;
    }

    @Override // p.x1k1
    public final void m(Surface surface, l291 l291Var) {
        u7u0 u7u0Var = this.k;
        Pair pair = u7u0Var.t;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((l291) u7u0Var.t.second).equals(l291Var)) {
            return;
        }
        u7u0Var.t = Pair.create(surface, l291Var);
        u7u0Var.g(surface, l291Var.a, l291Var.b);
    }

    @Override // p.x1k1
    public final void n() {
        u7u0 u7u0Var = this.k;
        if (u7u0Var.d) {
            u7u0Var.e.n();
        }
    }

    @Override // p.x1k1
    public final void o(int i, long j, List list, ie30 ie30Var) {
        dm5.y(this.j);
        this.b = b380.p(list);
        this.d = true;
        this.c = ie30Var;
        u7u0 u7u0Var = this.k;
        u7u0Var.x = -9223372036854775807L;
        u7u0Var.y = false;
        w(ie30Var);
        long j2 = this.f;
        boolean z = j2 == -9223372036854775807L;
        if (u7u0Var.d || z) {
            long j3 = z ? -4611686018427387904L : 1 + j2;
            u7u0Var.k.a(j3, new t7u0(i, j + this.e, j3));
        }
    }

    @Override // p.x1k1
    public final void p() {
        u7u0 u7u0Var = this.k;
        if (u7u0Var.d) {
            u7u0Var.e.p();
        }
    }

    @Override // p.x1k1
    public final void q(moj1 moj1Var) {
        u7u0 u7u0Var = this.k;
        u7u0Var.q = moj1Var;
        u7u0Var.e.k = moj1Var;
    }

    @Override // p.x1k1
    public final void r(int i) {
        this.k.e.r(i);
    }

    @Override // p.x1k1
    public final void release() {
        u7u0 u7u0Var = this.k;
        if (u7u0Var.v == 2) {
            return;
        }
        wdd1 wdd1Var = u7u0Var.o;
        if (wdd1Var != null) {
            wdd1Var.h();
        }
        npj1 npj1Var = u7u0Var.f147p;
        if (npj1Var != null) {
            npj1Var.release();
        }
        u7u0Var.t = null;
        u7u0Var.v = (byte) 2;
    }

    @Override // p.x1k1
    public final void s() {
        l291 l291Var = l291.c;
        int i = l291Var.a;
        int i2 = l291Var.b;
        u7u0 u7u0Var = this.k;
        u7u0Var.g(null, i, i2);
        u7u0Var.t = null;
    }

    @Override // p.x1k1
    public final void t(boolean z) {
        boolean z2 = this.j;
        u7u0 u7u0Var = this.k;
        if (z2) {
            npj1 npj1Var = u7u0Var.f147p;
            npj1Var.getClass();
            npj1Var.flush();
        }
        this.f = -9223372036854775807L;
        u7u0Var.f(z);
    }

    @Override // p.x1k1
    public final void u(long j, long j2) throws VideoSink$VideoSinkException {
        this.k.e.u(j + this.e, j2);
    }

    @Override // p.x1k1
    public final void v(boolean z) {
        u7u0 u7u0Var = this.k;
        if (u7u0Var.d) {
            u7u0Var.e.v(z);
        }
    }

    public final void w(ie30 ie30Var) {
        ge30 ge30VarA = ie30Var.a();
        x8h x8hVar = ie30Var.H;
        if (x8hVar == null || !x8hVar.f()) {
            x8hVar = x8h.h;
        }
        ge30VarA.G = x8hVar;
        ie30 ie30Var2 = new ie30(ge30VarA);
        int i = !this.d ? 2 : 1;
        npj1 npj1Var = this.k.f147p;
        npj1Var.getClass();
        npj1Var.o(0, i, ie30Var2, this.b, 0L);
    }
}
