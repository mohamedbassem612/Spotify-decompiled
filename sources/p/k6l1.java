package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k6l1 {
    public final String a;
    public final ArrayList b;
    public final hvl1 c;

    public k6l1(String str, ArrayList arrayList, hvl1 hvl1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = hvl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6l1)) {
            return false;
        }
        k6l1 k6l1Var = (k6l1) obj;
        return u890.j(this.a, k6l1Var.a) && this.b.equals(k6l1Var.b) && this.c.equals(k6l1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
