package p;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ypj0 {
    public final UUID a;
    public final Set b;
    public final iu30 c;

    public ypj0(UUID uuid, Set set, iu30 iu30Var) {
        this.a = uuid;
        this.b = set;
        this.c = iu30Var;
    }

    public final iu30 a() {
        return this.c;
    }

    public final Set b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypj0)) {
            return false;
        }
        ypj0 ypj0Var = (ypj0) obj;
        return this.a.equals(ypj0Var.a) && this.b.equals(ypj0Var.b) && this.c.equals(ypj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gvg.c(this.a.hashCode() * 31, 31, this.b);
    }
}
