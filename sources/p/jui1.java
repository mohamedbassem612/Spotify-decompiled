package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jui1 {
    public final br20 a;
    public oe5 b;
    public oe5 c;
    public oe5 d;
    public final float e;

    public jui1(br20 br20Var) {
        this.a = br20Var;
        this.e = br20Var.d();
    }

    public final oe5 a(long j, oe5 oe5Var, oe5 oe5Var2) {
        oe5 oe5VarC = this.c;
        if (oe5VarC == null) {
            oe5VarC = oe5Var.c();
            this.c = oe5VarC;
        }
        int iB = oe5VarC.b();
        int i = 0;
        while (true) {
            oe5 oe5Var3 = this.c;
            if (i >= iB) {
                if (oe5Var3 != null) {
                    return oe5Var3;
                }
                u890.C("velocityVector");
                throw null;
            }
            if (oe5Var3 == null) {
                u890.C("velocityVector");
                throw null;
            }
            oe5Var.getClass();
            oe5Var3.e(this.a.a(oe5Var2.a(i), j), i);
            i++;
        }
    }
}
