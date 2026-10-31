package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class btn0 {
    public final hux a;
    public final int b;
    public final lik1 c;
    public final mtn0 d;
    public final boolean e;
    public final atn0 f;

    public btn0(hux huxVar, int i, lik1 lik1Var, mtn0 mtn0Var, boolean z, atn0 atn0Var) {
        this.a = huxVar;
        this.b = i;
        this.c = lik1Var;
        this.d = mtn0Var;
        this.e = z;
        this.f = atn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btn0)) {
            return false;
        }
        btn0 btn0Var = (btn0) obj;
        return u890.j(this.a, btn0Var.a) && this.b == btn0Var.b && u890.j(this.c, btn0Var.c) && u890.j(this.d, btn0Var.d) && this.e == btn0Var.e && this.f.equals(btn0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c.a);
        mtn0 mtn0Var = this.d;
        return this.f.hashCode() + xcg1.g((iD + (mtn0Var == null ? 0 : mtn0Var.hashCode())) * 31, 31, this.e);
    }
}
