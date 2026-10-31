package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rh80 extends z5f0 {
    public rh80(sh80 sh80Var) {
        super(sh80Var);
    }

    public final int C(int i) {
        x390 x390VarU = this.U0.U0.u();
        gfh0 gfh0VarE = x390VarU.e();
        hmb0 hmb0Var = (hmb0) x390VarU.b;
        return gfh0VarE.maxIntrinsicWidth((ndo0) hmb0Var.e1.e, hmb0Var.m(), i);
    }

    public final q5t0 H(long j) {
        k0(j);
        ndo0 ndo0Var = this.U0;
        bfn0 bfn0VarA = ndo0Var.U0.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            c6f0 c6f0Var = ((hmb0) objArr[i2]).f1.q;
            c6f0Var.getClass();
            c6f0Var.t = 3;
        }
        hmb0 hmb0Var = ndo0Var.U0;
        c1(hmb0Var.X0.measure-3p2s80s(this, hmb0Var.m(), j));
        return this;
    }

    @Override // p.z5f0
    public final void W0() {
        c6f0 c6f0Var = this.U0.U0.f1.q;
        c6f0Var.getClass();
        c6f0Var.x0();
    }

    public final int d(int i) {
        x390 x390VarU = this.U0.U0.u();
        gfh0 gfh0VarE = x390VarU.e();
        hmb0 hmb0Var = (hmb0) x390VarU.b;
        return gfh0VarE.maxIntrinsicHeight((ndo0) hmb0Var.e1.e, hmb0Var.m(), i);
    }

    public final int n(int i) {
        x390 x390VarU = this.U0.U0.u();
        gfh0 gfh0VarE = x390VarU.e();
        hmb0 hmb0Var = (hmb0) x390VarU.b;
        return gfh0VarE.minIntrinsicHeight((ndo0) hmb0Var.e1.e, hmb0Var.m(), i);
    }

    public final int o0(ul3 ul3Var) {
        c6f0 c6f0Var = this.U0.U0.f1.q;
        c6f0Var.getClass();
        lmb0 lmb0Var = c6f0Var.f;
        t5f0 t5f0Var = c6f0Var.S0;
        if (!c6f0Var.X) {
            if (lmb0Var.d == 2) {
                t5f0Var.p(true);
                if (t5f0Var.d()) {
                    lmb0Var.f = true;
                    lmb0Var.g = true;
                }
            } else {
                t5f0Var.o(true);
            }
        }
        rh80 rh80Var = c6f0Var.r().F1;
        Boolean boolValueOf = rh80Var != null ? Boolean.valueOf(((x5f0) rh80Var).O0) : null;
        rh80 rh80Var2 = c6f0Var.r().F1;
        if (rh80Var2 != null) {
            ((x5f0) rh80Var2).O0 = true;
        }
        c6f0Var.k();
        rh80 rh80Var3 = c6f0Var.r().F1;
        if (rh80Var3 != null) {
            ((x5f0) rh80Var3).O0 = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) t5f0Var.e().get(ul3Var);
        int iIntValue = num != null ? num.intValue() : os00.INVALID_ID;
        this.Z0.g(iIntValue, ul3Var);
        return iIntValue;
    }

    public final int w(int i) {
        x390 x390VarU = this.U0.U0.u();
        gfh0 gfh0VarE = x390VarU.e();
        hmb0 hmb0Var = (hmb0) x390VarU.b;
        return gfh0VarE.minIntrinsicWidth((ndo0) hmb0Var.e1.e, hmb0Var.m(), i);
    }
}
