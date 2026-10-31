package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hry0 {
    public final kpy0 a;
    public final k8f0 b;

    public /* synthetic */ hry0(kpy0 kpy0Var, int i) {
        this((i & 1) != 0 ? kpy0.a : kpy0Var, new k8f0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hry0)) {
            return false;
        }
        hry0 hry0Var = (hry0) obj;
        return this.a == hry0Var.a && u890.j(this.b, hry0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public hry0(kpy0 kpy0Var, k8f0 k8f0Var) {
        this.a = kpy0Var;
        this.b = k8f0Var;
    }
}
