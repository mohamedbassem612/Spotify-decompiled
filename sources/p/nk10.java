package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nk10 implements v5b1 {
    public static final bgc e = new bgc((byte) 12);
    public final String a;
    public final xkg0 b;
    public final String c;
    public final String d;

    public nk10(String str, xkg0 xkg0Var, String str2, String str3) {
        this.a = str;
        this.b = xkg0Var;
        this.c = str2;
        this.d = str3;
    }

    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk10)) {
            return false;
        }
        nk10 nk10Var = (nk10) obj;
        return this.a.equals(nk10Var.a) && this.b.equals(nk10Var.b) && u890.j(this.c, nk10Var.c) && u890.j(this.d, nk10Var.d);
    }

    public final b3i1 getType() {
        return e;
    }

    public final int hashCode() {
        int iH = kk0.h(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iH + (str == null ? 0 : str.hashCode())) * 31);
    }
}
