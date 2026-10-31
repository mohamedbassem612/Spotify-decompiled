package p;

import android.content.Context;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ok4 implements yd50 {
    public static boolean g = true;
    public final ha4 a;
    public final Object b = new Object();
    public tbk1 c;
    public boolean d;
    public em3 e;
    public final nk4 f;

    public ok4(ha4 ha4Var) {
        this.a = ha4Var;
        nk4 nk4Var = new nk4(this, (byte) 0);
        this.f = nk4Var;
        if (ha4Var.isAttachedToWindow()) {
            Context context = ha4Var.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(nk4Var);
                this.d = true;
            }
        }
        ha4Var.addOnAttachStateChangeListener(new y22(this, (byte) 1));
    }

    @Override // p.yd50
    public final em3 a() {
        em3 em3Var = this.e;
        if (em3Var != null) {
            return em3Var;
        }
        em3 em3VarM = kln1.m();
        this.e = em3VarM;
        return em3VarM;
    }

    @Override // p.yd50
    public final be50 b() {
        je50 le50Var;
        je50 je50Var;
        be50 be50Var;
        synchronized (this.b) {
            try {
                ha4 ha4Var = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    x74.U(ha4Var);
                }
                if (i >= 29) {
                    je50Var = new je50();
                } else {
                    if (g) {
                        try {
                            le50Var = new ie50(this.a);
                        } catch (Throwable unused) {
                            g = false;
                            ha4 ha4Var2 = this.a;
                            l7v l7vVar = this.c;
                            if (l7vVar == null) {
                                l7v tbk1Var = new tbk1(ha4Var2.getContext());
                                ha4Var2.addView((View) tbk1Var, -1);
                                this.c = tbk1Var;
                                l7vVar = tbk1Var;
                            }
                            le50Var = new le50(l7vVar);
                        }
                    } else {
                        ha4 ha4Var3 = this.a;
                        l7v l7vVar2 = this.c;
                        if (l7vVar2 == null) {
                            l7v tbk1Var2 = new tbk1(ha4Var3.getContext());
                            ha4Var3.addView((View) tbk1Var2, -1);
                            this.c = tbk1Var2;
                            l7vVar2 = tbk1Var2;
                        }
                        le50Var = new le50(l7vVar2);
                    }
                    je50Var = le50Var;
                }
                be50Var = new be50(je50Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return be50Var;
    }

    @Override // p.yd50
    public final void c(be50 be50Var) {
        synchronized (this.b) {
            if (!be50Var.s) {
                be50Var.s = true;
                be50Var.b();
            }
        }
    }
}
