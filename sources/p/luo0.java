package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class luo0 extends puo0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public luo0(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof luo0)) {
            return false;
        }
        luo0 luo0Var = (luo0) obj;
        return u890.j(this.a, luo0Var.a) && this.b.equals(luo0Var.b) && this.c.equals(luo0Var.c) && u890.j(this.d, luo0Var.d) && u890.j(this.e, luo0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
