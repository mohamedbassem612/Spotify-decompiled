package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kyi1 {
    public final List a;
    public final int b;

    public kyi1(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyi1)) {
            return false;
        }
        kyi1 kyi1Var = (kyi1) obj;
        return u890.j(this.a, kyi1Var.a) && this.b == kyi1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
