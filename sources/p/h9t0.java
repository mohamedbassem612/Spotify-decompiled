package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h9t0 {
    public final ArrayList a;
    public final boolean b;
    public final boolean c;
    public final Integer d;

    public h9t0(ArrayList arrayList, boolean z, boolean z2, Integer num) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9t0)) {
            return false;
        }
        h9t0 h9t0Var = (h9t0) obj;
        return this.a.equals(h9t0Var.a) && this.b == h9t0Var.b && this.c == h9t0Var.c && u890.j(this.d, h9t0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return iG + (num == null ? 0 : num.hashCode());
    }
}
