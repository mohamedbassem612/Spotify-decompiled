package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c4g0 {
    public final jx11 a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    public c4g0(jx11 jx11Var, String str, List list, String str2, String str3) {
        this.a = jx11Var;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4g0)) {
            return false;
        }
        c4g0 c4g0Var = (c4g0) obj;
        return this.a == c4g0Var.a && u890.j(this.b, c4g0Var.b) && u890.j(this.c, c4g0Var.c) && u890.j(this.d, c4g0Var.d) && this.e.equals(c4g0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
