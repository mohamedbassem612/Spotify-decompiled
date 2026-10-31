package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hvi1 implements d6m {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public hvi1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvi1)) {
            return false;
        }
        hvi1 hvi1Var = (hvi1) obj;
        return u890.j(this.a, hvi1Var.a) && this.b.equals(hvi1Var.b) && this.c.equals(hvi1Var.c) && this.d.equals(hvi1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }
}
