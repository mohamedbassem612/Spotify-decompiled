package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ohw implements diw {
    public final f3b1 a;

    public ohw(f3b1 f3b1Var) {
        this.a = f3b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ohw) && this.a.equals(((ohw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
