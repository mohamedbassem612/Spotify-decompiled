package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k5g1 implements m5g1 {
    public final o5g1 a;

    public k5g1(o5g1 o5g1Var) {
        this.a = o5g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5g1) && this.a.equals(((k5g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
