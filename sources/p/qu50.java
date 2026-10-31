package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qu50 implements o1i {
    public final /* synthetic */ byte a = 0;
    public final lzn0 b;
    public final bcl1 c;

    public qu50(lzn0 lzn0Var, bcl1 bcl1Var) {
        this.b = lzn0Var;
        this.c = bcl1Var;
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((pu50) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                d((xtn0) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public void c(pu50 pu50Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        pu50 pu50Var2 = pu50Var;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1809448486);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(pu50Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 112;
            boolean zI = x340Var.i(this) | (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar)));
            Object objT = x340Var.T();
            if (zI || objT == obj) {
                objT = new fz40(this, o0iVar, (byte) 12);
                x340Var.s0(objT);
            }
            int i4 = i2 & 14;
            w0o1.b(pu50Var2, (iu30) objT, qim0Var, x340Var, i2 & 910);
            boolean z = i4 == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == obj) {
                objT2 = new ArrayList();
                x340Var.s0(objT2);
            }
            List list = (List) objT2;
            boolean zI2 = (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.i(this) | x340Var.g(list) | (i4 == 4);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == obj) {
                lhx lhxVar = new lhx(this, o0iVar, list, pu50Var2, (byte) 13);
                pu50Var2 = pu50Var2;
                x340Var.s0(lhxVar);
                objT3 = lhxVar;
            }
            oto1.c(pu50Var2, o0iVar, (iu30) objT3, x340Var, i4 | 64 | i3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, this, pu50Var2, o0iVar, qim0Var, (byte) 9);
        }
    }

    public void d(xtn0 xtn0Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2083992166);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(xtn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            lfc lfcVar = xtn0Var.d;
            aec aecVar = xtn0Var.f;
            String str = xtn0Var.a;
            String str2 = xtn0Var.c;
            boolean zI = ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.i(this) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new dt90(this, o0iVar, xtn0Var, (byte) 28);
                x340Var.s0(objT);
            }
            vbe.u(lfcVar, aecVar, str, str2, xtn0Var.e, new gbx(z50.c, (Function0) objT), (qim0) null, (yf) null, x340Var, 32768, 192);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, this, xtn0Var, o0iVar, qim0Var, (byte) 12);
        }
    }

    public qu50(bcl1 bcl1Var, lzn0 lzn0Var) {
        this.c = bcl1Var;
        this.b = lzn0Var;
    }
}
