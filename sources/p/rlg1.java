package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rlg1 extends ylg1 {
    public final tv80 a;

    public rlg1(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlg1) && u890.j(this.a, ((rlg1) obj).a);
    }

    public final int hashCode() {
        tv80 tv80Var = this.a;
        if (tv80Var == null) {
            return 0;
        }
        return tv80Var.hashCode();
    }
}
