package p;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q081 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q081(qba1 qba1Var, oba1 oba1Var) {
        super(2);
        this.a = (byte) 21;
        this.b = qba1Var;
        this.c = oba1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        int i;
        uk71 s55Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        vnr0 vnr0VarG = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                zob1 zob1Var = (zob1) obj;
                d5n0 d5n0Var = (d5n0) obj4;
                bpb1 bpb1Var = ((xk00) obj3).b;
                vnr vnrVar = (vnr) d5n0Var.b;
                i081 i081Var = (i081) ((kly0) d5n0Var.f).get();
                kly0 kly0Var = (kly0) d5n0Var.e;
                qkg qkgVarA = ((lmo) d5n0Var.i).a();
                c35 c35Var = (c35) d5n0Var.h;
                return new jpg0(new i181(zob1Var, bpb1Var, vnrVar, i081Var, kly0Var, ujo1.p(qkgVarA, c35Var.d(), c35Var.b(), c35Var.a(), c35Var.e()) ? (r860) d5n0Var.g : null), rz71.d);
            case 1:
                ((Number) obj2).intValue();
                r6p1.l((j681) obj4, (String) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                rd81 rd81Var = (rd81) obj4;
                epb1 epb1Var = new epb1((zob1) obj);
                xk00 xk00Var = (xk00) obj3;
                Context context = rd81Var.o;
                r961 r961Var = rd81Var.a;
                gw70 gw70Var = rd81Var.b;
                lo60 lo60Var = rd81Var.c;
                l0x0 l0x0Var = rd81Var.d;
                idd1 idd1Var = new idd1(new l5v0(rd81Var, (byte) 20));
                aru0 aru0Var = rd81Var.f;
                Flowable flowable = rd81Var.g;
                idd1 idd1Var2 = new idd1(new qv61(rd81Var, (byte) 29));
                idd1 idd1Var3 = new idd1(new fh61(rd81Var, xk00Var, (byte) 21));
                idd1 idd1Var4 = new idd1(w0n0.U0);
                idd1 idd1Var5 = new idd1(new l5v0(xk00Var, (byte) 21));
                kko kkoVar = xk00Var.a;
                klv0 klv0Var = xk00Var.i;
                vgm vgmVar = rd81Var.h;
                mr20 mr20VarA = rd81Var.j.a();
                Function0 function0 = rd81Var.n;
                ggx0 ggx0Var = new ggx0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 26);
                nwt nwtVar = rd81Var.l;
                iac0 iac0Var = rd81Var.m;
                uhk1 uhk1Var = new uhk1(nwtVar, iac0Var, kjy0.a);
                uu00 uu00Var = rd81Var.x;
                tbw0 tbw0Var = rd81Var.y;
                yqg yqgVar = rd81Var.B;
                cua cuaVar = rd81Var.z;
                dnc dncVar = rd81Var.A;
                y441 y441Var = rd81Var.q;
                hvp0 hvp0Var = rd81Var.r;
                ggl gglVar = rd81Var.s;
                boolean zA = rd81Var.t.a();
                t2j0 t2j0Var = rd81Var.u;
                krh krhVar = rd81Var.v;
                ov20 ov20Var = rd81Var.w;
                j0d1 j0d1VarB = guo1.B();
                fns fnsVar = igu.a;
                return new jpg0(new aso(new zhc0(context, gw70Var, epb1Var, lo60Var, l0x0Var, idd1Var, idd1Var5, idd1Var2, idd1Var3, idd1Var4, y441Var, hvp0Var, aru0Var, flowable, kkoVar, klv0Var, vgmVar, mr20VarA, new pd81(xk00Var), function0, ggx0Var, uhk1Var, uu00Var, tbw0Var, yqgVar, cuaVar, dncVar, iac0Var, r961Var, gglVar, zA, t2j0Var, krhVar, ov20Var, smo1.e(flo1.l(j0d1VarB, pyf0.a)), rd81Var.l, rd81Var.C.b), new dw81(rd81Var, (byte) 29)), oa81.i);
            case 3:
                ee81 ee81Var = (ee81) obj4;
                epb1 epb1Var2 = new epb1((zob1) obj);
                ajq0 ajq0Var = (ajq0) obj3;
                Context context2 = ee81Var.a;
                gw70 gw70Var2 = ee81Var.b;
                lzn0 lzn0Var = ee81Var.c;
                l0x0 l0x0Var2 = ee81Var.d;
                idd1 idd1Var6 = new idd1(new de81(ee81Var, (byte) 0));
                byte b2 = 1;
                idd1 idd1Var7 = new idd1(new jnx0(ajq0Var, b2));
                idd1 idd1Var8 = new idd1(new de81(ee81Var, b2));
                idd1 idd1Var9 = new idd1(new fh61(ee81Var, ajq0Var, (byte) 22));
                idd1 idd1Var10 = new idd1(da71.d1);
                aru0 aru0Var2 = ee81Var.g;
                Flowable flowable2 = ee81Var.h;
                kko kkoVar2 = (kko) ajq0Var.a;
                klv0 klv0Var2 = (klv0) ajq0Var.b;
                vgm vgmVar2 = ee81Var.i;
                mr20 mr20VarA2 = ee81Var.j.a();
                qa2 qa2Var = ee81Var.y;
                qa2 qa2Var2 = ee81Var.z;
                tco0 tco0Var = new tco0();
                uu00 uu00Var2 = ee81Var.r;
                tbw0 tbw0Var2 = ee81Var.s;
                yqg yqgVar2 = ee81Var.v;
                cua cuaVar2 = ee81Var.u;
                dnc dncVar2 = ee81Var.t;
                iac0 iac0Var2 = ee81Var.l;
                r961 r961Var2 = ee81Var.m;
                y441 y441Var2 = ee81Var.n;
                hvp0 hvp0Var2 = ee81Var.o;
                ggl gglVar2 = ee81Var.f12p;
                boolean zA2 = ee81Var.q.a();
                t2j0 t2j0Var2 = ee81Var.w;
                krh krhVar2 = ee81Var.x;
                ov20 ov20Var2 = ee81Var.B;
                j0d1 j0d1VarB2 = guo1.B();
                fns fnsVar2 = igu.a;
                return new jpg0(new aso(new zhc0(context2, gw70Var2, epb1Var2, lzn0Var, l0x0Var2, idd1Var6, idd1Var7, idd1Var8, idd1Var9, idd1Var10, y441Var2, hvp0Var2, aru0Var2, flowable2, kkoVar2, klv0Var2, vgmVar2, mr20VarA2, new d781(ajq0Var, (byte) 6), qa2Var, qa2Var2, tco0Var, uu00Var2, tbw0Var2, yqgVar2, cuaVar2, dncVar2, iac0Var2, r961Var2, gglVar2, zA2, t2j0Var2, krhVar2, ov20Var2, smo1.e(flo1.l(j0d1VarB2, pyf0.a)), ee81Var.A, ee81Var.C.b), new qd81(ee81Var, (byte) 2)), oa81.Y);
            case 4:
                ((Number) obj2).intValue();
                ((zg81) obj4).j((qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    li81 li81Var = (li81) obj4;
                    otw.c(li81Var.a, li81Var.b, (qim0) obj3, (ipb1) null, x340Var2, 0, 8);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((pt) obj4).w(czo1.p(7), (j2i) obj3, (b0k) obj);
                return rih1Var;
            case 7:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x2y x2yVar = (x2y) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ven0 ven0VarH = rwq.h((xe01) x2yVar.c, x340Var4, 0);
                    boolean z = !((bhm0) ven0VarH.getValue()).b;
                    boolean zI = x340Var4.i(x2yVar);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        i = 0;
                        objT = new hk81(x2yVar, (byte) 0);
                        x340Var4.s0(objT);
                    } else {
                        i = 0;
                    }
                    q3p1.b(i, i, (Function0) objT, x340Var4, z);
                    nyx.a(2, (wux) null, apo.r(-1165344711, new jk81((kk81) obj3, x2yVar, ven0VarH, (byte) 1), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((qk81) obj4).n1((xtj) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 9:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    hy81 hy81Var = (hy81) obj4;
                    iu30 iu30Var = (iu30) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarD);
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
                    nko1.H(gfh0VarC, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    w2g0.c(h2c.a.a(nim0Var, een.h), (tl3) null, apo.r(389311363, new rt11(hy81Var, iu30Var, (byte) 28), x340Var6), x340Var6, 3072, 6);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((cx0) obj4).f((qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                c8o.e((jx11) obj4, (qim0) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 12:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    u591 u591Var = (u591) obj4;
                    nu nuVar = u591Var.b;
                    r591 r591Var = (r591) obj3;
                    y591 y591Var = u591Var.c;
                    y7h0 y7h0Var = u591Var.d;
                    if (y591Var instanceof w591) {
                        s55Var = new uk71(y7h0Var, y591Var, (lnm) null, (byte) 14);
                    } else {
                        if (!(y591Var instanceof x591)) {
                            eg.o();
                            return null;
                        }
                        s55Var = new s55(2, (lnm) null, (byte) 23);
                    }
                    otw.c(nuVar, new a691(r591Var, s55Var), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((ybx0) obj4).b((Function0) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 14:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                boolean zY = x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2);
                j06 j06Var = x340Var10.a;
                if (zY) {
                    qim0 qim0VarL = bmq0.L(u291.f(nim0Var, 1.0f), k1o1.q(x340Var10), (g6o0) null);
                    x991 x991Var = (x991) obj4;
                    w991 w991Var = (w991) obj3;
                    era eraVar = een.P0;
                    f36 f36Var = h36.c;
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var10, 0);
                    int iHashCode2 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM2 = x340Var10.m();
                    qim0 qim0VarE2 = zr7.E(x340Var10, qim0VarL);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var10, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM2, x340Var10, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var10, lljVar3);
                    nko1.F(x340Var10);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE2, x340Var10, lljVar4);
                    qim0 qim0VarH = l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var10), false, 14);
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var10, 0);
                    int iHashCode3 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM3 = x340Var10.m();
                    qim0 qim0VarE3 = zr7.E(x340Var10, qim0VarH);
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(mbhVarA2, x340Var10, lljVar);
                    nko1.H(xos0VarM3, x340Var10, lljVar2);
                    x0d.q(iHashCode3, x340Var10, lljVar3, x340Var10);
                    nko1.H(qim0VarE3, x340Var10, lljVar4);
                    jto1.b((qim0) null, (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(2121966526, new rt11(x991Var, w991Var, (byte) 29), x340Var10), x340Var10, 0, 196608, 32767);
                    rqo1.g(0, 1, x340Var10, (qim0) null);
                    x340Var10.r(true);
                    qim0 qim0VarH2 = l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var10), false, 14);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var10).b;
                    qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarH2);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarP = x0d.p(lhc.g(x340Var10).g, 32, qim0VarZ);
                    mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var10, 0);
                    int iHashCode4 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM4 = x340Var10.m();
                    qim0 qim0VarE4 = zr7.E(x340Var10, qim0VarP);
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(mbhVarA3, x340Var10, lljVar);
                    nko1.H(xos0VarM4, x340Var10, lljVar2);
                    x0d.q(iHashCode4, x340Var10, lljVar3, x340Var10);
                    nko1.H(qim0VarE4, x340Var10, lljVar4);
                    x340Var10.i0(-603372986);
                    List<sa91> list = w991Var.d;
                    iu30 iu30Var2 = w991Var.c;
                    String str = w991Var.a;
                    for (sa91 sa91Var : list) {
                        if (sa91Var instanceof qa91) {
                            x340Var10.i0(-871278033);
                            otw.c(x991Var.d, new l991((qa91) sa91Var, str, iu30Var2), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                            x340Var10.r(false);
                        } else if (sa91Var instanceof ra91) {
                            x340Var10.i0(-871265449);
                            otw.c(x991Var.e, new r991((ra91) sa91Var, str, iu30Var2), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                            x340Var10.r(false);
                        } else {
                            if (!(sa91Var instanceof pa91)) {
                                throw p3d1.k(x340Var10, -871279656, false);
                            }
                            x340Var10.i0(-871252855);
                            otw.c(x991Var.c, new a991((pa91) sa91Var, str, iu30Var2), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                            x340Var10.r(false);
                        }
                    }
                    us71.m(x340Var10, false, true, true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ((aqw) obj4).a((qt91) obj3, (qe41) null, x340Var12, 0, 2);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 16:
                tt91 tt91Var = (tt91) obj4;
                ComposeView composeView = new ComposeView(tt91Var.a, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                mmr0 mmr0Var = (mmr0) obj3;
                composeView.setViewCompositionStrategy(p5x0.W0);
                op80 jp80Var = new jp80(new it1(composeView, (byte) 3));
                op80 eq80Var = new eq80(new e3h1(tt91Var.j, (n7h1) null, tt91Var.i));
                op80 wchVar = q6x.b;
                if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                    jp80Var = wchVar;
                } else if (jp80Var.equals(wchVar)) {
                    jp80Var = eq80Var;
                } else if (!eq80Var.equals(wchVar)) {
                    wchVar = new wch(jp80Var, eq80Var);
                    jp80Var = wchVar;
                }
                xhk1.c(composeView, jp80Var);
                composeView.setContent(new j2i(-84693263, new rt91(mmr0Var, tt91Var), true));
                return composeView;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj2).intValue();
                x760.d((w7a1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                x760.k((x7a1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                iu30 iu30Var3 = (iu30) obj4;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qim0 qim0VarR = u291.r(uyn1.B(nim0.a, 6.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f);
                    cr31 cr31Var = er31.a;
                    vzq0.a.getClass();
                    tzq0 tzq0Var = uzq0.b;
                    boolean zG = x340Var14.g(iu30Var3);
                    Object objT2 = x340Var14.T();
                    if (zG || objT2 == fkj0.X) {
                        objT2 = new pc81(iu30Var3, (byte) 27);
                        x340Var14.s0(objT2);
                    }
                    cwl1.b(qim0VarR, (tl3) null, cr31Var, (pgx) null, tzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT2), (gbx) null, apo.r(-956585603, new gge0((Context) obj3, (byte) 2), x340Var14), x340Var14, 0, 48, 1514);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                ((boe) obj4).g((jaa1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    otw.c((qba1) obj4, (oba1) obj3, nim0.a, (ipb1) null, x340Var16, 0, 8);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((vba1) obj4).e((uba1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                ((sca1) obj4).e((qca1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj2).intValue();
                ((sca1) obj4).f((rca1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                hqq0.z((k1r) obj4, (j2i) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                ((pda1) obj4).c(czo1.p(7), (j2i) obj3, (b0k) obj);
                return rih1Var;
            case 27:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                cka1 cka1Var = (cka1) obj4;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    vnr0 vnr0VarG2 = cka1Var.a.g((djc0) null, x340Var18, 1);
                    d761 d761Var = cka1Var.b;
                    if (d761Var == null) {
                        x340Var18.i0(971129861);
                    } else {
                        x340Var18.i0(-1769788548);
                        vnr0VarG = d761Var.g((djc0) null, x340Var18, 1);
                    }
                    x340Var18.r(false);
                    jo31.b(vnr0VarG2, vnr0VarG, cka1Var.c, (vtq) ((ngs0) obj3).d, (qim0) null, x340Var18, 584);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 28:
                b0k b0kVar = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                wat watVar = (wat) obj3;
                s24 s24Var = (s24) obj4;
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    qim0 qim0VarB = uyn1.B(u291.z(nim0Var, (fra) null, 1), dsa0.m(b0kVar2, 2131167046), 0.0f, dsa0.m(b0kVar2, 2131167045), 0.0f, 10);
                    boolean zI2 = b0kVar2.i(s24Var) | b0kVar2.i(watVar);
                    Object objT3 = b0kVar2.T();
                    if (zI2 || objT3 == fkj0.X) {
                        objT3 = new sza1(s24Var, watVar, (byte) 2);
                        b0kVar2.s0(objT3);
                    }
                    qim0 qim0VarX = ern1.x(qim0VarB, (iu30) objT3);
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode5 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM5 = b0kVar2.m();
                    qim0 qim0VarE5 = zr7.E(b0kVar2, qim0VarX);
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
                    nko1.H(gfh0VarC2, b0kVar2, y580.O0);
                    nko1.H(xos0VarM5, b0kVar2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode5), b0kVar2, y580.R0);
                    nko1.F(b0kVar2);
                    nko1.H(qim0VarE5, b0kVar2, y580.Y);
                    ov50 ov50Var = ((rbt) s24Var.b).c;
                    b0kVar2.i0(-579182485);
                    ov50Var.c(b0kVar2, 0);
                    b0kVar2.r(false);
                    b0kVar2.r(true);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var19 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                q3b1 q3b1Var = (q3b1) obj4;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    mod.c(new ely0[]{oi7.a.a(q3b1Var.a), ef.a.a(q3b1Var.b), ef.b.a(ef.d(x340Var20))}, apo.r(-1028521374, new j2r0((j2i) obj3, (byte) 20), x340Var20), x340Var20, 56);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q081(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q081(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
