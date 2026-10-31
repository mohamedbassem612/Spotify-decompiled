package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w3h0 implements e4h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public w3h0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3h0)) {
            return false;
        }
        w3h0 w3h0Var = (w3h0) obj;
        return this.a.equals(w3h0Var.a) && u890.j(this.b, w3h0Var.b) && u890.j(this.c, w3h0Var.c) && this.d.equals(w3h0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
