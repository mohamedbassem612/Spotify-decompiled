package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xtt0 {
    public final Map a;
    public final Map b;

    public xtt0(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtt0)) {
            return false;
        }
        xtt0 xtt0Var = (xtt0) obj;
        return u890.j(this.a, xtt0Var.a) && u890.j(this.b, xtt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
