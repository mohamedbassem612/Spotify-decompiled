package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kkk0 {
    public final jkk0 a;
    public final Map b;
    public final uao0 c;

    public kkk0(jkk0 jkk0Var, Map map, uao0 uao0Var) {
        this.a = jkk0Var;
        this.b = map;
        this.c = uao0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkk0)) {
            return false;
        }
        kkk0 kkk0Var = (kkk0) obj;
        return this.a.equals(kkk0Var.a) && u890.j(this.b, kkk0Var.b) && this.c == kkk0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return this.c.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }
}
