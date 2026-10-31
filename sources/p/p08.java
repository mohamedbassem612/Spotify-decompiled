package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p08 {
    public final String a;
    public final String b;
    public final String c;

    public p08(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p08)) {
            return false;
        }
        p08 p08Var = (p08) obj;
        return u890.j(this.a, p08Var.a) && u890.j(this.b, p08Var.b) && u890.j(this.c, p08Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ab80.k(1, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
