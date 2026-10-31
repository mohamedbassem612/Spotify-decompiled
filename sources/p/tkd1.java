package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tkd1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ tob1 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkd1(hdk hdkVar, ven0 ven0Var, gv21 gv21Var, float f, iu30 iu30Var, boolean z, float f2, Function0 function0) {
        super(3);
        this.f = hdkVar;
        this.e = ven0Var;
        this.g = gv21Var;
        this.c = f;
        this.h = iu30Var;
        this.b = z;
        this.d = f2;
        this.i = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        vgh1 vgh1Var;
        int i;
        boolean z;
        int i2;
        byte b = this.a;
        float f = this.c;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.i;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.h;
        switch (b) {
            case 0:
                i2c i2cVar = (i2c) obj;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj7;
                m4c m4cVar = fkj0.X;
                gv21 gv21Var = (gv21) obj5;
                hdk hdkVar = (hdk) obj6;
                boolean z2 = p3v.b(i2cVar.d(), 600.0f) >= 0;
                float f2 = z2 ? 270.0f : 201.0f;
                long jG = fc11.G(z2 ? 40 : 32);
                long jG2 = fc11.G(z2 ? 18 : 13);
                p3v p3vVarY = pap1.y(new p3v(i2cVar.d() * (hdkVar.z ? 0.3f : 0.25f)), new p3v(172.0f));
                float f3 = p3vVarY.a;
                float f4 = rck.b;
                ald1 ald1Var = new ald1(f3);
                qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), f2);
                boolean z3 = gv21Var.d;
                tob1 tob1Var = this.e;
                qim0 qim0VarQ = i1p1.q(zr7.i(pap1.r(qim0VarH, tob1Var, z3, 16), new vpw(gv21Var.b, hdkVar.l, ald1Var, tob1Var)), ald1Var);
                u7h u7hVar = hdkVar.k;
                if (u7hVar == null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-104984284);
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(x340Var2).a.b.a();
                    x340Var2.r(false);
                    j = jA;
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-104986113);
                    x340Var3.r(false);
                    j = u7hVar.a;
                }
                qim0 qim0VarI = zr7.i(p3f0.c(dug.f(qim0VarQ, j, d4o1.a), this.e, gv21Var.c, null, new p3v(24.0f), p3vVarY, 0.0f, 36), new km60((byte) 0, f, tob1Var, gv21Var.a));
                x340 x340Var4 = x340Var;
                boolean zD = x340Var4.d(f3) | x340Var4.i(hdkVar);
                Object objT = x340Var4.T();
                if (zD || objT == m4cVar) {
                    objT = new ef6(f3, hdkVar, (byte) 5);
                    x340Var4.s0(objT);
                }
                qim0 qim0VarS = exd0.s(qim0VarI, (iu30) objT);
                boolean zG = x340Var4.g(iu30Var);
                Object objT2 = x340Var4.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new pwc1(iu30Var, (byte) 5);
                    x340Var4.s0(objT2);
                }
                qim0 qim0VarX = bin.x(qim0VarS, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15);
                iu30 iu30Var2 = (iu30) obj7;
                Function0 function0 = (Function0) obj4;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarX);
                hzj.A.getClass();
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(hmb0.t1);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC, x340Var4, y580.O0);
                nko1.H(xos0VarM, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE, x340Var4, y580.Y);
                vyo1.o(hdkVar, iu30Var2, jG, jG2, f3, this.b, this.d, function0, x340Var4, 0);
                x340Var4.r(true);
                return rih1Var;
            case 1:
                i2c i2cVar2 = (i2c) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                vzq0 vzq0Var = (vzq0) obj5;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var5.g(i2cVar2) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var6.b0();
                    return rih1Var;
                }
                float fD = i2cVar2.d();
                int i3 = ((Configuration) x340Var6.k(AndroidCompositionLocals_androidKt.a)).orientation == 2 ? 2 : 1;
                int iC = l1d.C(i3);
                if (iC != 0) {
                    if (iC == 1) {
                        vgh1Var = vgh1.c;
                    } else {
                        eg.o();
                    }
                    return null;
                }
                vgh1Var = vgh1.d;
                int i4 = 3;
                if (p3v.b(fD, 250.0f) <= 0) {
                    i = 1;
                } else if (p3v.b(fD, 420.0f) <= 0) {
                    i = 2;
                } else if (p3v.b(fD, 560.0f) <= 0) {
                    i = 3;
                } else {
                    i = p3v.b(fD, vgh1Var.a) <= 0 ? 4 : 5;
                }
                int i5 = (i3 == 2 && i == 5 && this.b) ? 2 : 1;
                float fB = vgh1Var.b(i5);
                float fA = vgh1Var.a(i);
                int iC2 = l1d.C(i);
                if (iC2 != 0 && iC2 != 1) {
                    if (iC2 == 2 || iC2 == 3 || iC2 == 4) {
                        z = true;
                    } else {
                        eg.o();
                    }
                    return null;
                }
                z = false;
                int iC3 = l1d.C(i);
                if (iC3 == 0) {
                    i2 = 1;
                } else {
                    if (iC3 != 1 && iC3 != 2) {
                        if (iC3 == 3 || iC3 == 4) {
                            i2 = 3;
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    i2 = 2;
                }
                int iC4 = l1d.C(i);
                if (iC4 != 0) {
                    if (iC4 == 1 || iC4 == 2) {
                        i4 = 6;
                    } else if (iC4 == 3) {
                        i4 = 9;
                    } else {
                        if (iC4 != 4) {
                            eg.o();
                            return null;
                        }
                        i4 = 15;
                    }
                }
                wgh1 wgh1Var = new wgh1(i5, i3, i, fB, fA, z, i2, i4);
                vnd1 vnd1Var = (vnd1) obj6;
                mev mevVar = (mev) vnd1Var.c;
                dh30 dh30Var = (dh30) vnd1Var.b;
                qim0 qim0VarW = u291.w(nim0Var, 0.0f, fB);
                float fD2 = vzq0Var.d() + f;
                float fA2 = vzq0Var.a();
                float f5 = this.d;
                puo1.e((a470) obj7, wgh1Var, mevVar, dh30Var, qim0VarW, (upb0) obj4, new zzq0(f5, fD2, f5, fA2 + f5), 1.0f - ((Number) this.e.getValue()).floatValue(), x340Var6, 0);
                return rih1Var;
            default:
                vzq0 vzq0Var2 = (vzq0) obj;
                x340 x340Var7 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var7.g(vzq0Var2) ? 4 : 2;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    w2g0.c(u291.d((qim0) obj6, 1.0f), een.h, apo.r(1461565047, new tkd1(this.b, (vnd1) obj5, this.c, vzq0Var2, this.d, (a470) obj7, (upb0) obj4, this.e), x340Var8), x340Var8, 3120, 4);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkd1(qim0 qim0Var, boolean z, vnd1 vnd1Var, float f, float f2, a470 a470Var, upb0 upb0Var, tob1 tob1Var) {
        super(3);
        this.f = qim0Var;
        this.b = z;
        this.g = vnd1Var;
        this.c = f;
        this.d = f2;
        this.h = a470Var;
        this.i = upb0Var;
        this.e = tob1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkd1(boolean z, vnd1 vnd1Var, float f, vzq0 vzq0Var, float f2, a470 a470Var, upb0 upb0Var, tob1 tob1Var) {
        super(3);
        this.b = z;
        this.f = vnd1Var;
        this.c = f;
        this.g = vzq0Var;
        this.d = f2;
        this.h = a470Var;
        this.i = upb0Var;
        this.e = tob1Var;
    }
}
