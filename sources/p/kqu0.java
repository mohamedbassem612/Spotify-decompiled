package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kqu0 {
    public final Set a;
    public final cho b;

    public kqu0(Set set, cho choVar) {
        this.a = set;
        this.b = choVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqu0)) {
            return false;
        }
        kqu0 kqu0Var = (kqu0) obj;
        return u890.j(this.a, kqu0Var.a) && this.b == kqu0Var.b;
    }

    public final int hashCode() {
        Set set = this.a;
        return this.b.hashCode() + ((set == null ? 0 : set.hashCode()) * 31);
    }
}
