package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ad0 {
    public final yv31 a;
    public final List b;
    public final zc0 c;

    public ad0(yv31 yv31Var, List list, zc0 zc0Var) {
        this.a = yv31Var;
        this.b = list;
        this.c = zc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad0)) {
            return false;
        }
        ad0 ad0Var = (ad0) obj;
        return u890.j(this.a, ad0Var.a) && u890.j(this.b, ad0Var.b) && this.c.equals(ad0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
