package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qe90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final lg60 f;

    public qe90(String str, String str2, String str3, String str4, String str5, lg60 lg60Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = lg60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qe90) {
            qe90 qe90Var = (qe90) obj;
            return u890.j(this.a, qe90Var.a) && this.b.equals(qe90Var.b) && this.c.equals(qe90Var.c) && this.d.equals(qe90Var.d) && this.e.equals(qe90Var.e) && this.f == qe90Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
