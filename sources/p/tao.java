package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tao extends cbo {
    public final ol6 a;

    public tao(ol6 ol6Var) {
        this.a = ol6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tao) && this.a.equals(((tao) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
