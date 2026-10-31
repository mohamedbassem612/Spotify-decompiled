package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e8e0 {
    public final List a;
    public final List b;

    public e8e0(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8e0)) {
            return false;
        }
        e8e0 e8e0Var = (e8e0) obj;
        return u890.j(this.a, e8e0Var.a) && u890.j(this.b, e8e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
