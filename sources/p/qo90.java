package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qo90 {
    public final String a;
    public final Set b;
    public final String c;
    public final List d;
    public final lp90 e;
    public final List f;
    public final boolean g;
    public final mo90 h;
    public final mo90 i;

    public qo90(String str, Set set, String str2, List list, lp90 lp90Var, List list2, boolean z, mo90 mo90Var) {
        this.a = str;
        this.b = set;
        this.c = str2;
        this.d = list;
        this.e = lp90Var;
        this.f = list2;
        this.g = z;
        this.h = mo90Var;
        this.i = mo90Var;
    }

    public final Set a() {
        return this.b;
    }

    public final List b() {
        return this.d;
    }

    public final lp90 c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo90)) {
            return false;
        }
        qo90 qo90Var = (qo90) obj;
        return u890.j(this.a, qo90Var.a) && this.b.equals(qo90Var.b) && u890.j(this.c, qo90Var.c) && this.d.equals(qo90Var.d) && this.e.equals(qo90Var.e) && this.f.equals(qo90Var.f) && this.g == qo90Var.g && this.h.equals(qo90Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(f4i1.b((this.e.hashCode() + f4i1.b(cy30.d(gvg.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
    }
}
