package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e03 implements v5b1 {
    public static final ll0 d = new ll0((byte) 4);
    public final xkg0 a;
    public final String b;
    public final String c;

    public e03(xkg0 xkg0Var, String str, String str2) {
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
        if (!(obj instanceof e03)) {
            return false;
        }
        e03 e03Var = (e03) obj;
        return this.a.equals(e03Var.a) && u890.j(this.b, e03Var.b) && u890.j(this.c, e03Var.c);
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
