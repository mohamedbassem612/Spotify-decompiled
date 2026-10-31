package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ru70 {
    public final List a;
    public final Set b;

    public ru70(List list, Set set) {
        this.a = list;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru70)) {
            return false;
        }
        ru70 ru70Var = (ru70) obj;
        return this.a.equals(ru70Var.a) && u890.j(this.b, ru70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
