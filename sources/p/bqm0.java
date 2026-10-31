package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bqm0 {
    public final ArrayList a;
    public final ArrayList b;
    public final List c;

    public bqm0(ArrayList arrayList, ArrayList arrayList2, List list) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqm0)) {
            return false;
        }
        bqm0 bqm0Var = (bqm0) obj;
        return this.a.equals(bqm0Var.a) && this.b.equals(bqm0Var.b) && u890.j(this.c, bqm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
