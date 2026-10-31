package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b181 {
    public final ioj0 a;
    public final Map b;
    public final Set c;

    public b181(ioj0 ioj0Var, Map map, Set set) {
        this.a = ioj0Var;
        this.b = map;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b181)) {
            return false;
        }
        b181 b181Var = (b181) obj;
        return u890.j(this.a, b181Var.a) && u890.j(this.b, b181Var.b) && u890.j(this.c, b181Var.c);
    }

    public final int hashCode() {
        ioj0 ioj0Var = this.a;
        int iHashCode = (ioj0Var == null ? 0 : ioj0Var.a.hashCode()) * 31;
        Map map = this.b;
        return this.c.hashCode() + ((iHashCode + (map != null ? map.hashCode() : 0)) * 31);
    }
}
