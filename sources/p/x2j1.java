package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x2j1 {
    public final String a;
    public final String b;
    public final List c;

    public x2j1(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2j1)) {
            return false;
        }
        x2j1 x2j1Var = (x2j1) obj;
        return u890.j(this.a, x2j1Var.a) && u890.j(this.b, x2j1Var.b) && u890.j(this.c, x2j1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
