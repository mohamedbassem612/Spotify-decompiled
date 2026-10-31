package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rpd1 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;

    public rpd1(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpd1)) {
            return false;
        }
        rpd1 rpd1Var = (rpd1) obj;
        return this.a.equals(rpd1Var.a) && this.b == rpd1Var.b && this.c.equals(rpd1Var.c) && this.d.equals(rpd1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
