package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h9f1 {
    public final w9f1 a;
    public final List b;

    public h9f1(w9f1 w9f1Var, List list) {
        this.a = w9f1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h9f1) {
            h9f1 h9f1Var = (h9f1) obj;
            if (this.a == h9f1Var.a && u890.j(this.b, h9f1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
