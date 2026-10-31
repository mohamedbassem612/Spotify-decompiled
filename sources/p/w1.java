package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(float f, jlw0 jlw0Var, String str, String str2, int i, int i2) {
        super(3);
        this.b = f;
        this.g = jlw0Var;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        lee1 lee1Var;
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                uwr uwrVar = cbx.a;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                Object obj5 = fkj0.X;
                if (this.e == 1) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1249208503);
                    lee1Var = cbx.d(x340Var2).e;
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1249152951);
                    lee1Var = cbx.d(x340Var3).g;
                    x340Var3.r(false);
                }
                nim0 nim0Var = nim0.a;
                qim0 qim0VarB = uyn1.B(nim0Var, this.b, 0.0f, 0.0f, 0.0f, 14);
                x340 x340Var4 = x340Var;
                String str = this.c;
                boolean zG = x340Var4.g(str);
                j06 j06Var = x340Var4.a;
                Object objT = x340Var4.T();
                if (zG || objT == obj5) {
                    objT = new v1(str, (byte) 0);
                    x340Var4.s0(objT);
                }
                qim0 qim0VarB2 = s161.b(qim0VarB, true, (iu30) objT);
                cyn cynVar = (cyn) obj4;
                n4k n4kVar = hmb0.t1;
                int i = this.f;
                if (cynVar == null || i == 0) {
                    x340Var4.i0(-1248611691);
                    int i2 = i == 0 ? -1 : u1.a[l1d.C(i)];
                    if (i2 == -1) {
                        x340Var4.i0(-1247545663);
                        uwo1.e(this.d, qim0VarB2, lee1Var, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var4, 0, 0, 1720);
                        z = false;
                        x340Var4.r(false);
                    } else if (i2 == 1) {
                        x340Var4.i0(-1248566896);
                        jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var4, 0);
                        int iHashCode = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM = x340Var4.m();
                        qim0 qim0VarE = zr7.E(x340Var4, qim0VarB2);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(jw31VarA, x340Var4, lljVar4);
                        nko1.H(xos0VarM, x340Var4, lljVar3);
                        x0d.q(iHashCode, x340Var4, lljVar2, x340Var4);
                        nko1.H(qim0VarE, x340Var4, lljVar);
                        uwo1.e(this.d, null, lee1Var, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var4, 0, 0, 1722);
                        cvx cvxVar = cbx.b(x340Var4).b;
                        op71.g(x340Var4, u291.v(nim0Var, 4.0f));
                        zov0 zov0Var = cbx.b(x340Var4).g;
                        w0h1.a(wtx.c, isl.a, u291.r(nim0Var, 16.0f), ((wex) ((gmt) zex.a.c).c).b, 0L, true, x340Var4, wtx.d | 196656, 16);
                        x340Var4.r(true);
                        z = false;
                        x340Var4.r(false);
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw p3d1.k(x340Var4, 1622290189, false);
                        }
                        z = false;
                        x340Var4.i0(-1247751441);
                        pro1.h(this.d, lee1Var, qim0VarB2, x340Var4, 0);
                        x340Var4.r(false);
                    }
                    x340Var4.r(z);
                } else {
                    x340Var4.i0(-1248863535);
                    Object objT2 = x340Var4.T();
                    if (objT2 == obj5) {
                        objT2 = new dyn();
                        x340Var4.s0(objT2);
                    }
                    dyn dynVar = (dyn) objT2;
                    cyn cynVar2 = (cyn) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB2);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC, x340Var4, lljVar4);
                    nko1.H(xos0VarM2, x340Var4, lljVar3);
                    x0d.q(iHashCode2, x340Var4, lljVar2, x340Var4);
                    nko1.H(qim0VarE2, x340Var4, lljVar);
                    otw.c(dynVar, cynVar2, (qim0) null, (ipb1) null, x340Var4, 72, 12);
                    x340Var4.r(true);
                    x340Var4.r(false);
                }
                return rih1Var;
            default:
                i2c i2cVar = (i2c) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var5.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    n9p1.k((jlw0) obj4, zjy.j(i2cVar.c(), new p3v(this.b)).a, this.c, this.d, this.e, this.f, u291.f(nim0.a, 1.0f), x340Var6, 1572864);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(int i, float f, String str, cyn cynVar, int i2, String str2) {
        super(3);
        this.e = i;
        this.b = f;
        this.c = str;
        this.g = cynVar;
        this.f = i2;
        this.d = str2;
    }
}
