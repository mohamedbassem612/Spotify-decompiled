package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gw20 {
    public final Map a;
    public final List b;
    public final boolean c;

    public gw20(List list, Map map, boolean z) {
        this.a = map;
        this.b = list;
        this.c = z;
    }

    public static gw20 a(gw20 gw20Var, Map map, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            map = gw20Var.a;
        }
        if ((i & 2) != 0) {
            list = gw20Var.b;
        }
        if ((i & 4) != 0) {
            z = gw20Var.c;
        }
        gw20Var.getClass();
        return new gw20(list, map, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw20)) {
            return false;
        }
        gw20 gw20Var = (gw20) obj;
        return this.a.equals(gw20Var.a) && this.b.equals(gw20Var.b) && this.c == gw20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
