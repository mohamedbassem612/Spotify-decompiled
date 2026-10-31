package p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g6b1 {
    public final String a;
    public final Map b;

    public g6b1(String str, HashMap map) {
        this.a = str;
        this.b = map;
    }

    public final boolean a(g6b1 g6b1Var) {
        return this.a.equals(g6b1Var.a) && this.b == g6b1Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6b1)) {
            return false;
        }
        g6b1 g6b1Var = (g6b1) obj;
        return this.a.equals(g6b1Var.a) && this.b.equals(g6b1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
