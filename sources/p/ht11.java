package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ht11 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public ht11(String str, String str2, String str3, String str4, boolean z) {
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
        if (!(obj instanceof ht11)) {
            return false;
        }
        ht11 ht11Var = (ht11) obj;
        return u890.j(this.a, ht11Var.a) && this.b.equals(ht11Var.b) && u890.j(this.c, ht11Var.c) && this.d.equals(ht11Var.d) && this.e == ht11Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
