package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qx10 {
    public final UUID a;
    public final iy10 b;

    public qx10(UUID uuid, iy10 iy10Var) {
        this.a = uuid;
        this.b = iy10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx10)) {
            return false;
        }
        qx10 qx10Var = (qx10) obj;
        return u890.j(this.a, qx10Var.a) && u890.j(this.b, qx10Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        iy10 iy10Var = this.b;
        return iHashCode + (iy10Var == null ? 0 : iy10Var.hashCode());
    }
}
