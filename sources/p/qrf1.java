package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qrf1 implements srf1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public qrf1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrf1)) {
            return false;
        }
        qrf1 qrf1Var = (qrf1) obj;
        return this.a.equals(qrf1Var.a) && u890.j(this.b, qrf1Var.b) && u890.j(this.c, qrf1Var.c) && this.d.equals(qrf1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
