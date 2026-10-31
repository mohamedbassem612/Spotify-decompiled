package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k7i0 implements l7i0 {
    public final k8g1 a;

    public k7i0(k8g1 k8g1Var) {
        this.a = k8g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7i0) && u890.j(this.a, ((k7i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
