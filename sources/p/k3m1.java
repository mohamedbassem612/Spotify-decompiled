package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k3m1 extends b4m1 {
    public final String a;
    public final boolean b;

    public k3m1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3m1)) {
            return false;
        }
        k3m1 k3m1Var = (k3m1) obj;
        return u890.j(this.a, k3m1Var.a) && this.b == k3m1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
