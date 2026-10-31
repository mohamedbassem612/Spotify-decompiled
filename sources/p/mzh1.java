package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mzh1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public mzh1(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof mzh1)) {
            return false;
        }
        mzh1 mzh1Var = (mzh1) obj;
        return u890.j(this.a, mzh1Var.a) && u890.j(this.b, mzh1Var.b) && u890.j(this.c, mzh1Var.c) && u890.j(this.d, mzh1Var.d) && this.e.equals(mzh1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
