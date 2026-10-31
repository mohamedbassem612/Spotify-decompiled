package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hjf0 implements ijf0 {
    public final Set a;
    public final boolean b;

    public hjf0(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjf0)) {
            return false;
        }
        hjf0 hjf0Var = (hjf0) obj;
        return u890.j(this.a, hjf0Var.a) && this.b == hjf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
