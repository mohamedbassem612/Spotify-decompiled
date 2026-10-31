package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t7b extends v7b {
    public final i7g0 a;

    public t7b(i7g0 i7g0Var) {
        this.a = i7g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7b) && this.a == ((t7b) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
