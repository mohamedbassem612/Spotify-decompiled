package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l43 implements v5b1 {
    public static final ll0 d = new ll0((byte) 7);
    public final xkg0 a;
    public final String b;
    public final String c;

    public l43(xkg0 xkg0Var, String str, String str2) {
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
        if (!(obj instanceof l43)) {
            return false;
        }
        l43 l43Var = (l43) obj;
        return this.a.equals(l43Var.a) && u890.j(this.b, l43Var.b) && u890.j(this.c, l43Var.c);
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
