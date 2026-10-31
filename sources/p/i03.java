package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i03 implements v5b1 {
    public static final ll0 d = new ll0((byte) 6);
    public final xkg0 a;
    public final String b;
    public final String c;

    public i03(xkg0 xkg0Var, String str, String str2) {
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
        if (!(obj instanceof i03)) {
            return false;
        }
        i03 i03Var = (i03) obj;
        return this.a.equals(i03Var.a) && u890.j(this.b, i03Var.b) && u890.j(this.c, i03Var.c);
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
