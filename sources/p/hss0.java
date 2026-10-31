package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hss0 implements v5b1 {
    public static final x6c0 d = new x6c0((byte) 14);
    public final xkg0 a;
    public final String b;
    public final String c;

    public hss0(xkg0 xkg0Var, String str, String str2) {
        this.a = xkg0Var;
        this.b = str;
        this.c = str2;
    }

    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hss0)) {
            return false;
        }
        hss0 hss0Var = (hss0) obj;
        return this.a.equals(hss0Var.a) && u890.j(this.b, hss0Var.b) && u890.j(this.c, hss0Var.c);
    }

    public final b3i1 getType() {
        return d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
