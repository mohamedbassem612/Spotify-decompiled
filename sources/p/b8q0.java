package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b8q0 implements nml {
    public final View a;
    public final nml b;
    public m511 c;
    public m511 d = m511.e;

    public b8q0(View view) {
        this.a = view;
        this.b = obg1.n(view);
    }

    @Override // p.nml
    public final m511 a() {
        return c(this.b.a());
    }

    @Override // p.nml
    public final kku b(pml pmlVar) {
        return this.b.b(new a8q0(pmlVar, this));
    }

    public final m511 c(m511 m511Var) {
        if (!u890.j(m511Var, this.c)) {
            this.c = m511Var;
            View view = this.a;
            m511 m511Var2 = new m511(3, view.getRootView().getWidth(), view.getRootView().getHeight());
            float fMax = Math.max(m511Var.a, 0.0f);
            float fMax2 = Math.max(m511Var.b, 0.0f);
            float fMin = Math.min(m511Var.c, m511Var2.c);
            float fMin2 = Math.min(m511Var.d, m511Var2.d);
            m511 m511Var3 = (fMax >= fMin || fMax2 >= fMin2) ? null : new m511(fMax, fMax2, fMin, fMin2);
            if (m511Var3 == null) {
                m511Var3 = m511.e;
            }
            this.d = m511Var3;
        }
        return this.d;
    }
}
