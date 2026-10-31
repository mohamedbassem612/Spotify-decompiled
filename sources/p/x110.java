package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x110 implements z110 {
    public final x481 a;

    public x110(x481 x481Var) {
        this.a = x481Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x110) && this.a.equals(((x110) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
