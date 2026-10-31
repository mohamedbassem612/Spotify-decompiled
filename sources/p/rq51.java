package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rq51 {
    public final hi40 a;
    public final String b;

    public rq51(hi40 hi40Var, String str) {
        this.a = hi40Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq51)) {
            return false;
        }
        rq51 rq51Var = (rq51) obj;
        return this.a.equals(rq51Var.a) && this.b.equals(rq51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
