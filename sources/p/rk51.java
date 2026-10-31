package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rk51 {
    public final String a;
    public final l7c1 b;

    public rk51(String str, l7c1 l7c1Var) {
        this.a = str;
        this.b = l7c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk51)) {
            return false;
        }
        rk51 rk51Var = (rk51) obj;
        return this.a.equals(rk51Var.a) && u890.j(this.b, rk51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
