package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ae21 {
    public final List a;
    public final Set b;

    public ae21(List list, Set set) {
        this.a = list;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae21)) {
            return false;
        }
        ae21 ae21Var = (ae21) obj;
        return this.a.equals(ae21Var.a) && this.b.equals(ae21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
