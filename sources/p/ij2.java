package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ij2 extends kj2 {
    public final aj2 a;

    public ij2(aj2 aj2Var) {
        this.a = aj2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ij2) && this.a.equals(((ij2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
