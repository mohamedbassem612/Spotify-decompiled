package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c03 implements v5b1 {
    public static final ll0 d = new ll0((byte) 2);
    public final xkg0 a;
    public final String b;
    public final String c;

    public c03(xkg0 xkg0Var, String str, String str2) {
        this.a = xkg0Var;
        this.b = str;
        this.c = str2;
    }

    @Override // p.v5b1
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c03)) {
            return false;
        }
        c03 c03Var = (c03) obj;
        return this.a.equals(c03Var.a) && u890.j(this.b, c03Var.b) && u890.j(this.c, c03Var.c);
    }

    @Override // p.v5b1
    public final b3i1 getType() {
        return d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
