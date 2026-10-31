package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class kth0 implements rth0 {
    public static final jth0 Companion = new jth0();
    public final fsh a;
    public final String b;
    public final das0 c;

    public /* synthetic */ kth0(int i, fsh fshVar, String str, das0 das0Var) {
        if (5 != (i & 5)) {
            o6p1.t(i, 5, ith0.a.getDescriptor());
            throw null;
        }
        this.a = fshVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        this.c = das0Var;
    }

    public final fsh a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kth0)) {
            return false;
        }
        kth0 kth0Var = (kth0) obj;
        return u890.j(this.a, kth0Var.a) && u890.j(this.b, kth0Var.b) && u890.j(this.c, kth0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
