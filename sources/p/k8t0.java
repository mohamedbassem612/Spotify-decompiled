package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k8t0 {
    public final zmp0 a;
    public final y6u b;
    public final int c;
    public final String d;

    public k8t0(zmp0 zmp0Var, y6u y6uVar, int i, String str) {
        this.a = zmp0Var;
        this.b = y6uVar;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8t0)) {
            return false;
        }
        k8t0 k8t0Var = (k8t0) obj;
        return this.a.equals(k8t0Var.a) && this.b.equals(k8t0Var.b) && this.c == k8t0Var.c && this.d.equals(k8t0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
