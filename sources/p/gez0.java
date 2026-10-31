package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gez0 {
    public final bez0 a;

    public gez0(bez0 bez0Var) {
        this.a = bez0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gez0) && u890.j(this.a, ((gez0) obj).a);
    }

    public final int hashCode() {
        bez0 bez0Var = this.a;
        if (bez0Var == null) {
            return 0;
        }
        return bez0Var.hashCode();
    }
}
