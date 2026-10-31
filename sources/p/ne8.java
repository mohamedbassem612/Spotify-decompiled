package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ne8 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ w61 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne8(vu30 vu30Var, w61 w61Var, Function0 function0, boolean z, float f, byte b) {
        super(3);
        this.a = b;
        this.b = vu30Var;
        this.c = w61Var;
        this.d = function0;
        this.e = z;
        this.f = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i2c i2cVar = (i2c) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                w61 w61Var = this.c;
                float f = w61Var.a;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    vu30 vu30Var = this.b;
                    boolean z = vu30Var != null && p3v.b(i2cVar.c(), f) >= 0;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    boolean zH = x340Var2.h(z);
                    Function0 function0 = this.d;
                    boolean zG = zH | x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new me8(z, function0, (lnm) null, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    qxd0.t(boolValueOf, x340Var2, (vu30) objT);
                    if (vu30Var != null && p3v.b(i2cVar.c(), f) >= 0) {
                        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                        int iHashCode = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM = x340Var2.m();
                        qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        boolean z2 = x340Var2.S;
                        n4k n4kVar = hmb0.t1;
                        if (z2) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        llj lljVar = y580.O0;
                        nko1.H(mbhVarA, x340Var2, lljVar);
                        llj lljVar2 = y580.N0;
                        nko1.H(xos0VarM, x340Var2, lljVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        llj lljVar3 = y580.R0;
                        nko1.H(numValueOf, x340Var2, lljVar3);
                        nko1.F(x340Var2);
                        llj lljVar4 = y580.Y;
                        nko1.H(qim0VarE, x340Var2, lljVar4);
                        boolean z3 = this.e;
                        float f2 = this.f;
                        if (z3) {
                            x340Var2.i0(-126655436);
                        } else {
                            v8i0.i(f2, 1381386143, x340Var2, x340Var2, nim0Var);
                        }
                        x340Var2.r(false);
                        qim0 qim0VarD = u291.d(u291.i(nim0Var, f, w61Var.b), 1.0f);
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode2 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM2 = x340Var2.m();
                        qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarD);
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(gfh0VarC, x340Var2, lljVar);
                        nko1.H(xos0VarM2, x340Var2, lljVar2);
                        x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                        nko1.H(qim0VarE2, x340Var2, lljVar4);
                        us71.j(0, vu30Var, x340Var2, true);
                        if (z3) {
                            v8i0.i(f2, 1381394527, x340Var2, x340Var2, nim0Var);
                        } else {
                            x340Var2.i0(-126395532);
                        }
                        x340Var2.r(false);
                        x340Var2.r(true);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                nbh nbhVar = (nbh) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.g(nbhVar) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    qim0 qim0VarA = nbhVar.a(1.0f, u291.f(nim0Var, 1.0f), false);
                    Object objT2 = x340Var4.T();
                    if (objT2 == fkj0.X) {
                        objT2 = oc8.Y;
                        x340Var4.s0(objT2);
                    }
                    w2g0.c(s161.a(qim0VarA, (iu30) objT2), (tl3) null, apo.r(1248751416, new ne8(this.b, this.c, this.d, this.e, this.f, (byte) 0), x340Var4), x340Var4, 3072, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
