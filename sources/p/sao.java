package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sao extends cbo {
    public final s63 a;

    public sao(s63 s63Var) {
        this.a = s63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sao) && this.a.equals(((sao) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
