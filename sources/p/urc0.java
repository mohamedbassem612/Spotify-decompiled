package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class urc0 {
    public final List a;
    public final List b;

    public urc0(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urc0)) {
            return false;
        }
        urc0 urc0Var = (urc0) obj;
        return this.a.equals(urc0Var.a) && this.b.equals(urc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
