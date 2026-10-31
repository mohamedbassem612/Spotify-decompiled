package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hg6 {
    public final wj31 a;
    public final List b;

    public hg6(wj31 wj31Var, List list) {
        this.a = wj31Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg6)) {
            return false;
        }
        hg6 hg6Var = (hg6) obj;
        return u890.j(this.a, hg6Var.a) && u890.j(this.b, hg6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
