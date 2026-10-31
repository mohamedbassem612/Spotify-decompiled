package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m3k {
    public final wj31 a;
    public final List b;

    public m3k(wj31 wj31Var, List list) {
        this.a = wj31Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3k)) {
            return false;
        }
        m3k m3kVar = (m3k) obj;
        return u890.j(this.a, m3kVar.a) && u890.j(this.b, m3kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
