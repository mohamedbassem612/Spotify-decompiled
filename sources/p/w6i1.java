package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class w6i1 implements c7r0, b8r0 {
    public llm X;
    public final l6h1 a;
    public final b7r0 b;
    public final q8n c;
    public final i8h1 d;
    public final boolean e;
    public final boolean f;
    public final qhe0 g;
    public final v6i1 h;
    public final x1r0 i;
    public final zhk1 t;

    public w6i1(c2r0 c2r0Var, c2r0 c2r0Var2, i8h1 i8h1Var, i8h1 i8h1Var2, l6h1 l6h1Var, b7r0 b7r0Var, q8n q8nVar, qe41 qe41Var, bbr0 bbr0Var, fkk1 fkk1Var, iac0 iac0Var, cwn0 cwn0Var) {
        qhe0 qhe0VarA;
        g6h1 g6h1VarU;
        t1r0 t1r0Var;
        l6h1 l6h1Var2 = l6h1Var;
        this.a = l6h1Var2;
        this.b = b7r0Var;
        this.c = q8nVar;
        i8h1 i8h1Var3 = i8h1Var;
        this.d = i8h1Var3;
        s9h1 s9h1Var = (s9h1) bbr0Var.b0(s9h1.class).a();
        boolean z = s9h1Var != null && s9h1Var.a;
        this.e = z;
        s9h1 s9h1Var2 = (s9h1) bbr0Var.b0(s9h1.class).a();
        boolean z2 = s9h1Var2 != null && s9h1Var2.b && (t1r0Var = (t1r0) bbr0Var.b0(t1r0.class).a()) != null && t1r0Var.a;
        this.f = z2;
        s9h1 s9h1Var3 = (s9h1) bbr0Var.b0(s9h1.class).a();
        boolean z3 = s9h1Var3 != null && s9h1Var3.c;
        w7u0 w7u0Var = ((x7u0) bbr0Var.b0(x7u0.class).a()) != null ? w7u0.b : w7u0.a;
        t1r0 t1r0Var2 = (t1r0) bbr0Var.b0(t1r0.class).a();
        if (t1r0Var2 == null || !t1r0Var2.a) {
            qhe0VarA = null;
        } else {
            n6r0 n6r0VarE = wqn1.s(bbr0Var).e();
            qir0 qir0VarD = wqn1.u(bbr0Var).d();
            nar0 nar0VarC = wqn1.t(bbr0Var).c();
            xj61 xj61Var = new xj61();
            xj61Var.add(z2h1.b);
            if (z) {
                xj61Var.add(x2h1.b);
            }
            xj61 xj61VarJ = cwl1.j(xj61Var);
            if (z3) {
                g6h1VarU = poo1.u(cwn0Var);
            } else {
                g6h1.Companion.getClass();
                g6h1VarU = g6h1.d;
            }
            qhe0VarA = c2r0Var.a(n6r0VarE, qir0VarD, nar0VarC, xj61VarJ, z2, g6h1VarU, z3, wqn1.x(bbr0Var));
            mr20 mr20VarU = rqt0.u(new jha1(qqn1.f(bbr0Var.b0(bn70.class)), (byte) 27));
            tar0 tar0Var = qhe0VarA.g;
            if (tar0Var.d && tar0Var.c) {
                faa0 faa0Var = tar0Var.r;
                if (faa0Var != null) {
                    faa0Var.d(null);
                }
                llm llmVar = tar0Var.q;
                tar0Var.r = llmVar != null ? c921.y(llmVar, (o8n) null, 0, new cto0(mr20VarU, tar0Var, (lnm) null, (byte) 18), 3) : null;
            }
        }
        this.g = qhe0VarA;
        this.h = new v6i1(this);
        this.i = qhe0VarA != null ? new x1r0(qhe0VarA, qe41Var) : null;
        this.t = new zhk1(qhe0VarA != null ? qhe0VarA : i8h1Var3, qhe0VarA != null ? qhe0VarA : l6h1Var2, (qhe0VarA == null || !z) ? null : qhe0VarA, fkk1Var, iac0Var, z2, w7u0Var);
        this.X = c();
    }

    @Override // p.c7r0
    public void a(upn1 upn1Var) {
        boolean z = upn1Var instanceof k7r0;
        zhk1 zhk1Var = this.t;
        x1r0 x1r0Var = this.i;
        if (z) {
            boolean z2 = ((k7r0) upn1Var).c;
            if (z2 && x1r0Var != null) {
                x1r0Var.a(upn1Var);
            }
            zhk1Var.a(upn1Var);
            if (!z2 && x1r0Var != null) {
                x1r0Var.a(upn1Var);
            }
        } else {
            zhk1Var.a(upn1Var);
            if (x1r0Var != null) {
                x1r0Var.a(upn1Var);
            }
        }
        if (upn1Var instanceof l7r0) {
            if (this.X == null) {
                this.X = c();
            }
        } else if (upn1Var instanceof n7r0) {
            llm llmVar = this.X;
            if (llmVar != null) {
                smo1.q(llmVar);
            }
            this.X = null;
        }
    }

    public final llm c() {
        if (!this.f || this.g == null) {
            return null;
        }
        llm llmVarE = smo1.e(ha71.A(guo1.B(), this.c));
        c921.y(llmVarE, (o8n) null, 0, new b0f1(this, (lnm) null, (byte) 24), 3);
        return llmVarE;
    }

    @Override // p.c7r0
    public final Bundle d() {
        return null;
    }

    @Override // p.c7r0
    public final void dispose() {
        zhk1 zhk1Var = this.t;
        zhk1Var.h = null;
        zhk1Var.g.g();
        x1r0 x1r0Var = this.i;
        if (x1r0Var != null) {
            x1r0Var.dispose();
        }
        llm llmVar = this.X;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        this.X = null;
    }

    @Override // p.c7r0
    public final void e(vir0 vir0Var) {
        this.t.e(vir0Var);
    }

    @Override // p.b8r0
    public final Object f(Class cls) {
        boolean zEquals = cls.equals(i8h1.class);
        qhe0 qhe0Var = this.g;
        if (zEquals) {
            return qhe0Var != null ? qhe0Var : this.d;
        }
        if (cls.equals(l6h1.class)) {
            return qhe0Var != null ? qhe0Var : this.a;
        }
        if (cls.equals(n7h1.class)) {
            if (qhe0Var == null || !this.e) {
                return null;
            }
            return qhe0Var;
        }
        if (cls.equals(t8h1.class) || cls.equals(l3h1.class)) {
            return qhe0Var;
        }
        if (cls.equals(lir0.class) && qhe0Var != null) {
            return qhe0Var;
        }
        hhg1.o(cls, "Unsupported logger class: ");
        return null;
    }

    @Override // p.c7r0
    public final void b(Bundle bundle) {
    }
}
