package p;

import android.net.Uri;
import android.view.View;
import com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import j$.time.Clock;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qfx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfx(suo suoVar, l5y l5yVar, iu30 iu30Var, iu30 iu30Var2) {
        super(2);
        this.a = (byte) 8;
        this.b = suoVar;
        this.c = l5yVar;
        this.e = iu30Var;
        this.d = iu30Var2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        m5y m5yVarA;
        max maxVar;
        rih1 rih1Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var2 = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object obj7 = ((p811) obj6).a;
                    if (obj7 == null) {
                        u890.C("commentView");
                        throw null;
                    }
                    qsw.c(new obk1((View) obj7), apo.r(-1916294727, new g6w((oih) obj5, (fih) obj4, (iu30) obj3), x340Var2), x340Var2, 48);
                } else {
                    x340Var2.b0();
                }
                return rih1Var2;
            case 1:
                ((Number) obj2).intValue();
                shx.d((phx) obj6, (phx) obj5, (hcx) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 2:
                ((Number) obj2).intValue();
                cso1.e((b180) obj6, (qim0) obj5, (j6m) obj4, (tl3) obj3, (b0k) obj, czo1.p(49));
                return rih1Var2;
            case 3:
                ((Number) obj2).intValue();
                yvx.a((hfx) obj6, (uyx) obj5, (dvx) obj4, (vu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 4:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P("icon_element", new j2i(-634879235, new k40(tlc1Var, ((afh0) o7h.q0(tlc1Var.P("text_element", ami.b))).H(j), (gbx) obj6, (idn0) obj5, (hux) obj4, (jsl) obj3, (byte) 26), true)))).H(j);
                return tlc1Var.S(q5t0VarH.a, q5t0VarH.b, b7xVar, new f2(q5t0VarH, (byte) 15));
            case 5:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    yvx.a((hfx) obj5, (uyx) obj4, ((wux) obj6).a, (vu30) obj3, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var2;
            case 6:
                ((Number) obj2).intValue();
                acq0.f((v3y) obj6, (iu30) obj3, (qim0) obj5, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 7:
                ((Number) obj2).intValue();
                acq0.h((String) obj6, (lj80) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(3073));
                return rih1Var2;
            case 8:
                String str = (String) obj;
                nrs0 nrs0Var = (nrs0) obj2;
                k5y k5yVar = ((l5y) obj5).b;
                otu otuVar = ((suo) obj6).a;
                i8h1 i8h1Var = (i8h1) otuVar.b;
                if (k5yVar instanceof j5y) {
                    j5y j5yVar = (j5y) k5yVar;
                    ruo ruoVarB = suo.b(j5yVar, str, nrs0Var);
                    if (ruoVarB != null) {
                        m5yVarA = ruoVarB.a;
                    } else {
                        m5yVarA = suo.a(j5yVar, str, nrs0Var);
                        if (m5yVarA != null) {
                        }
                    }
                    if (!m5yVarA.d) {
                        if (ruoVarB != null) {
                            jpk0 jpk0VarL = otuVar.l(str, ruoVarB.b);
                            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("set_multiple_choice_value", 1, Collections.singletonMap("option_selected", str)), jpk0VarL.b, jpk0VarL.c.c.b, System.currentTimeMillis()), (xj61) null);
                        }
                        ((iu30) obj3).invoke(str);
                        ((iu30) obj4).invoke(new v4y(str));
                    }
                } else if (k5yVar instanceof i5y) {
                    c380 c380Var = ((i5y) k5yVar).a;
                    if (c380Var == null || !c380Var.isEmpty()) {
                        Iterator it = c380Var.iterator();
                        while (it.hasNext()) {
                            if (((f5y) it.next()).a.equals(str)) {
                                if (nrs0Var == null) {
                                    x6h1 x6h1VarC = ((txk0) otuVar.c).b.c();
                                    x6h1VarC.i.add(new a7h1("language_section", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC.j = false;
                                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                                    x6h1VarC2.i.add(new a7h1("language_option_row", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC2.j = false;
                                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("set_multiple_choice_value", 1, Collections.singletonMap("option_selected", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                                }
                                ((iu30) obj3).invoke(str);
                                ((iu30) obj4).invoke(new v4y(str));
                            }
                        }
                    }
                } else if (!k5yVar.equals(h5y.a)) {
                    eg.o();
                    return null;
                }
                return rih1Var2;
            case 9:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ((dyy) obj6).f((tob1) obj5, (tob1) obj4, (tob1) obj3, (lz20) null, x340Var6, 0, 8);
                } else {
                    x340Var6.b0();
                }
                return rih1Var2;
            case 10:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    long j2 = cbx.a(x340Var8).b.g;
                    boolean z = ((scz) obj6).b == kcz.a;
                    gfx.b(z ? 5 : 18, apo.r(482536048, new mvf((qcz) obj5, (yqg) obj4, (String) obj3, j2, z), x340Var8), x340Var8, 48);
                } else {
                    x340Var8.b0();
                }
                return rih1Var2;
            case 11:
                ((Number) obj2).intValue();
                l4o1.d((if00) null, (xfx) obj6, (p40) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(513));
                return rih1Var2;
            case 12:
                ((Number) obj2).intValue();
                ((i7d) obj6).d((cj00) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 13:
                ((Number) obj2).intValue();
                guo1.k((String) obj6, (iu30) obj3, (qim0) obj5, (Long) obj4, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 14:
                ((Number) obj2).intValue();
                guo1.y((String) obj6, (String) obj5, (iu30) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 15:
                ((Number) obj2).intValue();
                zzo1.d((x720) obj6, (iu30) obj3, (qim0) obj5, (Clock) obj4, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 16:
                ((Number) obj2).intValue();
                p1p1.h((qa20) obj6, (c380) obj5, (uny) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 17:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ak7 ak7Var = (ak7) obj6;
                tob1 tob1Var = (tob1) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ebp1.b("search-input", new gd21(), apo.r(87749026, new xh00((sp00) obj5, (lzn0) obj4, (byte) 14), x340Var10), x340Var10, 390, 0);
                    String id = ((vh20) tob1Var.getValue()).b.getId();
                    cer0 cer0Var = ((vh20) tob1Var.getValue()).b;
                    if (cer0Var.equals(pdr0.a)) {
                        x340Var10.i0(-1368736696);
                        ebp1.b(cer0Var.getId(), (qyl) null, apo.r(-1038995542, new lpk(tob1Var, (byte) 4), x340Var10), x340Var10, 384, 2);
                        x340Var10.r(false);
                    } else if (cer0Var instanceof tdr0) {
                        x340Var10.i0(-1368635140);
                        ebp1.b(id, (qyl) null, api.a, x340Var10, 384, 2);
                        x340Var10.r(false);
                    } else if (cer0Var.equals(udr0.a)) {
                        x340Var10.i0(-1429620270);
                        ebp1.b(id, (qyl) null, api.b, x340Var10, 384, 2);
                        x340Var10.r(false);
                    } else if (cer0Var instanceof xdr0) {
                        x340Var10.i0(-1368478032);
                        c380 c380VarA = mqo1.A(((xdr0) cer0Var).a);
                        boolean zI = x340Var10.i(ak7Var);
                        Object objT = x340Var10.T();
                        if (zI || objT == fkj0.X) {
                            objT = new gi00(ak7Var, (byte) 19);
                            x340Var10.s0(objT);
                        }
                        rno1.d(c380VarA, (qyl) null, (iu30) objT, x340Var10, 0);
                        x340Var10.r(false);
                    } else {
                        if (!cer0Var.equals(ber0.a)) {
                            throw p3d1.k(x340Var10, -1429626699, false);
                        }
                        x340Var10.i0(-1429599952);
                        ebp1.b(id, (qyl) null, api.f, x340Var10, 384, 2);
                        x340Var10.r(false);
                    }
                } else {
                    x340Var10.b0();
                }
                return rih1Var2;
            case 18:
                ((Number) obj2).intValue();
                ((rb30) obj6).e((ye5) obj5, (kq61) obj4, (iu30) obj3, (b0k) obj, czo1.p(9));
                return rih1Var2;
            case 19:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    kiv kivVar = oi7.a;
                    gw70 gw70Var = ((ForcedGraduationLockActivity) obj6).k1;
                    if (gw70Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    mod.b(kivVar.a(gw70Var), apo.r(997345436, new xx00((sc30) obj5, (oc30) obj4, (ipb1) obj3, (byte) 19), x340Var12), x340Var12, 56);
                } else {
                    x340Var12.b0();
                }
                return rih1Var2;
            case 20:
                ((Number) obj2).intValue();
                x9p1.b((yc30) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 21:
                ((Number) obj2).intValue();
                dsa0.c((vhx0) obj6, (zob1) obj5, (qim0) obj4, (vu30) obj3, (b0k) obj, czo1.p(3073));
                return rih1Var2;
            case 22:
                ((Number) obj2).intValue();
                pxd0.f((nmu0) obj6, (qim0) obj5, (ro30) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                fdg1.e((String) obj6, (sp00) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 24:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x340Var14.b0();
                    return rih1Var2;
                }
                era eraVar = een.Q0;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var14).b;
                qim0 qim0VarN = anm1.N("graduation_view_request_test_tag", uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0VarF), 0.0f, 0.0f, 0.0f, ((vzq0) obj6).a(), 7));
                jc50 jc50Var = (jc50) obj5;
                sp00 sp00Var = (sp00) obj4;
                iu30 iu30Var = (iu30) obj3;
                mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var14, 0);
                int iHashCode = Long.hashCode(x340Var14.T);
                xos0 xos0VarM = x340Var14.m();
                qim0 qim0VarE = zr7.E(x340Var14, qim0VarN);
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
                nko1.H(mbhVarA, x340Var14, y580.O0);
                nko1.H(xos0VarM, x340Var14, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var14, y580.R0);
                nko1.F(x340Var14);
                nko1.H(qim0VarE, x340Var14, y580.Y);
                cvx cvxVar2 = cbx.b(x340Var14).b;
                op71.g(x340Var14, u291.r(nim0Var, 16.0f));
                String str2 = jc50Var.c;
                if (str2 == null) {
                    str2 = "";
                }
                Uri uri = Uri.parse(str2);
                String str3 = jc50Var.b;
                bmq0.a(uri, (qim0) null, hcx.d, str3, str3, 0L, 0L, false, x340Var14, 384, 226);
                cvx cvxVar3 = cbx.b(x340Var14).b;
                op71.g(x340Var14, u291.r(nim0Var, 8.0f));
                String str4 = jc50Var.b;
                lee1 lee1Var = cbx.d(x340Var14).e;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                cvx cvxVar4 = cbx.b(x340Var14).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF2);
                Object objT2 = x340Var14.T();
                m4c m4cVar = fkj0.X;
                if (objT2 == m4cVar) {
                    objT2 = vc40.c1;
                    x340Var14.s0(objT2);
                }
                uwo1.e(str4, s161.b(qim0VarZ, false, (iu30) objT2), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2024);
                op71.g(x340Var14, u291.r(nim0Var, cbx.b(x340Var14).b.a));
                int iOrdinal = jc50Var.g.ordinal();
                if (iOrdinal == 0) {
                    x340Var14.i0(2108047654);
                    fdg1.n(jc50Var, x340Var14, 6);
                    x340Var14.r(false);
                } else {
                    if (iOrdinal != 1) {
                        throw p3d1.k(x340Var14, 2108043663, false);
                    }
                    x340Var14.i0(2108045407);
                    fdg1.p(jc50Var, x340Var14, 6);
                    x340Var14.r(false);
                }
                op71.g(x340Var14, u291.r(nim0Var, cbx.b(x340Var14).b.a));
                boolean z2 = (jc50Var.t || jc50Var.X) ? false : true;
                boolean zI2 = x340Var14.i(sp00Var) | x340Var14.g(iu30Var);
                Object objT3 = x340Var14.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new h750(sp00Var, iu30Var, (byte) 0);
                    x340Var14.s0(objT3);
                }
                z50 z50Var = z50.c;
                gbx gbxVar = new gbx(z50Var, (Function0) objT3);
                idx idxVar = new idx(4);
                max haxVar = jax.a;
                if (z2) {
                    x340Var14.i0(925510987);
                    x340Var14.r(false);
                    maxVar = haxVar;
                } else {
                    x340Var14.i0(925567221);
                    max haxVar2 = new hax(cwl1.o0(x340Var14, 2131956429));
                    x340Var14.r(false);
                    maxVar = haxVar2;
                }
                foo1.c(gbxVar, idxVar, anm1.N("graduation_view_request_positive_button_test_tag", nim0Var), maxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-162295542, new i750(jc50Var, (byte) 0), x340Var14), x340Var14, 0, 48, 2024);
                cvx cvxVar5 = cbx.b(x340Var14).b;
                op71.g(x340Var14, u291.r(nim0Var, 16.0f));
                boolean zI3 = x340Var14.i(sp00Var) | x340Var14.g(iu30Var);
                Object objT4 = x340Var14.T();
                if (zI3 || objT4 == m4cVar) {
                    objT4 = new h750(sp00Var, iu30Var, (byte) 1);
                    x340Var14.s0(objT4);
                }
                gbx gbxVar2 = new gbx(z50Var, (Function0) objT4);
                jdx jdxVar = jdx.c;
                if (z2) {
                    x340Var14.i0(926754955);
                } else {
                    x340Var14.i0(926811189);
                    haxVar = new hax(cwl1.o0(x340Var14, 2131956429));
                }
                x340Var14.r(false);
                foo1.c(gbxVar2, jdxVar, anm1.N("graduation_view_request_negative_button_test_tag", nim0Var), haxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-745393613, new i750(jc50Var, (byte) 1), x340Var14), x340Var14, 0, 48, 2024);
                op71.g(x340Var14, u291.r(nim0Var, cbx.b(x340Var14).b.a));
                String str5 = jc50Var.Y;
                boolean zG = x340Var14.g(iu30Var);
                Object objT5 = x340Var14.T();
                if (zG || objT5 == m4cVar) {
                    objT5 = new bb30(iu30Var, (byte) 27);
                    x340Var14.s0(objT5);
                }
                fdg1.e(str5, sp00Var, (Function0) objT5, new tq60(een.P0), x340Var14, 0);
                op71.g(x340Var14, u291.r(nim0Var, cbx.b(x340Var14).b.e));
                if (jc50Var.h || jc50Var.i) {
                    x340Var14.i0(928027877);
                    boolean zI4 = x340Var14.i(sp00Var) | x340Var14.g(iu30Var);
                    Object objT6 = x340Var14.T();
                    if (zI4 || objT6 == m4cVar) {
                        objT6 = new h750(sp00Var, iu30Var, (byte) 2);
                        x340Var14.s0(objT6);
                    }
                    Function0 function0 = (Function0) objT6;
                    boolean zI5 = x340Var14.i(sp00Var) | x340Var14.i(jc50Var) | x340Var14.g(iu30Var);
                    Object objT7 = x340Var14.T();
                    if (zI5 || objT7 == m4cVar) {
                        objT7 = new xvy(sp00Var, jc50Var, iu30Var, (byte) 13);
                        x340Var14.s0(objT7);
                    }
                    nmn1.c((String) null, (String) null, function0, (Function0) objT7, x340Var14, 0);
                    boolean zI6 = x340Var14.i(sp00Var);
                    Object objT8 = x340Var14.T();
                    if (zI6 || objT8 == m4cVar) {
                        objT8 = new n3s(sp00Var, (lnm) null, (byte) 22);
                        x340Var14.s0(objT8);
                    }
                    rih1Var = rih1Var2;
                    qxd0.t(rih1Var, x340Var14, (vu30) objT8);
                    x340Var14.r(false);
                } else {
                    x340Var14.i0(928662137);
                    x340Var14.r(false);
                    rih1Var = rih1Var2;
                }
                x340Var14.r(true);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                jhc1.e((jqi0) obj6, (iu30) obj3, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 26:
                ((Number) obj2).intValue();
                r4o1.o((String) obj6, (Function0) obj5, (qim0) obj4, (gbx) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 27:
                b0k b0kVar = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) ((ven0) obj5).getValue()).booleanValue();
                    nim0 nim0Var2 = nim0.a;
                    if (zBooleanValue) {
                        b0kVar2.i0(-956575435);
                        WeakHashMap weakHashMap = osl1.x;
                        op71.g(b0kVar2, u291.h(nim0Var2, ((wat) obj6).M0(((Number) ((ven0) obj3).getValue()).intValue()) + poo1.x(lhc.g(b0kVar2).f, b0kVar2).d() + 64.0f));
                        b0kVar2.r(false);
                    } else {
                        b0kVar2.i0(-956745036);
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar6 = cbx.b(b0kVar2).b;
                        qim0 qim0VarB = uyn1.B(nim0Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                        p410 p410Var = (p410) obj4;
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                        xos0 xos0VarM2 = b0kVar2.m();
                        qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarB);
                        hzj.A.getClass();
                        if (((x340) b0kVar2).a == null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar2.m0();
                        if (((x340) b0kVar2).S) {
                            b0kVar2.l(n4kVar);
                        } else {
                            b0kVar2.v0();
                        }
                        nko1.H(gfh0VarC, b0kVar2, y580.O0);
                        nko1.H(xos0VarM2, b0kVar2, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode2), b0kVar2, y580.R0);
                        nko1.F(b0kVar2);
                        nko1.H(qim0VarE2, b0kVar2, y580.Y);
                        p410Var.c(b0kVar2, 0);
                        b0kVar2.r(true);
                        b0kVar2.r(false);
                    }
                } else {
                    b0kVar2.b0();
                }
                return rih1Var2;
            case 28:
                ((Number) obj2).intValue();
                ((uu0) obj6).e((ne91) obj5, (cxc0) obj4, (v260) obj3, (b0k) obj, czo1.p(513));
                return rih1Var2;
            default:
                ((Number) obj2).intValue();
                gho1.d((nt70) obj6, (Function0) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qfx(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qfx(Object obj, Object obj2, iu30 iu30Var, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = iu30Var;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qfx(Object obj, iu30 iu30Var, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.e = iu30Var;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qfx(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfx(scz sczVar, qcz qczVar, yqg yqgVar, String str) {
        super(2);
        this.a = (byte) 10;
        this.b = sczVar;
        this.c = qczVar;
        this.d = yqgVar;
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfx(if00 if00Var, xfx xfxVar, p40 p40Var, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 11;
        this.b = xfxVar;
        this.c = p40Var;
        this.d = qim0Var;
        this.e = iu30Var;
    }
}
