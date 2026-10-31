package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hqk1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public hqk1(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqk1)) {
            return false;
        }
        hqk1 hqk1Var = (hqk1) obj;
        return u890.j(this.a, hqk1Var.a) && u890.j(this.b, hqk1Var.b) && u890.j(this.c, hqk1Var.c) && u890.j(this.d, hqk1Var.d) && this.e == hqk1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
