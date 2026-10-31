package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q2b0 {
    public final String a;
    public final Map b;

    public q2b0(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2b0)) {
            return false;
        }
        q2b0 q2b0Var = (q2b0) obj;
        return u890.j(this.a, q2b0Var.a) && this.b.equals(q2b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "@" + this.a + '(' + o7h.y0(sqg0.S(this.b), (CharSequence) null, (String) null, (String) null, aht.Z0, 31) + ')';
    }
}
