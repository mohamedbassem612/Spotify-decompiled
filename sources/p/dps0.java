package p;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dps0 extends m7 implements cqs0 {
    public static final dps0 d = new dps0(jug1.e, 0);
    public final jug1 b;
    public final int c;

    public dps0(jug1 jug1Var, int i) {
        this.b = jug1Var;
        this.c = i;
    }

    @Override // p.cqs0
    public final bqs0 builder() {
        return new hps0(this);
    }

    @Override // p.m7
    public final int c() {
        return this.c;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.b.d(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    @Override // p.m7
    public final Collection d() {
        return new xps0(this, (byte) 0);
    }

    @Override // p.m7, java.util.Map, p.cqs0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final dps0 put(Object obj, Object obj2) {
        svh0 svh0VarV = this.b.v(obj, obj == null ? 0 : obj.hashCode(), 0, obj2);
        if (svh0VarV == null) {
            return this;
        }
        return new dps0(svh0VarV.j(), svh0VarV.n() + this.c);
    }

    @Override // p.m7, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.c != map.size()) {
            return false;
        }
        boolean z = map instanceof dqs0;
        jug1 jug1Var = this.b;
        if (z) {
            return jug1Var.g(((dqs0) obj).d.b, w0q0.d1);
        }
        if (map instanceof eqs0) {
            return jug1Var.g(((eqs0) obj).e().g(), w0q0.e1);
        }
        if (map instanceof dps0) {
            return jug1Var.g(((dps0) obj).b, cps0.b);
        }
        return map instanceof hps0 ? jug1Var.g(((hps0) obj).g(), cps0.c) : super.equals(obj);
    }

    @Override // p.cqs0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final dps0 remove(String str) {
        int iHashCode = str.hashCode();
        jug1 jug1Var = this.b;
        jug1 jug1VarW = jug1Var.w(iHashCode, 0, str);
        if (jug1Var == jug1VarW) {
            return this;
        }
        if (jug1VarW != null) {
            return new dps0(jug1VarW, this.c - 1);
        }
        hso1.y();
        return d;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.b.h(obj == null ? 0 : obj.hashCode(), 0, obj);
    }
}
