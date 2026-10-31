package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qfh implements sfh {
    public final bce0 a;

    public qfh(bce0 bce0Var) {
        this.a = bce0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfh) && this.a.equals(((qfh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
