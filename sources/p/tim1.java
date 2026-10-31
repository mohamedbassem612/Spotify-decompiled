package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tim1 implements vim1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public tim1(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tim1)) {
            return false;
        }
        tim1 tim1Var = (tim1) obj;
        return u890.j(this.a, tim1Var.a) && u890.j(this.b, tim1Var.b) && u890.j(this.c, tim1Var.c) && u890.j(this.d, tim1Var.d) && u890.j(this.e, tim1Var.e) && u890.j(this.f, tim1Var.f);
    }

    public final int hashCode() {
        return ((this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31) + 1094540907;
    }
}
