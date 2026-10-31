package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zhf0 implements aif0 {
    public final LinkedHashMap a;
    public final dof1 b;
    public final a9h c;
    public final tv80 d;
    public final int e;
    public final c380 f;
    public final gy71 g;

    public zhf0(LinkedHashMap linkedHashMap, dof1 dof1Var, a9h a9hVar, tv80 tv80Var, int i, c380 c380Var, gy71 gy71Var) {
        this.a = linkedHashMap;
        this.b = dof1Var;
        this.c = a9hVar;
        this.d = tv80Var;
        this.e = i;
        this.f = c380Var;
        this.g = gy71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhf0)) {
            return false;
        }
        zhf0 zhf0Var = (zhf0) obj;
        return this.a.equals(zhf0Var.a) && u890.j(this.b, zhf0Var.b) && u890.j(this.c, zhf0Var.c) && u890.j(this.d, zhf0Var.d) && this.e == zhf0Var.e && u890.j(this.f, zhf0Var.f) && u890.j(this.g, zhf0Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        tv80 tv80Var = this.d;
        int iF = kk0.f(this.f, ab80.k(this.e, (iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31, 31), 31);
        gy71 gy71Var = this.g;
        return iF + (gy71Var != null ? gy71Var.hashCode() : 0);
    }
}
