package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v0u0 {
    public final jo70 a;
    public final jo70 b;

    public /* synthetic */ v0u0(jo70 jo70Var, int i) {
        this((i & 1) != 0 ? null : jo70Var, (jo70) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0u0)) {
            return false;
        }
        v0u0 v0u0Var = (v0u0) obj;
        return u890.j(this.a, v0u0Var.a) && u890.j(this.b, v0u0Var.b);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        jo70 jo70Var2 = this.b;
        return iHashCode + (jo70Var2 != null ? jo70Var2.hashCode() : 0);
    }

    public v0u0(jo70 jo70Var, jo70 jo70Var2) {
        this.a = jo70Var;
        this.b = jo70Var2;
    }
}
