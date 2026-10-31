package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fj50 {
    public final List a;
    public final ki50 b;

    public fj50(List list, ki50 ki50Var) {
        this.a = list;
        this.b = ki50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj50)) {
            return false;
        }
        fj50 fj50Var = (fj50) obj;
        return this.a.equals(fj50Var.a) && this.b.equals(fj50Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }
}
