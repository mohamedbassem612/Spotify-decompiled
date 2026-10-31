package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i6h extends n6h {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final ilw0 e;
    public final List f;
    public final ArrayList g;
    public final sxq0 h;
    public final cuu0 i;

    public i6h(String str, String str2, String str3, int i, ilw0 ilw0Var, List list, ArrayList arrayList, sxq0 sxq0Var, cuu0 cuu0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = ilw0Var;
        this.f = list;
        this.g = arrayList;
        this.h = sxq0Var;
        this.i = cuu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6h)) {
            return false;
        }
        i6h i6hVar = (i6h) obj;
        return u890.j(this.a, i6hVar.a) && u890.j(this.b, i6hVar.b) && u890.j(this.c, i6hVar.c) && this.d == i6hVar.d && this.e.equals(i6hVar.e) && this.f.equals(i6hVar.f) && this.g.equals(i6hVar.g) && this.h.equals(i6hVar.h) && u890.j(this.i, i6hVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + p3d1.f(this.g, kaa0.f(0, f4i1.b((this.e.hashCode() + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31, 31, this.f), 31), 31)) * 31;
        cuu0 cuu0Var = this.i;
        return iHashCode + (cuu0Var != null ? cuu0Var.hashCode() : 0);
    }
}
