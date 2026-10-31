package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oy implements d9j1 {
    public final taj1 a;

    public oy(taj1 taj1Var) {
        this.a = taj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy) && this.a.equals(((oy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
