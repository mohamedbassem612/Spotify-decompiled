package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vc51 extends hd51 {
    public final tv80 b;

    public vc51(tv80 tv80Var) {
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vc51) && u890.j(this.b, ((vc51) obj).b);
    }

    public final int hashCode() {
        tv80 tv80Var = this.b;
        if (tv80Var == null) {
            return 0;
        }
        return tv80Var.hashCode();
    }
}
