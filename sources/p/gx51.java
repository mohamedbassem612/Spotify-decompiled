package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gx51 {
    public static final gx51 d = new gx51(null, z6x.a, false);
    public final Map a;
    public final List b;
    public final boolean c;

    public gx51(LinkedHashMap linkedHashMap, List list, boolean z) {
        this.a = linkedHashMap;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx51)) {
            return false;
        }
        gx51 gx51Var = (gx51) obj;
        return u890.j(this.a, gx51Var.a) && u890.j(this.b, gx51Var.b) && this.c == gx51Var.c;
    }

    public final int hashCode() {
        Map map = this.a;
        return Boolean.hashCode(this.c) + f4i1.b((map == null ? 0 : map.hashCode()) * 31, 31, this.b);
    }
}
