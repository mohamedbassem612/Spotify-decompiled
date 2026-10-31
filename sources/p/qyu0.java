package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qyu0 implements v5b1 {
    public static final mxu0 f = new mxu0((byte) 26);
    public final String a;
    public final String b;
    public final xkg0 c;
    public final String d;
    public final String e;

    public qyu0(String str, String str2, xkg0 xkg0Var, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = xkg0Var;
        this.d = str3;
        this.e = str4;
    }

    @Override // p.v5b1
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyu0)) {
            return false;
        }
        qyu0 qyu0Var = (qyu0) obj;
        return j6p1.n(this.a, qyu0Var.a) && j6p1.n(this.b, qyu0Var.b) && this.c.equals(qyu0Var.c) && u890.j(this.d, qyu0Var.d) && u890.j(this.e, qyu0Var.e);
    }

    @Override // p.v5b1
    public final b3i1 getType() {
        return f;
    }

    public final int hashCode() {
        int iH = kk0.h(this.c, (j6p1.s(this.b) + (j6p1.s(this.a) * 31)) * 31, 31);
        String str = this.d;
        return this.e.hashCode() + ((iH + (str == null ? 0 : str.hashCode())) * 31);
    }
}
