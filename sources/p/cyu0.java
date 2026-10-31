package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cyu0 implements v5b1 {
    public static final mxu0 e = new mxu0((byte) 13);
    public final String a;
    public final xkg0 b;
    public final String c;
    public final String d;

    public cyu0(String str, xkg0 xkg0Var, String str2, String str3) {
        this.a = str;
        this.b = xkg0Var;
        this.c = str2;
        this.d = str3;
    }

    @Override // p.v5b1
    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyu0)) {
            return false;
        }
        cyu0 cyu0Var = (cyu0) obj;
        return j6p1.n(this.a, cyu0Var.a) && this.b.equals(cyu0Var.b) && u890.j(this.c, cyu0Var.c) && u890.j(this.d, cyu0Var.d);
    }

    @Override // p.v5b1
    public final b3i1 getType() {
        return e;
    }

    public final int hashCode() {
        int iH = kk0.h(this.b, j6p1.s(this.a) * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iH + (str == null ? 0 : str.hashCode())) * 31);
    }
}
