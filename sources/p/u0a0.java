package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u0a0 {
    public final Map a;
    public final Map b;

    public u0a0(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0a0)) {
            return false;
        }
        u0a0 u0a0Var = (u0a0) obj;
        return this.a.equals(u0a0Var.a) && this.b.equals(u0a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
