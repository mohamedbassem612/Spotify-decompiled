package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vba1 implements xpw {
    public final d061 a;
    public final rey0 b = new rey0(new k681(this, (byte) 20));
    public final ia00 c = n3o1.q(this).a(new aaq0(this, (byte) 28), r8a1.X);
    public final psw d;

    public vba1(d061 d061Var) {
        this.a = d061Var;
        j2i j2iVar = tjj.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static c1m0 f(uba1 uba1Var) {
        brl0 brl0Var = new brl0(uba1Var.a, (byte) 11);
        int i = uba1Var.b;
        String str = uba1Var.c;
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC == 1) {
                return new c1m0(brl0Var, 3);
            }
            int i2 = 2;
            if (iC != 2) {
                eg.o();
                return null;
            }
            if (str == null) {
                return new c1m0(brl0Var, 1);
            }
            if (!str.equals("artists")) {
                i2 = str.equals("songs") ? 4 : 0;
            }
            if (i2 != 0) {
                return new c1m0(brl0Var, i2);
            }
        }
        return null;
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final void e(uba1 uba1Var, b0k b0kVar, int i) {
        vba1 vba1Var;
        uba1 uba1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-294446647);
        int i2 = (x340Var.g(uba1Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            vba1Var = this;
            uba1Var2 = uba1Var;
            x340Var.b0();
        } else if (f(uba1Var) == null) {
            x340Var.i0(-1536782141);
            String str = uba1Var.d;
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new fe81(this, (byte) 29);
                x340Var.s0(objT);
            }
            rqt0.l(0, 2, str, (Function0) objT, x340Var, (qim0) null);
            x340Var.r(false);
            vba1Var = this;
            uba1Var2 = uba1Var;
        } else {
            x340Var.i0(-1536691807);
            vba1Var = this;
            uba1Var2 = uba1Var;
            otw.c(vba1Var, uba1Var2, (qim0) null, (ipb1) null, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 12);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(vba1Var, uba1Var2, i, (byte) 22);
        }
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
