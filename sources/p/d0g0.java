package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d0g0 extends f0g0 {
    public final c7p0 a;
    public final boolean b;

    public d0g0(c7p0 c7p0Var, boolean z) {
        this.a = c7p0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0g0)) {
            return false;
        }
        d0g0 d0g0Var = (d0g0) obj;
        return this.a == d0g0Var.a && this.b == d0g0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
