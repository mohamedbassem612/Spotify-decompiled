package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c8e1 {
    public static final df41 d;
    public final af5 a;
    public final long b;
    public final nbe1 c;

    static {
        final byte b = 1;
        d = new df41(new ef41((byte) 20), new vu30() { // from class: p.a261
            public final Object invoke(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        pze0.m(obj);
                        pze0.m(obj2);
                        return null;
                    default:
                        id41 id41Var = (id41) obj;
                        c8e1 c8e1Var = (c8e1) obj2;
                        return p7h.H(new Object[]{jf41.a(c8e1Var.a, jf41.a, id41Var), jf41.a(new nbe1(c8e1Var.b), jf41.f53p, id41Var)});
                }
            }
        });
    }

    public c8e1(af5 af5Var, long j, nbe1 nbe1Var) {
        nbe1 nbe1Var2;
        this.a = af5Var;
        this.b = e6p1.f(af5Var.b.length(), j);
        if (nbe1Var != null) {
            nbe1Var2 = new nbe1(e6p1.f(af5Var.b.length(), nbe1Var.a));
        } else {
            nbe1Var2 = null;
        }
        this.c = nbe1Var2;
    }

    public static c8e1 a(c8e1 c8e1Var, af5 af5Var, long j, int i) {
        if ((i & 1) != 0) {
            af5Var = c8e1Var.a;
        }
        if ((i & 2) != 0) {
            j = c8e1Var.b;
        }
        nbe1 nbe1Var = (i & 4) != 0 ? c8e1Var.c : null;
        c8e1Var.getClass();
        return new c8e1(af5Var, j, nbe1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8e1)) {
            return false;
        }
        c8e1 c8e1Var = (c8e1) obj;
        return nbe1.c(this.b, c8e1Var.b) && u890.j(this.c, c8e1Var.c) && u890.j(this.a, c8e1Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = nbe1.c;
        int iF = cy30.f(iHashCode, this.b, 31);
        nbe1 nbe1Var = this.c;
        return iF + (nbe1Var != null ? Long.hashCode(nbe1Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + nbe1.i(this.b) + ", composition=" + this.c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c8e1(long j, int i, String str) {
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = nbe1.c;
            j = b6p1.k();
        }
        this(new af5(str), j, (nbe1) null);
    }
}
