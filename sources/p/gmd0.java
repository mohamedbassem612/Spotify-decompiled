package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gmd0 {
    public final tb81 a;
    public final Map b;

    public gmd0(tb81 tb81Var, Map map) {
        this.a = tb81Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmd0)) {
            return false;
        }
        gmd0 gmd0Var = (gmd0) obj;
        return this.a.equals(gmd0Var.a) && this.b.equals(gmd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
