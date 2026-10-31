package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t5s {
    public final int a;
    public final Set b;
    public final mml c;
    public final as3 d;
    public final List e;
    public final List f;
    public final List g;

    public t5s(int i, Set set, mml mmlVar, as3 as3Var, List list, List list2, List list3) {
        this.a = i;
        this.b = set;
        this.c = mmlVar;
        this.d = as3Var;
        this.e = list;
        this.f = list2;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5s)) {
            return false;
        }
        t5s t5sVar = (t5s) obj;
        return this.a == t5sVar.a && u890.j(this.b, t5sVar.b) && u890.j(this.c, t5sVar.c) && this.d == t5sVar.d && u890.j(this.e, t5sVar.e) && u890.j(this.f, t5sVar.f) && this.g.equals(t5sVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + f4i1.b(f4i1.b((this.d.hashCode() + ((this.c.hashCode() + gvg.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f);
    }
}
