package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j6v extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6v(uvf1 uvf1Var, boolean z, kko kkoVar, String str, ymd0 ymd0Var, btt0 btt0Var) {
        super(3);
        this.a = (byte) 8;
        this.c = uvf1Var;
        this.b = z;
        this.d = kkoVar;
        this.e = str;
        this.f = ymd0Var;
        this.g = btt0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        kko kkoVar;
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.g;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                vu30 vu30Var = (vu30) obj5;
                iu30 iu30Var = (iu30) obj4;
                o9p1 o9p1Var = (o9p1) obj6;
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                Function0 function0 = (Function0) obj7;
                pe21 pe21Var = (pe21) obj8;
                x340 x340Var = (b0k) obj2;
                x340Var.i0(1184636779);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT);
                }
                c9n c9nVar = (c9n) objT;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = v8r.q(null);
                    x340Var.s0(objT2);
                }
                ven0 ven0Var = (ven0) objT2;
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT3);
                }
                ven0 ven0Var2 = (ven0) objT3;
                boolean zI = x340Var.i(c9nVar) | x340Var.g((Object) null) | x340Var.g(function0);
                Object objT4 = x340Var.T();
                if (zI || objT4 == m4cVar) {
                    objT4 = new o4u(function0, ven0Var2, ven0Var, c9nVar, (byte) 1);
                    x340Var.s0(objT4);
                }
                qxd0.i(pe21Var, (iu30) objT4, x340Var);
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zH = x340Var.h(z) | x340Var.i(o9p1Var) | x340Var.i(c9nVar) | x340Var.g((Object) null) | x340Var.g(iu30Var) | x340Var.g(function0) | x340Var.g(vu30Var);
                Object objT5 = x340Var.T();
                if (zH || objT5 == m4cVar) {
                    i6v i6vVar = new i6v(this.b, o9p1Var, vu30Var, iu30Var, ven0Var2, c9nVar, ven0Var, function0);
                    x340Var.s0(i6vVar);
                    objT5 = i6vVar;
                }
                qim0 qim0VarC = f8d1.c(qim0Var, pe21Var, boolValueOf, (PointerInputEventHandler) objT5);
                x340Var.r(false);
                return qim0VarC;
            case 1:
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    guo1.h(this.b, ((Boolean) ((tob1) obj4).getValue()).booleanValue() || ((Boolean) ((tob1) obj5).getValue()).booleanValue(), (swx) obj8, (zwx) obj7, (qim0) obj6, x340Var3, 0);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                x340 x340Var4 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var4.e(iIntValue2) ? 4 : 2;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean z2 = iIntValue2 == ((err0) ((jkr0) obj8).d.c).s();
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    if (!z2) {
                        qim0VarD = s161.a(qim0VarD, z860.h);
                    }
                    ArrayList arrayList = (ArrayList) obj7;
                    jkr0 jkr0Var = (jkr0) obj8;
                    db60 db60Var = (db60) obj6;
                    slx0 slx0Var = (slx0) obj4;
                    c9n c9nVar2 = (c9n) obj5;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var5.T);
                    xos0 xos0VarM = x340Var5.m();
                    qim0 qim0VarE = zr7.E(x340Var5, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var5.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var5.m0();
                    if (x340Var5.S) {
                        x340Var5.l(n4kVar);
                    } else {
                        x340Var5.v0();
                    }
                    nko1.H(gfh0VarC, x340Var5, y580.O0);
                    nko1.H(xos0VarM, x340Var5, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
                    nko1.F(x340Var5);
                    nko1.H(qim0VarE, x340Var5, y580.Y);
                    boolean z3 = this.b;
                    qmo1.b((rb60) arrayList.get(iIntValue2), iIntValue2, jkr0Var, z3, db60Var, slx0Var, (qim0) null, true, x340Var5, ((iIntValue3 << 3) & 112) | 12877824, 64);
                    if (iIntValue2 != jkr0Var.o()) {
                        x340Var5.i0(-603554549);
                        qim0 qim0VarB = h2c.a.b(nim0Var);
                        Object objT6 = x340Var5.T();
                        m4c m4cVar2 = fkj0.X;
                        if (objT6 == m4cVar2) {
                            objT6 = ktd.n(x340Var5);
                        }
                        idn0 idn0Var = (idn0) objT6;
                        boolean zI2 = ((iIntValue3 & 14) == 4) | x340Var5.i(c9nVar2) | x340Var5.h(z3) | x340Var5.i(jkr0Var);
                        Object objT7 = x340Var5.T();
                        if (zI2 || objT7 == m4cVar2) {
                            objT7 = new zv1(c9nVar2, z3, jkr0Var, iIntValue2);
                            x340Var5.s0(objT7);
                        }
                        t1c.a(bin.v(qim0VarB, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT7, 28), x340Var5, 0);
                        x340Var5.r(false);
                    } else {
                        x340Var5.i0(-603060595);
                        x340Var5.r(false);
                    }
                    x340Var5.r(true);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 3:
                float f = ((p3v) obj).a;
                x340 x340Var6 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var6.d(f) ? 4 : 2;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var7).b;
                    qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0VarZ);
                    lw90 lw90Var = (lw90) obj8;
                    d6o0 d6o0Var = (d6o0) obj7;
                    ldo ldoVar = (ldo) obj6;
                    ng20 ng20Var = (ng20) obj5;
                    iu30 iu30Var2 = (iu30) obj4;
                    mbh mbhVarA = jbh.a(f36Var, een.Q0, x340Var7, 0);
                    int iHashCode2 = Long.hashCode(x340Var7.T);
                    xos0 xos0VarM2 = x340Var7.m();
                    qim0 qim0VarE2 = zr7.E(x340Var7, qim0VarZ2);
                    hzj.A.getClass();
                    if (x340Var7.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var7.m0();
                    if (x340Var7.S) {
                        x340Var7.l(n4kVar);
                    } else {
                        x340Var7.v0();
                    }
                    nko1.H(mbhVarA, x340Var7, y580.O0);
                    nko1.H(xos0VarM2, x340Var7, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var7, y580.R0);
                    nko1.F(x340Var7);
                    nko1.H(qim0VarE2, x340Var7, y580.Y);
                    acq0.v(lw90Var.e(), x340Var7, 0);
                    acq0.u(x340Var7, 0);
                    acq0.t(lw90Var, d6o0Var, ldoVar, ng20Var, this.b, iu30Var2, f, x340Var7, (iIntValue4 << 18) & 3670016);
                    x340Var7.r(true);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                jkf0 jkf0Var = (jkf0) obj8;
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    boolean zG = x340Var9.g(jkf0Var);
                    Object objT8 = x340Var9.T();
                    if (zG || objT8 == fkj0.X) {
                        objT8 = new e4f0(jkf0Var, (byte) 6);
                        x340Var9.s0(objT8);
                    }
                    hm5.a(jkf0Var, qim0VarD2, (iu30) objT8, (tl3) null, "ContextMenuPageTransition", (iu30) null, apo.r(-21382887, new ghf0((String) obj7, (String) obj6, (String) obj5, this.b, (iu30) obj4), x340Var9), x340Var9, 1597488, 40);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                znb0 znb0Var = (znb0) obj8;
                c380 c380Var = (c380) obj7;
                ven0 ven0Var3 = (ven0) obj6;
                bqm bqmVar = (bqm) obj4;
                String str = (String) obj5;
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var10, 0);
                x340 x340Var11 = x340Var10;
                int iHashCode3 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM3 = x340Var11.m();
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarE3 = zr7.E(x340Var10, nim0Var2);
                hzj.A.getClass();
                x340 x340Var12 = x340Var10;
                if (x340Var12.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                nko1.H(mbhVarA2, x340Var10, y580.O0);
                nko1.H(xos0VarM3, x340Var10, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var10, y580.R0);
                nko1.F(x340Var10);
                nko1.H(qim0VarE3, x340Var10, y580.Y);
                maa maaVar = (maa) znb0Var.getValue();
                String str2 = ((w4i1) o7h.q0(c380Var)).b;
                boolean zG2 = x340Var12.g(ven0Var3);
                Object objT9 = x340Var12.T();
                if (zG2 || objT9 == fkj0.X) {
                    objT9 = new q2j0(ven0Var3, (byte) 0);
                    x340Var12.s0(objT9);
                }
                otw.c(maaVar, new p871(str2, (Function0) objT9), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var10).b;
                op71.g(x340Var10, uyn1.B(nim0Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13));
                otw.c(bqmVar, new aqm(xpm.a, z, str, c380Var), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                x340Var12.r(true);
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                c680.k((String) obj8, (String) obj7, this.b, (Boolean) obj6, (p8q0) obj5, (iu30) obj4, (b0k) obj2, 0);
                return rih1Var;
            case 7:
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str3 = (String) obj8;
                if (z) {
                    x340 x340Var14 = x340Var13;
                    x340Var14.i0(-1585509882);
                    yla.s(x340Var14);
                    qim0 qim0VarR = u291.r(nim0Var, 32.0f);
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode4 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM4 = x340Var14.m();
                    qim0 qim0VarE4 = zr7.E(x340Var14, qim0VarR);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var14, y580.O0);
                    nko1.H(xos0VarM4, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE4, x340Var14, y580.Y);
                    xto1.e((qim0) null, 2, 0L, 0L, x340Var14, 48, 13);
                    x340Var14.r(true);
                    x340Var14.r(false);
                } else {
                    x340 x340Var15 = x340Var13;
                    x340Var15.i0(-1585241019);
                    String str4 = str3 == null ? (String) obj6 : (String) obj4;
                    Function0 function1 = str3 == null ? (Function0) obj7 : (Function0) obj5;
                    if (ihc1.y0(str4)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    gbx gbxVar = new gbx(new y50(str4), function1);
                    ldx ldxVar = ldx.c;
                    gdx gdxVarA = yla.s(x340Var15).a();
                    Object objT10 = x340Var15.T();
                    if (objT10 == fkj0.X) {
                        objT10 = wu51.d;
                        x340Var15.s0(objT10);
                    }
                    wro1.h(gbxVar, ldxVar, s161.a(nim0Var, (iu30) objT10), (max) null, gdxVarA, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-173705134, new nl41(str3, (byte) 5), x340Var15), x340Var15, 12582912, 6, 856);
                    x340Var15.r(false);
                }
                return rih1Var;
            default:
                String str5 = (String) obj;
                uvf1 uvf1Var = (uvf1) obj8;
                y8n soy0Var = (!z || (kkoVar = (kko) obj7) == null) ? new soy0(uvf1Var.a.c((String) obj6, Collections.singletonList(str5), true).map(new xrh(str5, (byte) 8)).toFlowable(BackpressureStrategy.d)) : t5p1.j(new pvf1(kkoVar.a(), str5, (byte) 0), 3);
                kdn0 kdn0VarA = tvf1.a((btt0) obj5, str5);
                ymd0 ymd0Var = (ymd0) obj4;
                uvf1Var.getClass();
                fai0 fai0Var = new fai0();
                l811 l811Var = new l811();
                l811 l811Var2 = new l811();
                fai0Var.m(new lvf1(false, false, false, false, false));
                fai0Var.n(soy0Var, new xjr(fai0Var, (byte) 7));
                fai0Var.n(kdn0VarA, new mvf1(l811Var2, fai0Var, l811Var, (byte) 2));
                if (ymd0Var != null) {
                    fai0Var.n(ymd0Var, new mvf1(l811Var, fai0Var, l811Var2, (byte) 3));
                }
                return w6d1.q(fai0Var, dw81.N0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6v(Object obj, Object obj2, Object obj3, Object obj4, boolean z, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.g = obj4;
        this.b = z;
        this.f = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6v(String str, String str2, boolean z, Boolean bool, p8q0 p8q0Var, iu30 iu30Var) {
        super(3);
        this.a = (byte) 6;
        this.c = str;
        this.d = str2;
        this.b = z;
        this.e = bool;
        this.g = p8q0Var;
        this.f = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6v(znb0 znb0Var, c380 c380Var, ven0 ven0Var, bqm bqmVar, boolean z, String str) {
        super(3);
        this.a = (byte) 5;
        this.c = znb0Var;
        this.d = c380Var;
        this.e = ven0Var;
        this.f = bqmVar;
        this.b = z;
        this.g = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6v(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6v(boolean z, String str, String str2, String str3, Function0 function0, Function0 function1) {
        super(3);
        this.a = (byte) 7;
        this.b = z;
        this.c = str;
        this.e = str2;
        this.f = str3;
        this.d = function0;
        this.g = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6v(boolean z, swx swxVar, zwx zwxVar, qim0 qim0Var, tob1 tob1Var, tob1 tob1Var2) {
        super(3);
        this.a = (byte) 1;
        this.b = z;
        this.c = swxVar;
        this.d = zwxVar;
        this.e = qim0Var;
        this.f = tob1Var;
        this.g = tob1Var2;
    }
}
