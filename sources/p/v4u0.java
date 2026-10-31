package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v4u0 {
    public final u4u0 a;
    public final xzc0 b;
    public final Set c;
    public final w4u0 d;
    public final src0 e;

    public v4u0(u4u0 u4u0Var, xzc0 xzc0Var, Set set, w4u0 w4u0Var, src0 src0Var) {
        this.a = u4u0Var;
        this.b = xzc0Var;
        this.c = set;
        this.d = w4u0Var;
        this.e = src0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4u0)) {
            return false;
        }
        v4u0 v4u0Var = (v4u0) obj;
        return u890.j(this.a, v4u0Var.a) && this.b == v4u0Var.b && u890.j(this.c, v4u0Var.c) && u890.j(this.d, v4u0Var.d) && u890.j(this.e, v4u0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + gvg.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }
}
