package p;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bvm0 extends k9 {
    public final nen0 c;
    public final ArrayList d;
    public final nen0 e;
    public final iv91 f;

    public bvm0() {
        super((byte) 16);
        this.c = dm5.C();
        this.d = new ArrayList();
        this.e = new nen0();
        w9 w9Var = new w9(this, (byte) 16);
        pv91.b(pv91.a);
        synchronized (pv91.c) {
            pv91.h = o7h.O0(w9Var, pv91.h);
        }
        this.f = new iv91(w9Var, (byte) 0);
    }

    @Override // p.k9
    public final void J0() {
        this.f.a();
        this.d.clear();
        this.e.a();
        synchronized (this.b) {
            this.c.a();
        }
    }

    @Override // p.k9
    public final iu30 l1(r261 r261Var) {
        nen0 nen0Var = this.e;
        iu30 gub0Var = (iu30) nen0Var.g(r261Var);
        if (gub0Var == null) {
            gub0Var = new gub0(this, r261Var, (byte) 5);
            int iF = nen0Var.f(r261Var);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = nen0Var.c;
            Object obj = objArr[iF];
            nen0Var.b[iF] = r261Var;
            objArr[iF] = gub0Var;
        }
        return gub0Var;
    }

    @Override // p.k9
    public final void m1(jfe jfeVar) {
        this.e.k(jfeVar);
        y0(jfeVar);
        z0();
    }

    public final void v1(Object obj, r261 r261Var) {
        this.d.add(new yum0(obj, r261Var));
    }

    @Override // p.k9
    public final void y0(r261 r261Var) {
        this.d.add(new zum0(r261Var));
    }

    @Override // p.k9
    public final void z0() {
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.d;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    avm0 avm0Var = (avm0) arrayList.get(i);
                    if (avm0Var instanceof yum0) {
                        dm5.g(this.c, ((yum0) avm0Var).a, ((yum0) avm0Var).b);
                    } else {
                        if (!(avm0Var instanceof zum0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dm5.a0(this.c, ((zum0) avm0Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.clear();
    }
}
