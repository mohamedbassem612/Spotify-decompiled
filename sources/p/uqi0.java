package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uqi0 {
    public final List a;
    public final qxc0 b;

    public uqi0(List list, qxc0 qxc0Var) {
        this.a = list;
        this.b = qxc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqi0)) {
            return false;
        }
        uqi0 uqi0Var = (uqi0) obj;
        return this.a.equals(uqi0Var.a) && this.b.equals(uqi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
