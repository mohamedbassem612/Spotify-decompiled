package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lk80 {
    public final int a;
    public final int b;
    public final Map c;

    public /* synthetic */ lk80(int i, int i2, Map map, int i3) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? b7x.a : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk80)) {
            return false;
        }
        lk80 lk80Var = (lk80) obj;
        return this.a == lk80Var.a && this.b == lk80Var.b && u890.j(this.c, lk80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.a + ", complexViewId=" + this.b + ", children=" + this.c + ')';
    }

    public lk80(int i, int i2, Map map) {
        this.a = i;
        this.b = i2;
        this.c = map;
    }
}
