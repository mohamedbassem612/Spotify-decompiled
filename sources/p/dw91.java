package p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dw91 implements ypb1, Map, sla0 {
    public cw91 a;
    public final qv91 b;
    public final qv91 c;
    public final qv91 d;

    public dw91() {
        hno1.m();
        eps0 eps0Var = eps0.d;
        jv91 jv91VarH = pv91.h();
        cw91 cw91Var = new cw91(jv91VarH.g(), eps0Var);
        if (!(jv91VarH instanceof rv40)) {
            cw91Var.b = new cw91(1L, eps0Var);
        }
        this.a = cw91Var;
        this.b = new qv91(this, (byte) 0);
        this.c = new qv91(this, (byte) 1);
        this.d = new qv91(this, (byte) 2);
    }

    public static boolean a(cw91 cw91Var, int i, eps0 eps0Var) {
        boolean z;
        synchronized (oho1.a) {
            if (cw91Var.e() == i) {
                cw91Var.f(eps0Var);
                z = true;
                cw91Var.g(cw91Var.e() + 1);
            } else {
                z = false;
            }
        }
        return z;
    }

    public final cw91 b() {
        return pv91.r(this.a, this);
    }

    @Override // java.util.Map
    public final void clear() {
        jv91 jv91VarN;
        cw91 cw91VarF = pv91.f(this.a);
        hno1.m();
        eps0 eps0Var = eps0.d;
        if (eps0Var != cw91VarF.d()) {
            cw91 cw91Var = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                cw91 cw91VarU = pv91.u(cw91Var, this, jv91VarN);
                synchronized (oho1.a) {
                    cw91VarU.f(eps0Var);
                    cw91VarU.g(cw91VarU.e() + 1);
                }
            }
            pv91.l(jv91VarN, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b().d().containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return b().d().containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return b().d().get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b().d().isEmpty();
    }

    @Override // p.ypb1
    public final cqb1 k() {
        return this.a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // p.ypb1
    public final void l(cqb1 cqb1Var) {
        this.a = (cw91) cqb1Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        eps0 eps0VarD;
        int iE;
        Object objPut;
        jv91 jv91VarN;
        boolean zA;
        do {
            synchronized (oho1.a) {
                cw91 cw91VarF = pv91.f(this.a);
                eps0VarD = cw91VarF.d();
                iE = cw91VarF.e();
            }
            eps0VarD.getClass();
            ips0 ips0VarF = eps0VarD.f();
            objPut = ips0VarF.put(obj, obj2);
            eps0 eps0VarF = ips0VarF.f();
            if (u890.j(eps0VarF, eps0VarD)) {
                break;
            }
            cw91 cw91Var = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                zA = a(pv91.u(cw91Var, this, jv91VarN), iE, eps0VarF);
            }
            pv91.l(jv91VarN, this);
        } while (!zA);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        eps0 eps0VarD;
        int iE;
        jv91 jv91VarN;
        boolean zA;
        do {
            synchronized (oho1.a) {
                cw91 cw91VarF = pv91.f(this.a);
                eps0VarD = cw91VarF.d();
                iE = cw91VarF.e();
            }
            eps0VarD.getClass();
            ips0 ips0VarF = eps0VarD.f();
            ips0VarF.putAll(map);
            eps0 eps0VarF = ips0VarF.f();
            if (u890.j(eps0VarF, eps0VarD)) {
                return;
            }
            cw91 cw91Var = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                zA = a(pv91.u(cw91Var, this, jv91VarN), iE, eps0VarF);
            }
            pv91.l(jv91VarN, this);
        } while (!zA);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        eps0 eps0VarD;
        int iE;
        Object objRemove;
        jv91 jv91VarN;
        boolean zA;
        do {
            synchronized (oho1.a) {
                cw91 cw91VarF = pv91.f(this.a);
                eps0VarD = cw91VarF.d();
                iE = cw91VarF.e();
            }
            eps0VarD.getClass();
            ips0 ips0VarF = eps0VarD.f();
            objRemove = ips0VarF.remove(obj);
            eps0 eps0VarF = ips0VarF.f();
            if (u890.j(eps0VarF, eps0VarD)) {
                break;
            }
            cw91 cw91Var = this.a;
            synchronized (pv91.c) {
                jv91VarN = ekb.n();
                zA = a(pv91.u(cw91Var, this, jv91VarN), iE, eps0VarF);
            }
            pv91.l(jv91VarN, this);
        } while (!zA);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return b().d().c();
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + pv91.f(this.a).d() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
