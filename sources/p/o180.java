package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o180 {
    public final List a;
    public final ax70 b;

    public o180(List list, ax70 ax70Var) {
        this.a = list;
        this.b = ax70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o180)) {
            return false;
        }
        o180 o180Var = (o180) obj;
        return u890.j(this.a, o180Var.a) && u890.j(this.b, o180Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ax70 ax70Var = this.b;
        return iHashCode + (ax70Var == null ? 0 : ax70Var.hashCode());
    }
}
