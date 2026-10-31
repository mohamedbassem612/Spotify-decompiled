package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lzo0 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    public lzo0(Map map, Map map2, Map map3, Map map4) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzo0)) {
            return false;
        }
        lzo0 lzo0Var = (lzo0) obj;
        return u890.j(this.a, lzo0Var.a) && u890.j(this.b, lzo0Var.b) && u890.j(this.c, lzo0Var.c) && u890.j(this.d, lzo0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.e(cy30.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
