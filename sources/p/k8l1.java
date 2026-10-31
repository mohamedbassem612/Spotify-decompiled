package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k8l1 {
    public final dt71 a;
    public final dt71 b;
    public final dt71 c;
    public final dt71 d;
    public final dt71 e;

    public k8l1(dt71 dt71Var, dt71 dt71Var2, dt71 dt71Var3, dt71 dt71Var4, dt71 dt71Var5) {
        this.a = dt71Var;
        this.b = dt71Var2;
        this.c = dt71Var3;
        this.d = dt71Var4;
        this.e = dt71Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8l1)) {
            return false;
        }
        k8l1 k8l1Var = (k8l1) obj;
        return this.a == k8l1Var.a && this.b == k8l1Var.b && this.c == k8l1Var.c && this.d == k8l1Var.d && this.e == k8l1Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
