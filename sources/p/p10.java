package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p10 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public p10(int i, String str, String str2, String str3, String str4, String str5) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str4 = (i & 8) != 0 ? "" : str4;
        str5 = (i & 16) != 0 ? "" : str5;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p10)) {
            return false;
        }
        p10 p10Var = (p10) obj;
        return this.a.equals(p10Var.a) && this.b.equals(p10Var.b) && this.c.equals(p10Var.c) && this.d.equals(p10Var.d) && this.e.equals(p10Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
