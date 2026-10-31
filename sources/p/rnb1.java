package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rnb1 {
    public final zdz0 a;
    public final List b;

    public rnb1(zdz0 zdz0Var, List list) {
        this.a = zdz0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnb1)) {
            return false;
        }
        rnb1 rnb1Var = (rnb1) obj;
        return u890.j(this.a, rnb1Var.a) && this.b.equals(rnb1Var.b);
    }

    public final int hashCode() {
        zdz0 zdz0Var = this.a;
        return this.b.hashCode() + ((zdz0Var == null ? 0 : zdz0Var.hashCode()) * 31);
    }
}
