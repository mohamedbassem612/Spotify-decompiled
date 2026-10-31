package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s7x0 {
    public final q7x0 a;

    public s7x0(q7x0 q7x0Var) {
        this.a = q7x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7x0) && this.a == ((s7x0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
