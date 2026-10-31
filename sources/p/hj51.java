package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hj51 {
    public final String a;
    public final String b;
    public final int c = 2;

    public hj51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj51)) {
            return false;
        }
        hj51 hj51Var = (hj51) obj;
        return u890.j(this.a, hj51Var.a) && u890.j(this.b, hj51Var.b) && this.c == hj51Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
