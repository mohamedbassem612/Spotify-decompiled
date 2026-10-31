package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p291 extends dmb0 {
    public fe5 O0;
    public gra P0;
    public boolean S0;
    public long Q0 = -9223372034707292160L;
    public long R0 = jjl.b(0, 0, 0, 0, 15);
    public final hrr0 T0 = xto.t((Object) null);

    public p291(fe5 fe5Var, gra graVar) {
        this.O0 = fe5Var;
        this.P0 = graVar;
    }

    public final void B1() {
        this.T0.setValue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH;
        n291 n291Var;
        long jD;
        n291 n291Var2;
        if (ifh0Var.W()) {
            this.R0 = j;
            this.S0 = true;
            q5t0VarH = afh0Var.H(j);
        } else {
            q5t0VarH = afh0Var.H(this.S0 ? this.R0 : j);
        }
        q5t0 q5t0Var = q5t0VarH;
        char c = ' ';
        long j2 = (((long) q5t0Var.b) & 4294967295L) | (((long) q5t0Var.a) << 32);
        if (ifh0Var.W()) {
            this.Q0 = j2;
            c = ' ';
            jD = j2;
            j2 = jD;
        } else {
            long j3 = !yr80.b(this.Q0, -9223372034707292160L) ? this.Q0 : j2;
            hrr0 hrr0Var = this.T0;
            n291 n291Var3 = (n291) hrr0Var.getValue();
            if (n291Var3 != null) {
                o95 o95Var = n291Var3.a;
                boolean z = (yr80.b(j3, ((yr80) o95Var.e()).a) || o95Var.f()) ? false : true;
                if (!yr80.b(j3, ((yr80) o95Var.e.getValue()).a) || z) {
                    n291Var3.b = ((yr80) o95Var.e()).a;
                    n291Var2 = n291Var3;
                    c921.y(v1(), (o8n) null, 0, new wn2(n291Var2, j3, this, (lnm) null, (byte) 16), 3);
                } else {
                    n291Var2 = n291Var3;
                }
                n291Var = n291Var2;
            } else {
                long j4 = j3;
                n291Var = new n291(new o95(new yr80(j4), rno1.h, new yr80(4294967297L), 8), j4);
            }
            hrr0Var.setValue(n291Var);
            jD = jjl.d(j, ((yr80) n291Var.a.e()).a);
        }
        int i = (int) (jD >> c);
        int i2 = (int) (jD & 4294967295L);
        return ifh0Var.S(i, i2, b7x.a, new o291(this, j2, i, i2, ifh0Var, q5t0Var));
    }

    public final void z1() {
        this.Q0 = -9223372034707292160L;
        this.S0 = false;
    }
}
