package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ala extends f311 {
    public final ska a;
    public final boolean b;
    public final vhd0 c;
    public boolean d;

    public ala(ska skaVar, boolean z, vhd0 vhd0Var) {
        this.a = skaVar;
        this.b = z;
        this.c = vhd0Var;
    }

    public static final ven0 e(rk41 rk41Var, ala alaVar, int i, b0k b0kVar) {
        return v8r.r(f4i1.c(i, "quizRow_"), (i * 100) + 200, rk41Var.a, alaVar.b, (Function0) null, b0kVar, 0, 16);
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        tka tkaVar;
        ven0 ven0Var;
        int i3;
        byte b;
        byte b2;
        boolean z;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-272044533);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = this.d;
            rih1 rih1Var = rih1.a;
            if (z2) {
                x340Var.i0(124736887);
                boolean z3 = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z3 || objT == obj) {
                    objT = new to1(function0, (lnm) null, (byte) 4);
                    x340Var.s0(objT);
                }
                qxd0.t(rih1Var, x340Var, (vu30) objT);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    tkaVar = new tka(this, i2cVar, rk41Var, function0, i, (byte) 0);
                }
            } else {
                x340Var.i0(124798391);
                x340Var.r(false);
                Object objT2 = x340Var.T();
                if (objT2 == obj) {
                    objT2 = yda.Y;
                    x340Var.s0(objT2);
                }
                qxd0.i(rih1Var, (iu30) objT2, x340Var);
                float fC = i2cVar.c() * 0.87f;
                Object objT3 = x340Var.T();
                if (objT3 == obj) {
                    objT3 = v8r.q((Object) null);
                    x340Var.s0(objT3);
                }
                ven0 ven0Var2 = (ven0) objT3;
                boolean zI = ((i2 & 896) == 256) | x340Var.i(this);
                Object objT4 = x340Var.T();
                if (zI || objT4 == obj) {
                    objT4 = new z77(this, function0, (byte) 28);
                    x340Var.s0(objT4);
                }
                Function0 function1 = (Function0) objT4;
                if (ven0Var2.getValue() != null) {
                    x340Var.i0(125194757);
                    b = 2;
                    ven0Var = ven0Var2;
                    zod.S(new hsi1("QuizDelayAfterTap", Float.valueOf(0.0f), Float.valueOf(1.0f), irn1.o0(500, 0, mlv.d, 2), rno1.a), rk41Var.a, this.b, function1, x340Var, 8, 0);
                    i3 = 0;
                    x340Var.r(false);
                } else {
                    ven0Var = ven0Var2;
                    i3 = 0;
                    b = 2;
                    x340Var.i0(125611831);
                    x340Var.r(false);
                }
                i9p1.f(this.c, x340Var, i3);
                ven0 ven0VarS = v8r.s(x340Var.k(yhm1.a), x340Var);
                Object objT5 = x340Var.T();
                ska skaVar = this.a;
                if (objT5 == obj) {
                    objT5 = i9p1.s(skaVar.d, ven0Var, chz0.a, new zka(ven0VarS, this, b));
                    x340Var.s0(objT5);
                }
                dhz0 dhz0Var = (dhz0) objT5;
                Object objT6 = x340Var.T();
                if (objT6 == obj) {
                    b2 = 1;
                    objT6 = i9p1.s(skaVar.e, ven0Var, chz0.b, new zka(ven0VarS, this, (byte) 1));
                    x340Var.s0(objT6);
                } else {
                    b2 = 1;
                }
                dhz0 dhz0Var2 = (dhz0) objT6;
                Object objT7 = x340Var.T();
                if (objT7 == obj) {
                    objT7 = i9p1.s(skaVar.f, ven0Var, chz0.c, new zka(ven0VarS, this, (byte) 0));
                    x340Var.s0(objT7);
                }
                dhz0 dhz0Var3 = (dhz0) objT7;
                byte b3 = b2;
                ven0 ven0VarR = v8r.r("quizTitle", 100, rk41Var.a, this.b, (Function0) null, x340Var, 54, 16);
                ven0 ven0VarE = e(rk41Var, this, 0, x340Var);
                ven0 ven0VarE2 = e(rk41Var, this, b3, x340Var);
                tob1 tob1VarE = e(rk41Var, this, 2, x340Var);
                tob1 tob1VarE2 = e(rk41Var, this, 3, x340Var);
                tob1 tob1VarE3 = e(rk41Var, this, 4, x340Var);
                ven0 ven0VarY = h7w.y(x340Var);
                Object objT8 = x340Var.T();
                if (objT8 == obj) {
                    objT8 = pzm.i(x340Var);
                }
                lz20 lz20Var = (lz20) objT8;
                if (((Boolean) ven0VarY.getValue()).booleanValue()) {
                    x340Var.i0(127442660);
                    Boolean boolValueOf = Boolean.valueOf(rk41Var.a);
                    byte b4 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(rk41Var))) ? b3 : (byte) 0;
                    Object objT9 = x340Var.T();
                    if (b4 != 0 || objT9 == obj) {
                        z = false;
                        objT9 = new uka(rk41Var, lz20Var, null, (byte) 0);
                        x340Var.s0(objT9);
                    } else {
                        z = false;
                    }
                    qxd0.t(boolValueOf, x340Var, (vu30) objT9);
                    x340Var.r(z);
                } else {
                    ven0VarE = ven0VarE;
                    x340Var.i0(127737687);
                    x340Var.r(false);
                }
                vnr0 vnr0Var = (vnr0) skaVar.a.invoke(x340Var, 0);
                vnr0 vnr0Var2 = (vnr0) skaVar.c.invoke(x340Var, 0);
                String str = vnr0Var.a;
                if (!(vnr0Var.c instanceof jor0)) {
                    str = null;
                }
                String strK = str != null ? l1d.k(skaVar.b, str, " ") : null;
                String str2 = vnr0Var2.a;
                if (!(vnr0Var2.c instanceof jor0)) {
                    str2 = null;
                }
                String strY0 = o7h.y0(f46.i0(new String[]{strK, str2}), ". ", (String) null, (String) null, (iu30) null, 62);
                int iI0 = ((wat) x340Var.k(t4k.h)).i0(84.0f);
                tob1[] tob1VarArr = new tob1[3];
                tob1VarArr[0] = tob1VarE;
                tob1VarArr[b3] = tob1VarE2;
                tob1VarArr[2] = tob1VarE3;
                List listM = p7h.M(tob1VarArr);
                Object objT10 = x340Var.T();
                if (objT10 == obj) {
                    objT10 = yv91.a(new yka(tob1VarE3, ven0Var, (byte) 0));
                    x340Var.s0(objT10);
                }
                tob1 tob1Var = (tob1) objT10;
                j2i j2iVarR = apo.r(-1695280273, new vka(vnr0Var, (byte) 0), x340Var);
                j2i j2iVarR2 = apo.r(-922238322, new vka(vnr0Var2, b3), x340Var);
                j2i j2iVarR3 = apo.r(-149196371, new cka(this, b3), x340Var);
                qim0 qim0VarA = i2cVar.a(u291.h(u291.f(nim0.a, 1.0f), fC), een.X);
                uwr uwrVar = cbx.a;
                float f = cbx.b(x340Var).b.a;
                float f2 = cbx.b(x340Var).b.a;
                cvx cvxVar = cbx.b(x340Var).b;
                i9p1.n(iI0, j2iVarR, j2iVarR2, j2iVarR3, uyn1.B(qim0VarA, f, 0.0f, f2, 16.0f, 2), apo.r(815404381, new xka(lz20Var, strY0, ven0VarE2, vnr0Var2, ven0VarR, vnr0Var, this, rk41Var, ven0VarE, dhz0Var, dhz0Var2, dhz0Var3, ven0Var, listM, tob1Var), x340Var), x340Var, 200112);
                x340Var = x340Var;
            }
            h311VarV.d = tkaVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            tkaVar = new tka(this, i2cVar, rk41Var, function0, i, (byte) 1);
            h311VarV.d = tkaVar;
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return pk41.a;
    }
}
