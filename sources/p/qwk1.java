package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qwk1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public qwk1(String str, String str2, String str3, String str4, boolean z) {
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
        if (!(obj instanceof qwk1)) {
            return false;
        }
        qwk1 qwk1Var = (qwk1) obj;
        return this.a.equals(qwk1Var.a) && this.b.equals(qwk1Var.b) && this.c.equals(qwk1Var.c) && u890.j(this.d, qwk1Var.d) && this.e == qwk1Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
