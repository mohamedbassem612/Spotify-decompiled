package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hh41 {
    public final String a;
    public final String b;

    public hh41(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh41)) {
            return false;
        }
        hh41 hh41Var = (hh41) obj;
        return u890.j(this.a, hh41Var.a) && u890.j(this.b, hh41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
