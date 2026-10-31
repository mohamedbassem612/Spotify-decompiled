package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yao extends cbo {
    public final fhu0 a;

    public yao(fhu0 fhu0Var) {
        this.a = fhu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yao) && this.a.equals(((yao) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
