package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kae1 {
    public final Map a;
    public final boolean b;

    public kae1(Map map, boolean z) {
        this.a = map;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kae1)) {
            return false;
        }
        kae1 kae1Var = (kae1) obj;
        return this.a.equals(kae1Var.a) && this.b == kae1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
