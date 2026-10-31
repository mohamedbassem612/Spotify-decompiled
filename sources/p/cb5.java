package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cb5 extends dmb0 {
    public zgg1 O0;
    public ven0 P0;
    public eb5 Q0;
    public q5t0 R0;
    public q5t0 S0;
    public long T0 = 0;
    public long U0 = 0;
    public final ab5 V0 = new ab5(this, (byte) 1);
    public final ab5 W0 = new ab5(this, (byte) 0);
    public long X0 = -9223372034707292160L;

    public cb5(zgg1 zgg1Var, ven0 ven0Var, eb5 eb5Var) {
        this.O0 = zgg1Var;
        this.P0 = ven0Var;
        this.Q0 = eb5Var;
    }

    public final void B1() {
        this.X0 = -9223372034707292160L;
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        long j2;
        q5t0 q5t0VarH = afh0Var.H(j);
        if (ifh0Var.W()) {
            j2 = (((long) q5t0VarH.a) << 32) | (((long) q5t0VarH.b) & 4294967295L);
        } else {
            zgg1 zgg1Var = this.O0;
            int i = q5t0VarH.a;
            if (zgg1Var == null) {
                j2 = (((long) i) << 32) | (((long) q5t0VarH.b) & 4294967295L);
                this.X0 = j2;
            } else {
                long j3 = (((long) q5t0VarH.b) & 4294967295L) | (((long) i) << 32);
                ygg1 ygg1VarB = zgg1Var.b(new bb5(this, j3, (byte) 0), new bb5(this, j3, (byte) 1));
                this.Q0.f = ygg1VarB;
                j2 = ((yr80) ygg1VarB.getValue()).a;
                this.X0 = ((yr80) ygg1VarB.getValue()).a;
            }
        }
        boolean zW = ifh0Var.W();
        b7x b7xVar = b7x.a;
        if (zW) {
            this.R0 = q5t0VarH;
            this.T0 = j2;
            return ifh0Var.S((int) (j2 >> 32), (int) (j2 & 4294967295L), b7xVar, this.V0);
        }
        this.S0 = q5t0VarH;
        this.U0 = j2;
        return ifh0Var.S((int) (j2 >> 32), (int) (j2 & 4294967295L), b7xVar, this.W0);
    }
}
