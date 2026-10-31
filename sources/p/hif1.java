package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hif1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public hif1(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof hif1)) {
            return false;
        }
        hif1 hif1Var = (hif1) obj;
        return this.a.equals(hif1Var.a) && this.b.equals(hif1Var.b) && this.c.equals(hif1Var.c) && this.d.equals(hif1Var.d) && u890.j(this.e, hif1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(false) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
