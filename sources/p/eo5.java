package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eo5 {
    public final List a;
    public final do5 b;

    public eo5(List list, do5 do5Var) {
        this.a = list;
        this.b = do5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo5)) {
            return false;
        }
        eo5 eo5Var = (eo5) obj;
        return this.a.equals(eo5Var.a) && u890.j(this.b, eo5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
