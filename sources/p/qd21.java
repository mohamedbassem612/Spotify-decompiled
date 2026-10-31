package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qd21 {
    public final jca a;
    public final int b;
    public final jca c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public qd21(jca jcaVar, jca jcaVar2, int i) {
        this.a = jcaVar;
        this.b = i;
        this.c = jcaVar2;
    }

    public static boolean j(jca jcaVar) {
        return jcaVar.k() != 0;
    }

    public static void n(jca jcaVar, long j) {
        jcaVar.M();
        if (jcaVar instanceof mce1) {
            ((mce1) jcaVar).b0(j);
        }
    }

    public final void a(jca jcaVar, j7s j7sVar) {
        dm5.y(this.a == jcaVar || this.c == jcaVar);
        if (j(jcaVar)) {
            j7sVar.e(jcaVar);
            if (jcaVar.k() == 2) {
                jcaVar.Q();
            }
            jcaVar.d();
        }
    }

    public final int b() {
        boolean zJ = j(this.a);
        jca jcaVar = this.c;
        return (zJ ? 1 : 0) + ((jcaVar == null || !j(jcaVar)) ? 0 : 1);
    }

    public final jca c(brh0 brh0Var) {
        if (brh0Var == null) {
            return null;
        }
        p641[] p641VarArr = brh0Var.c;
        int i = this.b;
        if (p641VarArr[i] == null) {
            return null;
        }
        jca jcaVar = this.a;
        if (jcaVar.o() == p641VarArr[i]) {
            return jcaVar;
        }
        jca jcaVar2 = this.c;
        if (jcaVar2 == null || jcaVar2.o() != p641VarArr[i]) {
            return null;
        }
        return jcaVar2;
    }

    public final boolean d(brh0 brh0Var, jca jcaVar) {
        if (jcaVar == null) {
            return true;
        }
        p641[] p641VarArr = brh0Var.c;
        int i = this.b;
        p641 p641Var = p641VarArr[i];
        if (jcaVar.o() == null) {
            return true;
        }
        if (jcaVar.o() == p641Var) {
            if (p641Var == null || jcaVar.q()) {
                return true;
            }
            brh0 brh0VarE = brh0Var.e();
            if (brh0Var.g.f && brh0VarE != null && brh0VarE.e && ((jcaVar instanceof mce1) || (jcaVar instanceof rlj0) || jcaVar.j() >= brh0VarE.g())) {
                return true;
            }
        }
        for (brh0 brh0VarE2 = brh0Var.e(); brh0VarE2 != null; brh0VarE2 = brh0VarE2.e()) {
            if (Objects.equals(brh0VarE2.c[i], jcaVar.o())) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        jca jcaVar = this.a;
        boolean zT = j(jcaVar) ? jcaVar.t() : true;
        jca jcaVar2 = this.c;
        return (jcaVar2 == null || !j(jcaVar2)) ? zT : jcaVar2.t() & zT;
    }

    public final boolean f() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public final boolean g(brh0 brh0Var) {
        int i = this.d;
        return ((i == 2 || i == 4) && c(brh0Var) == this.a) || (this.d == 3 && c(brh0Var) == this.c);
    }

    public final boolean h(brh0 brh0Var) {
        return c(brh0Var) != null;
    }

    public final boolean i() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return j(this.a);
        }
        jca jcaVar = this.c;
        jcaVar.getClass();
        return jcaVar.k() != 0;
    }

    public final void k(boolean z) {
        if (z) {
            if (this.e) {
                this.a.K();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            jca jcaVar = this.c;
            jcaVar.getClass();
            jcaVar.K();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int l(jca jcaVar, brh0 brh0Var, o0g1 o0g1Var, j7s j7sVar) {
        jca jcaVar2;
        int i;
        p641[] p641VarArr = brh0Var.c;
        if (jcaVar == null || jcaVar.k() == 0 || (jcaVar == (jcaVar2 = this.a) && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (jcaVar == this.c && this.d == 3) {
            return 1;
        }
        p641 p641VarO = jcaVar.o();
        int i2 = this.b;
        Object[] objArr = p641VarO != p641VarArr[i2];
        boolean zO = o0g1Var.o(i2);
        if (!zO || objArr != false) {
            if (!jcaVar.s()) {
                qp00 qp00Var = ((qp00[]) o0g1Var.d)[i2];
                int length = qp00Var != null ? qp00Var.length() : 0;
                ie30[] ie30VarArr = new ie30[length];
                for (int i3 = 0; i3 < length; i3++) {
                    qp00Var.getClass();
                    ie30VarArr[i3] = qp00Var.e(i3);
                }
                p641 p641Var = p641VarArr[i2];
                p641Var.getClass();
                jcaVar.J(ie30VarArr, p641Var, brh0Var.g(), brh0Var.f(), brh0Var.g.a);
                return 3;
            }
            if (!jcaVar.t()) {
                return 0;
            }
            a(jcaVar, j7sVar);
            if (!zO || f()) {
                k(jcaVar == jcaVar2);
                return 1;
            }
        }
        return 1;
    }

    public final void m() {
        if (!j(this.a)) {
            k(true);
        }
        jca jcaVar = this.c;
        if (jcaVar == null || j(jcaVar)) {
            return;
        }
        k(false);
    }

    public final void o() {
        jca jcaVar = this.a;
        if (jcaVar.k() == 1 && this.d != 4) {
            jcaVar.P();
            return;
        }
        jca jcaVar2 = this.c;
        if (jcaVar2 == null || jcaVar2.k() != 1 || this.d == 3) {
            return;
        }
        jcaVar2.P();
    }
}
