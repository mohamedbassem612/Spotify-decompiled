package p;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cg20 implements rs40, us40 {
    public EGLSurface B;
    public final Context a;
    public final EGLDisplay d;
    public final EGLContext e;
    public final EGLSurface f;
    public final x8h g;
    public final roj1 h;
    public final Executor i;
    public final uoj1 j;
    public final dfe1 l;
    public final v4f0 m;
    public final v4f0 n;
    public final ts40 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f24p;
    public int q;
    public int r;
    public dos s;
    public boolean t;
    public l291 v;
    public mxr w;
    public boolean x;
    public boolean y;
    public o3d1 z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public ps40 u = new ypa((byte) 11, false);
    public final ConcurrentLinkedQueue k = new ConcurrentLinkedQueue();
    public long A = -9223372036854775807L;

    public cg20(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, x8h x8hVar, roj1 roj1Var, Executor executor, uoj1 uoj1Var, ts40 ts40Var, int i, boolean z) {
        this.a = context;
        this.d = eGLDisplay;
        this.e = eGLContext;
        this.f = eGLSurface;
        this.g = x8hVar;
        this.h = roj1Var;
        this.i = executor;
        this.j = uoj1Var;
        this.o = ts40Var;
        this.f24p = z;
        this.l = new dfe1(i, x8h.h(x8hVar));
        this.m = new v4f0(i);
        this.n = new v4f0(i);
    }

    @Override // p.rs40
    public final void a() {
        this.h.h();
        if (!this.k.isEmpty()) {
            dm5.y(!this.f24p);
            this.t = true;
        } else {
            mxr mxrVar = this.w;
            mxrVar.getClass();
            mxrVar.z();
            this.t = false;
        }
    }

    @Override // p.rs40
    public final void b(cce cceVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p.rs40
    public final void c(ps40 ps40Var) {
        this.h.h();
        this.u = ps40Var;
        int i = 0;
        while (true) {
            if (i >= (this.o == null ? 1 : this.l.d())) {
                return;
            }
            ps40Var.k();
            i++;
        }
    }

    @Override // p.rs40
    public final void d(Executor executor, os40 os40Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p.us40
    public final void e(long j) {
        this.h.f(new nys(this, j, (byte) 2), true);
    }

    @Override // p.rs40
    public final void f(ss40 ss40Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p.rs40
    public final void flush() {
        this.h.h();
        this.k.clear();
        int i = 0;
        this.t = false;
        this.A = -9223372036854775807L;
        dos dosVar = this.s;
        if (dosVar != null) {
            dosVar.flush();
        }
        this.u.onFlush();
        ts40 ts40Var = this.o;
        if (ts40Var != null) {
            return;
        }
        while (true) {
            if (i >= (ts40Var == null ? 1 : this.l.d())) {
                return;
            }
            this.u.k();
            i++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.rs40
    public final void g(ks40 ks40Var, ss40 ss40Var, final long j) throws GlUtil.GlException {
        this.h.h();
        long j2 = this.A;
        Object[] objArr = 0;
        Executor executor = this.i;
        if (j2 == -9223372036854775807L) {
            final Object[] objArr2 = objArr == true ? 1 : 0;
            executor.execute(new Runnable(this) { // from class: p.bg20
                public final /* synthetic */ cg20 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b = objArr2;
                    long j3 = j;
                    cg20 cg20Var = this.b;
                    switch (b) {
                        case 0:
                            cg20Var.j.b(j3, false);
                            break;
                        default:
                            cg20Var.j.b(j3, true);
                            break;
                    }
                }
            });
        }
        final byte b = 1;
        if (this.o != null) {
            dm5.y(this.l.d() > 0);
            i(ks40Var, ss40Var, j, j * 1000);
            return;
        }
        if (this.f24p) {
            i(ks40Var, ss40Var, j, j * 1000);
        } else {
            ype1 ype1Var = new ype1(ss40Var, j);
            ConcurrentLinkedQueue concurrentLinkedQueue = this.k;
            concurrentLinkedQueue.add(ype1Var);
            long j3 = this.A;
            if (j3 != -9223372036854775807L) {
                if (j == j3) {
                    this.A = -9223372036854775807L;
                    executor.execute(new Runnable(this) { // from class: p.bg20
                        public final /* synthetic */ cg20 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            long j4 = j;
                            cg20 cg20Var = this.b;
                            switch (b2) {
                                case 0:
                                    cg20Var.j.b(j4, false);
                                    break;
                                default:
                                    cg20Var.j.b(j4, true);
                                    break;
                            }
                        }
                    });
                    i(ks40Var, ss40Var, j, System.nanoTime());
                    concurrentLinkedQueue.clear();
                } else {
                    this.u.j(ss40Var);
                }
            }
        }
        this.u.k();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(ks40 ks40Var, int i, int i2) throws VideoFrameProcessingException, GlUtil.GlException {
        char c = 1;
        Object[] objArr = (this.q == i && this.r == i2 && this.v != null) ? false : true;
        ArrayList arrayList = this.b;
        if (objArr != false) {
            this.q = i;
            this.r = i2;
            l291 l291VarI = qpn1.i(i, i2, arrayList);
            if (!Objects.equals(this.v, l291VarI)) {
                this.v = l291VarI;
                this.i.execute(new ag20(this, l291VarI, c == true ? 1 : 0));
            }
        }
        this.v.getClass();
        o3d1 o3d1Var = this.z;
        dos dosVar = null;
        ts40 ts40Var = this.o;
        if (o3d1Var == null && ts40Var == null) {
            dm5.y(this.B == null);
            dos dosVar2 = this.s;
            if (dosVar2 != null) {
                dosVar2.release();
                this.s = null;
            }
            oon1.H("Output surface and size not set, dropping frame.");
            return false;
        }
        int i3 = o3d1Var == null ? this.v.a : o3d1Var.b;
        int i4 = o3d1Var == null ? this.v.b : o3d1Var.c;
        x8h x8hVar = this.g;
        if (o3d1Var != null && this.B == null) {
            this.B = ks40Var.d(this.d, o3d1Var.a, x8hVar.c, o3d1Var.e);
        }
        if (ts40Var != null) {
            this.l.c(ks40Var, i3, i4);
        }
        dos dosVar3 = this.s;
        if (dosVar3 == null || !(this.y || objArr == true || this.x)) {
            dosVar = dosVar3;
        } else {
            dosVar3.release();
            this.s = null;
        }
        if (dosVar == null) {
            o3d1 o3d1Var2 = this.z;
            int i5 = o3d1Var2 == null ? 0 : o3d1Var2.d;
            v280 v280Var = new v280(4);
            v280Var.e(arrayList);
            if (i5 != 0) {
                float f = i5 % 360.0f;
                if (f < 0.0f) {
                    f += 360.0f;
                }
                v280Var.c(new ig41(f));
            }
            v280Var.c(x5w0.f(i3, i4, 0));
            dos dosVarK = dos.k(this.a, v280Var.g(), this.c, x8hVar, 0);
            l291 l291VarI2 = qpn1.i(this.q, this.r, dosVarK.i);
            o3d1 o3d1Var3 = this.z;
            if (o3d1Var3 != null) {
                dm5.y(l291VarI2.a == o3d1Var3.b);
                dm5.y(l291VarI2.b == o3d1Var3.c);
            }
            this.s = dosVarK;
            this.y = false;
            this.x = false;
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [p.ss40] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void i(ks40 ks40Var, ss40 ss40Var, long j, long j2) throws GlUtil.GlException {
        ?? r7;
        long j3;
        cg20 cg20Var;
        ?? r8;
        cg20 cg20Var2;
        try {
            if (j2 != -2) {
                try {
                    if (h(ks40Var, ss40Var.c, ss40Var.d)) {
                        long j4 = this.A;
                        if (!(j4 != -9223372036854775807L) || j == j4) {
                            if (this.z != null) {
                                cg20 cg20Var3 = this;
                                j3 = j;
                                try {
                                    cg20Var3.j(ss40Var, j3, j2);
                                    r8 = ss40Var;
                                    cg20Var2 = cg20Var3;
                                } catch (GlUtil.GlException | VideoFrameProcessingException e) {
                                    e = e;
                                    r7 = ss40Var;
                                    cg20Var = cg20Var3;
                                    cg20Var.i.execute(new xdh(cg20Var, e, j3, (byte) 2));
                                    cg20Var2 = cg20Var;
                                    r8 = r7;
                                }
                            } else {
                                cg20 cg20Var4 = this;
                                ss40 ss40Var2 = ss40Var;
                                ts40 ts40Var = cg20Var4.o;
                                cg20Var2 = cg20Var4;
                                r8 = ss40Var2;
                                if (ts40Var != null) {
                                    cg20Var4.k(ss40Var2, j);
                                    cg20Var2 = cg20Var4;
                                    r8 = ss40Var2;
                                }
                            }
                            cg20Var2.u.j((ss40) r8);
                            return;
                        }
                    }
                } catch (VideoFrameProcessingException e2) {
                    e = e2;
                    cg20Var = this;
                    r7 = ss40Var;
                    j3 = j;
                    cg20Var.i.execute(new xdh(cg20Var, e, j3, (byte) 2));
                    cg20Var2 = cg20Var;
                    r8 = r7;
                    cg20Var2.u.j((ss40) r8);
                    return;
                } catch (GlUtil.GlException e3) {
                    e = e3;
                    cg20Var = this;
                    r7 = ss40Var;
                    j3 = j;
                    cg20Var.i.execute(new xdh(cg20Var, e, j3, (byte) 2));
                    cg20Var2 = cg20Var;
                    r8 = r7;
                    cg20Var2.u.j((ss40) r8);
                    return;
                }
            }
            this.u.j(ss40Var);
            if (j2 == -2) {
                this.w.getClass();
            }
        } catch (VideoFrameProcessingException e4) {
            e = e4;
            this = this;
        } catch (GlUtil.GlException e5) {
            e = e5;
            this = this;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public final void j(ss40 ss40Var, long j, long j2) throws VideoFrameProcessingException, GlUtil.GlException {
        EGLSurface eGLSurface = this.B;
        eGLSurface.getClass();
        o3d1 o3d1Var = this.z;
        o3d1Var.getClass();
        dos dosVar = this.s;
        dosVar.getClass();
        int i = o3d1Var.b;
        int i2 = o3d1Var.c;
        EGLDisplay eGLDisplay = this.d;
        fn31.I(eGLDisplay, this.e, eGLSurface, i, i2);
        fn31.w();
        dosVar.h(ss40Var.a, j);
        if (j2 == -3) {
            dm5.y(j != -9223372036854775807L);
            j2 = 1000 * j;
        }
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j2);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        this.w.getClass();
        x8r.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public final void k(ss40 ss40Var, long j) throws VideoFrameProcessingException, GlUtil.GlException {
        ss40 ss40VarF = this.l.f();
        this.m.a(j);
        fn31.J(ss40VarF.b, ss40VarF.c, ss40VarF.d);
        fn31.w();
        dos dosVar = this.s;
        dosVar.getClass();
        dosVar.h(ss40Var.a, j);
        this.n.a(fn31.F());
        ts40 ts40Var = this.o;
        ts40Var.getClass();
        ts40Var.b(this, ss40VarF, j);
    }

    @Override // p.rs40
    public final void release() throws VideoFrameProcessingException {
        this.h.h();
        dos dosVar = this.s;
        if (dosVar != null) {
            dosVar.release();
            this.s = null;
        }
        try {
            try {
                this.l.b();
                fn31.H(this.d, this.B);
                fn31.t();
                this.B = null;
            } catch (GlUtil.GlException e) {
                throw new VideoFrameProcessingException((Throwable) e);
            }
        } catch (Throwable th) {
            this.B = null;
            throw th;
        }
    }
}
