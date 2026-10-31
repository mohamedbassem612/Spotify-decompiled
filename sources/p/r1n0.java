package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r1n0 {
    public final q1n0 a;
    public final q3n0 b;

    public r1n0(q1n0 q1n0Var, q3n0 q3n0Var) {
        this.a = q1n0Var;
        this.b = q3n0Var;
    }

    public final w7r0 a(sck1 sck1Var, iac0 iac0Var, q6e0 q6e0Var) {
        int iOrdinal = this.b.a().ordinal();
        q1n0 q1n0Var = this.a;
        if (iOrdinal == 0) {
            return new hl00(iac0Var, q1n0Var.a(q6e0Var));
        }
        if (iOrdinal == 1) {
            return new owf1(sck1Var, q6e0Var, new u5b(q1n0Var, (byte) 4));
        }
        eg.o();
        return null;
    }
}
