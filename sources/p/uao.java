package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uao extends cbo {
    public final x78 a;

    public uao(x78 x78Var) {
        this.a = x78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uao) && this.a.equals(((uao) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
