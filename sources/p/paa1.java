package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class paa1 {
    public final Long a;
    public final List b;

    public paa1(Long l, List list) {
        this.a = l;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paa1)) {
            return false;
        }
        paa1 paa1Var = (paa1) obj;
        return u890.j(this.a, paa1Var.a) && u890.j(this.b, paa1Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }
}
