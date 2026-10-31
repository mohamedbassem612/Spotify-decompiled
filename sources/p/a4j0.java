package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a4j0 {
    public final List a;
    public final List b;
    public final List c;

    public a4j0(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4j0)) {
            return false;
        }
        a4j0 a4j0Var = (a4j0) obj;
        return u890.j(this.a, a4j0Var.a) && u890.j(this.b, a4j0Var.b) && u890.j(this.c, a4j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
