package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h9c1 extends i9c1 {
    public final String a;
    public final cnt b;
    public final bnt c;
    public final String d;
    public final Map e;
    public final dqi1 f;
    public final o371 g;

    public /* synthetic */ h9c1(String str, cnt cntVar, bnt bntVar, String str2, Map map, dqi1 dqi1Var, o371 o371Var, int i) {
        this(str, cntVar, (i & 4) != 0 ? null : bntVar, (i & 8) != 0 ? null : str2, map, (i & 32) != 0 ? null : dqi1Var, (i & 64) != 0 ? new o371(null, false, false, 7) : o371Var);
    }

    public static h9c1 i(h9c1 h9c1Var, bnt bntVar, Map map, o371 o371Var, int i) {
        String str = h9c1Var.a;
        cnt cntVar = h9c1Var.b;
        if ((i & 4) != 0) {
            bntVar = h9c1Var.c;
        }
        bnt bntVar2 = bntVar;
        String str2 = h9c1Var.d;
        if ((i & 16) != 0) {
            map = h9c1Var.e;
        }
        Map map2 = map;
        dqi1 dqi1Var = h9c1Var.f;
        if ((i & 64) != 0) {
            o371Var = h9c1Var.g;
        }
        return new h9c1(str, cntVar, bntVar2, str2, map2, dqi1Var, o371Var);
    }

    @Override // p.p371
    public final String b() {
        return this.d;
    }

    @Override // p.i9c1, p.p371
    public final o371 c() {
        return this.g;
    }

    @Override // p.p371
    public final String d() {
        return this.a;
    }

    @Override // p.p371
    public final Map e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9c1)) {
            return false;
        }
        h9c1 h9c1Var = (h9c1) obj;
        return u890.j(this.a, h9c1Var.a) && u890.j(this.b, h9c1Var.b) && u890.j(this.c, h9c1Var.c) && u890.j(this.d, h9c1Var.d) && u890.j(this.e, h9c1Var.e) && u890.j(this.f, h9c1Var.f) && u890.j(this.g, h9c1Var.g);
    }

    @Override // p.p371
    public final dqi1 f() {
        return this.f;
    }

    @Override // p.i9c1
    public final t0c g() {
        return this.b;
    }

    @Override // p.i9c1
    public final bnt h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        bnt bntVar = this.c;
        int iHashCode2 = (iHashCode + (bntVar == null ? 0 : bntVar.e.hashCode())) * 31;
        String str = this.d;
        int iE = cy30.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        dqi1 dqi1Var = this.f;
        return this.g.hashCode() + ((iE + (dqi1Var != null ? dqi1Var.hashCode() : 0)) * 31);
    }

    public h9c1(String str, cnt cntVar, bnt bntVar, String str2, Map map, dqi1 dqi1Var, o371 o371Var) {
        this.a = str;
        this.b = cntVar;
        this.c = bntVar;
        this.d = str2;
        this.e = map;
        this.f = dqi1Var;
        this.g = o371Var;
    }
}
