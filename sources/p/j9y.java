package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j9y implements s9y {
    public final chf0 a;

    public j9y(chf0 chf0Var) {
        this.a = chf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9y) && this.a == ((j9y) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
