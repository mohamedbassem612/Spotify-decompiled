package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hps0 extends z8 implements bqs0 {
    public dps0 a;
    public jma b = new jma((byte) 17);
    public jug1 c;
    public Object d;
    public int e;
    public int f;

    public hps0(dps0 dps0Var) {
        this.a = dps0Var;
        this.c = dps0Var.b;
        this.f = dps0Var.c();
    }

    public final int c() {
        return this.f;
    }

    public final void clear() {
        this.c = jug1.e;
        k(0);
    }

    public final boolean containsKey(Object obj) {
        return this.c.d(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final dps0 build() {
        jug1 jug1Var = this.c;
        dps0 dps0Var = this.a;
        if (jug1Var != dps0Var.b) {
            this.b = new jma((byte) 17);
            dps0Var = new dps0(this.c, c());
        }
        this.a = dps0Var;
        return dps0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f == map.size()) {
                if (map instanceof dps0) {
                    return this.c.g(((dps0) obj).b, cps0.d);
                }
                if (map instanceof hps0) {
                    return this.c.g(((hps0) obj).c, cps0.e);
                }
                if (map instanceof dqs0) {
                    return this.c.g(((dqs0) obj).d.b, cps0.f);
                }
                if (map instanceof eqs0) {
                    return this.c.g(((eqs0) obj).d.c, cps0.g);
                }
                if (c() != map.size()) {
                    hhg1.n("Failed requirement.");
                    return false;
                }
                if (map.isEmpty()) {
                    return true;
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (!ltn1.w(this, (Map.Entry) it.next())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.e;
    }

    public final jug1 g() {
        return this.c;
    }

    public final Object get(Object obj) {
        return this.c.h(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    public final jma h() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        return entrySet().hashCode();
    }

    public final void i(int i) {
        this.e = i;
    }

    public final void j(Object obj) {
        this.d = obj;
    }

    public final void k(int i) {
        this.f = i;
        this.e++;
    }

    public final Object put(Object obj, Object obj2) {
        this.d = null;
        this.c = this.c.m(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(Map map) {
        dps0 dps0VarBuild = null;
        dps0 dps0Var = map instanceof dps0 ? (dps0) map : null;
        if (dps0Var == null) {
            hps0 hps0Var = map instanceof hps0 ? (hps0) map : null;
            if (hps0Var != null) {
                dps0VarBuild = hps0Var.build();
            }
        } else {
            dps0VarBuild = dps0Var;
        }
        if (dps0VarBuild == null) {
            super/*java.util.AbstractMap*/.putAll(map);
            return;
        }
        w9t w9tVar = new w9t();
        w9tVar.a = 0;
        int iC = c();
        this.c = this.c.n(dps0VarBuild.b, 0, w9tVar, this);
        int iC2 = (dps0VarBuild.c() + iC) - w9tVar.a;
        if (iC != iC2) {
            k(iC2);
        }
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c();
        jug1 jug1VarP = this.c.p(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        if (jug1VarP == null) {
            jug1VarP = jug1.e;
        }
        this.c = jug1VarP;
        return iC != c();
    }

    public final Object remove(Object obj) {
        this.d = null;
        jug1 jug1VarO = this.c.o(obj == null ? 0 : obj.hashCode(), obj, 0, this);
        if (jug1VarO == null) {
            jug1VarO = jug1.e;
        }
        this.c = jug1VarO;
        return this.d;
    }
}
