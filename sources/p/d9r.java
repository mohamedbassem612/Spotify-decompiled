package p;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d9r implements rs40 {
    public final Context a;
    public final c9r b;
    public dos c;
    public final x8h d;
    public EGLDisplay i;
    public int j = -1;
    public int k = -1;
    public ps40 e = new ypa((byte) 6, false);
    public qs40 f = new mta((byte) 6);
    public os40 g = new n7o((byte) 4);
    public Executor h = l5u.a;

    public d9r(Context context, c9r c9rVar, x8h x8hVar) {
        this.a = context;
        this.b = c9rVar;
        this.d = x8hVar;
    }

    @Override // p.rs40
    public final void a() {
        this.f.h();
    }

    @Override // p.rs40
    public final void b(cce cceVar) {
        this.f = cceVar;
    }

    @Override // p.rs40
    public final void c(ps40 ps40Var) {
        this.e = ps40Var;
        ps40Var.k();
    }

    @Override // p.rs40
    public final void d(Executor executor, os40 os40Var) {
        this.g = os40Var;
        this.h = executor;
    }

    public final void e(int i, int i2) {
        if (this.i == null) {
            this.i = fn31.N();
        }
        EGL14.eglGetCurrentContext();
        if (this.j == -1 || this.k == -1) {
            this.j = i;
            this.k = i2;
        }
        this.b.getClass();
        if (this.c == null) {
            n3p1.j(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            x5w0 x5w0VarF = x5w0.f(this.j, this.k, 0);
            int iB = o280.b(4, 1);
            if (iB > 4) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[0] = x5w0VarF;
            bg11 bg11VarL = b380.l(1, objArrCopyOf);
            bg11 bg11Var = bg11.e;
            x8h x8hVar = this.d;
            this.c = dos.k(this.a, bg11VarL, bg11Var, x8hVar, x8hVar.c == 1 ? 2 : 0);
        }
    }

    @Override // p.rs40
    public final void f(ss40 ss40Var) {
        this.e.j(ss40Var);
        this.e.k();
    }

    @Override // p.rs40
    public final void flush() {
        dos dosVar = this.c;
        if (dosVar != null) {
            dosVar.flush();
        }
        this.e.onFlush();
        this.e.k();
    }

    @Override // p.rs40
    public final void g(ks40 ks40Var, ss40 ss40Var, long j) {
        try {
            e(ss40Var.c, ss40Var.d);
            this.c.getClass();
            throw null;
        } catch (VideoFrameProcessingException | GlUtil.GlException e) {
            this.h.execute(new xdh(this, e, j, (byte) 1));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    @Override // p.rs40
    public final void release() throws VideoFrameProcessingException {
        dos dosVar = this.c;
        if (dosVar != null) {
            dosVar.release();
        }
        try {
            fn31.t();
        } catch (GlUtil.GlException e) {
            throw new VideoFrameProcessingException((Throwable) e);
        }
    }
}
