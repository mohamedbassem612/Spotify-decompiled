package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ll8 extends nl8 {
    public final Map a;
    public final String b;

    public ll8(String str, Map map) {
        this.a = map;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll8)) {
            return false;
        }
        ll8 ll8Var = (ll8) obj;
        return u890.j(this.a, ll8Var.a) && u890.j(this.b, ll8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
