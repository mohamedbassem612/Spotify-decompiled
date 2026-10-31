package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tck0 {
    public final Map a;
    public final uao0 b;

    public tck0(Map map, uao0 uao0Var) {
        this.a = map;
        this.b = uao0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tck0)) {
            return false;
        }
        tck0 tck0Var = (tck0) obj;
        return this.a.equals(tck0Var.a) && this.b == tck0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
