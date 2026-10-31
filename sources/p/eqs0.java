package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eqs0 extends z8 implements bqs0 {
    public dqs0 a;
    public Object b;
    public Object c;
    public final hps0 d;

    public eqs0(dqs0 dqs0Var) {
        this.a = dqs0Var;
        this.b = dqs0Var.b;
        this.c = dqs0Var.c;
        dps0 dps0Var = dqs0Var.d;
        dps0Var.getClass();
        this.d = new hps0(dps0Var);
    }

    public final Set a() {
        return new lps0(this, (byte) 1);
    }

    public final Set b() {
        return new ops0(this, (byte) 1);
    }

    public final cqs0 build() {
        dps0 dps0VarBuild = this.d.build();
        dqs0 dqs0Var = this.a;
        if (dps0VarBuild != dqs0Var.d) {
            dqs0Var = new dqs0(this.b, this.c, dps0VarBuild);
        }
        this.a = dqs0Var;
        return dqs0Var;
    }

    public final int c() {
        return this.d.c();
    }

    public final void clear() {
        this.d.clear();
        wdu0 wdu0Var = wdu0.P0;
        this.b = wdu0Var;
        this.c = wdu0Var;
    }

    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    public final Collection d() {
        return new zkg0(this, (byte) 3);
    }

    public final hps0 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            hps0 hps0Var = this.d;
            Map map = (Map) obj;
            if (hps0Var.c() == map.size()) {
                if (map instanceof dqs0) {
                    return hps0Var.c.g(((dqs0) obj).d.b, cps0.Y);
                }
                if (map instanceof eqs0) {
                    return hps0Var.c.g(((eqs0) obj).d.c, cps0.Z);
                }
                if (map instanceof dps0) {
                    return hps0Var.c.g(((dps0) obj).b, cps0.N0);
                }
                if (map instanceof hps0) {
                    return hps0Var.c.g(((hps0) obj).c, cps0.O0);
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

    public final Object get(Object obj) {
        qlc0 qlc0Var = (qlc0) this.d.get(obj);
        if (qlc0Var == null) {
            return null;
        }
        return qlc0Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        return entrySet().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object put(Object obj, Object obj2) {
        hps0 hps0Var = this.d;
        qlc0 qlc0Var = (qlc0) hps0Var.get(obj);
        if (qlc0Var != null) {
            Object obj3 = qlc0Var.a;
            if (obj3 == obj2) {
                return obj2;
            }
            hps0Var.put(obj, qlc0Var.h(obj2));
            return obj3;
        }
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            hps0Var.put(obj, new qlc0(obj2));
            return null;
        }
        Object obj4 = this.c;
        Object obj5 = hps0Var.get(obj4);
        obj5.getClass();
        hps0Var.put(obj4, ((qlc0) obj5).f(obj));
        hps0Var.put(obj, new qlc0(obj2, obj4));
        this.c = obj;
        return null;
    }

    public final Object remove(Object obj) {
        hps0 hps0Var = this.d;
        qlc0 qlc0Var = (qlc0) hps0Var.remove(obj);
        if (qlc0Var == null) {
            return null;
        }
        Object obj2 = qlc0Var.c;
        Object obj3 = qlc0Var.b;
        if (qlc0Var.b()) {
            Object obj4 = hps0Var.get(obj3);
            obj4.getClass();
            hps0Var.put(obj3, ((qlc0) obj4).f(obj2));
        } else {
            this.b = obj2;
        }
        if (qlc0Var.a()) {
            Object obj5 = hps0Var.get(obj2);
            obj5.getClass();
            hps0Var.put(obj2, ((qlc0) obj5).g(obj3));
        } else {
            this.c = obj3;
        }
        return qlc0Var.a;
    }

    public final boolean remove(Object obj, Object obj2) {
        qlc0 qlc0Var = (qlc0) this.d.get(obj);
        if (qlc0Var == null || !u890.j(qlc0Var.a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
