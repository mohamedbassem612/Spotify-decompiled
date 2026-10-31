package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ym11 {
    public final ioj0 a;

    public ym11(ioj0 ioj0Var) {
        this.a = ioj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym11) && u890.j(this.a, ((ym11) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
