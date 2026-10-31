package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sck0 {
    public final rck0 a;
    public final Map b;
    public final uao0 c;

    public sck0(rck0 rck0Var, Map map, uao0 uao0Var) {
        this.a = rck0Var;
        this.b = map;
        this.c = uao0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sck0)) {
            return false;
        }
        sck0 sck0Var = (sck0) obj;
        return this.a.equals(sck0Var.a) && u890.j(this.b, sck0Var.b) && this.c == sck0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return this.c.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }
}
