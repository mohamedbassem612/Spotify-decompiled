package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bsi0 {
    public final String a;
    public final Map b;

    public bsi0(String str, Map map) {
        this.a = str;
        this.b = ila0.G(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsi0)) {
            return false;
        }
        bsi0 bsi0Var = (bsi0) obj;
        return u890.j(this.a, bsi0Var.a) && u890.j(this.b, bsi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ')';
    }
}
