package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cji1 implements v5b1 {
    public static final uyu0 f = new uyu0((byte) 22);
    public final String a;
    public final String b;
    public final xkg0 c;
    public final String d;
    public final String e;

    public cji1(String str, String str2, xkg0 xkg0Var, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = xkg0Var;
        this.d = str3;
        this.e = str4;
    }

    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cji1)) {
            return false;
        }
        cji1 cji1Var = (cji1) obj;
        return this.a.equals(cji1Var.a) && this.b.equals(cji1Var.b) && this.c.equals(cji1Var.c) && u890.j(this.d, cji1Var.d) && u890.j(this.e, cji1Var.e);
    }

    public final b3i1 getType() {
        return f;
    }

    public final int hashCode() {
        int iH = kk0.h(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return this.e.hashCode() + ((iH + (str == null ? 0 : str.hashCode())) * 31);
    }
}
