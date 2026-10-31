package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rnc0 {
    public final int a;
    public final List b;

    public rnc0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnc0)) {
            return false;
        }
        rnc0 rnc0Var = (rnc0) obj;
        return this.a == rnc0Var.a && u890.j(this.b, rnc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public /* synthetic */ rnc0() {
        this(-1, z6x.a);
    }
}
