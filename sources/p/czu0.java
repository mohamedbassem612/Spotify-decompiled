package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class czu0 implements v5b1 {
    public static final uyu0 g = new uyu0((byte) 7);
    public final String a;
    public final String b;
    public final String c;
    public final xkg0 d;
    public final String e;
    public final String f;

    public czu0(String str, String str2, String str3, String str4, String str5, xkg0 xkg0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xkg0Var;
        this.e = str4;
        this.f = str5;
    }

    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czu0)) {
            return false;
        }
        czu0 czu0Var = (czu0) obj;
        return this.a.equals(czu0Var.a) && this.b.equals(czu0Var.b) && this.c.equals(czu0Var.c) && this.d.equals(czu0Var.d) && u890.j(this.e, czu0Var.e) && u890.j(this.f, czu0Var.f);
    }

    public final b3i1 getType() {
        return g;
    }

    public final int hashCode() {
        int iH = kk0.h(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        return this.f.hashCode() + ((iH + (str == null ? 0 : str.hashCode())) * 31);
    }
}
