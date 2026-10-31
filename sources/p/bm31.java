package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bm31 {
    public final String a;
    public final List b;
    public final Map c;

    public bm31(String str, List list, Map map) {
        this.a = str;
        this.b = list;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm31)) {
            return false;
        }
        bm31 bm31Var = (bm31) obj;
        return u890.j(this.a, bm31Var.a) && u890.j(this.b, bm31Var.b) && u890.j(this.c, bm31Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
