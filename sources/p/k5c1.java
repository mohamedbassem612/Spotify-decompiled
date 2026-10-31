package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k5c1 implements l5c1 {
    public final o7c1 a;

    public k5c1(o7c1 o7c1Var) {
        this.a = o7c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5c1) && this.a.equals(((k5c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
