package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r9y implements s9y {
    public final l1f1 a;

    public r9y(l1f1 l1f1Var) {
        this.a = l1f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9y) && this.a == ((r9y) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
