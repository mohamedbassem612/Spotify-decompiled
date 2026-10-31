package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wg3 {
    public final cxc0 a;
    public final Map b;

    public wg3(cxc0 cxc0Var, Map map) {
        this.a = cxc0Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg3)) {
            return false;
        }
        wg3 wg3Var = (wg3) obj;
        return u890.j(this.a, wg3Var.a) && u890.j(this.b, wg3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
