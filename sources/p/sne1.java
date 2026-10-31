package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sne1 {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final Long e;
    public final Map f;
    public final Map g;

    public sne1(String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Long l, Map map, Map map2) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = l;
        this.f = map;
        this.g = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sne1)) {
            return false;
        }
        sne1 sne1Var = (sne1) obj;
        return this.a.equals(sne1Var.a) && this.b.equals(sne1Var.b) && this.c.equals(sne1Var.c) && this.d.equals(sne1Var.d) && u890.j(this.e, sne1Var.e) && this.f.equals(sne1Var.f) && this.g.equals(sne1Var.g);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.d, p3d1.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
        Long l = this.e;
        return this.g.hashCode() + cy30.e((iF + (l == null ? 0 : l.hashCode())) * 31, 31, this.f);
    }
}
