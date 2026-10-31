package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bgh1 {
    public final a331 a;
    public final boolean b;

    public bgh1(a331 a331Var, boolean z) {
        this.a = a331Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgh1)) {
            return false;
        }
        bgh1 bgh1Var = (bgh1) obj;
        return u890.j(this.a, bgh1Var.a) && this.b == bgh1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
