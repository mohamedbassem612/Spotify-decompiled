package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class imm1 implements xpw {
    public final /* synthetic */ byte a;
    public final psw b;
    public final rqw c;
    public final mqw d;

    public imm1(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.d = k1o1.p();
                this.c = f3o1.u();
                j2i j2iVar = kkj.a;
                ien0 ien0Var = qsw.a;
                this.b = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.d = k1o1.o(gft.Y0);
                j2i j2iVarJ = apo.j(-1893817755, new yhy(this, (byte) 9), true);
                ien0 ien0Var2 = qsw.a;
                this.b = new psw(j2iVarJ, (byte) 0);
                this.c = n3o1.q(this).a(c0z.N0, c0z.P0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }

    public void e(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1303058830);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131958436);
            j2i j2iVar = ymi.a;
            j2i j2iVar2 = ymi.b;
            j2i j2iVarR = apo.r(916376716, new qgd((byte) 3, strO0, iu30Var, false), x340Var);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new y9y(iu30Var, (byte) 23);
                x340Var.s0(objT);
            }
            ila0.c(null, j2iVar, j2iVar2, j2iVarR, null, (Function0) objT, x340Var, 3504, 17);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(this, iu30Var, i, (byte) 4);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    public imm1(dmj1 dmj1Var, w9u0 w9u0Var, klm1 klm1Var, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 0;
        this.d = cxm.v(new w9p0(), gp71.D, b9p0.a(w9u0Var, klm1Var, q8nVar2), u5l1.e1, bpo1.A(q8nVar, dmj1Var));
        this.c = n3o1.q(this).a(yxl1.X, yxl1.Y);
        j2i j2iVar = l4j.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }
}
