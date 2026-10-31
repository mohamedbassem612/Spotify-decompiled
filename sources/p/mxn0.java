package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mxn0 implements pxn0 {
    public final boolean a;
    public final iu30 b;
    public final zu30 c;

    public mxn0(boolean z, iu30 iu30Var, zu30 zu30Var) {
        this.a = z;
        this.b = iu30Var;
        this.c = zu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxn0)) {
            return false;
        }
        mxn0 mxn0Var = (mxn0) obj;
        return this.a == mxn0Var.a && this.b.equals(mxn0Var.b) && this.c.equals(mxn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.g(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
