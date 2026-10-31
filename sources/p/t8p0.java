package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t8p0 implements ez00 {
    public final int a;
    public final List b;

    public t8p0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8p0)) {
            return false;
        }
        t8p0 t8p0Var = (t8p0) obj;
        return this.a == t8p0Var.a && u890.j(this.b, t8p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }

    public /* synthetic */ t8p0() {
        this(1, z6x.a);
    }
}
