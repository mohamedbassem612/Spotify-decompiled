package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q8v0 {
    public final c481 a;
    public final boolean b;
    public final n131 c;
    public final Map d;

    public q8v0(c481 c481Var, boolean z, n131 n131Var, Map map) {
        this.a = c481Var;
        this.b = z;
        this.c = n131Var;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8v0)) {
            return false;
        }
        q8v0 q8v0Var = (q8v0) obj;
        return this.a.equals(q8v0Var.a) && this.b == q8v0Var.b && this.c.equals(q8v0Var.c) && u890.j(this.d, q8v0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31;
        Map map = this.d;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
