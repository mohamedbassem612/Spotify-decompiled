package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mtn0 {
    public final iu30 a;
    public final vu30 b;
    public final iu30 c;

    public mtn0(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var) {
        this.a = iu30Var;
        this.b = vu30Var;
        this.c = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtn0)) {
            return false;
        }
        mtn0 mtn0Var = (mtn0) obj;
        return this.a.equals(mtn0Var.a) && this.b.equals(mtn0Var.b) && this.c.equals(mtn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        try {
            return super.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
