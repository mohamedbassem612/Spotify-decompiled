package p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dqs0 extends m7 implements cqs0 {
    public static final dqs0 e;
    public final Object b;
    public final Object c;
    public final dps0 d;

    static {
        wdu0 wdu0Var = wdu0.P0;
        dps0 dps0Var = dps0.d;
        hso1.y();
        e = new dqs0(wdu0Var, wdu0Var, dps0.d);
    }

    public dqs0(Object obj, Object obj2, dps0 dps0Var) {
        this.b = obj;
        this.c = obj2;
        this.d = dps0Var;
    }

    @Override // p.m7
    public final Set a() {
        return new rps0(this, (byte) 2);
    }

    @Override // p.m7
    public final Set b() {
        return new iqs0(this);
    }

    @Override // p.cqs0
    public final bqs0 builder() {
        return new eqs0(this);
    }

    @Override // p.m7
    public final int c() {
        return this.d.c();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // p.m7
    public final Collection d() {
        return new xps0(this, (byte) 1);
    }

    @Override // p.m7, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        dps0 dps0Var = this.d;
        Map map = (Map) obj;
        if (dps0Var.c() != map.size()) {
            return false;
        }
        if (map instanceof dqs0) {
            return dps0Var.b.g(((dqs0) obj).d.b, cps0.h);
        }
        if (map instanceof eqs0) {
            return dps0Var.b.g(((eqs0) obj).e().g(), cps0.i);
        }
        if (map instanceof dps0) {
            return dps0Var.b.g(((dps0) obj).b, cps0.t);
        }
        return map instanceof hps0 ? dps0Var.b.g(((hps0) obj).g(), cps0.X) : super.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        qlc0 qlc0Var = (qlc0) this.d.get(obj);
        if (qlc0Var == null) {
            return null;
        }
        return qlc0Var.e();
    }

    @Override // p.m7, java.util.Map, p.cqs0
    public final cqs0 put(Object obj, Object obj2) {
        boolean zIsEmpty = isEmpty();
        dps0 dps0Var = this.d;
        if (zIsEmpty) {
            return new dqs0(obj, obj, dps0Var.put(obj, new qlc0(obj2)));
        }
        qlc0 qlc0Var = (qlc0) dps0Var.get(obj);
        Object obj3 = this.c;
        Object obj4 = this.b;
        if (qlc0Var != null) {
            return qlc0Var.e() == obj2 ? this : new dqs0(obj4, obj3, dps0Var.put(obj, qlc0Var.h(obj2)));
        }
        Object obj5 = dps0Var.get(obj3);
        obj5.getClass();
        return new dqs0(obj4, obj, dps0Var.put(obj3, ((qlc0) obj5).f(obj)).put(obj, new qlc0(obj2, obj3)));
    }

    @Override // p.cqs0
    public final cqs0 remove(String str) {
        dps0 dps0Var = this.d;
        qlc0 qlc0Var = (qlc0) dps0Var.get(str);
        if (qlc0Var == null) {
            return this;
        }
        dps0 dps0VarF = dps0Var.remove(str);
        if (qlc0Var.b()) {
            Object obj = dps0VarF.get(qlc0Var.d());
            obj.getClass();
            dps0VarF = dps0VarF.put(qlc0Var.d(), ((qlc0) obj).f(qlc0Var.c()));
        }
        if (qlc0Var.a()) {
            Object obj2 = dps0VarF.get(qlc0Var.c());
            obj2.getClass();
            dps0VarF = dps0VarF.put(qlc0Var.c(), ((qlc0) obj2).g(qlc0Var.d()));
        }
        return new dqs0(!qlc0Var.b() ? qlc0Var.c() : this.b, !qlc0Var.a() ? qlc0Var.d() : this.c, dps0VarF);
    }
}
