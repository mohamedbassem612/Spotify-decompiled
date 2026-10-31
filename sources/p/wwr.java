package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wwr {
    public final f7l1 a;

    public wwr(f7l1 f7l1Var) {
        this.a = f7l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wwr) && u890.j(this.a, ((wwr) obj).a);
    }

    public final int hashCode() {
        f7l1 f7l1Var = this.a;
        if (f7l1Var == null) {
            return 0;
        }
        return f7l1Var.a.hashCode();
    }
}
