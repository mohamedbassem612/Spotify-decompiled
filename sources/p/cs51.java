package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cs51 {
    public final String a;
    public final long b;

    public cs51(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs51)) {
            return false;
        }
        cs51 cs51Var = (cs51) obj;
        return u890.j(this.a, cs51Var.a) && this.b == cs51Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
