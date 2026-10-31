package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e1r {
    public final jh5 a;
    public final int b;
    public final ppa0 c;
    public final zjd1 d;
    public final iu30 e;
    public final int f;
    public final d1r g;

    public e1r(jh5 jh5Var, int i, ppa0 ppa0Var, zjd1 zjd1Var, iu30 iu30Var) {
        this.a = jh5Var;
        this.b = i;
        this.c = ppa0Var;
        this.d = zjd1Var;
        this.e = iu30Var;
        this.f = ((ab80.k(i, jh5Var.c * 31, 31) + (ppa0Var != null ? ppa0Var.hashCode() : 0)) * 31) + (zjd1Var != null ? zjd1Var.hashCode() : 0);
        this.g = (ppa0Var == null || zjd1Var == null) ? new d1r(jh5Var) : null;
    }

    public final void a(Map map, iu30 iu30Var) {
        zjd1 zjd1Var;
        k3r j3rVar;
        ppa0 ppa0Var = this.c;
        if (ppa0Var == null || (zjd1Var = this.d) == null) {
            return;
        }
        jh5 jh5Var = this.a;
        if (jh5Var.a()) {
            return;
        }
        Object objInvoke = jh5Var.b;
        if (!ppa0Var.a().isEmpty()) {
            int size = ppa0Var.a().size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    j3rVar = new j3r(objInvoke);
                    break;
                }
                jh5 jh5Var2 = new jh5(((opa0) ppa0Var.a().get(i)).b(), objInvoke);
                if (i > 0) {
                    iu30Var.invoke(jh5Var2);
                }
                k3r k3rVar = (k3r) map.get(jh5Var2);
                if (!(k3rVar instanceof j3r)) {
                    if (!(k3rVar instanceof h3r)) {
                        j3rVar = null;
                        break;
                    } else {
                        j3rVar = k3rVar;
                        break;
                    }
                }
                objInvoke = ((opa0) ppa0Var.a().get(i)).a().invoke(((j3r) k3rVar).a);
                if (objInvoke == null) {
                    j3rVar = new h3r(c3r.a);
                    break;
                }
                i++;
            }
        } else {
            j3rVar = new j3r(objInvoke);
        }
        if (j3rVar instanceof j3r) {
            iu30Var.invoke(new jh5(zjd1Var, ((j3r) j3rVar).a));
        }
    }

    public final g3p1 b(Map map) {
        d1r d1rVar = this.g;
        if (d1rVar != null) {
            return d1rVar;
        }
        k3r j3rVar = null;
        ppa0 ppa0Var = this.c;
        if (ppa0Var == null) {
            eg.m("Required value was null.");
            return null;
        }
        zjd1 zjd1Var = this.d;
        if (zjd1Var == null) {
            eg.m("Required value was null.");
            return null;
        }
        jh5 jh5Var = this.a;
        if (jh5Var.a()) {
            return new d1r(new jh5(zjd1Var, fkj0.R0));
        }
        Object objInvoke = jh5Var.b;
        if (!ppa0Var.a().isEmpty()) {
            int size = ppa0Var.a().size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    j3rVar = new j3r(objInvoke);
                    break;
                }
                k3r k3rVar = (k3r) map.get(new jh5(((opa0) ppa0Var.a().get(i)).b(), objInvoke));
                if (!(k3rVar instanceof j3r)) {
                    if (!(k3rVar instanceof h3r)) {
                        break;
                    }
                    j3rVar = k3rVar;
                    break;
                }
                objInvoke = ((opa0) ppa0Var.a().get(i)).a().invoke(((j3r) k3rVar).a);
                if (objInvoke == null) {
                    j3rVar = new h3r(c3r.a);
                    break;
                }
                i++;
            }
        } else {
            j3rVar = new j3r(objInvoke);
        }
        if (j3rVar instanceof j3r) {
            return new d1r(new jh5(zjd1Var, ((j3r) j3rVar).a));
        }
        return j3rVar instanceof h3r ? new b1r(jh5Var, ((h3r) j3rVar).a) : c1r.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e1r.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e1r e1rVar = (e1r) obj;
        return this.f == e1rVar.f && u890.j(this.a, e1rVar.a) && this.b == e1rVar.b && u890.j(this.c, e1rVar.c) && u890.j(this.d, e1rVar.d);
    }

    public final int hashCode() {
        return this.f;
    }

    public /* synthetic */ e1r(jh5 jh5Var, int i, iu30 iu30Var) {
        this(jh5Var, i, null, null, iu30Var);
    }
}
