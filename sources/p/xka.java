package p;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xka extends hab0 implements xu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object O0;
    public final /* synthetic */ Object P0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xka(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
        this.X = obj10;
        this.Y = obj11;
        this.Z = obj12;
        this.N0 = obj13;
        this.O0 = obj14;
        this.P0 = obj15;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        byte b = this.a;
        Object obj4 = this.N0;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        Object obj7 = this.X;
        Object obj8 = this.t;
        Object obj9 = this.i;
        Object obj10 = this.h;
        Object obj11 = this.g;
        Object obj12 = this.f;
        Object obj13 = this.e;
        Object obj14 = this.d;
        Object obj15 = this.c;
        qim0 qim0Var = nim0.a;
        Object obj16 = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.h(zBooleanValue) ? 4 : 2;
                }
                boolean z = (iIntValue & 19) != 18;
                int i2 = iIntValue & 1;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(i2, z);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    qim0 qim0VarD = u291.d(qim0Var, 1.0f);
                    lz20 lz20Var = (lz20) obj16;
                    String str = (String) obj15;
                    tob1 tob1Var = (tob1) obj14;
                    vnr0 vnr0Var = (vnr0) obj10;
                    tob1 tob1Var2 = (tob1) obj13;
                    vnr0 vnr0Var2 = (vnr0) obj9;
                    ska skaVar = ((ala) obj8).a;
                    rk41 rk41Var = (rk41) obj7;
                    tob1 tob1Var3 = (tob1) obj12;
                    dhz0 dhz0Var = (dhz0) obj6;
                    dhz0 dhz0Var2 = (dhz0) obj5;
                    dhz0 dhz0Var3 = (dhz0) obj4;
                    ven0 ven0Var = (ven0) this.O0;
                    List list = (List) this.P0;
                    tob1 tob1Var4 = (tob1) obj11;
                    mbh mbhVarA = jbh.a(h36.g, een.P0, x340Var2, 6);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
                    pbh pbhVar = pbh.a;
                    qim0 qim0VarThen = vby0.p(u291.f(pbhVar.a(1.0f, qim0Var, true), 1.0f), lz20Var).then(c030.a);
                    boolean zG = x340Var2.g(str);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new nb9(str, (byte) 10);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarA = s161.a(qim0VarThen, (iu30) objT);
                    era eraVar = een.Q0;
                    f36 f36Var = h36.c;
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 48);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA2, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    qim0 qim0VarF = u291.f(pbhVar.a(1.0f, qim0Var, true), 1.0f);
                    mbh mbhVarA3 = jbh.a(h36.e, eraVar, x340Var2, 54);
                    int iHashCode3 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM3 = x340Var2.m();
                    qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA3, x340Var2, lljVar);
                    nko1.H(xos0VarM3, x340Var2, lljVar2);
                    x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE3, x340Var2, lljVar4);
                    boolean zG2 = x340Var2.g(tob1Var2);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new lq2(tob1Var2, (byte) 16);
                        x340Var2.s0(objT2);
                    }
                    qgo1.f(vnr0Var2, i541.C(qim0Var, (iu30) objT2), new a0e1(3), 0, false, (iu30) null, x340Var2, 8, 56);
                    uwr uwrVar = cbx.a;
                    op71.g(x340Var2, u291.h(qim0Var, cbx.b(x340Var2).b.b));
                    qim0 qim0VarA2 = pbhVar.a(1.0f, qim0Var, false);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode4 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM4 = x340Var2.m();
                    qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarA2);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, lljVar);
                    nko1.H(xos0VarM4, x340Var2, lljVar2);
                    x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE4, x340Var2, lljVar4);
                    x340Var2.i0(-1044870541);
                    zj31 zj31Var = skaVar.g;
                    boolean z3 = rk41Var.a;
                    qim0 qim0VarR = d7e.r(2.0f, u291.l(u291.j(0.0f, 140.0f, 1, qim0Var), 84.0f), true);
                    boolean zG3 = x340Var2.g(tob1Var3);
                    Object objT3 = x340Var2.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new lq2(tob1Var3, (byte) 17);
                        x340Var2.s0(objT3);
                    }
                    zj31Var.b(new jj31(z3, 0, i541.C(qim0VarR, (iu30) objT3), 2, (jfe) null, skaVar.h, (Map) null, false, false, (Function0) null, (iu30) null, 4048), x340Var2, 8);
                    us71.m(x340Var2, false, true, true);
                    if (zBooleanValue) {
                        x340Var2.i0(1576402552);
                        boolean zG4 = x340Var2.g(tob1Var);
                        Object objT4 = x340Var2.T();
                        if (zG4 || objT4 == m4cVar) {
                            objT4 = new lq2(tob1Var, (byte) 18);
                            x340Var2.s0(objT4);
                        }
                        qgo1.f(vnr0Var, i541.C(qim0Var, (iu30) objT4), new a0e1(3), 0, false, (iu30) null, x340Var2, 8, 56);
                        cvx cvxVar = cbx.b(x340Var2).b;
                        x0d.s(qim0Var, 16.0f, x340Var2, false);
                    } else {
                        x340Var2.i0(1576680281);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                    qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                    mbh mbhVarA4 = jbh.a(f36Var, eraVar, x340Var2, 48);
                    int iHashCode5 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM5 = x340Var2.m();
                    qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarF2);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA4, x340Var2, lljVar);
                    nko1.H(xos0VarM5, x340Var2, lljVar2);
                    x0d.q(iHashCode5, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE5, x340Var2, lljVar4);
                    chz0 chz0Var = (chz0) ven0Var.getValue();
                    boolean zBooleanValue2 = ((Boolean) tob1Var4.getValue()).booleanValue();
                    boolean zG5 = x340Var2.g(list);
                    Object objT5 = x340Var2.T();
                    if (zG5 || objT5 == m4cVar) {
                        objT5 = new s6(list, (byte) 10);
                        x340Var2.s0(objT5);
                    }
                    i9p1.l(dhz0Var, dhz0Var2, dhz0Var3, (qim0) null, chz0Var, zBooleanValue2, (iu30) objT5, x340Var2, 584, 8);
                    x340Var2.r(true);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            case 1:
                i2c i2cVar = (i2c) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                vzq0 vzq0Var = (vzq0) obj16;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    float f = zjy.p(0.0f, new p3v((i2cVar.c() - 100.0f) - vzq0Var.a())).a;
                    hvp0 hvp0Var = (hvp0) obj15;
                    gr81 gr81Var = gr81.R0;
                    gr81 gr81Var2 = gr81.Q0;
                    xyf1 xyf1Var = (xyf1) obj14;
                    d0r d0rVar = (d0r) obj13;
                    iac0 iac0Var = (iac0) obj12;
                    kkw0 kkw0Var = (kkw0) obj11;
                    njm njmVar = (njm) obj10;
                    r6h1 r6h1Var = (r6h1) obj9;
                    wks wksVar = (wks) obj8;
                    zob1 zob1Var = (zob1) obj7;
                    w6a1 w6a1Var = (w6a1) obj6;
                    cm0 cm0Var = (cm0) obj5;
                    u7h u7hVar = (u7h) obj4;
                    b9u0 b9u0Var = (b9u0) this.O0;
                    Context context = (Context) this.P0;
                    Object objT6 = x340Var4.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT6 == m4cVar2) {
                        dnc0 dnc0VarD = hvp0.d(hvp0Var, gr81Var, gr81Var2);
                        tva1 tva1VarA = xyf1Var.a(d0rVar, iac0Var, kkw0Var, njmVar, r6h1Var);
                        tjq tjqVar = (tjq) ((voq) wksVar.b.getValue()).a.c;
                        woq woqVar = (woq) ((jly0) tjqVar.a).get();
                        ycm ycmVar = (ycm) ((e821) tjqVar.b).e;
                        c8o.l(ycmVar);
                        qi1 qi1Var = new qi1(w6a1Var, tva1VarA, new n0o(woqVar, ycmVar, (jyo) ((jly0) tjqVar.d).get(), (xoq) ((jly0) tjqVar.c).get(), d0rVar, njmVar), u7hVar, new s6a1(f), cm0Var, context, b9u0Var, (byte) 13);
                        i = 0;
                        two1.v(dnc0VarD, zob1Var, false, qi1Var);
                        objT6 = dnc0VarD.a();
                        x340Var4.s0(objT6);
                    } else {
                        i = 0;
                    }
                    xtb0 xtb0VarA = aub0.a(i, x340Var4, 3);
                    q1d0 q1d0VarN = jyo1.n(xtb0VarA, (cnc0) objT6, (h3h1) null, x340Var4, i);
                    zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, vzq0Var.a(), 7);
                    qim0 qim0VarN = anm1.N("song_dna_list_root", u291.d(qim0Var, 1.0f));
                    boolean zI = x340Var4.i(q1d0VarN);
                    Object objT7 = x340Var4.T();
                    if (zI || objT7 == m4cVar2) {
                        objT7 = new xo8(q1d0VarN, (byte) 10);
                        x340Var4.s0(objT7);
                    }
                    ujo1.d(qim0VarN, xtb0VarA, zzq0VarJ, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT7, x340Var4, 6, 504);
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
            default:
                jm6 jm6Var = (jm6) obj16;
                vzq0 vzq0Var2 = (vzq0) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var5.g(vzq0Var2) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    u7h u7hVar2 = new u7h(jm6Var.g);
                    uwr uwrVar2 = cbx.a;
                    gaa1.a(u7hVar2, cbx.a(x340Var6).a.a.a(), ((vex) zex.a.e).c, u291.d(qim0Var, 1.0f), false, (fe5) null, apo.r(-1059141698, new fdh1((cm0) this.P0, (hw2) obj10, jm6Var, (mjm) obj7, (xzq) obj15, (xzq) obj11, (d0r) obj14, (fos) obj13, (iac0) obj4, (wen0) obj8, (hvp0) obj9, vzq0Var2, (kkw0) this.O0, (kt91) obj12, (xyf1) obj6, (r6h1) obj5), x340Var6), x340Var6, 1575936, 48);
                } else {
                    x340Var6.b0();
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xka(lz20 lz20Var, String str, ven0 ven0Var, vnr0 vnr0Var, ven0 ven0Var2, vnr0 vnr0Var2, ala alaVar, rk41 rk41Var, ven0 ven0Var3, dhz0 dhz0Var, dhz0 dhz0Var2, dhz0 dhz0Var3, ven0 ven0Var4, List list, tob1 tob1Var) {
        super(3);
        this.a = (byte) 0;
        this.b = lz20Var;
        this.c = str;
        this.d = ven0Var;
        this.h = vnr0Var;
        this.e = ven0Var2;
        this.i = vnr0Var2;
        this.t = alaVar;
        this.X = rk41Var;
        this.f = ven0Var3;
        this.Y = dhz0Var;
        this.Z = dhz0Var2;
        this.N0 = dhz0Var3;
        this.O0 = ven0Var4;
        this.P0 = list;
        this.g = tob1Var;
    }
}
