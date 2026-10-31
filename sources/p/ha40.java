package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ha40 implements v5b1 {
    public static final bgc e = new bgc((byte) 18);
    public final String a;
    public final xkg0 b;
    public final String c;
    public final String d;

    public ha40(String str, xkg0 xkg0Var, String str2, String str3) {
        this.a = str;
        this.b = xkg0Var;
        this.c = str2;
        this.d = str3;
    }

    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha40)) {
            return false;
        }
        ha40 ha40Var = (ha40) obj;
        return this.a.equals(ha40Var.a) && this.b.equals(ha40Var.b) && u890.j(this.c, ha40Var.c) && u890.j(this.d, ha40Var.d);
    }

    public final b3i1 getType() {
        return e;
    }

    public final int hashCode() {
        int iH = kk0.h(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iH + (str == null ? 0 : str.hashCode())) * 31);
    }
}
