package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class we9 {
    public final qg9 a;
    public final Map b;
    public final Map c;

    public we9(qg9 qg9Var, Map map, Map map2) {
        this.a = qg9Var;
        this.b = map;
        this.c = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we9)) {
            return false;
        }
        we9 we9Var = (we9) obj;
        return u890.j(this.a, we9Var.a) && this.b.equals(we9Var.b) && this.c.equals(we9Var.c);
    }

    public final int hashCode() {
        qg9 qg9Var = this.a;
        return this.c.hashCode() + cy30.e((qg9Var == null ? 0 : qg9Var.hashCode()) * 31, 31, this.b);
    }
}
