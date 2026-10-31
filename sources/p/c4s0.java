package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c4s0 {
    public final e4s0 a;
    public final List b;

    public c4s0(e4s0 e4s0Var, List list) {
        this.a = e4s0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4s0)) {
            return false;
        }
        c4s0 c4s0Var = (c4s0) obj;
        return u890.j(this.a, c4s0Var.a) && u890.j(this.b, c4s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ c4s0(e4s0 e4s0Var) {
        this(e4s0Var, z6x.a);
    }
}
