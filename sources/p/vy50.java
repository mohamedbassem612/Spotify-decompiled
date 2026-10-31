package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vy50 {
    public final List a;
    public final g3f1 b;

    public vy50(List list, g3f1 g3f1Var) {
        this.a = list;
        this.b = g3f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy50)) {
            return false;
        }
        vy50 vy50Var = (vy50) obj;
        return u890.j(this.a, vy50Var.a) && u890.j(this.b, vy50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
