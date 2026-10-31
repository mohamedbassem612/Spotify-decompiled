package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p9f1 {
    public final gsc1 a;
    public final List b;

    public p9f1(gsc1 gsc1Var, List list) {
        this.a = gsc1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p9f1) {
            p9f1 p9f1Var = (p9f1) obj;
            if (this.a == p9f1Var.a && u890.j(this.b, p9f1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
