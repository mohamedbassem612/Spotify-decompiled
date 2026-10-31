package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vn6 {
    public final String a;
    public final k6r0 b;
    public final List c;
    public final String d;

    public vn6(String str, k6r0 k6r0Var, ArrayList arrayList, String str2, int i) {
        k6r0Var = (i & 2) != 0 ? null : k6r0Var;
        arrayList = (i & 4) != 0 ? z6x.a : arrayList;
        this.a = str;
        this.b = k6r0Var;
        this.c = arrayList;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn6)) {
            return false;
        }
        vn6 vn6Var = (vn6) obj;
        return this.a.equals(vn6Var.a) && u890.j(this.b, vn6Var.b) && this.c.equals(vn6Var.c) && this.d.equals(vn6Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        k6r0 k6r0Var = this.b;
        return Boolean.hashCode(false) + xcg1.g(cy30.d(f4i1.b((iHashCode + (k6r0Var == null ? 0 : k6r0Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, false);
    }
}
