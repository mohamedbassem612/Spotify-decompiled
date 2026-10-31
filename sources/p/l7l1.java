package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l7l1 {
    public final bbl1 a;

    public l7l1(bbl1 bbl1Var) {
        this.a = bbl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7l1) && u890.j(this.a, ((l7l1) obj).a);
    }

    public final int hashCode() {
        bbl1 bbl1Var = this.a;
        if (bbl1Var == null) {
            return 0;
        }
        return bbl1Var.hashCode();
    }
}
