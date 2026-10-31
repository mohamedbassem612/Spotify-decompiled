package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kyh1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public kyh1(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
    }

    public static kyh1 a(kyh1 kyh1Var, int i) {
        return new kyh1(kyh1Var.a, kyh1Var.b, kyh1Var.c, kyh1Var.d, i, kyh1Var.e, kyh1Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyh1)) {
            return false;
        }
        kyh1 kyh1Var = (kyh1) obj;
        return u890.j(this.a, kyh1Var.a) && u890.j(this.b, kyh1Var.b) && u890.j(this.c, kyh1Var.c) && u890.j(this.d, kyh1Var.d) && u890.j(this.e, kyh1Var.e) && u890.j(this.f, kyh1Var.f) && this.g == kyh1Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public /* synthetic */ kyh1() {
        this("#FFFFFF", "", "", "", 0, "", "");
    }
}
