package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yhg0 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final int e;
    public final Long f;
    public final Long g;

    public yhg0(List list, List list2, List list3, List list4, int i, Long l, Long l2) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = i;
        this.f = l;
        this.g = l2;
    }

    public final List a() {
        return this.d;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhg0)) {
            return false;
        }
        yhg0 yhg0Var = (yhg0) obj;
        return u890.j(this.a, yhg0Var.a) && this.b.equals(yhg0Var.b) && this.c.equals(yhg0Var.c) && u890.j(this.d, yhg0Var.d) && this.e == yhg0Var.e && u890.j(this.f, yhg0Var.f) && u890.j(this.g, yhg0Var.g);
    }

    public final int hashCode() {
        int iB = f4i1.b(f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        int i = this.e;
        int iC = (iB + (i == 0 ? 0 : l1d.C(i))) * 31;
        Long l = this.f;
        int iHashCode = (iC + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
