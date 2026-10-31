package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o7a1 {
    public final p7a1 a;
    public final int b;
    public final List c;

    public o7a1(p7a1 p7a1Var, int i, List list) {
        this.a = p7a1Var;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7a1)) {
            return false;
        }
        o7a1 o7a1Var = (o7a1) obj;
        return u890.j(this.a, o7a1Var.a) && this.b == o7a1Var.b && u890.j(this.c, o7a1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
