package p;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lp61 {
    public final jp61 a;
    public final lax b;
    public final Object c;
    public final Object d;
    public final Map e;
    public final igb1 f;
    public final idd1 g;
    public final idd1 h;

    public lp61(jp61 jp61Var, lax laxVar, Object obj, Object obj2, Map map) {
        this.a = jp61Var;
        this.b = laxVar;
        this.c = obj;
        this.d = obj2;
        this.e = map;
        this.f = jp61Var.c;
        this.g = new idd1(new kp61(this, (byte) 0));
        this.h = new idd1(new kp61(this, (byte) 1));
    }

    public final String a(x340 x340Var) {
        jgb1 jgb1Var = this.a.b;
        String strU = zmo1.u(jgb1Var.e, (String) null, x340Var);
        if (strU != null) {
            x340Var.i0(915953653);
            x340Var.r(false);
            return strU;
        }
        x340Var.i0(915954893);
        String strU2 = zmo1.u(jgb1Var.c, jgb1Var.d, x340Var);
        x340Var.r(false);
        return strU2;
    }

    public final String b(b0k b0kVar) {
        jgb1 jgb1Var = this.a.b;
        return zmo1.u(jgb1Var.c, jgb1Var.d, b0kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp61)) {
            return false;
        }
        lp61 lp61Var = (lp61) obj;
        return u890.j(this.a, lp61Var.a) && u890.j(this.b, lp61Var.b) && u890.j(this.c, lp61Var.c) && u890.j(this.d, lp61Var.d) && u890.j(this.e, lp61Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Object obj = this.c;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.d;
        return this.e.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }

    public lp61(jp61 jp61Var, lax laxVar, Serializable serializable, Map map, int i) {
        this(jp61Var, (i & 2) != 0 ? new gax(2131961690, (String) null) : laxVar, (i & 4) != 0 ? null : serializable, (Object) null, (i & 16) != 0 ? b7x.a : map);
    }
}
