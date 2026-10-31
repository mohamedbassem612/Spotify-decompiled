package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lsv implements usv {
    public final String a;
    public final List b;
    public final ArrayList c;
    public final wd21 d;

    public lsv(String str, List list, ArrayList arrayList, wd21 wd21Var) {
        this.a = str;
        this.b = list;
        this.c = arrayList;
        this.d = wd21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsv)) {
            return false;
        }
        lsv lsvVar = (lsv) obj;
        return this.a.equals(lsvVar.a) && u890.j(this.b, lsvVar.b) && this.c.equals(lsvVar.c) && u890.j(this.d, lsvVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
