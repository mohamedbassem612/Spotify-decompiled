package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r2b0 extends k3b0 {
    public final q2b0 a;

    public r2b0(q2b0 q2b0Var) {
        this.a = q2b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2b0) && this.a.equals(((r2b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.a + ')';
    }
}
