package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m2r0 extends bgp0 implements pml {
    public m511 c;
    public nml d;
    public nml e;
    public kku f;
    public boolean g;
    public m511 h;
    public m511 i;

    public m2r0() {
        m511 m511Var = m511.e;
        m511 m511Var2 = m511.e;
        this.h = m511Var2;
        this.i = m511Var2;
    }

    public final m511 a() {
        m511 m511Var = this.c;
        if (m511Var != null) {
            return m511Var;
        }
        nml nmlVar = this.d;
        m511 m511VarA = nmlVar != null ? nmlVar.a() : null;
        if (m511VarA != null && m511VarA.c - m511VarA.a > 0.0f && m511VarA.d - m511VarA.b > 0.0f) {
            this.h = m511VarA;
        }
        return this.h;
    }

    @Override // p.pml
    public final void c(m511 m511Var) {
        if (this.c == null) {
            h();
        }
    }

    @Override // p.bgp0
    public final void e() {
        this.g = true;
        k();
    }

    @Override // p.bgp0
    public final void f() {
        this.g = false;
        k();
    }

    public final void g() {
        this.d = null;
        this.c = null;
        this.h = m511.e;
        k();
        h();
    }

    public final void h() {
        m511 m511VarA = a();
        if (m511VarA.equals(this.i)) {
            return;
        }
        this.i = m511VarA;
        d(m511VarA);
    }

    public final void i(View view) {
        nml nmlVarN = obg1.n(view);
        if (this.d == nmlVarN) {
            return;
        }
        this.d = nmlVarN;
        k();
        h();
    }

    public final void j(m511 m511Var) {
        if (u890.j(this.c, m511Var)) {
            return;
        }
        this.c = m511Var;
        k();
        h();
    }

    public final void k() {
        nml nmlVar = (this.g && this.c == null) ? this.d : null;
        if (nmlVar == this.e) {
            return;
        }
        kku kkuVar = this.f;
        if (kkuVar != null) {
            kkuVar.dispose();
        }
        this.e = nmlVar;
        this.f = nmlVar != null ? nmlVar.b(this) : null;
    }
}
