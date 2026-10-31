package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hc91 implements jc91 {
    public final List a;
    public final List b;
    public final tr80 c;

    public hc91(List list, List list2, tr80 tr80Var) {
        this.a = list;
        this.b = list2;
        this.c = tr80Var;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc91)) {
            return false;
        }
        hc91 hc91Var = (hc91) obj;
        return u890.j(this.a, hc91Var.a) && this.b.equals(hc91Var.b) && u890.j(this.c, hc91Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
