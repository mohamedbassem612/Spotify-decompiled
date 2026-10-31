package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wh61 {
    public final mr20 a;

    public wh61(mr20 mr20Var) {
        this.a = mr20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh61) && u890.j(this.a, ((wh61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
