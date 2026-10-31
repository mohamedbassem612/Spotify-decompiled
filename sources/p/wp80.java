package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wp80 extends jap1 {
    public final int c;
    public final int d;
    public final Map e;

    public wp80(int i, int i2, Map map) {
        this.c = i;
        this.d = i2;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp80)) {
            return false;
        }
        wp80 wp80Var = (wp80) obj;
        return this.c == wp80Var.c && this.d == wp80Var.d && u890.j(this.e, wp80Var.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, l1d.C(this.c) * 31, 31);
        Map map = this.e;
        return iK + (map == null ? 0 : map.hashCode());
    }

    public /* synthetic */ wp80(int i, int i2) {
        this(i, i2, null);
    }
}
