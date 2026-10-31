package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bu61 {
    public final hux a;
    public final Integer b;
    public final String c;
    public final Integer d;
    public final au61 e;

    public bu61(hux huxVar, Integer num, String str, Integer num2, au61 au61Var, int i) {
        num = (i & 2) != 0 ? null : num;
        str = (i & 4) != 0 ? null : str;
        this.a = huxVar;
        this.b = num;
        this.c = str;
        this.d = num2;
        this.e = au61Var;
        ero1.s(new Object[]{num, str}, w661.Y0);
        ero1.r(new Object[]{num2, null}, w661.Z0);
    }

    public final au61 a() {
        return this.e;
    }

    public final hux b() {
        return this.a;
    }

    public final Integer c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final Integer e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu61)) {
            return false;
        }
        bu61 bu61Var = (bu61) obj;
        return u890.j(this.a, bu61Var.a) && u890.j(this.b, bu61Var.b) && u890.j(this.c, bu61Var.c) && u890.j(this.d, bu61Var.d) && this.e.equals(bu61Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 961);
    }
}
