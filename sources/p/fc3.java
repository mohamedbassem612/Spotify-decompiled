package p;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import com.spotify.concertsgalleryview.v1.GetGalleryPageResponse;
import com.spotify.encore.image.EncoreImageView;
import com.spotify.mobius.Next;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fc3 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc3(p410 p410Var, int i) {
        super(2);
        this.a = (byte) 10;
        this.b = p410Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Object objInvoke;
        Object obj3;
        String strA;
        lye0 lye0Var;
        boolean z;
        Object obj4;
        i = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                sve0 sve0Var = (sve0) obj;
                gc3 gc3Var = (gc3) this.b;
                dp5 dp5Var = gc3Var.c;
                lc3 lc3Var = gc3Var.b;
                String uri = lc3Var.getUri();
                w7x w7xVar = w7x.a;
                sve0Var.a(ijo.class, l700.class, piw.class, new ijo(12, w7xVar, w7xVar), new wgo(dp5Var));
                sve0Var.b(jc91.class, new zae(uri, (byte) 1));
                gc3Var.d.m(sve0Var, lc3Var.getUri(), gc3Var.i.b());
                if (gc3Var.k) {
                    gc3Var.e.C0(sve0Var);
                }
                return rih1.a;
            case 1:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                mz6 mz6Var = (mz6) this.b;
                x340 x340Var = (x340) b0kVar;
                if (x340Var.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = (rm6) mz6.c(mz6Var).get();
                        x340Var.s0(objT);
                    }
                    objT.getClass();
                    rm6 rm6Var = (rm6) objT;
                    im6 im6VarP = hno1.p(mz6.e(mz6Var));
                    boolean zI = x340Var.i(mz6Var) | x340Var.i(rm6Var) | x340Var.g(im6VarP);
                    Object objT2 = x340Var.T();
                    Object obj5 = objT2;
                    if (zI || objT2 == m4cVar) {
                        lz6 lz6Var = new lz6(mz6Var, rm6Var, im6VarP, (byte) 0);
                        x340Var.s0(lz6Var);
                        obj5 = lz6Var;
                    }
                    qxd0.i(im6VarP, (iu30) obj5, x340Var);
                    otw.c(rm6Var, im6VarP, null, wpb1.C(mz6.class.getName(), rm6Var, hno1.p(mz6.e(mz6Var)), x340Var, 0, 8), x340Var, 0, 4);
                } else {
                    x340Var.b0();
                }
                return rih1.a;
            case 2:
                return ((jpk) this.b).e.t((GetGalleryPageResponse) obj);
            case 3:
                mtv mtvVar = (mtv) this.b;
                jtv jtvVar = mtvVar.d;
                ptv ptvVar = mtvVar.c;
                return jtvVar.b((f8e0) obj, (Bundle) obj2, ptvVar.b(), ptvVar.a());
            case 4:
                return bs51.k(Observable.just(new an41(new f2t((kly0) this.b, (dn41) obj2, (byte) 26))));
            case 5:
                return new cdk1(((vu30) this.b).invoke((zob1) obj, (iac0) obj2));
            case 6:
                qim0 qim0Var = (qim0) obj;
                float f = ((p3v) obj2).a;
                ecx ecxVar = (ecx) this.b;
                if (ecxVar != null) {
                    float f2 = ecxVar.a;
                    if (f2 != 1.0f) {
                        return f2 > 1.0f ? u291.v(qim0Var, f) : u291.h(qim0Var, f);
                    }
                }
                return u291.r(qim0Var, f);
            case 7:
                b0k b0kVar2 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                EncoreImageView encoreImageView = (EncoreImageView) this.b;
                x340 x340Var2 = (x340) b0kVar2;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tux source = encoreImageView.getSource();
                    boolean z2 = source instanceof sux;
                    if (z2 && encoreImageView.imageLoader == null) {
                        eg.m("Please initialize the property image loader before using EncoreImageView with an URI source.");
                        return null;
                    }
                    if (u890.j(source, rux.a)) {
                        x340Var2.i0(-364022824);
                        cso1.f((jmr0) encoreImageView.getPlaceholderFactory().invoke(x340Var2, 0), encoreImageView.get_contentDescription(), (qim0) encoreImageView.getModifierFactory().invoke(x340Var2, 0), encoreImageView.getContentScale(), encoreImageView.getAlignment(), x340Var2, 8, 32);
                        x340Var2.r(false);
                    } else {
                        if (!z2) {
                            throw p3d1.k(x340Var2, -364023721, false);
                        }
                        x340Var2.i0(-364000882);
                        mod.b(oi7.a.a(encoreImageView.getImageLoader()), apo.r(1249655568, new l04((sux) source, encoreImageView, (byte) 3), x340Var2), x340Var2, 56);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            case 8:
                deh dehVar = deh.a;
                Intent intent = (Intent) obj;
                irn0 irn0Var = (irn0) obj2;
                m830 m830Var = m830.b1;
                mg30 mg30Var = (mg30) this.b;
                kg30 kg30Var = new kg30(mg30Var, intent, (byte) 0);
                kg30 kg30Var2 = new kg30(mg30Var, intent, (byte) 1);
                kg30 kg30Var3 = new kg30(mg30Var, intent, (byte) 2);
                kg30 kg30Var4 = new kg30(mg30Var, intent, (byte) 3);
                u830 u830Var = new u830(mg30Var, (byte) 2);
                if (irn0Var instanceof crn0) {
                    m830Var.invoke(irn0Var);
                    objInvoke = dehVar;
                } else if (irn0Var instanceof ern0) {
                    kg30Var2.invoke(irn0Var);
                    objInvoke = dehVar;
                } else if (irn0Var instanceof grn0) {
                    kg30Var.invoke(irn0Var);
                    objInvoke = dehVar;
                } else if (irn0Var instanceof frn0) {
                    objInvoke = kg30Var3.invoke(irn0Var);
                } else if (irn0Var instanceof hrn0) {
                    objInvoke = kg30Var4.invoke(irn0Var);
                } else {
                    if (!(irn0Var instanceof drn0)) {
                        eg.o();
                        return null;
                    }
                    u830Var.invoke(irn0Var);
                    objInvoke = dehVar;
                }
                return (geh) objInvoke;
            case 9:
                b0k b0kVar3 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                az50 az50Var = (az50) this.b;
                x340 x340Var3 = (x340) b0kVar3;
                if (x340Var3.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    kiv kivVar = ef.a;
                    yy50 yy50Var = az50Var.t;
                    if (yy50Var == null) {
                        yy50Var = new yy50();
                    }
                    mod.b(kivVar.a(yy50Var), apo.r(454740548, new zy50(az50Var, (byte) 1), x340Var3), x340Var3, 56);
                } else {
                    x340Var3.b0();
                }
                return rih1.a;
            case 10:
                ((Number) obj2).intValue();
                ((p410) this.b).c((b0k) obj, czo1.p(1));
                return rih1.a;
            case 11:
                ne80 ne80Var = (ne80) obj;
                oe80 oe80Var = (oe80) obj2;
                m6p1 m6p1Var = oe80Var.a;
                if (m6p1Var instanceof de80) {
                    m6p1Var = ((se80) this.b).f;
                }
                oe80 oe80VarA = oe80.a(oe80Var, m6p1Var, (o6p1) null, ne80Var.b(), ne80Var.c(), ne80Var.a(), 2);
                return ((m6p1Var instanceof be80) && (oe80Var.b instanceof fe80)) ? Next.i(oe80VarA, Collections.singleton(new he80(((be80) m6p1Var).A(), ne80Var.b(), ne80Var.a()))) : Next.h(oe80VarA);
            case 12:
                ((Number) obj2).intValue();
                x340 x340Var4 = (x340) ((b0k) obj);
                x340Var4.i0(-1667432149);
                ez80 ez80Var = (ez80) this.b;
                yo2 yo2Var = ez80Var.k;
                boolean zI2 = x340Var4.i(ez80Var);
                Object objT3 = x340Var4.T();
                if (zI2 || objT3 == fkj0.X) {
                    obj3 = objT3;
                    nd70 nd70Var = new nd70(ez80Var, (byte) 24);
                    x340Var4.s0(nd70Var);
                    obj3 = nd70Var;
                }
                obj3 = objT3;
                max maxVarZ = xa4.z(yo2Var, (Function0) obj3, x340Var4);
                x340Var4.r(false);
                return maxVarZ;
            case 13:
                b0k b0kVar4 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                ica0 ica0Var = (ica0) this.b;
                x340 x340Var5 = (x340) b0kVar4;
                if (x340Var5.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int iC = l1d.C(ica0.j(ica0Var));
                    if (iC == 0) {
                        x340Var5.i0(1552287160);
                        otw.c(ica0.c(ica0Var), new hba0(ica0.d(ica0Var), ica0.h(ica0Var), !((bp90) ica0.f(ica0Var).e.a().getValue()).e), null, null, x340Var5, 0, 12);
                        x340Var5.r(false);
                    } else if (iC == 1) {
                        x340Var5.i0(1552300599);
                        otw.c(ica0.i(ica0Var), new uca0(ica0.d(ica0Var), ica0.h(ica0Var), j1e1.l(ica0.d(ica0Var)), ica0.d(ica0Var).c().b(), j1e1.k(ica0.d(ica0Var)), ((no4) ica0.g(ica0Var).a.get()).U(), ica0.d(ica0Var).a()), null, null, x340Var5, 0, 12);
                        x340Var5.r(false);
                    } else {
                        if (iC != 2) {
                            throw p3d1.k(x340Var5, 1552286144, false);
                        }
                        x340Var5.i0(1552322158);
                        dea0 dea0VarE = ica0.e(ica0Var);
                        qo90 qo90VarD = ica0.d(ica0Var);
                        xea0 xea0VarH = ica0.h(ica0Var);
                        boolean zL = j1e1.l(ica0.d(ica0Var));
                        kp90 kp90VarA = ica0.d(ica0Var).c().a().a();
                        otw.c(dea0VarE, new tda0(qo90VarD, xea0VarH, zL, (kp90VarA == null || (strA = kp90VarA.a()) == null) ? "" : strA, ica0.d(ica0Var).c().b(), ica0.d(ica0Var).c().a().a() != null, j1e1.k(ica0.d(ica0Var)), ica0.d(ica0Var).a()), null, null, x340Var5, 0, 12);
                        x340Var5.r(false);
                    }
                } else {
                    x340Var5.b0();
                }
                return rih1.a;
            case 14:
                Object obj6 = ((cdk1) ((vu30) ((Map.Entry) this.b).getValue()).invoke((zob1) obj, (iac0) obj2)).a;
                laa laaVar = obj6 instanceof laa ? (laa) obj6 : null;
                if (laaVar != null) {
                    return laaVar;
                }
                tyq tyqVar = obj6 instanceof tyq ? (tyq) obj6 : null;
                qfv qfvVarM0 = tyqVar != null ? fdg1.m0(tyqVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : null;
                return qfvVarM0 != null ? qfvVarM0 : f6o1.A((maa) obj6, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 15:
                zxa0 zxa0Var = (zxa0) obj;
                Bundle bundle = (Bundle) obj2;
                if (bundle != null && (lye0Var = (lye0) jhc1.t(bundle, "login_choice_page_model", lye0.class)) != null) {
                    return lye0Var;
                }
                nye0 nye0Var = (nye0) this.b;
                String strB = zxa0Var.b();
                Integer numA = zxa0Var.a();
                pye0 pye0Var = nye0Var.e;
                String strA2 = pye0Var.a();
                zzy zzyVarB = pye0Var.b();
                Boolean boolH = pye0Var.h();
                pe peVar = nye0Var.c;
                return new lye0(strA2, strB, zzyVarB, boolH, numA, peVar.b(3) && !peVar.d());
            case 16:
                lsg0 lsg0Var = (lsg0) obj;
                yrg0 yrg0Var = ((bsg0) this.b).e;
                String strB2 = lsg0Var.b();
                List listA = lsg0Var.a();
                if (listA.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = listA.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                        } else if (!((hrg0) it.next()).g()) {
                            z = false;
                        }
                    }
                }
                List<hrg0> listA2 = lsg0Var.a();
                ArrayList arrayList = new ArrayList(q7h.U(listA2, 10));
                for (hrg0 hrg0Var : listA2) {
                    String strD = hrg0Var.d();
                    String strA3 = hrg0Var.a();
                    tfs tfsVarB = ufs.b((ufs) yrg0Var.b, "", hrg0Var.c(), hrg0Var.b());
                    tfsVarB.f();
                    tfsVarB.h();
                    tfsVarB.i();
                    arrayList.add(new irg0(strD, strA3, tfsVarB.a(), hrg0Var.g(), false, hrg0Var.f(), hrg0Var.e()));
                }
                List listA3 = lsg0Var.a();
                if (!listA3.isEmpty()) {
                    Iterator it2 = listA3.iterator();
                    while (it2.hasNext()) {
                        if (((hrg0) it2.next()).g() && (i = i + 1) < 0) {
                            p7h.S();
                            throw null;
                        }
                    }
                }
                return new msg0(i, strB2, arrayList, z, false);
            case 17:
                b0k b0kVar5 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var6 = (x340) b0kVar5;
                if (x340Var6.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ((j2i) this.b).invoke(x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1.a;
            case 18:
                return ((u9c) this.b).h((zob1) obj);
            case 19:
                b0k b0kVar6 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var7 = (x340) b0kVar6;
                if (x340Var7.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    irn1.u((qim0) null, (vu30) null, (vu30) null, (erl1) null, apo.r(-1269110485, new dvt0((bmx0) this.b, (byte) 22), x340Var7), x340Var7, 24576, 15);
                } else {
                    x340Var7.b0();
                }
                return rih1.a;
            case 20:
                b0k b0kVar7 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var8 = (x340) b0kVar7;
                if (x340Var8.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    w0h1.a(mlx.c, isl.a, (qim0) null, ((hc01) this.b).a(), 0L, false, x340Var8, mlx.d | 48, 52);
                } else {
                    x340Var8.b0();
                }
                return rih1.a;
            case 21:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                kzt.c(fFloatValue, (ven0) this.b);
                return rih1.a;
            case 22:
                rih1 rih1Var = rih1.a;
                b0k b0kVar8 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                urc1 urc1Var = (urc1) this.b;
                rwj rwjVar = urc1Var.b;
                x340 x340Var9 = (x340) b0kVar8;
                if (!x340Var9.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x340Var9.b0();
                } else if (urc1Var.g.a()) {
                    x340Var9.i0(1870208169);
                    mqo1.j(urc1Var.c, urc1Var.d, urc1Var.e, urc1Var.f, x340Var9, 0);
                    x340Var9.r(false);
                } else {
                    x340Var9.i0(1870437011);
                    otw.c(rwjVar, rih1Var, null, wpb1.C("SubtitlesPageStateHolder", rwjVar, rih1Var, x340Var9, 390, 8), x340Var9, 48, 4);
                    x340Var9.r(false);
                }
                return rih1Var;
            case 23:
                b0k b0kVar9 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                n0i1 n0i1Var = (n0i1) this.b;
                p0i1 p0i1Var = n0i1Var.c;
                x340 x340Var10 = (x340) b0kVar9;
                if (x340Var10.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    otw.c(new suh1(n0i1Var.a, n0i1Var.d, n0i1Var.e), new tyh1(p0i1Var.a(), p0i1Var.b()), null, null, x340Var10, 0, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1.a;
            case 24:
                b0k b0kVar10 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                kii1 kii1Var = (kii1) this.b;
                bck1 bck1Var = kii1Var.P1;
                x340 x340Var11 = (x340) b0kVar10;
                if (x340Var11.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    rqe1 rqe1Var = (rqe1) b2p1.C(((MobiusLoopViewModel) bck1Var.getValue()).b, x340Var11).getValue();
                    si1 si1VarV = rqe1Var != null ? sj1.v(rqe1Var, kii1Var.O1) : null;
                    ztq ztqVar = kii1Var.N1;
                    if (ztqVar == null) {
                        u890.C("timelineListElementFactory");
                        throw null;
                    }
                    fhi1 fhi1Var = kii1Var.L1;
                    if (fhi1Var == null) {
                        u890.C("errorElementLogger");
                        throw null;
                    }
                    ytq ytqVar = kii1Var.M1;
                    if (ytqVar == null) {
                        u890.C("userListeningStatusElementFactory");
                        throw null;
                    }
                    MobiusLoopViewModel mobiusLoopViewModel = (MobiusLoopViewModel) bck1Var.getValue();
                    boolean zI3 = x340Var11.i(mobiusLoopViewModel);
                    Object objT4 = x340Var11.T();
                    if (zI3 || objT4 == fkj0.X) {
                        obj4 = objT4;
                        hcf1 hcf1Var = new hcf1(mobiusLoopViewModel);
                        x340Var11.s0(hcf1Var);
                        obj4 = hcf1Var;
                    }
                    obj4 = objT4;
                    c8o.h(si1VarV, ztqVar, fhi1Var, ytqVar, (iu30) obj4, x340Var11, 0);
                } else {
                    x340Var11.b0();
                }
                return rih1.a;
            case 25:
                y8j1 y8j1Var = (y8j1) obj;
                f8j1 f8j1Var = (f8j1) obj2;
                return Next.h(new f8j1(f8j1Var.a, y8j1Var.a(), y8j1Var.b(), ((x8j1) this.b).f(y8j1Var) ? new a8j1(true) : f8j1Var.g, f8j1Var.h, 14));
            default:
                ((AppWidgetManager) obj).partiallyUpdateAppWidget((int[]) obj2, (RemoteViews) this.b);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc3(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
