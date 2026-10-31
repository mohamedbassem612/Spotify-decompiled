package p;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ml4 implements vdt0 {
    public vzb0 a;
    public xab1 b;
    public s1c0 c;
    public dt71 d;

    public final void a() {
        j(null);
    }

    public final void b() {
        xab1 xab1Var = this.b;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.b = null;
        dt71 dt71VarI = i();
        if (dt71VarI != null) {
            dt71VarI.d();
        }
    }

    public final void c() {
        b6t b6tVar;
        vzb0 vzb0Var = this.a;
        if (vzb0Var == null || (b6tVar = (k6a1) lcc.z(vzb0Var, t4k.q)) == null) {
            return;
        }
        b6tVar.a();
    }

    public final void d(c8e1 c8e1Var, hyp0 hyp0Var, y9e1 y9e1Var, gqb0 gqb0Var, n511 n511Var, n511 n511Var2) {
        s1c0 s1c0Var = this.c;
        if (s1c0Var != null) {
            a0c0 a0c0Var = s1c0Var.m;
            synchronized (a0c0Var.i) {
                try {
                    a0c0Var.j = c8e1Var;
                    a0c0Var.l = hyp0Var;
                    a0c0Var.k = y9e1Var;
                    a0c0Var.m = n511Var;
                    a0c0Var.n = n511Var2;
                    if (a0c0Var.b || a0c0Var.a) {
                        a0c0Var.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e() {
        b6t b6tVar;
        vzb0 vzb0Var = this.a;
        if (vzb0Var == null || (b6tVar = (k6a1) lcc.z(vzb0Var, t4k.q)) == null) {
            return;
        }
        b6tVar.b();
    }

    public final void f(n511 n511Var) {
        Rect rect;
        s1c0 s1c0Var = this.c;
        if (s1c0Var != null) {
            s1c0Var.l = new Rect(jch0.U(n511Var.a), jch0.U(n511Var.b), jch0.U(n511Var.c), jch0.U(n511Var.d));
            if (!s1c0Var.j.isEmpty() || (rect = s1c0Var.l) == null) {
                return;
            }
            s1c0Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final void g(c8e1 c8e1Var, c8e1 c8e1Var2) {
        s1c0 s1c0Var = this.c;
        if (s1c0Var != null) {
            boolean z = (nbe1.c(s1c0Var.h.b, c8e1Var2.b) && u890.j(s1c0Var.h.c, c8e1Var2.c)) ? false : true;
            s1c0Var.h = c8e1Var2;
            int size = s1c0Var.j.size();
            for (int i = 0; i < size; i++) {
                x311 x311Var = (x311) ((WeakReference) s1c0Var.j.get(i)).get();
                if (x311Var != null) {
                    x311Var.g = c8e1Var2;
                }
            }
            a0c0 a0c0Var = s1c0Var.m;
            synchronized (a0c0Var.i) {
                a0c0Var.j = null;
                a0c0Var.l = null;
                a0c0Var.k = null;
                a0c0Var.m = null;
                a0c0Var.n = null;
            }
            if (u890.j(c8e1Var, c8e1Var2)) {
                if (z) {
                    oj80 oj80Var = s1c0Var.b;
                    int iG = nbe1.g(c8e1Var2.b);
                    int iF = nbe1.f(c8e1Var2.b);
                    nbe1 nbe1Var = s1c0Var.h.c;
                    int iG2 = nbe1Var != null ? nbe1.g(nbe1Var.a) : -1;
                    nbe1 nbe1Var2 = s1c0Var.h.c;
                    oj80Var.d().updateSelection((View) oj80Var.b, iG, iF, iG2, nbe1Var2 != null ? nbe1.f(nbe1Var2.a) : -1);
                    return;
                }
                return;
            }
            if (c8e1Var != null && (!u890.j(c8e1Var.a.b, c8e1Var2.a.b) || (nbe1.c(c8e1Var.b, c8e1Var2.b) && !u890.j(c8e1Var.c, c8e1Var2.c)))) {
                oj80 oj80Var2 = s1c0Var.b;
                oj80Var2.d().restartInput((View) oj80Var2.b);
                return;
            }
            int size2 = s1c0Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                x311 x311Var2 = (x311) ((WeakReference) s1c0Var.j.get(i2)).get();
                if (x311Var2 != null) {
                    c8e1 c8e1Var3 = s1c0Var.h;
                    oj80 oj80Var3 = s1c0Var.b;
                    if (x311Var2.k) {
                        x311Var2.g = c8e1Var3;
                        if (x311Var2.i) {
                            oj80Var3.d().updateExtractedText((View) oj80Var3.b, x311Var2.h, yzo1.u(c8e1Var3));
                        }
                        nbe1 nbe1Var3 = c8e1Var3.c;
                        long j = c8e1Var3.b;
                        int iG3 = nbe1Var3 != null ? nbe1.g(nbe1Var3.a) : -1;
                        nbe1 nbe1Var4 = c8e1Var3.c;
                        oj80Var3.d().updateSelection((View) oj80Var3.b, nbe1.g(j), nbe1.f(j), iG3, nbe1Var4 != null ? nbe1.f(nbe1Var4.a) : -1);
                    }
                }
            }
        }
    }

    public final void h(c8e1 c8e1Var, x180 x180Var, d5e1 d5e1Var, l7n l7nVar) {
        j(new kl4(c8e1Var, this, x180Var, d5e1Var, l7nVar, (byte) 0));
    }

    public final sen0 i() {
        dt71 dt71Var = this.d;
        if (dt71Var != null) {
            return dt71Var;
        }
        if (!rkc1.a) {
            return null;
        }
        dt71 dt71VarE = mgo1.e(1, 0, 3, 2);
        this.d = dt71VarE;
        return dt71VarE;
    }

    public final void j(kl4 kl4Var) {
        vzb0 vzb0Var = this.a;
        if (vzb0Var == null) {
            return;
        }
        this.b = ((pim0) vzb0Var).N0 ? fn31.T(vzb0Var.v1(), null, 4, new ss90(vzb0Var, new bh(kl4Var, this, vzb0Var, (lnm) null, (byte) 10), (lnm) null, (byte) 13), 1) : null;
    }

    public final void k(vzb0 vzb0Var) {
        vzb0 vzb0Var2 = this.a;
        if (vzb0Var2 != vzb0Var) {
            tf80.c("Expected textInputModifierNode to be " + vzb0Var + " but was " + vzb0Var2);
        }
        this.a = null;
    }
}
