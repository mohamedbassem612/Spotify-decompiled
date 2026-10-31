package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x7m1 {
    public final boolean a;
    public final List b;

    public x7m1(List list, boolean z) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7m1)) {
            return false;
        }
        x7m1 x7m1Var = (x7m1) obj;
        return this.a == x7m1Var.a && u890.j(this.b, x7m1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
