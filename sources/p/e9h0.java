package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e9h0 {
    public final List a;
    public final Map b;

    public e9h0(List list, Map map) {
        this.a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9h0)) {
            return false;
        }
        e9h0 e9h0Var = (e9h0) obj;
        return u890.j(this.a, e9h0Var.a) && u890.j(this.b, e9h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
