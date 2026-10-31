package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nn51 {
    public final List a;
    public final List b;
    public final ArrayList c;

    public nn51(List list, List list2, ArrayList arrayList) {
        this.a = list;
        this.b = list2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn51)) {
            return false;
        }
        nn51 nn51Var = (nn51) obj;
        return u890.j(this.a, nn51Var.a) && u890.j(this.b, nn51Var.b) && this.c.equals(nn51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
