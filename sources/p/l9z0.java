package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l9z0 {
    public final iun0 a;
    public final boolean b;

    public l9z0(iun0 iun0Var, boolean z) {
        this.a = iun0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9z0)) {
            return false;
        }
        l9z0 l9z0Var = (l9z0) obj;
        return this.a.equals(l9z0Var.a) && this.b == l9z0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
