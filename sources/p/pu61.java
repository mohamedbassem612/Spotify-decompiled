package p;

import android.app.Activity;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pu61 {
    public final Activity a;
    public final lzn0 b;
    public final kv61 c;
    public final qyj d;
    public final lu61 e;
    public final a1r0 f;
    public final los g;

    public pu61(Activity activity, lzn0 lzn0Var, kv61 kv61Var, qyj qyjVar, lu61 lu61Var, a1r0 a1r0Var, los losVar) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = kv61Var;
        this.d = qyjVar;
        this.e = lu61Var;
        this.f = a1r0Var;
        this.g = losVar;
    }

    public final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        qim0 qim0Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1095290614);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 48 | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            u85 u85Var = (erl1) x340Var.k(szf0.b);
            if (u85Var == null) {
                x340Var.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var).g;
            } else {
                x340Var.i0(-241885792);
            }
            x340Var.r(false);
            bgc0 bgc0Var = new bgc0(u85Var, 16);
            qim0 qim0Var5 = nim0.a;
            qim0 qim0VarJ = too1.j(qim0Var5, bgc0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarJ);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (this.e.c) {
                x340Var.i0(234422983);
                qim0Var3 = qim0Var5;
                bzn1.e((qim0) null, apo.r(181130489, new jt41(this, str, (byte) 15), x340Var), false, (vu30) null, rgr0.a, (ngr0) null, (ygr0) null, (Function0) null, x340Var, 48, 237);
                x340Var.r(false);
                qim0Var4 = null;
            } else {
                qim0Var3 = qim0Var5;
                qim0Var4 = null;
                x340Var.i0(234528848);
                c(i2 & 910, str, x340Var, null);
                x340Var.r(false);
            }
            rqo1.g(0, 1, x340Var, qim0Var4);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(this, str, qim0Var2, i, (byte) 26);
        }
    }

    public final void b(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1205676488);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            gfx.b(3, apo.r(-814860237, new j2r0(j2iVar, (byte) 14), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(this, j2iVar, i, (byte) 16);
        }
    }

    public final void c(int i, String str, b0k b0kVar, qim0 qim0Var) {
        String str2;
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1941136839);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = i | (x340Var.g(str2) ? 4 : 2);
        } else {
            str2 = str;
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = rq61.i;
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(s161.b(qim0Var3, true, (iu30) objT), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str2, uyn1.y(qim0VarF, 16.0f, 12.0f), cbx.d(x340Var).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3 & 14, 0, 2024);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, str, qim0Var2, i, (byte) 14);
        }
    }

    public final p2r0 d(String str, List list) {
        return this.d.a(new j2i(-1481147365, new ou61(this, str, list, (byte) 1), true));
    }
}
