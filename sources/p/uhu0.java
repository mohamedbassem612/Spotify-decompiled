package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uhu0 {
    public static final uhu0 c = new uhu0(b7x.a, null);
    public final Map a;
    public final xkk1 b;

    public uhu0(Map map, xkk1 xkk1Var) {
        this.a = map;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhu0)) {
            return false;
        }
        uhu0 uhu0Var = (uhu0) obj;
        return this.a.equals(uhu0Var.a) && u890.j(this.b, uhu0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
