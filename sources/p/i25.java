package p;

import android.app.Application;
import android.content.Context;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.SocketException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i25 {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public i25(int i, int i2) {
        this.b = apo.q(i);
        this.c = apo.q(i2);
        this.e = new ksb0(i, 30, 100);
    }

    public static IOException b(i25 i25Var, long j, boolean z, IOException iOException, int i) {
        jf01 jf01Var = (jf01) i25Var.b;
        boolean z2 = false;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 8) == 0;
        xa00 xa00Var = (xa00) i25Var.c;
        if (iOException != null) {
            i25Var.g(iOException);
        }
        if (z4) {
            if (iOException != null) {
                xa00Var.v(jf01Var, iOException);
            } else {
                xa00Var.t(jf01Var, j);
            }
        }
        if (z3) {
            if (iOException != null) {
                xa00Var.A(jf01Var, iOException);
            } else {
                xa00Var.y(jf01Var, j);
            }
        }
        if (z4 && !z) {
            z2 = true;
        }
        return jf01Var.i(i25Var, z2, (!z3 || z) ? z2 : true, z3 && z, (z4 && z) ? true : z2, iOException);
    }

    public void a() {
        synchronized (((qpc) this.e)) {
            if (this.a) {
                return;
            }
            this.a = true;
            w4n1.b((c291) this.c);
            try {
                ((y861) this.b).a();
            } catch (IOException unused) {
            }
        }
    }

    public kf01 c() {
        kf01 kf01VarI = ((sl00) this.e).i();
        kf01 kf01Var = kf01VarI instanceof kf01 ? kf01VarI : null;
        if (kf01Var != null) {
            return kf01Var;
        }
        eg.m("no connection for CONNECT tunnels");
        return null;
    }

    public yf01 d(ry21 ry21Var) throws IOException {
        i25 i25Var;
        sl00 sl00Var = (sl00) this.e;
        try {
            String strC = ry21Var.f.c("Content-Type");
            if (strC == null) {
                strC = null;
            }
            long j = sl00Var.j(ry21Var);
            i25Var = this;
            try {
                return new yf01(strC, j, sj1.g(new ql00(i25Var, sl00Var.c(ry21Var), j, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                ((xa00) i25Var.c).A((jf01) i25Var.b, iOException);
                i25Var.g(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            i25Var = this;
        }
    }

    public zx21 e(boolean z) throws IOException {
        try {
            zx21 zx21VarF = ((sl00) this.e).f(z);
            if (zx21VarF == null) {
                return zx21VarF;
            }
            zx21VarF.n = this;
            return zx21VarF;
        } catch (IOException e) {
            ((xa00) this.c).A((jf01) this.b, e);
            g(e);
            throw e;
        }
    }

    public synchronized void f() {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            Context context = (Context) this.e;
            if (context != null) {
                ((g25) this.c).a(context);
                context.unregisterComponentCallbacks((h25) this.d);
            }
            ((WeakReference) this.b).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void g(IOException iOException) {
        this.a = true;
        ((sl00) this.e).i().e((jf01) this.b, iOException);
    }

    public void h(int i, int i2) {
        if (i < 0.0f) {
            tf80.a("Index should be non-negative (" + i + ")");
        }
        ((err0) this.b).t(i);
        ((ksb0) this.e).c(i);
        ((err0) this.c).t(i2);
    }

    public uo5 i() throws SocketException {
        jf01 jf01Var = (jf01) this.b;
        if (jf01Var.X) {
            eg.m("Check failed.");
            return null;
        }
        jf01Var.X = true;
        jf01Var.f.j();
        synchronized (jf01Var) {
            if (jf01Var.S0 == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (jf01Var.O0 || jf01Var.P0) {
                throw new IllegalStateException("Check failed.");
            }
            if (jf01Var.Z) {
                throw new IllegalStateException("Check failed.");
            }
            if (!jf01Var.N0) {
                throw new IllegalStateException("Check failed.");
            }
            jf01Var.N0 = false;
            jf01Var.O0 = true;
            jf01Var.P0 = true;
        }
        kf01 kf01VarI = ((sl00) this.e).i();
        kf01VarI.e.setSoTimeout(0);
        kf01VarI.b();
        return new uo5(this);
    }

    public i25(Application application, c9n c9nVar, utw0 utw0Var) {
        this.b = application;
        this.c = c9nVar;
        this.d = utw0Var;
        application.registerActivityLifecycleCallbacks(new eon1(utw0Var));
    }

    public i25(rf01 rf01Var) {
        this.b = new WeakReference(rf01Var);
        this.c = new g25(this, rf01Var);
        this.d = new h25(this);
    }

    public i25(jf01 jf01Var, xa00 xa00Var, tl00 tl00Var, sl00 sl00Var) {
        this.b = jf01Var;
        this.c = xa00Var;
        this.d = tl00Var;
        this.e = sl00Var;
    }

    public i25(qpc qpcVar, y861 y861Var) {
        this.e = qpcVar;
        this.b = y861Var;
        c291 c291VarL = y861Var.l(1);
        this.c = c291VarL;
        this.d = new ppc(qpcVar, this, c291VarL);
    }
}
