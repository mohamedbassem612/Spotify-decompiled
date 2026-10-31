package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u23 implements d33 {
    public final xvi0 a;

    public u23(xvi0 xvi0Var) {
        this.a = xvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u23) && this.a.equals(((u23) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
