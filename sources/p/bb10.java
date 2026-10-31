package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bb10 {
    public final String a;
    public final List b;
    public final int c;
    public final int d;

    public bb10(String str, int i, int i2, List list) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb10)) {
            return false;
        }
        bb10 bb10Var = (bb10) obj;
        return u890.j(this.a, bb10Var.a) && this.b.equals(bb10Var.b) && this.c == bb10Var.c && this.d == bb10Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
