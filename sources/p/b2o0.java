package p;

import android.view.View;
import com.spotify.eventcardinfoservice.v1.EventCardInfoResponse;
import com.spotify.eventcardinfoservice.v1.SingleEvent;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import spotify.collection.esperanto.proto.CollectionArtist;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b2o0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2o0(Function0 function0, u7h u7hVar, u7h u7hVar2, String str) {
        super(2);
        this.a = (byte) 17;
        this.d = function0;
        this.e = u7hVar;
        this.b = u7hVar2;
        this.c = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        o8q0 o8q0Var;
        String str;
        byte b = this.a;
        z50 z50Var = z50.c;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ((f2o0) obj5).h((c2o0) obj4, (iu30) obj6, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((o3o0) obj5).g((l3o0) obj4, (iu30) obj6, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                bno1.d((quc0) obj5, (c380) obj4, (Function0) obj6, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                c9q0 c9q0Var = (c9q0) obj3;
                n0o n0oVar = (n0o) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k900 k900Var = (k900) obj4;
                    Boolean bool = c9q0Var.c;
                    fod0 fod0Var = (fod0) n0oVar.h;
                    EventCardInfoResponse eventCardInfoResponse = k900Var.a;
                    CollectionArtist collectionArtist = k900Var.b;
                    int iP = eventCardInfoResponse.p();
                    int i = iP == 0 ? -1 : d9q0.a[l1d.C(iP)];
                    if (i == 1) {
                        o8q0Var = new o8q0(eventCardInfoResponse.t().p(), fod0Var.d(eventCardInfoResponse.t().n().n()), eventCardInfoResponse.t().q());
                    } else if (i != 2) {
                        o8q0Var = new o8q0("", "", "");
                    } else {
                        SingleEvent singleEvent = (SingleEvent) o7h.s0(eventCardInfoResponse.s().o());
                        String strP = singleEvent != null ? singleEvent.p() : null;
                        String str2 = strP == null ? "" : strP;
                        String strB = fod0Var.b(eventCardInfoResponse.s().p().n(), eventCardInfoResponse.s().q().n());
                        int iR = eventCardInfoResponse.s().r();
                        h290 h290VarO = eventCardInfoResponse.s().o();
                        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                        Iterator it = h290VarO.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((SingleEvent) it.next()).p());
                        }
                        o8q0Var = new n8q0(iR, str2, strB, collectionArtist.q().getLink(), arrayList);
                    }
                    String strO = eventCardInfoResponse.o();
                    String name = collectionArtist.q().getName();
                    String strN = eventCardInfoResponse.n();
                    boolean zQ = eventCardInfoResponse.q();
                    String strR = eventCardInfoResponse.u() ? eventCardInfoResponse.r() : null;
                    iu30 iu30Var = (iu30) obj6;
                    String str3 = c9q0Var.a;
                    if (o8q0Var instanceof o8q0) {
                        str = o8q0Var.a;
                    } else {
                        if (!(o8q0Var instanceof n8q0)) {
                            eg.o();
                            return null;
                        }
                        str = ((n8q0) o8q0Var).a;
                    }
                    c680.i(strO, name, strN, zQ, strR, bool, o8q0Var, iu30Var, (lag) n0oVar.t, str3, str, ((qaq0) n0oVar.i).b(), x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((rzo0) obj5).i((th61) obj4, (String) obj6, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                qxy0.i(czo1.p(513), (String) obj5, (Function0) obj4, (b0k) obj, (hux) obj6, (qim0) obj3);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                qxy0.o((gpq0) obj5, (Function0) obj4, (Function0) obj6, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 7:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                air0 air0Var = (air0) obj5;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    View viewC = air0Var.c();
                    if (viewC == null) {
                        x340Var4.i0(196475346);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(196475347);
                        ven0 ven0Var = (ven0) obj4;
                        ven0 ven0Var2 = (ven0) obj6;
                        dcr0 dcr0Var = (dcr0) obj3;
                        boolean zI = x340Var4.i(viewC);
                        Object objT = x340Var4.T();
                        if (zI || objT == m4cVar) {
                            objT = new xy50(viewC, (byte) 22);
                            x340Var4.s0(objT);
                        }
                        iu30 iu30Var2 = (iu30) objT;
                        boolean zI2 = x340Var4.i(ven0Var) | x340Var4.i(air0Var) | x340Var4.i(ven0Var2) | x340Var4.i(dcr0Var);
                        Object objT2 = x340Var4.T();
                        if (zI2 || objT2 == m4cVar) {
                            o4u o4uVar = new o4u(air0Var, dcr0Var, ven0Var, ven0Var2, (byte) 5);
                            x340Var4.s0(o4uVar);
                            objT2 = o4uVar;
                        }
                        dm5.b(iu30Var2, nim0.a, (iu30) null, (iu30) objT2, (iu30) null, x340Var4, 0, 20);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                d4o1.d((xfx) obj5, (l7u) obj4, (qim0) obj3, (iu30) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                h4o1.h((xfx) obj5, (hi10) obj4, (qim0) obj3, (iu30) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                l6o1.l((xfx) obj5, (u7t0) obj4, (qim0) obj3, (iu30) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                boolean zY = x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2);
                j06 j06Var = x340Var6.a;
                if (zY) {
                    era eraVar = een.Q0;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    cvx cvxVar2 = cbx.b(x340Var6).b;
                    qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 16.0f, ((vzq0) obj5).a(), 2);
                    str0 str0Var = (str0) obj4;
                    iu30 iu30Var3 = (iu30) obj6;
                    lik1 lik1Var = (lik1) obj3;
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var6, 0);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var6, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var6, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var6, lljVar3);
                    nko1.F(x340Var6);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var6, lljVar4);
                    gio1.d((qim0) null, x340Var6, 0);
                    eio1.f(pox.c, cwl1.o0(x340Var6, 2131952717), x340Var6, pox.d);
                    eio1.f(rpx.c, cwl1.o0(x340Var6, 2131952719), x340Var6, rpx.d);
                    eio1.f(zkx.c, cwl1.o0(x340Var6, 2131952715), x340Var6, zkx.d);
                    eio1.f(znx.c, cwl1.o0(x340Var6, 2131952718), x340Var6, znx.d);
                    eio1.f(hmx.c, cwl1.o0(x340Var6, 2131952716), x340Var6, hmx.d);
                    qim0 qim0VarB2 = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, cbx.b(x340Var6).b.a, 7);
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var6, 0);
                    int iHashCode2 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM2 = x340Var6.m();
                    qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarB2);
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(mbhVarA2, x340Var6, lljVar);
                    nko1.H(xos0VarM2, x340Var6, lljVar2);
                    x0d.q(iHashCode2, x340Var6, lljVar3, x340Var6);
                    nko1.H(qim0VarE2, x340Var6, lljVar4);
                    cvx cvxVar3 = cbx.b(x340Var6).b;
                    qim0 qim0VarO = ab80.o(nim0Var, 16.0f, x340Var6, nim0Var, 1.0f);
                    jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var6, 0);
                    int iHashCode3 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM3 = x340Var6.m();
                    qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarO);
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(jw31VarA, x340Var6, lljVar);
                    nko1.H(xos0VarM3, x340Var6, lljVar2);
                    x0d.q(iHashCode3, x340Var6, lljVar3, x340Var6);
                    nko1.H(qim0VarE3, x340Var6, lljVar4);
                    boolean zI3 = x340Var6.i(str0Var) | x340Var6.g(lik1Var) | x340Var6.g(iu30Var3);
                    Object objT3 = x340Var6.T();
                    if (zI3 || objT3 == fkj0.X) {
                        objT3 = new pcp0(str0Var, lik1Var, iu30Var3, (byte) 17);
                        x340Var6.s0(objT3);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT3), new idx(4), anm1.N("parental_consent_education_continue_button", nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, t5j.a, x340Var6, 0, 48, 2040);
                    x340Var6.r(true);
                    op71.g(x340Var6, u291.h(nim0Var, cbx.b(x340Var6).b.b));
                    eio1.i(str0Var, iu30Var3, x340Var6, 0);
                    x340Var6.r(true);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj6;
                qwr0 qwr0Var = (qwr0) obj3;
                xk xkVar = (xk) obj4;
                hxa0 hxa0Var = (hxa0) obj5;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zI4 = x340Var8.i(hxa0Var) | x340Var8.i(xkVar) | x340Var8.i(qwr0Var) | x340Var8.g(iu30Var4);
                    Object objT4 = x340Var8.T();
                    if (zI4 || objT4 == fkj0.X) {
                        odp0 odp0Var = new odp0(hxa0Var, xkVar, qwr0Var, iu30Var4, (byte) 4);
                        x340Var8.s0(odp0Var);
                        objT4 = odp0Var;
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT4), new idx(19), (qim0) null, jax.a, yla.r(x340Var8), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(632165777, new swr0(hxa0Var, (byte) 1), x340Var8), x340Var8, 0, 48, 1996);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                kno1.m((vnr0) obj5, (List) obj4, (vu30) obj6, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                oqo1.e((String) obj5, (gob) obj4, (g5f) obj6, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                tro1.g((tms0) obj5, (Function0) obj4, (Function0) obj6, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ows0.d((String) obj5, (hw61) obj4, (qux) obj6, (qim0) obj3, (b0k) obj, czo1.p(513));
                return rih1Var;
            case 17:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Function0 function0 = (Function0) obj5;
                    if (ihc1.y0("CTA Text Click")) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50("CTA Text Click"), function0), i0p1.t((u7h) obj4, (u7h) obj6), nim0.a, (max) null, yla.s(x340Var10), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1861934412, new psr0((String) obj3, (byte) 14), x340Var10), x340Var10, 0, 48, 2008);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var5 = (iu30) obj3;
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var6 = (iu30) obj6;
                nnt0 nnt0Var = (nnt0) obj4;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    idm idmVar = (idm) obj5;
                    String str4 = nnt0Var.h;
                    boolean zG = x340Var12.g(iu30Var6);
                    Object objT5 = x340Var12.T();
                    if (zG || objT5 == m4cVar2) {
                        objT5 = new smt0(iu30Var6, (byte) 4);
                        x340Var12.s0(objT5);
                    }
                    Function0 function1 = (Function0) objT5;
                    boolean zG2 = x340Var12.g(iu30Var5) | x340Var12.i(nnt0Var);
                    Object objT6 = x340Var12.T();
                    if (zG2 || objT6 == m4cVar2) {
                        objT6 = new ft0(iu30Var5, nnt0Var, (byte) 19);
                        x340Var12.s0(objT6);
                    }
                    otw.c(idmVar, new wcm(str4, (String) null, (String) null, scm.a, function1, (Function0) objT6, false, (String) null, (String) null, 966), (qim0) null, (ipb1) null, x340Var12, 0, 12);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                z5p1.d((String) obj5, (String) obj4, (hnu0) obj6, (gnu0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                ((hou0) obj5).e((String) obj4, (x4i1) obj6, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ((ulc) obj5).e((fji0) obj4, (iu30) obj6, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((ulc) obj5).f((zpu0) obj4, (Function0) obj6, (vu30) obj3, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                w6p1.c((v2v0) obj5, (iu30) obj6, (qim0) obj3, (yqg) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                sok.h((iu30) obj6, (gzv0) obj5, (e9k) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                a8o.j((t7w0) obj5, (s8w0) obj4, (Function0) obj6, (Function0) obj3, (b0k) obj, czo1.p(65));
                return rih1Var;
            case 26:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                boolean zY2 = x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2);
                j06 j06Var2 = x340Var14.a;
                if (!zY2) {
                    x340Var14.b0();
                    return rih1Var;
                }
                uwr uwrVar2 = cbx.a;
                float f = cbx.b(x340Var14).e.b;
                cvx cvxVar4 = cbx.b(x340Var14).b;
                yla.r(x340Var14);
                float f2 = 80.0f + f;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                e8w0 e8w0Var = (e8w0) obj5;
                smp0 smp0Var = (smp0) obj4;
                vu30 vu30Var = (vu30) obj6;
                Function0 function2 = (Function0) obj3;
                mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var14, 0);
                int iHashCode4 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM4 = x340Var14.m();
                qim0 qim0VarE4 = zr7.E(x340Var14, qim0VarD);
                hzj.A.getClass();
                if (j06Var2 == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(n4kVar);
                } else {
                    x340Var14.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA3, x340Var14, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM4, x340Var14, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var14, lljVar7);
                nko1.F(x340Var14);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE4, x340Var14, lljVar8);
                crm0.j(cwl1.o0(x340Var14, 2131952917), null, null, null, x340Var14, 0, 14);
                qim0 qim0VarH = kx40.h(1.0f, u291.d(nim0Var, 1.0f), true);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode5 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM5 = x340Var14.m();
                qim0 qim0VarE5 = zr7.E(x340Var14, qim0VarH);
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(n4kVar);
                } else {
                    x340Var14.v0();
                }
                nko1.H(gfh0VarC, x340Var14, lljVar5);
                nko1.H(xos0VarM5, x340Var14, lljVar6);
                x0d.q(iHashCode5, x340Var14, lljVar7, x340Var14);
                nko1.H(qim0VarE5, x340Var14, lljVar8);
                d36 d36Var = new d36(cbx.b(x340Var14).e.a, true, new um5(false));
                zzq0 zzq0Var = new zzq0(f, f - 12.0f, f, f2);
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                boolean zI5 = x340Var14.i(e8w0Var) | x340Var14.i(smp0Var) | x340Var14.g(vu30Var);
                Object objT7 = x340Var14.T();
                if (zI5 || objT7 == fkj0.X) {
                    objT7 = new ozu0(e8w0Var, smp0Var, vu30Var, (byte) 6);
                    x340Var14.s0(objT7);
                }
                j2h1.d(qim0VarD2, (xtb0) null, (uvx) null, 0, zzq0Var, d36Var, (iu30) objT7, x340Var14, 0, 46);
                pqo.e(0, function2, x340Var14, h2c.a.a(nim0Var, een.X));
                x340Var14.r(true);
                x340Var14.r(true);
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ((yeu0) obj5).d((String) obj4, (uiw0) obj3, (iu30) obj6, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                pxd0.k((vnr0) obj5, (vnr0) obj4, (j2i) obj6, (qim0) obj3, (b0k) obj, czo1.p(29185));
                return rih1Var;
            default:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                iu30 iu30Var7 = (iu30) obj6;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zG3 = x340Var16.g(iu30Var7);
                    Object objT8 = x340Var16.T();
                    if (zG3 || objT8 == fkj0.X) {
                        objT8 = new ppv0(iu30Var7, (byte) 12);
                        x340Var16.s0(objT8);
                    }
                    yon1.h((mox0) obj5, (idm) obj4, (hft0) obj3, jzn1.w(nim0Var, (iu30) objT8, x340Var16), iu30Var7, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2o0(Object obj, Object obj2, Object obj3, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2o0(Object obj, Object obj2, Object obj3, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2o0(Object obj, Object obj2, iu30 iu30Var, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = iu30Var;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2o0(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2o0(iu30 iu30Var, gzv0 gzv0Var, e9k e9kVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 24;
        this.b = iu30Var;
        this.d = gzv0Var;
        this.e = e9kVar;
        this.c = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2o0(iu30 iu30Var, mox0 mox0Var, idm idmVar, hft0 hft0Var) {
        super(2);
        this.a = (byte) 29;
        this.b = iu30Var;
        this.d = mox0Var;
        this.e = idmVar;
        this.c = hft0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2o0(air0 air0Var, ven0 ven0Var, ven0 ven0Var2, dcr0 dcr0Var) {
        super(2);
        this.a = (byte) 7;
        this.d = air0Var;
        this.e = ven0Var;
        this.b = ven0Var2;
        this.c = dcr0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2o0(v2v0 v2v0Var, iu30 iu30Var, qim0 qim0Var, yqg yqgVar, int i) {
        super(2);
        this.a = (byte) 23;
        this.d = v2v0Var;
        this.b = iu30Var;
        this.c = qim0Var;
        this.e = yqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2o0(e8w0 e8w0Var, smp0 smp0Var, vu30 vu30Var, Function0 function0) {
        super(2);
        this.a = (byte) 26;
        this.d = e8w0Var;
        this.e = smp0Var;
        this.b = vu30Var;
        this.c = function0;
    }
}
