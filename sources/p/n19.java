package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n19 extends d7o0 {
    public final c7o0 a;
    public final b7o0 b;

    public n19(c7o0 c7o0Var, b7o0 b7o0Var) {
        this.a = c7o0Var;
        this.b = b7o0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d7o0) {
            d7o0 d7o0Var = (d7o0) obj;
            c7o0 c7o0Var = this.a;
            if (c7o0Var != null ? c7o0Var.equals(((n19) d7o0Var).a) : ((n19) d7o0Var).a == null) {
                b7o0 b7o0Var = this.b;
                if (b7o0Var != null ? b7o0Var.equals(((n19) d7o0Var).b) : ((n19) d7o0Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        c7o0 c7o0Var = this.a;
        int iHashCode = ((c7o0Var == null ? 0 : c7o0Var.hashCode()) ^ 1000003) * 1000003;
        b7o0 b7o0Var = this.b;
        return iHashCode ^ (b7o0Var != null ? b7o0Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
