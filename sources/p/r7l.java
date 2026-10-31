package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r7l extends u7l {
    public final hry0 a;

    public r7l(hry0 hry0Var) {
        this.a = hry0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7l) && this.a.equals(((r7l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
