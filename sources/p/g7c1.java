package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g7c1 extends h7c1 {
    public final b8c1 a;

    public g7c1(b8c1 b8c1Var) {
        this.a = b8c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7c1) && this.a.equals(((g7c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
