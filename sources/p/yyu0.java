package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yyu0 implements v5b1 {
    public static final uyu0 g = new uyu0((byte) 3);
    public final String a;
    public final String b;
    public final String c;
    public final xkg0 d;
    public final String e;
    public final String f;

    public yyu0(String str, String str2, String str3, String str4, String str5, xkg0 xkg0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xkg0Var;
        this.e = str4;
        this.f = str5;
    }

    @Override // p.v5b1
    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyu0)) {
            return false;
        }
        yyu0 yyu0Var = (yyu0) obj;
        return this.a.equals(yyu0Var.a) && j6p1.n(this.b, yyu0Var.b) && j6p1.n(this.c, yyu0Var.c) && this.d.equals(yyu0Var.d) && u890.j(this.e, yyu0Var.e) && u890.j(this.f, yyu0Var.f);
    }

    @Override // p.v5b1
    public final b3i1 getType() {
        return g;
    }

    public final int hashCode() {
        int iH = kk0.h(this.d, (j6p1.s(this.c) + ((j6p1.s(this.b) + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.e;
        return this.f.hashCode() + ((iH + (str == null ? 0 : str.hashCode())) * 31);
    }
}
