package p;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qf6 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf6(xd6 xd6Var, wj31 wj31Var, rk41 rk41Var, boolean z, boolean z2, int i, List list, qe6 qe6Var) {
        super(3);
        this.e = xd6Var;
        this.f = wj31Var;
        this.g = rk41Var;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.h = list;
        this.i = qe6Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function0 function0;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        boolean z = this.c;
        Object obj6 = this.i;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (b) {
            case 0:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                i2c i2cVar = (i2c) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                xd6 xd6Var = (xd6) obj8;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    float fD = i2cVar.d();
                    float fC = i2cVar.c();
                    cr31 cr31Var = sf6.a;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarB = i2cVar.b(nim0Var);
                    boolean zG = x340Var2.g(xd6Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new pf6(xd6Var, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    Function0 function1 = (Function0) objT;
                    boolean zG2 = x340Var2.g(xd6Var);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new pf6(xd6Var, (byte) 1);
                        x340Var2.s0(objT2);
                    }
                    lgo1.a(cr31Var, 2, fD, qim0VarB, function1, (Function0) objT2, (Function0) null, (Function0) null, (Function0) null, (Function0) null, x340Var2, 54, 960);
                    qim0 qim0VarE = d1u.E(sf6.b, sf6.c, i1p1.q(i2cVar.b(nim0Var), cr31Var), cr31Var);
                    Object objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        objT3 = t16.e1;
                        x340Var2.s0(objT3);
                    }
                    qim0 qim0VarB2 = s161.b(qim0VarE, true, (iu30) objT3);
                    zj31 zj31Var = (wj31) obj7;
                    rk41 rk41Var = (rk41) obj5;
                    List list = (List) obj4;
                    qe6 qe6Var = (qe6) obj6;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB2);
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
                    nko1.H(gfh0VarC, x340Var2, lljVar4);
                    nko1.H(xos0VarM, x340Var2, lljVar3);
                    x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar);
                    int iB = p3v.b(fD, 0.0f);
                    h2c h2cVar = h2c.a;
                    if (iB <= 0 || p3v.b(fC, 0.0f) <= 0) {
                        x340Var2.i0(-972667959);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-973058125);
                        zj31Var.b(new jj31((!rk41Var.a && this.b && z) ? false : true, this.d, h2cVar.b(nim0Var), 0, (jfe) null, list, (Map) null, false, false, (Function0) null, (iu30) null, 4056), x340Var2, 8);
                        x340Var2.r(false);
                    }
                    qim0 qim0VarY = uyn1.y(h2cVar.b(nim0Var), sf6.d, sf6.e);
                    era eraVar = een.Q0;
                    mbh mbhVarA = jbh.a(h36.g, eraVar, x340Var2, 54);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarY);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, lljVar4);
                    nko1.H(xos0VarM2, x340Var2, lljVar3);
                    x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
                    nko1.H(qim0VarE3, x340Var2, lljVar);
                    qmo1.a(qe6Var.b, new wnb0(1.0f, false), x340Var2, 8);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    mbh mbhVarA2 = jbh.a(new d36(sf6.f, true, new um5(false)), eraVar, x340Var2, 54);
                    int iHashCode3 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM3 = x340Var2.m();
                    qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarF);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA2, x340Var2, lljVar4);
                    nko1.H(xos0VarM3, x340Var2, lljVar3);
                    x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                    nko1.H(qim0VarE4, x340Var2, lljVar);
                    x340Var2.i0(1379164258);
                    for (pe6 pe6Var : qe6Var.a) {
                        jw31 jw31VarA = ew31.a(new d36(sf6.g, true, new um5(false)), een.N0, x340Var2, 54);
                        int iHashCode4 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM4 = x340Var2.m();
                        qim0 qim0VarE5 = zr7.E(x340Var2, nim0Var);
                        hzj.A.getClass();
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(jw31VarA, x340Var2, lljVar4);
                        nko1.H(xos0VarM4, x340Var2, lljVar3);
                        x0d.q(iHashCode4, x340Var2, lljVar2, x340Var2);
                        nko1.H(qim0VarE5, x340Var2, lljVar);
                        qgo1.f((vnr0) pe6Var.a.invoke(x340Var2, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 62);
                        qgo1.f((vnr0) pe6Var.b.invoke(x340Var2, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 62);
                        x340Var2.r(true);
                    }
                    x340Var2.r(false);
                    x340Var2.r(true);
                    x340Var2.r(true);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                bmf0 bmf0Var = (bmf0) obj8;
                Boolean bool = (Boolean) obj7;
                float fFloatValue = ((Number) ((tob1) obj6).getValue()).floatValue();
                if (z) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(-507109374);
                    x340Var4.r(false);
                    function0 = (Function0) obj5;
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(-507062750);
                    float fFloatValue2 = ((Number) ((tob1) obj4).getValue()).floatValue();
                    boolean zD = x340Var5.d(fFloatValue2);
                    Object objT4 = x340Var5.T();
                    if (zD || objT4 == fkj0.X) {
                        objT4 = new xnn((byte) 2, fFloatValue2);
                        x340Var5.s0(objT4);
                    }
                    function0 = (Function0) objT4;
                    x340Var5.r(false);
                }
                wlf0.b(bmf0Var, bool, this.b, fFloatValue, function0, this.c, this.d > 0, x340Var3, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf6(bmf0 bmf0Var, Boolean bool, boolean z, boolean z2, Function0 function0, tob1 tob1Var, int i, tob1 tob1Var2) {
        super(3);
        this.e = bmf0Var;
        this.f = bool;
        this.b = z;
        this.c = z2;
        this.g = function0;
        this.h = tob1Var;
        this.d = i;
        this.i = tob1Var2;
    }
}
