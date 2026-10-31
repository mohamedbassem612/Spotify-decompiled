package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class are0 {
    public final xoe0 a;
    public final t3k1 b;
    public final Map c;

    public are0(xoe0 xoe0Var, t3k1 t3k1Var, Map map) {
        this.a = xoe0Var;
        this.b = t3k1Var;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof are0)) {
            return false;
        }
        are0 are0Var = (are0) obj;
        return this.a.equals(are0Var.a) && this.b.equals(are0Var.b) && this.c.equals(are0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
