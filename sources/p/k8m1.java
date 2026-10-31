package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k8m1 {
    public final n1i a;
    public final n1i b;

    public k8m1(n1i n1iVar, n1i n1iVar2) {
        this.a = n1iVar;
        this.b = n1iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8m1)) {
            return false;
        }
        k8m1 k8m1Var = (k8m1) obj;
        return this.a == k8m1Var.a && this.b == k8m1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
