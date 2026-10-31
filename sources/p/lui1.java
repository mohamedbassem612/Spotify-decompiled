package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lui1 {
    public final oe5 a;
    public final dlv b;

    public lui1(oe5 oe5Var, dlv dlvVar) {
        this.a = oe5Var;
        this.b = dlvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lui1)) {
            return false;
        }
        lui1 lui1Var = (lui1) obj;
        return u890.j(this.a, lui1Var.a) && u890.j(this.b, lui1Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
