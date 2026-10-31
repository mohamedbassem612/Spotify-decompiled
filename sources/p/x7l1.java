package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x7l1 {
    public final String a;
    public final List b;
    public final String c;

    public x7l1(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7l1)) {
            return false;
        }
        x7l1 x7l1Var = (x7l1) obj;
        return u890.j(this.a, x7l1Var.a) && this.b.equals(x7l1Var.b) && u890.j(this.c, x7l1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
