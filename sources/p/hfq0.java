package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hfq0 {
    public final boolean a;
    public final List b;
    public final kfq0 c;

    public hfq0(boolean z, List list, kfq0 kfq0Var) {
        this.a = z;
        this.b = list;
        this.c = kfq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfq0)) {
            return false;
        }
        hfq0 hfq0Var = (hfq0) obj;
        return this.a == hfq0Var.a && u890.j(this.b, hfq0Var.b) && u890.j(this.c, hfq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
