package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xyu0 implements v5b1 {
    public static final uyu0 f = new uyu0((byte) 2);
    public final String a;
    public final String b;
    public final xkg0 c;
    public final String d;
    public final String e;

    public xyu0(String str, String str2, xkg0 xkg0Var, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = xkg0Var;
        this.d = str3;
        this.e = str4;
    }

    @Override // p.v5b1
    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyu0)) {
            return false;
        }
        xyu0 xyu0Var = (xyu0) obj;
        return this.a.equals(xyu0Var.a) && j6p1.n(this.b, xyu0Var.b) && this.c.equals(xyu0Var.c) && u890.j(this.d, xyu0Var.d) && u890.j(this.e, xyu0Var.e);
    }

    @Override // p.v5b1
    public final b3i1 getType() {
        return f;
    }

    public final int hashCode() {
        int iH = kk0.h(this.c, (j6p1.s(this.b) + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        return this.e.hashCode() + ((iH + (str == null ? 0 : str.hashCode())) * 31);
    }
}
