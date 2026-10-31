package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uwk1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public uwk1(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwk1)) {
            return false;
        }
        uwk1 uwk1Var = (uwk1) obj;
        return u890.j(this.a, uwk1Var.a) && u890.j(this.b, uwk1Var.b) && u890.j(this.c, uwk1Var.c) && this.d.equals(uwk1Var.d) && this.e == uwk1Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
