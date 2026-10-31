package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xt70 {
    public final List a;
    public final m87 b;

    public xt70(List list, m87 m87Var) {
        this.a = list;
        this.b = m87Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt70)) {
            return false;
        }
        xt70 xt70Var = (xt70) obj;
        return u890.j(this.a, xt70Var.a) && u890.j(this.b, xt70Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        m87 m87Var = this.b;
        return iHashCode + (m87Var == null ? 0 : m87Var.hashCode());
    }
}
