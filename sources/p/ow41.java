package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ow41 {
    public final int a;
    public final List b;
    public final xb51 c;
    public final boolean d;

    public ow41(int i, List list, xb51 xb51Var, boolean z) {
        this.a = i;
        this.b = list;
        this.c = xb51Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow41)) {
            return false;
        }
        ow41 ow41Var = (ow41) obj;
        return this.a == ow41Var.a && u890.j(this.b, ow41Var.b) && u890.j(this.c, ow41Var.c) && this.d == ow41Var.d;
    }

    public final int hashCode() {
        int iB = f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b);
        xb51 xb51Var = this.c;
        return Boolean.hashCode(this.d) + ((iB + (xb51Var == null ? 0 : Integer.hashCode(xb51Var.a))) * 31);
    }
}
