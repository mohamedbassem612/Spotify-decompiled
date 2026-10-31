package p;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x1r0 implements c7r0 {
    public final qhe0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final oe41 f;
    public final svh0 g;
    public final String h;
    public final gyq0 i;

    public x1r0(qhe0 qhe0Var, qe41 qe41Var) {
        this.a = qhe0Var;
        oe41 oe41VarP = qe41Var.p();
        this.f = oe41VarP;
        this.g = new svh0(qe41Var.getLifecycle(), new WeakReference(qhe0Var));
        String strConcat = "PageBoundPageInstrumentation".concat(qhe0Var.P0.path());
        this.h = strConcat;
        this.i = new gyq0(qe41Var, (byte) 5);
        Bundle bundleA = oe41VarP.a(strConcat);
        if (bundleA != null) {
            b(bundleA);
        }
        oe41VarP.e(strConcat);
        oe41VarP.c(strConcat, new uk(this, (byte) 13));
    }

    @Override // p.c7r0
    public final void a(upn1 upn1Var) {
        boolean z;
        if (!this.d || (((z = this.c) && (upn1Var instanceof k7r0)) || !z)) {
            boolean z2 = upn1Var instanceof l7r0;
            qhe0 qhe0Var = this.a;
            if (z2) {
                qhe0Var.G();
                return;
            }
            boolean z3 = upn1Var instanceof h7r0;
            svh0 svh0Var = this.g;
            if (z3) {
                if (this.c) {
                    return;
                }
                this.c = true;
                if (this.b) {
                    svh0Var.r();
                    return;
                }
                return;
            }
            if (upn1Var instanceof k7r0) {
                boolean z4 = ((k7r0) upn1Var).c;
                boolean z5 = false;
                if (z4) {
                    this.e = false;
                    if (!this.b && this.c) {
                        svh0Var.r();
                    }
                } else if ((this.b || this.c) && !this.e) {
                    boolean zBooleanValue = ((Boolean) this.i.invoke()).booleanValue();
                    if (zBooleanValue && xcg1.b(qhe0Var.t)) {
                        z5 = true;
                    }
                    qhe0Var.Q0 = z5;
                    qhe0Var.v(zBooleanValue);
                    this.e = true;
                }
                this.b = z4;
            }
        }
    }

    @Override // p.c7r0
    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.b = bundle.getBoolean("USER_BEHAVIOR_PAGE_FOCUSED_KEY");
        this.c = bundle.getBoolean("USER_BEHAVIOR_DATA_LOAD_COMPLETE_FOCUSED_KEY");
        qhe0 qhe0Var = this.a;
        Bundle bundle2 = bundle.getBundle("USER_BEHAVIOR_LOGGER_KEY".concat(qhe0Var.P0.path()));
        if (bundle2 != null) {
            qhe0Var.y(bundle2);
        }
        this.d = true;
    }

    @Override // p.c7r0
    public final Bundle d() {
        return null;
    }

    @Override // p.c7r0
    public final void dispose() {
        this.f.e(this.h);
    }
}
