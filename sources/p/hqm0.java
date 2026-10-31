package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hqm0 {
    public final List a;
    public final ArrayList b;
    public final int c;

    public hqm0(List list, ArrayList arrayList, int i) {
        this.a = list;
        this.b = arrayList;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqm0)) {
            return false;
        }
        hqm0 hqm0Var = (hqm0) obj;
        return u890.j(this.a, hqm0Var.a) && this.b.equals(hqm0Var.b) && this.c == hqm0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
