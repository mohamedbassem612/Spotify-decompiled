package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lj51 implements nj51 {
    public final zm81 a;
    public final ArrayList b;
    public final int c;

    public lj51(zm81 zm81Var, ArrayList arrayList, int i) {
        this.a = zm81Var;
        this.b = arrayList;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj51)) {
            return false;
        }
        lj51 lj51Var = (lj51) obj;
        return u890.j(this.a, lj51Var.a) && this.b.equals(lj51Var.b) && this.c == lj51Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
