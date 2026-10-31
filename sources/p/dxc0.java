package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dxc0 implements ez00 {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final aen e;
    public final String f;
    public final String g;
    public final String h;
    public final Map i;
    public final x7i1 j;
    public final Long k;

    public dxc0(String str, long j, long j2, String str2, aen aenVar, String str3, String str4, String str5, Map map, x7i1 x7i1Var, Long l) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = aenVar;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = map;
        this.j = x7i1Var;
        this.k = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxc0)) {
            return false;
        }
        dxc0 dxc0Var = (dxc0) obj;
        return this.a.equals(dxc0Var.a) && this.b == dxc0Var.b && this.c == dxc0Var.c && this.d.equals(dxc0Var.d) && this.e.equals(dxc0Var.e) && this.f.equals(dxc0Var.f) && u890.j(this.g, dxc0Var.g) && this.h.equals(dxc0Var.h) && this.i.equals(dxc0Var.i) && this.j.equals(dxc0Var.j) && u890.j(this.k, dxc0Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d((this.e.hashCode() + cy30.d(cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d)) * 31, 31, this.f);
        String str = this.g;
        int iHashCode = (this.j.hashCode() + cy30.e(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i)) * 31;
        Long l = this.k;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
