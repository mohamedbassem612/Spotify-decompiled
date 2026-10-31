package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aby extends dmb0 implements zkb0 {
    public bjg1 O0;
    public zgg1 P0;
    public zgg1 Q0;
    public zgg1 R0;
    public bby S0;
    public ln00 T0;
    public ft71 U0;
    public Function0 V0;
    public ray W0;
    public long X0 = -9223372034707292160L;
    public tl3 Y0;
    public final i5w Z0;
    public final s20 a1;

    public aby(bjg1 bjg1Var, zgg1 zgg1Var, zgg1 zgg1Var2, zgg1 zgg1Var3, bby bbyVar, ln00 ln00Var, ft71 ft71Var, Function0 function0, ray rayVar) {
        this.O0 = bjg1Var;
        this.P0 = zgg1Var;
        this.Q0 = zgg1Var2;
        this.R0 = zgg1Var3;
        this.S0 = bbyVar;
        this.T0 = ln00Var;
        this.U0 = ft71Var;
        this.V0 = function0;
        this.W0 = rayVar;
        jjl.b(0, 0, 0, 0, 15);
        this.Z0 = new i5w(this, (byte) 22);
        this.a1 = new s20(this, (byte) 22);
    }

    public final tl3 H1() {
        tl3 tl3Var;
        tl3 tl3Var2;
        if (this.O0.f().f(pay.a, pay.b)) {
            cfe cfeVar = this.S0.a.c;
            if (cfeVar != null && (tl3Var2 = cfeVar.a) != null) {
                return tl3Var2;
            }
            cfe cfeVar2 = this.T0.a.c;
            if (cfeVar2 != null) {
                return cfeVar2.a;
            }
            return null;
        }
        cfe cfeVar3 = this.T0.a.c;
        if (cfeVar3 != null && (tl3Var = cfeVar3.a) != null) {
            return tl3Var;
        }
        cfe cfeVar4 = this.S0.a.c;
        if (cfeVar4 != null) {
            return cfeVar4.a;
        }
        return null;
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        ygg1 ygg1VarB;
        ygg1 ygg1VarA;
        if (this.O0.a.P0() == this.O0.d.getValue()) {
            this.Y0 = null;
        } else if (this.Y0 == null) {
            tl3 tl3VarH1 = H1();
            if (tl3VarH1 == null) {
                tl3VarH1 = een.d;
            }
            this.Y0 = tl3VarH1;
        }
        boolean zW = ifh0Var.W();
        b7x b7xVar = b7x.a;
        if (zW) {
            q5t0 q5t0VarH = afh0Var.H(j);
            long j2 = (((long) q5t0VarH.a) << 32) | (((long) q5t0VarH.b) & 4294967295L);
            this.X0 = j2;
            return ifh0Var.S((int) (j2 >> 32), (int) (j2 & 4294967295L), b7xVar, new s20(q5t0VarH, (byte) 21));
        }
        if (!((Boolean) this.V0.invoke()).booleanValue()) {
            q5t0 q5t0VarH2 = afh0Var.H(j);
            return ifh0Var.S(q5t0VarH2.a, q5t0VarH2.b, b7xVar, new f2(q5t0VarH2, (byte) 16));
        }
        o4u o4uVarA = this.W0.a();
        q5t0 q5t0VarH3 = afh0Var.H(j);
        long j3 = (((long) q5t0VarH3.a) << 32) | (((long) q5t0VarH3.b) & 4294967295L);
        long j4 = !yr80.b(this.X0, -9223372034707292160L) ? this.X0 : j3;
        zgg1 zgg1Var = this.P0;
        if (zgg1Var != null) {
            ygg1VarB = zgg1Var.b(this.Z0, new zay(this, j4, (byte) 0));
        } else {
            ygg1VarB = null;
        }
        long jD = jjl.d(j, ygg1VarB != null ? ((yr80) ygg1VarB.getValue()).a : j3);
        zgg1 zgg1Var2 = this.Q0;
        long j5 = zgg1Var2 != null ? ((qr80) zgg1Var2.b(vay.h, new zay(this, j4, (byte) 2)).getValue()).a : 0L;
        zgg1 zgg1Var3 = this.R0;
        if (zgg1Var3 != null) {
            ygg1VarA = zgg1Var3.a(this.a1, this.U0.k(), this.U0.l(), new zay(this, j4, (byte) 1));
        } else {
            ygg1VarA = null;
        }
        return ifh0Var.S((int) (jD >> 32), (int) (jD & 4294967295L), b7xVar, new yay(this, ygg1VarA, j3, j4, jD, q5t0VarH3, j5, o4uVarA));
    }

    @Override // p.zkb0
    public final void d1(elb0 elb0Var) {
        this.U0.p(elb0Var);
    }

    public final void z1() {
        this.X0 = -9223372034707292160L;
    }
}
