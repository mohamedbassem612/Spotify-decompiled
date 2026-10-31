package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rqg1 {
    public final boolean a;
    public final dn90 b;

    public rqg1(boolean z, dn90 dn90Var) {
        this.a = z;
        this.b = dn90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqg1)) {
            return false;
        }
        rqg1 rqg1Var = (rqg1) obj;
        return this.a == rqg1Var.a && this.b.equals(rqg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, true);
    }
}
