package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gcz0 {
    public final List a;
    public final List b;
    public final Map c;

    public gcz0(List list, List list2, Map map) {
        this.a = list;
        this.b = list2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcz0)) {
            return false;
        }
        gcz0 gcz0Var = (gcz0) obj;
        return u890.j(this.a, gcz0Var.a) && u890.j(this.b, gcz0Var.b) && u890.j(this.c, gcz0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
