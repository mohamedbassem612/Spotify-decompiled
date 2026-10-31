package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class evi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public evi0(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof evi0)) {
            return false;
        }
        evi0 evi0Var = (evi0) obj;
        return u890.j(this.a, evi0Var.a) && u890.j(this.b, evi0Var.b) && u890.j(this.c, evi0Var.c) && u890.j(this.d, evi0Var.d) && u890.j(this.e, evi0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
