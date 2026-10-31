package p;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j$.time.Instant;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class erc extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erc(String str, boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 10;
        this.e = str;
        this.b = z;
        this.d = z2;
        this.c = function0;
        this.f = function1;
        this.g = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j;
        boolean z;
        long j2;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        boolean z2 = this.d;
        n4k n4kVar = hmb0.t1;
        boolean z3 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    mta mtaVar = cbx.b(x340Var2).d;
                    qim0 qim0VarJ = u291.j(32.0f, 0.0f, 2, qim0VarF);
                    d8e0 d8e0Var = (d8e0) obj6;
                    lee1 lee1Var = (lee1) obj5;
                    vrc vrcVar = (vrc) obj4;
                    Function0 function0 = (Function0) obj3;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarJ);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    if (d8e0Var == null) {
                        x340Var2.i0(475674504);
                        t4n1.i(120.0f, lee1Var, vrcVar instanceof urc, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(475862798);
                        String str = d8e0Var.e;
                        Object objT = x340Var2.T();
                        if (objT == fkj0.X) {
                            objT = jpc.h;
                            x340Var2.s0(objT);
                        }
                        qim0 qim0VarA = s161.a(nim0Var, (iu30) objT);
                        if (z3) {
                            x340Var2.i0(-815925449);
                            j = cbx.a(x340Var2).b.c;
                            x340Var2.r(false);
                        } else {
                            x340Var2.i0(-815923601);
                            j = cbx.a(x340Var2).b.a;
                            x340Var2.r(false);
                        }
                        uwo1.e(str, qim0VarA, lee1Var, j, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
                        x340Var2.r(false);
                    }
                    if (z2) {
                        x340Var2.i0(476359139);
                        foo1.c(new gbx(z50.c, function0), ldx.c, new wnb0(1.0f, true), (max) null, yla.s(x340Var2).a(), uyn1.h(3, 0.0f, 0.0f), (idn0) null, (ga80) null, (vu30) null, (vu30) null, kai.a, x340Var2, 0, 48, 1944);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(477003319);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                y7e1 y7e1Var = (y7e1) obj5;
                iu30 iu30Var = (iu30) obj6;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (z3) {
                    x340Var4.i0(-1789379024);
                    loo1.l((Function0) obj3, x340Var4, 0);
                    x340Var4.r(false);
                } else if (z2) {
                    x340Var4.i0(-1789377343);
                    boolean zG = x340Var4.g(iu30Var) | x340Var4.i(y7e1Var);
                    Object objT2 = x340Var4.T();
                    if (zG || objT2 == fkj0.X) {
                        objT2 = new efb(iu30Var, y7e1Var, (byte) 1);
                        x340Var4.s0(objT2);
                    }
                    loo1.k((Function0) objT2, x340Var4, 6);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-1789374287);
                    loo1.e((Function0) obj4, x340Var4, 0);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                lro1.f(this.b, (iu30) obj6, (String) obj5, (qim0) obj4, (String) obj3, this.d, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                t8p1.e((pl80) obj6, this.b, this.d, (Instant) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var6, 2131953641);
                    String strO1 = cwl1.o0(x340Var6, 2131953640);
                    String strO2 = cwl1.o0(x340Var6, 2131953642);
                    String strO3 = cwl1.o0(x340Var6, 2131953643);
                    Function0 function1 = (Function0) obj3;
                    Function0 function2 = (Function0) obj6;
                    Function0 function3 = (Function0) obj5;
                    Function0 function4 = (Function0) obj4;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var6, 0);
                    int iHashCode2 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM2 = x340Var6.m();
                    qim0 qim0VarE2 = zr7.E(x340Var6, nim0Var);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(mbhVarA, x340Var6, y580.O0);
                    nko1.H(xos0VarM2, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE2, x340Var6, y580.Y);
                    if (z3) {
                        x340Var6.i0(293503669);
                        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                        if (ihc1.y0(strO0)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        } else {
                            jto1.b(qim0VarF2, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function1), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1175645665, new qdg0(strO0, (byte) 3), x340Var6), x340Var6, 6, 196608, 32702);
                            if (z2) {
                                x340Var6.i0(293754180);
                                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                                if (ihc1.y0(strO1)) {
                                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                } else {
                                    jto1.b(qim0VarF3, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO1), function2), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1490638972, new qdg0(strO1, (byte) 4), x340Var6), x340Var6, 6, 196608, 32702);
                                    z = false;
                                    x340Var6.r(false);
                                }
                            } else {
                                z = false;
                                x340Var6.i0(293996352);
                                x340Var6.r(false);
                            }
                            x340Var6.r(z);
                        }
                        return null;
                    }
                    x340Var6.i0(294006272);
                    x340Var6.r(false);
                    qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                    if (ihc1.y0(strO2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    } else {
                        jto1.b(qim0VarF4, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO2), function3), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1853885830, new qdg0(strO2, (byte) 5), x340Var6), x340Var6, 6, 196608, 32702);
                        if (z2) {
                            x340Var6.i0(294274856);
                            qim0 qim0VarF5 = u291.f(nim0Var, 1.0f);
                            if (ihc1.y0(strO3)) {
                                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            } else {
                                jto1.b(qim0VarF5, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO3), function4), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(961254232, new qdg0(strO3, (byte) 6), x340Var6), x340Var6, 6, 196608, 32702);
                                x340Var6.r(false);
                            }
                        } else {
                            x340Var6.i0(294513184);
                            x340Var6.r(false);
                        }
                        x340Var6.r(true);
                    }
                    return null;
                }
                x340Var6.b0();
                return rih1Var;
            case 5:
                isq0 isq0Var = (isq0) obj5;
                osq0 osq0Var = (osq0) obj6;
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                iu30 iu30Var2 = (iu30) obj4;
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else if (z3) {
                    x340Var8.i0(-671820690);
                    boolean zG2 = x340Var8.g(iu30Var2);
                    Object objT3 = x340Var8.T();
                    if (zG2 || objT3 == m4cVar) {
                        objT3 = new dgq0(iu30Var2, (byte) 11);
                        x340Var8.s0(objT3);
                    }
                    osq0Var.h(isq0Var, true, this.d, (Function0) objT3, x340Var8, 432, 0);
                    x340Var8.r(false);
                } else if (((wsq0) obj3).equals(rsq0.a)) {
                    x340Var8.i0(-671532204);
                    boolean zG3 = x340Var8.g(iu30Var2);
                    Object objT4 = x340Var8.T();
                    if (zG3 || objT4 == m4cVar) {
                        objT4 = new dgq0(iu30Var2, (byte) 12);
                        x340Var8.s0(objT4);
                    }
                    osq0Var.g((Function0) objT4, x340Var8, 0);
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(-671437747);
                    osq0Var.h(isq0Var, false, false, (Function0) null, x340Var8, 48, 12);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 6:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                String str2 = (String) obj4;
                oiw0 oiw0Var = (oiw0) obj6;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zB = oiw0Var.b();
                    int i = (!z3 || zB) ? 40 : 32;
                    giw0 giw0Var = new giw0(i, zB, z2);
                    float f = (!z3 || zB) ? 4.0f : 8.0f;
                    float fMin = Math.min(70.0f, Math.max(((Configuration) x340Var10.k(AndroidCompositionLocals_androidKt.a)).fontScale, 1.0f) * i);
                    tob1 tob1VarB = z95.b(oiw0Var instanceof hiw0 ? 0.25f : 1.0f, fiw0.a, "previewButtonAlpha", (iu30) null, x340Var10, 3072, 20);
                    gra graVar = een.h;
                    qim0 qim0VarD = i541.D(i1p1.q(uyn1.B(u291.a(anm1.N("PreviewLabel", (qim0) obj5), fMin, fMin), 0.0f, f, f, f, 1), er31.a), 0.0f, 0.0f, ((Number) tob1VarB.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048571);
                    if (oiw0Var instanceof niw0) {
                        j2 = u7h.j;
                    } else {
                        uwr uwrVar2 = cbx.a;
                        j2 = ((vex) zex.a.e).d;
                    }
                    qim0 qim0VarF6 = dug.f(qim0VarD, j2, d4o1.a);
                    boolean zG4 = x340Var10.g(str2);
                    Object objT5 = x340Var10.T();
                    if (zG4 || objT5 == m4cVar2) {
                        objT5 = new zqu0(str2, (byte) 15);
                        x340Var10.s0(objT5);
                    }
                    qim0 qim0VarB = s161.b(qim0VarF6, true, (iu30) objT5);
                    oiw0 oiw0Var2 = (oiw0) obj6;
                    Function0 function5 = (Function0) obj3;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM3 = x340Var10.m();
                    qim0 qim0VarE3 = zr7.E(x340Var10, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(gfh0VarC, x340Var10, y580.O0);
                    nko1.H(xos0VarM3, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE3, x340Var10, y580.Y);
                    Object objT6 = x340Var10.T();
                    if (objT6 == m4cVar2) {
                        objT6 = p7w0.X;
                        x340Var10.s0(objT6);
                    }
                    iu30 iu30Var3 = (iu30) objT6;
                    Object objT7 = x340Var10.T();
                    if (objT7 == m4cVar2) {
                        objT7 = p7w0.Y;
                        x340Var10.s0(objT7);
                    }
                    hm5.a(oiw0Var2, (qim0) null, iu30Var3, (tl3) null, "PreviewLabelState", (iu30) objT7, apo.r(836652416, new wh(giw0Var, function5, (byte) 26), x340Var10), x340Var10, 1794432, 10);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                sio1.k((String) obj6, (String) obj5, (iu30) obj4, (Function0) obj3, this.b, this.d, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((b0i0) obj6).e((xyz0) obj5, this.b, this.d, (iu30) obj4, (j2i) obj3, (b0k) obj, czo1.p(24577));
                return rih1Var;
            case 9:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ven0 ven0Var = (ven0) obj6;
                    hdn0 hdn0Var = (hdn0) obj5;
                    Object objT8 = x340Var12.T();
                    if (objT8 == fkj0.X) {
                        objT8 = new hov0(ven0Var, hdn0Var, (byte) 9);
                        x340Var12.s0(objT8);
                    }
                    qim0 qim0VarX = j9k1.x(nim0Var, (xu30) objT8);
                    o501 o501Var = (o501) obj4;
                    e601 e601Var = (e601) obj3;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode4 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM4 = x340Var12.m();
                    qim0 qim0VarE4 = zr7.E(x340Var12, qim0VarX);
                    hzj.A.getClass();
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
                    nko1.H(gfh0VarC2, x340Var12, y580.O0);
                    nko1.H(xos0VarM4, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE4, x340Var12, y580.Y);
                    rqo1.n(o501Var, this.b, false, this.d, e601Var, x340Var12, 432, 0);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                qon1.f((String) obj6, this.b, this.d, (Function0) obj3, (Function0) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                vvm1.s((ejj1) obj6, (Bitmap) obj5, this.b, (qim0) obj4, this.d, (gqb) obj3, (b0k) obj, czo1.p(196609));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erc(String str, String str2, iu30 iu30Var, Function0 function0, boolean z, boolean z2, int i) {
        super(2);
        this.a = (byte) 7;
        this.e = str;
        this.f = str2;
        this.g = iu30Var;
        this.c = function0;
        this.b = z;
        this.d = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erc(cvx cvxVar, d8e0 d8e0Var, lee1 lee1Var, vrc vrcVar, boolean z, boolean z2, Function0 function0) {
        super(2);
        this.a = (byte) 0;
        this.e = d8e0Var;
        this.f = lee1Var;
        this.g = vrcVar;
        this.b = z;
        this.d = z2;
        this.c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erc(pl80 pl80Var, boolean z, boolean z2, Instant instant, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.e = pl80Var;
        this.b = z;
        this.d = z2;
        this.f = instant;
        this.c = function0;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erc(b0i0 b0i0Var, xyz0 xyz0Var, boolean z, boolean z2, iu30 iu30Var, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 8;
        this.e = b0i0Var;
        this.f = xyz0Var;
        this.b = z;
        this.d = z2;
        this.g = iu30Var;
        this.c = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erc(ven0 ven0Var, hdn0 hdn0Var, o501 o501Var, boolean z, boolean z2, e601 e601Var) {
        super(2);
        this.a = (byte) 9;
        this.e = ven0Var;
        this.f = hdn0Var;
        this.g = o501Var;
        this.b = z;
        this.d = z2;
        this.c = e601Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erc(oiw0 oiw0Var, boolean z, boolean z2, qim0 qim0Var, String str, Function0 function0) {
        super(2);
        this.a = (byte) 6;
        this.e = oiw0Var;
        this.b = z;
        this.d = z2;
        this.f = qim0Var;
        this.g = str;
        this.c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erc(ejj1 ejj1Var, Bitmap bitmap, boolean z, qim0 qim0Var, boolean z2, gqb gqbVar, int i) {
        super(2);
        this.a = (byte) 11;
        this.e = ejj1Var;
        this.f = bitmap;
        this.b = z;
        this.g = qim0Var;
        this.d = z2;
        this.c = gqbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ erc(boolean z, Function0 function0, boolean z2, cv30 cv30Var, Object obj, Function0 function1, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = function0;
        this.d = z2;
        this.e = cv30Var;
        this.f = obj;
        this.g = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erc(boolean z, iu30 iu30Var, String str, qim0 qim0Var, String str2, boolean z2, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = z;
        this.e = iu30Var;
        this.f = str;
        this.g = qim0Var;
        this.c = str2;
        this.d = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erc(boolean z, osq0 osq0Var, isq0 isq0Var, boolean z2, iu30 iu30Var, wsq0 wsq0Var) {
        super(2);
        this.a = (byte) 5;
        this.b = z;
        this.e = osq0Var;
        this.f = isq0Var;
        this.d = z2;
        this.g = iu30Var;
        this.c = wsq0Var;
    }
}
