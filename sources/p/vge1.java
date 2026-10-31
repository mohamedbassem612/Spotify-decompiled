package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vge1 {
    public final List a;
    public final List b;
    public final List c;

    public vge1(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vge1)) {
            return false;
        }
        vge1 vge1Var = (vge1) obj;
        return this.a.equals(vge1Var.a) && this.b.equals(vge1Var.b) && this.c.equals(vge1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
