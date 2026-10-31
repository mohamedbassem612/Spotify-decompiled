package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xeb1 {
    public final String a;
    public final List b;
    public final String c;

    public xeb1(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeb1)) {
            return false;
        }
        xeb1 xeb1Var = (xeb1) obj;
        return u890.j(this.a, xeb1Var.a) && this.b.equals(xeb1Var.b) && this.c.equals(xeb1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
