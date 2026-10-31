package p;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r1q0 {
    public final Runnable a;
    public final n36 b = new n36();
    public m1q0 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public r1q0(Runnable runnable) {
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? zr7.k(new xy50(this, (byte) 20), new cnp0(this, (byte) 17), new u6j0(this, (byte) 19), new ckj(this, (byte) 1)) : gg.c(new ckj(this, (byte) 2));
        }
    }

    public final void a(iac0 iac0Var, m1q0 m1q0Var) {
        x8c0 lifecycle = iac0Var.getLifecycle();
        if (lifecycle.b() == w8c0.a) {
            return;
        }
        m1q0Var.b.add(new p1q0(this, lifecycle, m1q0Var));
        f();
        m1q0Var.c = new mdp0(this, (byte) 23);
    }

    public final q1q0 b(m1q0 m1q0Var) {
        this.b.addLast(m1q0Var);
        q1q0 q1q0Var = new q1q0(this, m1q0Var);
        m1q0Var.b.add(q1q0Var);
        f();
        m1q0Var.c = new mdp0(this, (byte) 24);
        return q1q0Var;
    }

    public final void c() {
        Object objPrevious;
        m1q0 m1q0Var = this.c;
        if (m1q0Var == null) {
            n36 n36Var = this.b;
            ListIterator listIterator = n36Var.listIterator(n36Var.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((m1q0) objPrevious).a);
            m1q0Var = (m1q0) objPrevious;
        }
        this.c = null;
        if (m1q0Var != null) {
            m1q0Var.a();
        }
    }

    public final void d() {
        Object objPrevious;
        m1q0 m1q0Var = this.c;
        if (m1q0Var == null) {
            n36 n36Var = this.b;
            ListIterator listIterator = n36Var.listIterator(n36Var.b());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((m1q0) objPrevious).a);
            m1q0Var = (m1q0) objPrevious;
        }
        this.c = null;
        if (m1q0Var != null) {
            m1q0Var.b();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        if (z && !this.f) {
            gg.K(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            gg.U(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void f() {
        boolean z = this.g;
        boolean z2 = false;
        n36 n36Var = this.b;
        if (n36Var == null || !n36Var.isEmpty()) {
            Iterator it = n36Var.iterator();
            while (it.hasNext()) {
                if (((m1q0) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z2);
    }
}
