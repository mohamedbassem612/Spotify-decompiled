package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kwq0 {
    public final UUID a;
    public final Object b;

    public kwq0(UUID uuid, Object obj) {
        this.a = uuid;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwq0)) {
            return false;
        }
        kwq0 kwq0Var = (kwq0) obj;
        return u890.j(this.a, kwq0Var.a) && u890.j(this.b, kwq0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
