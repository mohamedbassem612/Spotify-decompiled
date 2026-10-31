package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g5r0 {
    public final List a;
    public final gd80 b;
    public final List c;
    public final gd80 d;
    public final List e;
    public final String f;
    public final List g;
    public final List h;
    public final List i;

    public g5r0(List list, gd80 gd80Var, List list2, gd80 gd80Var2, List list3, String str, List list4, List list5, List list6) {
        this.a = list;
        this.b = gd80Var;
        this.c = list2;
        this.d = gd80Var2;
        this.e = list3;
        this.f = str;
        this.g = list4;
        this.h = list5;
        this.i = list6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5r0)) {
            return false;
        }
        g5r0 g5r0Var = (g5r0) obj;
        return u890.j(this.a, g5r0Var.a) && u890.j(this.b, g5r0Var.b) && u890.j(this.c, g5r0Var.c) && u890.j(this.d, g5r0Var.d) && u890.j(this.e, g5r0Var.e) && u890.j(this.f, g5r0Var.f) && u890.j(this.g, g5r0Var.g) && u890.j(this.h, g5r0Var.h) && u890.j(this.i, g5r0Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gd80 gd80Var = this.b;
        int iB = f4i1.b((iHashCode + (gd80Var == null ? 0 : gd80Var.hashCode())) * 31, 31, this.c);
        gd80 gd80Var2 = this.d;
        return this.i.hashCode() + f4i1.b(f4i1.b(cy30.d(f4i1.b((iB + (gd80Var2 != null ? gd80Var2.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
