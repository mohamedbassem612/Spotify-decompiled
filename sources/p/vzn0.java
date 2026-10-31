package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vzn0 {
    public final cv21 a;

    public vzn0(cv21 cv21Var) {
        this.a = cv21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzn0) && this.a.equals(((vzn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
