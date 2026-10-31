package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xdx0 {
    public final byte a;
    public final List b;
    public final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public xdx0(String str, List list, int i) {
        this.a = i;
        this.b = list;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdx0)) {
            return false;
        }
        xdx0 xdx0Var = (xdx0) obj;
        return this.a == xdx0Var.a && u890.j(this.b, xdx0Var.b) && u890.j(this.c, xdx0Var.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
