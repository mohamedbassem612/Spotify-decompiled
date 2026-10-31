package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class evd1 {
    public final String a;
    public final h290 b;
    public final String c;

    public evd1(String str, String str2, h290 h290Var) {
        this.a = str;
        this.b = h290Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evd1)) {
            return false;
        }
        evd1 evd1Var = (evd1) obj;
        return this.a.equals(evd1Var.a) && this.b.equals(evd1Var.b) && this.c.equals(evd1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.g(this.b, this.a.hashCode() * 31, 31);
    }
}
