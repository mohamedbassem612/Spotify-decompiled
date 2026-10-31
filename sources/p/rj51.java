package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rj51 {
    public final String a = "";
    public final List b = z6x.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj51)) {
            return false;
        }
        rj51 rj51Var = (rj51) obj;
        return this.a.equals(rj51Var.a) && this.b.equals(rj51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, false);
    }
}
