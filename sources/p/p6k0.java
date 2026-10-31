package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p6k0 {
    public final o6k0 a;
    public final boolean b;

    public p6k0(o6k0 o6k0Var, boolean z) {
        this.a = o6k0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6k0)) {
            return false;
        }
        p6k0 p6k0Var = (p6k0) obj;
        return this.a.equals(p6k0Var.a) && this.b == p6k0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
