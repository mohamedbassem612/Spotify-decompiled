package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wo50 implements yo50 {
    public final mr20 a;

    public wo50(mr20 mr20Var) {
        this.a = mr20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wo50) && this.a.equals(((wo50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
