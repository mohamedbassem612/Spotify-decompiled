package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vkc0 extends p371 {
    public final String a;
    public final String b;
    public final Map c;
    public final dqi1 d;
    public final o371 e;

    public /* synthetic */ vkc0(String str, String str2, Map map, dqi1 dqi1Var, o371 o371Var, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? b7x.a : map, (i & 8) != 0 ? null : dqi1Var, (i & 16) != 0 ? new o371(null, false, false, 7) : o371Var);
    }

    public static vkc0 g(vkc0 vkc0Var, Map map, o371 o371Var, int i) {
        String str = vkc0Var.a;
        String str2 = vkc0Var.b;
        if ((i & 4) != 0) {
            map = vkc0Var.c;
        }
        Map map2 = map;
        dqi1 dqi1Var = vkc0Var.d;
        if ((i & 16) != 0) {
            o371Var = vkc0Var.e;
        }
        return new vkc0(str, str2, map2, dqi1Var, o371Var);
    }

    @Override // p.p371
    public final String b() {
        return this.b;
    }

    @Override // p.p371
    public final o371 c() {
        return this.e;
    }

    @Override // p.p371
    public final String d() {
        return this.a;
    }

    @Override // p.p371
    public final Map e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkc0)) {
            return false;
        }
        vkc0 vkc0Var = (vkc0) obj;
        return u890.j(this.a, vkc0Var.a) && u890.j(this.b, vkc0Var.b) && u890.j(this.c, vkc0Var.c) && u890.j(this.d, vkc0Var.d) && u890.j(this.e, vkc0Var.e);
    }

    @Override // p.p371
    public final dqi1 f() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iE = cy30.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        dqi1 dqi1Var = this.d;
        return this.e.hashCode() + ((iE + (dqi1Var != null ? dqi1Var.hashCode() : 0)) * 31);
    }

    public vkc0(String str, String str2, Map map, dqi1 dqi1Var, o371 o371Var) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = dqi1Var;
        this.e = o371Var;
    }
}
