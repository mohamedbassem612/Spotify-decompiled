package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y0a0 {
    public final String a;
    public final Map b;

    public y0a0(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0a0)) {
            return false;
        }
        y0a0 y0a0Var = (y0a0) obj;
        return dsa0.n(this.a, y0a0Var.a) && u890.j(this.b, y0a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (dsa0.p(this.a) * 31);
    }
}
