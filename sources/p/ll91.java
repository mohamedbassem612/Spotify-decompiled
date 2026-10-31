package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ll91 {
    public final ol91 a;
    public final long b;

    public ll91(ol91 ol91Var, long j) {
        this.a = ol91Var;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final ol91 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll91)) {
            return false;
        }
        ll91 ll91Var = (ll91) obj;
        return this.a.equals(ll91Var.a) && this.b == ll91Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
