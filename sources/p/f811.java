package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f811 {
    public final nue1 a;
    public final List b;

    public f811(nue1 nue1Var, List list) {
        this.a = nue1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f811)) {
            return false;
        }
        f811 f811Var = (f811) obj;
        return u890.j(this.a, f811Var.a) && u890.j(this.b, f811Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ f811(nue1 nue1Var) {
        this(nue1Var, z6x.a);
    }
}
