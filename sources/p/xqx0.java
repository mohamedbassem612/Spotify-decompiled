package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xqx0 extends frx0 {
    public final String a;
    public final String b;
    public final String c;
    public final Set d;
    public final Set e;

    public xqx0(String str, String str2, String str3, Set set, Set set2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = set;
        this.e = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqx0)) {
            return false;
        }
        xqx0 xqx0Var = (xqx0) obj;
        return u890.j(this.a, xqx0Var.a) && u890.j(this.b, xqx0Var.b) && u890.j(this.c, xqx0Var.c) && u890.j(this.d, xqx0Var.d) && u890.j(this.e, xqx0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gvg.c(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
