package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class heg {
    public final kf30 a;
    public final kf30 b;
    public final boolean c;

    static {
        new mka((byte) 2);
    }

    public heg(kf30 kf30Var, kf30 kf30Var2, boolean z) {
        this.a = kf30Var;
        this.b = kf30Var2;
        this.c = z;
        kf30Var2.a.c();
    }

    public static final String c(kf30 kf30Var) {
        String str = kf30Var.a.a;
        return ihc1.i0(str, '/') ? cy30.n("`", str, '`') : str;
    }

    public final kf30 a() {
        kf30 kf30Var = this.a;
        boolean zC = kf30Var.a.c();
        kf30 kf30Var2 = this.b;
        if (zC) {
            return kf30Var2;
        }
        return new kf30(kf30Var.a.a + '.' + kf30Var2.a.a);
    }

    public final String b() {
        kf30 kf30Var = this.a;
        boolean zC = kf30Var.a.c();
        kf30 kf30Var2 = this.b;
        if (zC) {
            return c(kf30Var2);
        }
        return kf30Var.a.a.replace('.', '/') + "/" + c(kf30Var2);
    }

    public final heg d(ajn0 ajn0Var) {
        return new heg(this.a, this.b.a(ajn0Var), this.c);
    }

    public final heg e() {
        kf30 kf30VarB = this.b.b();
        if (kf30VarB.a.c()) {
            return null;
        }
        return new heg(this.a, kf30VarB, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heg)) {
            return false;
        }
        heg hegVar = (heg) obj;
        return u890.j(this.a, hegVar.a) && u890.j(this.b, hegVar.b) && this.c == hegVar.c;
    }

    public final ajn0 f() {
        return this.b.a.g();
    }

    public final boolean g() {
        return !this.b.b().a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        boolean zC = this.a.a.c();
        String strB = b();
        return zC ? "/".concat(strB) : strB;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public heg(kf30 kf30Var, ajn0 ajn0Var) {
        this(kf30Var, lap1.s(ajn0Var), false);
        kf30 kf30Var2 = kf30.c;
    }
}
