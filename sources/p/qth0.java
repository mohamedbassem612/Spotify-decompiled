package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class qth0 implements rth0 {
    public static final pth0 Companion = new pth0();
    public final fsh a;
    public final String b;
    public final f0c1 c;

    public /* synthetic */ qth0(int i, fsh fshVar, String str, f0c1 f0c1Var) {
        if (5 != (i & 5)) {
            o6p1.t(i, 5, oth0.a.getDescriptor());
            throw null;
        }
        this.a = fshVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        this.c = f0c1Var;
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
        if (!(obj instanceof qth0)) {
            return false;
        }
        qth0 qth0Var = (qth0) obj;
        return u890.j(this.a, qth0Var.a) && u890.j(this.b, qth0Var.b) && u890.j(this.c, qth0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
