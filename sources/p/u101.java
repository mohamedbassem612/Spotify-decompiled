package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u101 implements z101 {
    public final q001 a;

    public u101(q001 q001Var) {
        this.a = q001Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u101) && this.a.equals(((u101) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
