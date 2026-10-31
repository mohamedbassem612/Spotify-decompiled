package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u4u0 {
    public final Map a;
    public final Map b;

    public u4u0(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4u0)) {
            return false;
        }
        u4u0 u4u0Var = (u4u0) obj;
        return u890.j(this.a, u4u0Var.a) && u890.j(this.b, u4u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
