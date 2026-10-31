package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gwp0 {
    public final List a;
    public final boolean b;
    public final Map c;
    public final Map d;

    public gwp0(List list, boolean z, Map map, Map map2) {
        this.a = list;
        this.b = z;
        this.c = map;
        this.d = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwp0)) {
            return false;
        }
        gwp0 gwp0Var = (gwp0) obj;
        return this.a.equals(gwp0Var.a) && this.b == gwp0Var.b && u890.j(this.c, gwp0Var.c) && u890.j(this.d, gwp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.e(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
