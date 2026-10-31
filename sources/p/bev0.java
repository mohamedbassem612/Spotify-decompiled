package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bev0 {
    public final List a;
    public final List b;
    public final int c;
    public final List d;
    public final iev0 e;

    public bev0(List list, List list2, int i, List list3, iev0 iev0Var) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = list3;
        this.e = iev0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bev0)) {
            return false;
        }
        bev0 bev0Var = (bev0) obj;
        return this.a.equals(bev0Var.a) && u890.j(this.b, bev0Var.b) && this.c == bev0Var.c && this.d.equals(bev0Var.d) && this.e.equals(bev0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f4i1.b(kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }
}
