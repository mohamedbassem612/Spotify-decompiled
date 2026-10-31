package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x0j0 implements a2j0 {
    public final String a;
    public final List b;
    public final boolean c;

    public x0j0(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0j0)) {
            return false;
        }
        x0j0 x0j0Var = (x0j0) obj;
        return u890.j(this.a, x0j0Var.a) && this.b.equals(x0j0Var.b) && this.c == x0j0Var.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
