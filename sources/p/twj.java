package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class twj extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twj(maa maaVar, hwq hwqVar, String str, txj txjVar, w061 w061Var, l7e0 l7e0Var, String str2, String str3, boolean z, tob1 tob1Var) {
        super(2);
        this.c = maaVar;
        this.d = hwqVar;
        this.e = str;
        this.h = txjVar;
        this.i = w061Var;
        this.t = l7e0Var;
        this.f = str2;
        this.g = str3;
        this.b = z;
        this.X = tob1Var;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0412  */
    /* JADX WARN: Code duplicated, block: B:144:0x0536  */
    public final Object invoke(Object obj, Object obj2) {
        l6m l6mVar;
        float f;
        qim0 qim0VarK;
        boolean z;
        qim0 qim0VarD;
        uhl uhlVar;
        ihl ihlVar;
        boolean z2;
        boolean z3;
        tjz tjzVar;
        boolean z4;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0Var = nim0.a;
        Object obj3 = this.t;
        Object obj4 = this.X;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        Object obj10 = this.c;
        rih1 rih1Var = rih1.a;
        Object obj11 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                hwq hwqVar = (hwq) obj11;
                maa maaVar = (maa) obj10;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    txj txjVar = (txj) obj6;
                    hwq hwqVar2 = (hwq) obj11;
                    i1o1.e(maaVar, hwqVar2, (rzq) txjVar.d.d, (qim0) null, wpb1.D(gvg.h("key_luxp_row_esh_", hwqVar.g.a(), "_", (String) obj9), maaVar, hwqVar, x340Var2, 0), cei.c, (xu30) null, 0, apo.r(-626559498, new swj(txjVar, (w061) obj5, (l7e0) obj3, hwqVar2, (String) obj8, (String) obj7, this.b, (tob1) obj4), x340Var2), x340Var2, 100859904, 100);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    hob1 hob1Var = (hob1) obj10;
                    iu30 iu30Var = (iu30) obj11;
                    iuj iujVar = (iuj) obj9;
                    znb0 znb0Var = (znb0) obj8;
                    znb0 znb0Var2 = (znb0) obj7;
                    znb0 znb0Var3 = (znb0) obj6;
                    znb0 znb0Var4 = (znb0) obj5;
                    znb0 znb0Var5 = (znb0) obj3;
                    i091 i091Var = (i091) obj4;
                    Object objT = x340Var4.T();
                    if (objT == fkj0.X) {
                        objT = y7i0.g;
                        x340Var4.s0(objT);
                    }
                    rpo1.e(hob1Var, 0.0f, iu30Var, iujVar, znb0Var, znb0Var2, znb0Var3, znb0Var4, this.b, (qim0) null, false, (znb0) null, znb0Var5, false, (znb0) null, (znb0) null, false, (znb0) null, (znb0) null, (znb0) null, (yqg) null, i091Var, false, (vu30) null, (String) null, (iu30) objT, x340Var4, 0, 196608, 31452672);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj5;
                iu30 iu30Var3 = (iu30) obj6;
                l6m l6mVar2 = (l6m) obj7;
                uhl uhlVar2 = (xhl) obj11;
                gij1 gij1Var = (gij1) obj8;
                m4c m4cVar = fkj0.X;
                if ((iIntValue3 & 11) == 2) {
                    x340 x340Var6 = x340Var5;
                    if (x340Var6.H()) {
                        x340Var6.b0();
                        return rih1Var;
                    }
                }
                ((ven0) obj10).setValue(rih1Var);
                int i = uhlVar2.b;
                uhlVar2.m();
                x340 x340Var7 = x340Var5;
                x340Var7.i0(567221617);
                xhl xhlVar = (xhl) uhlVar2.l().b;
                ihl ihlVarK = xhlVar.k();
                ihl ihlVarK2 = xhlVar.k();
                ihl ihlVarK3 = xhlVar.k();
                shl shlVarE = uhlVar2.e();
                boolean zG = x340Var7.g(gij1Var);
                Object objT2 = x340Var7.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = v8r.q((Object) null);
                    x340Var7.s0(objT2);
                }
                ven0 ven0Var = (ven0) objT2;
                boolean zG2 = x340Var7.g(l6mVar2) | x340Var7.g((l6m) ven0Var.getValue());
                Object objT3 = x340Var7.T();
                if (zG2 || objT3 == m4cVar) {
                    if (l6mVar2 == null) {
                        l6mVar = (l6m) ven0Var.getValue();
                    }
                    if (l6mVar != null) {
                        l6mVar = l6mVar2;
                        objT3 = Float.valueOf(l6mVar.a / l6mVar.b);
                    } else {
                        l6mVar = l6mVar2;
                        objT3 = null;
                    }
                    x340Var7.s0(objT3);
                }
                Float f2 = (Float) objT3;
                boolean zG3 = x340Var7.g(f2);
                Object objT4 = x340Var7.T();
                if (zG3 || objT4 == m4cVar) {
                    if (f2 != null) {
                        float fFloatValue = f2.floatValue();
                        f = 1.0f;
                        if (fFloatValue > 1.0f) {
                            qim0VarK = xhl.j(d7e.r(fFloatValue, u291.f(qim0Var, 1.0f), false), ihlVarK, new esy0(shlVarE, (byte) 3));
                            f = 1.0f;
                        } else {
                            qim0VarK = u291.d(qim0Var, 1.0f);
                        }
                        if (qim0VarK == null) {
                        }
                        objT4 = qim0VarK;
                        x340Var7.s0(objT4);
                    } else {
                        ihlVarK2 = ihlVarK2;
                        f = 1.0f;
                    }
                    qim0VarK = d9y0.k(u291.d(qim0Var, f), 0.0f);
                    objT4 = qim0VarK;
                    x340Var7.s0(objT4);
                } else {
                    ihlVarK2 = ihlVarK2;
                }
                qim0 qim0Var2 = (qim0) objT4;
                boolean zG4 = x340Var7.g(gij1Var);
                Object objT5 = x340Var7.T();
                if (zG4 || objT5 == m4cVar) {
                    objT5 = v8r.q(Boolean.FALSE);
                    x340Var7.s0(objT5);
                }
                ven0 ven0Var2 = (ven0) objT5;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var7.T);
                xos0 xos0VarM = x340Var7.m();
                qim0 qim0VarE = zr7.E(x340Var7, qim0Var2);
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
                nko1.H(gfh0VarC, x340Var7, y580.O0);
                nko1.H(xos0VarM, x340Var7, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                nko1.F(x340Var7);
                nko1.H(qim0VarE, x340Var7, y580.Y);
                boolean zG5 = x340Var7.g(iu30Var3);
                boolean z5 = this.b;
                boolean zH = zG5 | x340Var7.h(z5) | x340Var7.g(ven0Var2) | x340Var7.g(iu30Var2);
                Object objT6 = x340Var7.T();
                if (zH || objT6 == m4cVar) {
                    z = z5;
                    objT6 = new eu91(iu30Var3, z, iu30Var2, ven0Var2, (byte) 6);
                    x340Var7.s0(objT6);
                } else {
                    z = z5;
                }
                iu30 iu30Var4 = (iu30) objT6;
                if (z) {
                    if ((f2 != null ? f2.floatValue() : 0.0f) > 1.0f) {
                        x340Var7.i0(183210275);
                        qim0 qim0VarD2 = u291.d(qim0Var, 1.0f);
                        Object objT7 = x340Var7.T();
                        if (objT7 == m4cVar) {
                            objT7 = rre1.Q0;
                            x340Var7.s0(objT7);
                        }
                        qim0VarD = j9k1.x(qim0VarD2, (xu30) objT7);
                        x340Var7.r(false);
                    } else {
                        x340Var7.i0(183731726);
                        x340Var7.r(false);
                        qim0VarD = u291.d(qim0Var, 1.0f);
                    }
                } else {
                    x340Var7.i0(183731726);
                    x340Var7.r(false);
                    qim0VarD = u291.d(qim0Var, 1.0f);
                }
                dm5.a(iu30Var4, qim0VarD, (iu30) null, x340Var7, 0, 4);
                Uri uri = Uri.parse(gij1Var.c.a);
                boolean zG6 = x340Var7.g(ven0Var);
                Object objT8 = x340Var7.T();
                if (zG6 || objT8 == m4cVar) {
                    objT8 = new i2g1(ven0Var, (byte) 10);
                    x340Var7.s0(objT8);
                }
                ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT8, (iu30) null, (iu30) null, 0L, x340Var7, 0, 0, 126974);
                qim0 qim0VarThen = u291.d(qim0Var, 1.0f).then(((Boolean) ven0Var2.getValue()).booleanValue() ? d9y0.k(qim0Var, 0.0f) : qim0Var);
                as80 as80Var = mif1.P0;
                isl islVar = isl.a;
                eso1.h(ni7VarA, islVar, qim0VarThen, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, x340Var7, 1794096, 392);
                x340Var7.r(true);
                if (gij1Var.g) {
                    x340Var7.i0(569897536);
                    x340Var7.r(false);
                } else {
                    x340Var7.i0(569629231);
                    eso1.g(cyo1.x(x340Var7, 2131234003), islVar, u291.d(qim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.V0, (tl3) null, (ColorFilter) null, x340Var7, 1794480, 392);
                    x340Var7.r(false);
                }
                if (gij1Var.e.length() <= 0) {
                    uhlVar = uhlVar2;
                    ihlVar = ihlVarK;
                    z2 = false;
                    x340Var7.i0(571291296);
                    x340Var7.r(false);
                } else {
                    if ((f2 != null ? f2.floatValue() : 0.0f) > 1.0f) {
                        x340Var7.i0(570009322);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var7).b;
                        l3j1 l3j1Var = new l3j1(gij1Var, uhlVar2, ihlVarK2, ihlVarK, (byte) 1);
                        uhlVar = uhlVar2;
                        ihlVar = ihlVarK;
                        gfx.b(6, apo.r(-1175012311, l3j1Var, x340Var7), x340Var7, 54);
                        z2 = false;
                        x340Var7.r(false);
                    } else {
                        uhlVar = uhlVar2;
                        ihlVar = ihlVarK;
                        z2 = false;
                        x340Var7.i0(571291296);
                        x340Var7.r(false);
                    }
                }
                z0i z0iVar = gij1Var.h;
                if (z0iVar == null) {
                    x340Var7.i0(571337578);
                    x340Var7.r(z2);
                    z3 = z2;
                } else {
                    x340Var7.i0(571337579);
                    cce cceVar = (cce) obj3;
                    o0i o0iVar = (o0i) obj4;
                    boolean zG7 = x340Var7.g(ihlVar);
                    Object objT9 = x340Var7.T();
                    if (zG7 || objT9 == m4cVar) {
                        objT9 = new nij1(ihlVar, (byte) 0);
                        x340Var7.s0(objT9);
                    }
                    qim0 qim0VarF = u291.f(xhl.j(qim0Var, ihlVarK3, (iu30) objT9), 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var7).b;
                    cceVar.a(8, o0iVar, z0iVar, x340Var7, uyn1.z(8.0f, 0.0f, 2, qim0VarF));
                    z3 = false;
                    x340Var7.r(false);
                }
                x340Var7.r(z3);
                if (uhlVar.b == i) {
                    return rih1Var;
                }
                qxd0.S((su) obj9, x340Var7);
                return rih1Var;
            default:
                x340 x340Var8 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                l8m1 l8m1Var = (l8m1) obj10;
                tjz tjzVar2 = l8m1Var.n;
                m4c m4cVar2 = fkj0.X;
                x340 x340Var9 = x340Var8;
                if (!x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var9.b0();
                    return rih1Var;
                }
                if (((Boolean) ((ven0) obj11).getValue()).booleanValue()) {
                    x340Var9.i0(-1116412665);
                    boolean zI = x340Var9.i(l8m1Var);
                    Object objT10 = x340Var9.T();
                    if (zI || objT10 == m4cVar2) {
                        objT10 = new i8m1(l8m1Var, (byte) 0);
                        x340Var9.s0(objT10);
                    }
                    iu30 iu30Var5 = (iu30) objT10;
                    boolean zI2 = x340Var9.i(tjzVar2);
                    Object objT11 = x340Var9.T();
                    if (zI2 || objT11 == m4cVar2) {
                        objT11 = new zgl1(1, tjzVar2, tjz.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0, (byte) 6);
                        tjzVar = tjzVar2;
                        x340Var9.s0(objT11);
                    } else {
                        tjzVar = tjzVar2;
                    }
                    yhm1.a(rih1Var, iu30Var5, (iu30) objT11, x340Var9, 6);
                    z4 = false;
                    x340Var9.r(false);
                } else {
                    tjzVar = tjzVar2;
                    z4 = false;
                    x340Var9.i0(-1116142624);
                    x340Var9.r(false);
                }
                qim0 qim0VarD3 = u291.d(qim0Var, 1.0f);
                c8m1 c8m1Var = (c8m1) obj9;
                ycl1 ycl1Var = (ycl1) obj8;
                ven0 ven0Var3 = (ven0) obj7;
                ven0 ven0Var4 = (ven0) obj6;
                o0i o0iVar2 = (o0i) obj5;
                tob1 tob1Var = (tob1) obj4;
                ven0 ven0Var5 = (ven0) obj3;
                gfh0 gfh0VarC2 = t1c.c(een.d, z4);
                int iHashCode2 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM2 = x340Var9.m();
                qim0 qim0VarE2 = zr7.E(x340Var9, qim0VarD3);
                hzj.A.getClass();
                if (x340Var9.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(gfh0VarC2, x340Var9, y580.O0);
                nko1.H(xos0VarM2, x340Var9, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var9, y580.R0);
                nko1.F(x340Var9);
                nko1.H(qim0VarE2, x340Var9, y580.Y);
                boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
                i3k i3kVar = (i3k) ven0Var5.getValue();
                String id = c8m1Var.c.getId();
                boolean zA = l8m1Var.m.a();
                boolean zI3 = x340Var9.i(l8m1Var) | x340Var9.i(c8m1Var);
                Object objT12 = x340Var9.T();
                if (zI3 || objT12 == m4cVar2) {
                    objT12 = new g4k1(l8m1Var, c8m1Var, (byte) 14);
                    x340Var9.s0(objT12);
                }
                Function0 function0 = (Function0) objT12;
                boolean zI4 = x340Var9.i(ven0Var3) | x340Var9.i(ven0Var4) | x340Var9.i(o0iVar2) | x340Var9.i(l8m1Var);
                Object objT13 = x340Var9.T();
                if (zI4 || objT13 == m4cVar2) {
                    objT13 = new odp0(o0iVar2, l8m1Var, ven0Var3, ven0Var4, (byte) 27);
                    x340Var9.s0(objT13);
                }
                Function0 function1 = (Function0) objT13;
                boolean zI5 = x340Var9.i(ven0Var3) | x340Var9.i(ven0Var4) | x340Var9.i(l8m1Var);
                Object objT14 = x340Var9.T();
                if (zI5 || objT14 == m4cVar2) {
                    objT14 = new hml1(l8m1Var, ven0Var3, ven0Var4, (byte) 2);
                    x340Var9.s0(objT14);
                }
                Function0 function2 = (Function0) objT14;
                boolean zI6 = x340Var9.i(ven0Var3) | x340Var9.i(ven0Var4) | x340Var9.i(o0iVar2);
                Object objT15 = x340Var9.T();
                if (zI6 || objT15 == m4cVar2) {
                    objT15 = new hml1(o0iVar2, ven0Var3, ven0Var4, (byte) 3);
                    x340Var9.s0(objT15);
                }
                whm1.b(i3kVar, ycl1Var, function0, function1, function2, null, (Function0) objT15, id, zBooleanValue, this.b, zA, tjzVar, x340Var9, 0);
                z0i z0iVar2 = c8m1Var.f;
                if (z0iVar2 == null) {
                    x340Var9.i0(-2065089347);
                    x340Var9.r(false);
                } else {
                    x340Var9.i0(-2065089346);
                    l8m1Var.j.a(8, o0iVar2, z0iVar2, x340Var9, uyn1.B(h2c.a.a(qim0Var, een.X), 0.0f, 0.0f, 0.0f, 4.0f, 7));
                    x340Var9.r(false);
                }
                x340Var9.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twj(ven0 ven0Var, xhl xhlVar, su suVar, gij1 gij1Var, l6m l6mVar, iu30 iu30Var, boolean z, iu30 iu30Var2, cce cceVar, o0i o0iVar) {
        super(2);
        this.c = ven0Var;
        this.d = xhlVar;
        this.e = suVar;
        this.f = gij1Var;
        this.g = l6mVar;
        this.h = iu30Var;
        this.b = z;
        this.i = iu30Var2;
        this.t = cceVar;
        this.X = o0iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twj(hob1 hob1Var, iu30 iu30Var, iuj iujVar, znb0 znb0Var, znb0 znb0Var2, znb0 znb0Var3, znb0 znb0Var4, boolean z, znb0 znb0Var5, i091 i091Var) {
        super(2);
        this.c = hob1Var;
        this.d = iu30Var;
        this.e = iujVar;
        this.f = znb0Var;
        this.g = znb0Var2;
        this.h = znb0Var3;
        this.i = znb0Var4;
        this.b = z;
        this.t = znb0Var5;
        this.X = i091Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twj(l8m1 l8m1Var, ven0 ven0Var, c8m1 c8m1Var, ycl1 ycl1Var, ven0 ven0Var2, ven0 ven0Var3, o0i o0iVar, boolean z, ven0 ven0Var4, ven0 ven0Var5) {
        super(2);
        this.c = l8m1Var;
        this.d = ven0Var;
        this.e = c8m1Var;
        this.f = ycl1Var;
        this.g = ven0Var2;
        this.h = ven0Var3;
        this.i = o0iVar;
        this.b = z;
        this.X = ven0Var4;
        this.t = ven0Var5;
    }
}
