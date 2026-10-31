package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dyn implements xpw {
    public final rey0 a = k1o1.p();
    public final ia00 b = n3o1.q(this).a(cnn.c, cnn.e);
    public final psw c;

    public dyn() {
        j2i j2iVar = new j2i(1119887044, new bfm(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.b;
    }

    public final jsw c() {
        return this.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e(cyn cynVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        ayn aynVar = cynVar.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1245024147);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(cynVar) : x340Var.i(cynVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (aynVar instanceof zxn) {
            x340Var.i0(1827673466);
            zqo1.m(((zxn) aynVar).a, x340Var, 0);
            x340Var.r(false);
        } else if (aynVar instanceof xxn) {
            x340Var.i0(1827676503);
            xxn xxnVar = (xxn) aynVar;
            zqo1.b(xxnVar.a, xxnVar.b, x340Var, 0);
            x340Var.r(false);
        } else {
            if (!(aynVar instanceof yxn)) {
                throw p3d1.k(x340Var, 1827671803, false);
            }
            x340Var.i0(1827680260);
            rc2.e(((yxn) aynVar).a, (qim0) null, x340Var, 0);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(this, cynVar, i, (byte) 14);
        }
    }

    public final mqw getBehavior() {
        return this.a;
    }
}
