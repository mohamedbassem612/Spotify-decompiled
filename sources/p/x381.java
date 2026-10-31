package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661(with = xz50.class)
public final class x381 {
    public static final w381 Companion = new w381();
    public final Map a;
    public final List b;

    public x381(List list, Map map) {
        this.a = map;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x381)) {
            return false;
        }
        x381 x381Var = (x381) obj;
        return u890.j(this.a, x381Var.a) && u890.j(this.b, x381Var.b);
    }

    public final int hashCode() {
        Map map = this.a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
