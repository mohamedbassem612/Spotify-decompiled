package p;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lyn0 {
    public final UUID a;
    public final bzn0 b;
    public final Map c;

    public lyn0(UUID uuid, bzn0 bzn0Var, Map map) {
        this.a = uuid;
        this.b = bzn0Var;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyn0)) {
            return false;
        }
        lyn0 lyn0Var = (lyn0) obj;
        return this.a.equals(lyn0Var.a) && this.b.equals(lyn0Var.b) && u890.j(this.c, lyn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
