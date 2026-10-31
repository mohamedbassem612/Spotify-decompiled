package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b10 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public b10(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b10)) {
            return false;
        }
        b10 b10Var = (b10) obj;
        return u890.j(this.a, b10Var.a) && u890.j(this.b, b10Var.b) && this.c == b10Var.c && u890.j(this.d, b10Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public /* synthetic */ b10(String str, String str2, int i, int i2) {
        this(str, str2, (i2 & 4) != 0 ? 1 : i, "");
    }
}
