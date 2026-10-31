package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lt60 extends jto1 {
    public final wb0 b;

    public lt60(wb0 wb0Var) {
        this.b = wb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lt60) && u890.j(this.b, ((lt60) obj).b);
    }

    public final int hashCode() {
        wb0 wb0Var = this.b;
        if (wb0Var == null) {
            return 0;
        }
        return wb0Var.hashCode();
    }
}
