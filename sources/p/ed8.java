package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ed8 implements v5b1 {
    public static final ll0 f = new ll0((byte) 17);
    public final String a;
    public final String b;
    public final xkg0 c;
    public final String d;
    public final String e;

    public ed8(String str, String str2, xkg0 xkg0Var, String str3, String str4) {
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
        if (!(obj instanceof ed8)) {
            return false;
        }
        ed8 ed8Var = (ed8) obj;
        return j6p1.n(this.a, ed8Var.a) && j6p1.n(this.b, ed8Var.b) && this.c.equals(ed8Var.c) && u890.j(this.d, ed8Var.d) && u890.j(this.e, ed8Var.e);
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
