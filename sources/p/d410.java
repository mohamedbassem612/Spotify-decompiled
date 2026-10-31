package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d410 extends e410 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public d410(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d410)) {
            return false;
        }
        d410 d410Var = (d410) obj;
        return this.a.equals(d410Var.a) && u890.j(this.b, d410Var.b) && u890.j(this.c, d410Var.c) && this.d == d410Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
