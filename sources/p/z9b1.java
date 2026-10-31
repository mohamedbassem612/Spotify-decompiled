package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z9b1 {
    public final UUID a;
    public final Object b;

    public z9b1(UUID uuid, Object obj) {
        this.a = uuid;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9b1)) {
            return false;
        }
        z9b1 z9b1Var = (z9b1) obj;
        return u890.j(this.a, z9b1Var.a) && u890.j(this.b, z9b1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
