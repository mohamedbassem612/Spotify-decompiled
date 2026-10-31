package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o0a1 implements v5b1 {
    public static final uyu0 d = new uyu0((byte) 13);
    public final xkg0 a;
    public final String b;
    public final String c;

    public o0a1(xkg0 xkg0Var, String str, String str2) {
        this.a = xkg0Var;
        this.b = str;
        this.c = str2;
    }

    @Override // p.v5b1
    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0a1)) {
            return false;
        }
        o0a1 o0a1Var = (o0a1) obj;
        return this.a.equals(o0a1Var.a) && u890.j(this.b, o0a1Var.b) && u890.j(this.c, o0a1Var.c);
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
