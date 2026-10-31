package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wu61 {
    public final String a;
    public final String b;
    public final xpw c;
    public final Object d;

    public wu61(String str, String str2, xpw xpwVar, Object obj) {
        this.a = str;
        this.b = str2;
        this.c = xpwVar;
        this.d = obj;
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-487153897);
        int i2 = (x340Var.g(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            xpw xpwVar = this.c;
            otw.c(xpwVar, this.d, (qim0) null, wpb1.D(rc11.a.b(xpwVar.getClass()).o() + "." + this.a + "." + this.b, xpwVar, this.d, x340Var, 0), x340Var, 0, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u841(this, i, (byte) 20);
        }
    }

    public final String b() {
        return this.a;
    }

    public final Object c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu61)) {
            return false;
        }
        wu61 wu61Var = (wu61) obj;
        return u890.j(this.a, wu61Var.a) && u890.j(this.b, wu61Var.b) && u890.j(this.c, wu61Var.c) && u890.j(this.d, wu61Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Object obj = this.d;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }
}
