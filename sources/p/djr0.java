package p;

import android.os.Bundle;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class djr0 implements c7r0 {
    public final rjd X;
    public final llm Y;
    public final ihp0 a;
    public final Function0 b;
    public bbr0 c;
    public xab1 d;
    public kj41 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public iac0 t;

    public djr0() {
        hhp0 hhp0Var = hhp0.a;
        v0r0 v0r0Var = v0r0.Y;
        this.a = hhp0Var;
        this.b = v0r0Var;
        this.g = true;
        this.X = new rjd(this, (byte) 6);
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        j0d1 j0d1VarB = guo1.B();
        bs50Var.getClass();
        this.Y = smo1.e(flo1.l(bs50Var, j0d1VarB).y(new z8n("ObservationPlatformPlugin.pagevisit")));
    }

    public final void a(upn1 upn1Var) {
        if (upn1Var instanceof n7r0) {
            this.h = false;
            h();
        } else if ((!(upn1Var instanceof k7r0) || ((k7r0) upn1Var).c) && this.h) {
            f();
        }
    }

    public final void c(iac0 iac0Var) {
        x8c0 lifecycle;
        iac0 iac0Var2 = this.t;
        rjd rjdVar = this.X;
        if (iac0Var2 != null && (lifecycle = iac0Var2.getLifecycle()) != null) {
            lifecycle.d(rjdVar);
        }
        this.t = iac0Var;
        this.g = iac0Var.getLifecycle().b().a(w8c0.e);
        iac0Var.getLifecycle().a(rjdVar);
    }

    public final Bundle d() {
        return null;
    }

    public final void dispose() {
        x8c0 lifecycle;
        if (this.f) {
            return;
        }
        this.f = true;
        h();
        iac0 iac0Var = this.t;
        if (iac0Var != null && (lifecycle = iac0Var.getLifecycle()) != null) {
            lifecycle.d(this.X);
        }
        this.t = null;
        smo1.p(this.Y, (CancellationException) null);
    }

    public final void e(vir0 vir0Var) {
        if (vir0Var.equals(sir0.a)) {
            this.h = true;
            f();
            return;
        }
        if (!(vir0Var instanceof uir0)) {
            if (!(vir0Var instanceof tir0)) {
                eg.o();
                return;
            } else {
                this.h = false;
                h();
                return;
            }
        }
        boolean z = ((uir0) vir0Var).a != 1;
        this.h = z;
        if (z) {
            f();
        } else {
            h();
        }
    }

    public final void f() {
        bbr0 bbr0Var;
        if (!this.f && this.g && ((Boolean) this.b.invoke()).booleanValue()) {
            if (this.e == null) {
                kj41 kj41VarU = this.a.u("page.visit");
                kj41VarU.setAttribute("page_implementation", "tome");
                this.e = kj41VarU;
                String str = this.i;
                if (str != null) {
                    kj41VarU.setAttribute("page_identifier", str);
                }
            }
            xab1 xab1Var = this.d;
            if ((xab1Var == null || !xab1Var.isActive()) && (bbr0Var = this.c) != null) {
                this.d = fn31.T(this.Y, (o8n) null, 0, new cto0(bbr0Var, this, null, (byte) 21), 3);
            }
        }
    }

    public final void g(bbr0 bbr0Var) {
        this.c = bbr0Var;
    }

    public final void h() {
        xab1 xab1Var = this.d;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.d = null;
        kj41 kj41Var = this.e;
        if (kj41Var != null) {
            kj41Var.stop();
        }
        this.e = null;
    }

    public final void b(Bundle bundle) {
    }
}
