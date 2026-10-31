package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kzo0 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    public kzo0(List list, List list2, List list3, List list4) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzo0)) {
            return false;
        }
        kzo0 kzo0Var = (kzo0) obj;
        return this.a.equals(kzo0Var.a) && this.b.equals(kzo0Var.b) && this.c.equals(kzo0Var.c) && this.d.equals(kzo0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
