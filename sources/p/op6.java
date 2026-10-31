package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class op6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public op6(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op6)) {
            return false;
        }
        op6 op6Var = (op6) obj;
        return this.a.equals(op6Var.a) && this.b.equals(op6Var.b) && this.c.equals(op6Var.c) && u890.j(this.d, op6Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
