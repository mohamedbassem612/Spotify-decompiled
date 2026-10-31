package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w450 implements l700 {
    public final Map a;
    public final Map b;

    public w450(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w450)) {
            return false;
        }
        w450 w450Var = (w450) obj;
        return u890.j(this.a, w450Var.a) && u890.j(this.b, w450Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
