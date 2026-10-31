package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i7a1 {
    public final vb81 a;
    public final Map b;

    public i7a1(vb81 vb81Var, Map map) {
        this.a = vb81Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7a1)) {
            return false;
        }
        i7a1 i7a1Var = (i7a1) obj;
        return this.a.equals(i7a1Var.a) && this.b.equals(i7a1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
