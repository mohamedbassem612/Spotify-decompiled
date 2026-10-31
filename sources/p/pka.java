package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pka extends f311 {
    public final nka a;
    public final boolean b;
    public final vhd0 c;
    public final ok41 d = new ok41(1500);
    public boolean e;

    public pka(nka nkaVar, boolean z, vhd0 vhd0Var) {
        this.a = nkaVar;
        this.b = z;
        this.c = vhd0Var;
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        h311 h311VarV;
        oka okaVar;
        ven0 ven0VarR;
        byte b;
        Object objInvoke;
        m4c m4cVar = fkj0.X;
        Float fValueOf = Float.valueOf(0.0f);
        nka nkaVar = this.a;
        hla hlaVar = nkaVar.c;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-823461781);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(rk41Var) : x340Var2.i(rk41Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(this) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = this.e;
            rih1 rih1Var = rih1.a;
            if (z) {
                x340Var2.i0(1103408919);
                boolean z2 = (i2 & 896) == 256;
                Object objT = x340Var2.T();
                if (z2 || objT == m4cVar) {
                    objT = new to1(function0, (lnm) null, (byte) 3);
                    x340Var2.s0(objT);
                }
                qxd0.t(rih1Var, x340Var2, (vu30) objT);
                x340Var2.r(false);
                h311VarV = x340Var2.v();
                if (h311VarV == null) {
                    return;
                } else {
                    okaVar = new oka(this, i2cVar, rk41Var, function0, i, (byte) 0);
                }
            } else {
                x340Var2.i0(1103470423);
                x340Var2.r(false);
                boolean zI = x340Var2.i(this) | ((i2 & 896) == 256);
                Object objT2 = x340Var2.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new z77(this, function0, (byte) 27);
                    x340Var2.s0(objT2);
                }
                Function0 function1 = (Function0) objT2;
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = yda.X;
                    x340Var2.s0(objT3);
                }
                qxd0.i(rih1Var, (iu30) objT3, x340Var2);
                e9p1.e(this.c, ((Boolean) hlaVar.invoke()).booleanValue(), x340Var2, 0);
                ven0 ven0VarI = g9p1.I("feedbackEntry", rka.a, rk41Var.a, this.b, (Function0) null, x340Var2, 16);
                if (this.b) {
                    x340Var2.i0(1104166404);
                    ven0VarR = zod.R(new hsi1("feedbackFadeOut", fValueOf, Float.valueOf(1.0f), rka.b, rno1.a), rk41Var.a, function1, x340Var2, 8, 0);
                    x340Var2 = x340Var2;
                    x340Var2.r(false);
                    b = 2;
                } else {
                    x340Var2.i0(1104574953);
                    Object objT4 = x340Var2.T();
                    if (objT4 == m4cVar) {
                        objT4 = v8r.q(fValueOf);
                        x340Var2.s0(objT4);
                    }
                    ven0VarR = (tob1) objT4;
                    b = 2;
                    zod.R(new hsi1("FeedbackTimer", 0, 1500, irn1.o0(1500, 0, mlv.d, 2), rno1.b), rk41Var.a, function1, x340Var2, 8, 0);
                    x340Var2.r(false);
                }
                if (((Boolean) hlaVar.invoke()).booleanValue()) {
                    x340Var2.i0(-1072730180);
                    objInvoke = nkaVar.a.invoke(x340Var2, 0);
                } else {
                    x340Var2.i0(-1072729286);
                    objInvoke = nkaVar.b.invoke(x340Var2, r18);
                }
                vnr0 vnr0Var = (vnr0) objInvoke;
                x340Var2.r(false);
                qim0 qim0VarF = u291.f(i2cVar.a(nim0.a, een.h), 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).b.a, 0.0f, b, qim0VarF);
                boolean zG = x340Var2.g(ven0VarI) | x340Var2.g(ven0VarR);
                Object objT5 = x340Var2.T();
                if (zG || objT5 == m4cVar) {
                    objT5 = new dy(ven0VarI, ven0VarR, b);
                    x340Var2.s0(objT5);
                }
                x340 x340Var3 = x340Var2;
                qgo1.f(vnr0Var, i541.C(qim0VarZ, (iu30) objT5), new a0e1(3), 0, false, (iu30) null, x340Var3, 8, 56);
                x340Var = x340Var3;
            }
            h311VarV.d = okaVar;
        }
        x340Var = x340Var2;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            okaVar = new oka(this, i2cVar, rk41Var, function0, i, (byte) 1);
            h311VarV.d = okaVar;
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.d;
    }
}
