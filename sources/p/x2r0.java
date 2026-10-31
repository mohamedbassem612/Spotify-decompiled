package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x2r0 {
    public final int a;
    public final List b;

    public x2r0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2r0)) {
            return false;
        }
        x2r0 x2r0Var = (x2r0) obj;
        return this.a == x2r0Var.a && u890.j(this.b, x2r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
