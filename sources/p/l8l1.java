package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l8l1 {
    public final z0i a;
    public final boolean b;

    public l8l1(z0i z0iVar, boolean z) {
        this.a = z0iVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8l1)) {
            return false;
        }
        l8l1 l8l1Var = (l8l1) obj;
        return u890.j(this.a, l8l1Var.a) && this.b == l8l1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
