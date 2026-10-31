package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zwe0 {
    public final j4s0 a;
    public final rf8 b;

    public zwe0(j4s0 j4s0Var, rf8 rf8Var) {
        this.a = j4s0Var;
        this.b = rf8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zwe0) {
            zwe0 zwe0Var = (zwe0) obj;
            return u890.j(this.a, zwe0Var.a) && this.b == zwe0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
