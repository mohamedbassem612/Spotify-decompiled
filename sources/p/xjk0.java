package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xjk0 implements ikk0 {
    public final fkc1 a;

    public xjk0(fkc1 fkc1Var) {
        this.a = fkc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xjk0) && this.a == ((xjk0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
