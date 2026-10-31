package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v5y0 {
    public final String a;
    public final h4d0 b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public v5y0(String str, h4d0 h4d0Var, List list, boolean z, boolean z2) {
        this.a = str;
        this.b = h4d0Var;
        this.c = list;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5y0)) {
            return false;
        }
        v5y0 v5y0Var = (v5y0) obj;
        return u890.j(this.a, v5y0Var.a) && this.b == v5y0Var.b && this.c.equals(v5y0Var.c) && this.d == v5y0Var.d && this.e == v5y0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }
}
