package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r021 implements w021 {
    public final o331 a;
    public final boolean b;

    public r021(o331 o331Var, boolean z) {
        this.a = o331Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r021)) {
            return false;
        }
        r021 r021Var = (r021) obj;
        return u890.j(this.a, r021Var.a) && this.b == r021Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
