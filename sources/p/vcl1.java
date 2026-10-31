package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vcl1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public vcl1(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof vcl1)) {
            return false;
        }
        vcl1 vcl1Var = (vcl1) obj;
        return u890.j(this.a, vcl1Var.a) && this.b.equals(vcl1Var.b) && this.c.equals(vcl1Var.c) && this.d.equals(vcl1Var.d) && u890.j(this.e, vcl1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
