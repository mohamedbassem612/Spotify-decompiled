package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nde1 {
    public final uvg1 a;

    public nde1(uvg1 uvg1Var) {
        this.a = uvg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nde1) && u890.j(this.a, ((nde1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
