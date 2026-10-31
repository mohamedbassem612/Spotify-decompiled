package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t7l extends u7l {
    public final hry0 a;

    public t7l(hry0 hry0Var) {
        this.a = hry0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7l) && this.a.equals(((t7l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
