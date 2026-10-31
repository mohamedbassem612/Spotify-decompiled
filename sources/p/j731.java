package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j731 implements m731 {
    public final Set a;
    public final Map b;

    public j731(Map map, Set set) {
        this.a = set;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j731)) {
            return false;
        }
        j731 j731Var = (j731) obj;
        return this.a.equals(j731Var.a) && u890.j(this.b, j731Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
