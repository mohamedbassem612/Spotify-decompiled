package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dyx implements o4e1 {
    public final /* synthetic */ zxx N0;
    public final /* synthetic */ e6e1 O0;
    public final /* synthetic */ hdn0 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ y7e1 Z;
    public final /* synthetic */ vzq0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ tob1 e;
    public final /* synthetic */ lee1 f;
    public final /* synthetic */ tob1 g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ vu30 i;
    public final /* synthetic */ float t;

    public dyx(vzq0 vzq0Var, boolean z, boolean z2, tob1 tob1Var, tob1 tob1Var2, lee1 lee1Var, tob1 tob1Var3, vu30 vu30Var, vu30 vu30Var2, float f, hdn0 hdn0Var, String str, y7e1 y7e1Var, zxx zxxVar, e6e1 e6e1Var) {
        this.a = vzq0Var;
        this.b = z;
        this.c = z2;
        this.d = tob1Var;
        this.e = tob1Var2;
        this.f = lee1Var;
        this.g = tob1Var3;
        this.h = vu30Var;
        this.i = vu30Var2;
        this.t = f;
        this.X = hdn0Var;
        this.Y = str;
        this.Z = y7e1Var;
        this.N0 = zxxVar;
        this.O0 = e6e1Var;
    }

    public final void f(int i, j2i j2iVar, b0k b0kVar) {
        fra fraVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(354912255);
        int i2 = (x340Var.g(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            long j = ((u7h) this.d.getValue()).a;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(nim0.a, j, er31.b(4.0f));
            long j2 = ((u7h) this.e.getValue()).a;
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarW = uyn1.w(d1u.E(1.0f, j2, qim0VarF, er31.b(4.0f)), this.a);
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            boolean z = this.b;
            if (z) {
                fraVar = een.O0;
            } else {
                fraVar = this.c ? een.N0 : een.Z;
            }
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            b3o1.j(this.f, ((u7h) this.g.getValue()).a, apo.r(1103459183, new cyx(this.h, this.i, z, this.c, this.t, this.X, j2iVar, this.Y, this.Z, this.N0, this.O0), x340Var), x340Var, 384, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ozw(this, j2iVar, i, (byte) 18);
        }
    }
}
