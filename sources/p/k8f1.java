package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k8f1 implements l8f1 {
    public final int a;
    public final String b;

    public k8f1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8f1)) {
            return false;
        }
        k8f1 k8f1Var = (k8f1) obj;
        return this.a == k8f1Var.a && u890.j(this.b, k8f1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
