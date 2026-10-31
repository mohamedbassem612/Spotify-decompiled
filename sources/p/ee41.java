package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ee41 extends kdn0 {
    public final String Y;
    public fe41 Z;

    public ee41(fe41 fe41Var, String str, Object obj) {
        super(obj);
        this.Y = str;
        this.Z = fe41Var;
    }

    public final void m(Object obj) {
        fe41 fe41Var = this.Z;
        if (fe41Var != null) {
            fe41Var.b.S(obj, this.Y);
        }
        super/*p.ymd0*/.m(obj);
    }

    public final void n() {
        this.Z = null;
    }

    public ee41(String str, fe41 fe41Var) {
        this.Y = str;
        this.Z = fe41Var;
    }
}
