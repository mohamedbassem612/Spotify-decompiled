package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g811 {
    public final h7v a;
    public final List b;

    public g811(h7v h7vVar, List list) {
        this.a = h7vVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g811)) {
            return false;
        }
        g811 g811Var = (g811) obj;
        return u890.j(this.a, g811Var.a) && u890.j(this.b, g811Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ g811(h7v h7vVar) {
        this(h7vVar, z6x.a);
    }
}
