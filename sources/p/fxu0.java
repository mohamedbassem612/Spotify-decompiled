package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fxu0 implements v5b1 {
    public static final x6c0 d = new x6c0((byte) 25);
    public final xkg0 a;
    public final String b;
    public final String c;

    public fxu0(xkg0 xkg0Var, String str, String str2) {
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
        if (!(obj instanceof fxu0)) {
            return false;
        }
        fxu0 fxu0Var = (fxu0) obj;
        return this.a.equals(fxu0Var.a) && u890.j(this.b, fxu0Var.b) && u890.j(this.c, fxu0Var.c);
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
