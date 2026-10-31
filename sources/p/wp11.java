package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wp11 {
    public final Map a;
    public final Map b;

    public wp11(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final Map a() {
        return this.a;
    }

    public final Map b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp11)) {
            return false;
        }
        wp11 wp11Var = (wp11) obj;
        return u890.j(this.a, wp11Var.a) && u890.j(this.b, wp11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ wp11() {
        b7x b7xVar = b7x.a;
        this(b7xVar, b7xVar);
    }
}
