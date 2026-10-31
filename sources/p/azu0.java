package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class azu0 implements v5b1 {
    public static final uyu0 g = new uyu0((byte) 5);
    public final String a;
    public final String b;
    public final String c;
    public final xkg0 d;
    public final String e;
    public final String f;

    public azu0(String str, String str2, String str3, String str4, String str5, xkg0 xkg0Var) {
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
        if (!(obj instanceof azu0)) {
            return false;
        }
        azu0 azu0Var = (azu0) obj;
        return this.a.equals(azu0Var.a) && j6p1.n(this.b, azu0Var.b) && j6p1.n(this.c, azu0Var.c) && this.d.equals(azu0Var.d) && u890.j(this.e, azu0Var.e) && u890.j(this.f, azu0Var.f);
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
