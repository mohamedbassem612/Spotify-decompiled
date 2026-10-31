package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iez0 {
    public final bez0 a;

    public iez0(bez0 bez0Var) {
        this.a = bez0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iez0) && u890.j(this.a, ((iez0) obj).a);
    }

    public final int hashCode() {
        bez0 bez0Var = this.a;
        if (bez0Var == null) {
            return 0;
        }
        return bez0Var.hashCode();
    }
}
