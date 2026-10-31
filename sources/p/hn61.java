package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hn61 {
    public final String a;
    public final String b;
    public final String c;
    public final vu30 d;
    public final String e;
    public final String f;
    public final int g;
    public final Boolean h;

    public /* synthetic */ hn61(String str, String str2, String str3, j2i j2iVar, String str4, String str5, Boolean bool, int i) {
        this((i & 1) != 0 ? null : str, str2, str3, (vu30) ((i & 8) != 0 ? null : j2iVar), str4, str5, (i & 64) != 0 ? 1 : 2, (i & 128) != 0 ? null : bool);
    }

    public static hn61 a(hn61 hn61Var, Boolean bool) {
        String str = hn61Var.a;
        String str2 = hn61Var.b;
        String str3 = hn61Var.c;
        vu30 vu30Var = hn61Var.d;
        String str4 = hn61Var.e;
        String str5 = hn61Var.f;
        int i = hn61Var.g;
        hn61Var.getClass();
        return new hn61(str, str2, str3, vu30Var, str4, str5, i, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn61)) {
            return false;
        }
        hn61 hn61Var = (hn61) obj;
        return u890.j(this.a, hn61Var.a) && u890.j(this.b, hn61Var.b) && u890.j(this.c, hn61Var.c) && u890.j(this.d, hn61Var.d) && u890.j(this.e, hn61Var.e) && u890.j(this.f, hn61Var.f) && this.g == hn61Var.g && u890.j(this.h, hn61Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        vu30 vu30Var = this.d;
        int iD2 = cy30.d((iD + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int iK = ab80.k(this.g, (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Boolean bool = this.h;
        return iK + (bool != null ? bool.hashCode() : 0);
    }

    public hn61(String str, String str2, String str3, vu30 vu30Var, String str4, String str5, int i, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = vu30Var;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = bool;
    }
}
