package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hq01 implements iq01 {
    public final m87 a;
    public final List b;

    public hq01(List list, m87 m87Var) {
        this.a = m87Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq01)) {
            return false;
        }
        hq01 hq01Var = (hq01) obj;
        return u890.j(this.a, hq01Var.a) && u890.j(this.b, hq01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
