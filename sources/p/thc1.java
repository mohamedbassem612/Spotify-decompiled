package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class thc1 implements vhc1 {
    public final int a;
    public final x4i1 b;
    public final int c;
    public final String d;
    public final String e;
    public final pc41 f;
    public final vhc1 g;
    public final boolean h;
    public final List i;
    public final Map j;

    public thc1(int i, x4i1 x4i1Var, int i2, String str, String str2, pc41 pc41Var, thc1 thc1Var, boolean z, List list, Map map) {
        this.a = i;
        this.b = x4i1Var;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = pc41Var;
        this.g = thc1Var;
        this.h = z;
        this.i = list;
        this.j = map;
    }

    @Override // p.vhc1
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thc1)) {
            return false;
        }
        thc1 thc1Var = (thc1) obj;
        return this.a == thc1Var.a && u890.j(this.b, thc1Var.b) && this.c == thc1Var.c && u890.j(this.d, thc1Var.d) && u890.j(this.e, thc1Var.e) && u890.j(this.f, thc1Var.f) && u890.j(this.g, thc1Var.g) && this.h == thc1Var.h && u890.j(this.i, thc1Var.i) && u890.j(this.j, thc1Var.j);
    }

    @Override // p.vhc1
    public final String getUri() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        x4i1 x4i1Var = this.b;
        int iD = cy30.d(cy30.d(kaa0.f(this.c, (iHashCode + (x4i1Var == null ? 0 : x4i1Var.hashCode())) * 31, 31), 31, this.d), 31, this.e);
        pc41 pc41Var = this.f;
        int iHashCode2 = (iD + (pc41Var == null ? 0 : pc41Var.hashCode())) * 31;
        vhc1 vhc1Var = this.g;
        return this.j.hashCode() + f4i1.b(xcg1.g((iHashCode2 + (vhc1Var != null ? vhc1Var.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }
}
