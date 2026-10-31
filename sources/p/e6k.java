package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e6k implements v5b1 {
    public static final bgc e = new bgc((byte) 4);
    public final String a;
    public final xkg0 b;
    public final String c;
    public final String d;

    public e6k(String str, xkg0 xkg0Var, String str2, String str3) {
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
        if (!(obj instanceof e6k)) {
            return false;
        }
        e6k e6kVar = (e6k) obj;
        return j6p1.n(this.a, e6kVar.a) && this.b.equals(e6kVar.b) && u890.j(this.c, e6kVar.c) && u890.j(this.d, e6kVar.d);
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
