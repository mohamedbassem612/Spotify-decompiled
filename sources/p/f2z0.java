package p;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f2z0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2z0(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    public static final boolean a(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:52:0x027d  */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        int i;
        ou80 ou80Var;
        String strA;
        String str;
        ou80 ou80Var2;
        y711 y711Var;
        w7h1 w7h1Var;
        rrt0 rrt0Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        ou80 ou80VarY = null;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                e2z0 e2z0Var = (e2z0) obj;
                d2z0 d2z0Var = (d2z0) obj2;
                tqw tqwVar = (tqw) obj3;
                if (d2z0Var instanceof b2z0) {
                    e2z0Var.f.invoke();
                    return rih1Var;
                }
                if (d2z0Var instanceof a2z0) {
                    e2z0Var.g.invoke();
                    return rih1Var;
                }
                if (!(d2z0Var instanceof c2z0)) {
                    eg.o();
                    return null;
                }
                k1z0 k1z0Var = e2z0Var.b;
                ykz0 ykz0Var = new ykz0(k1z0Var.g.c, k1z0Var.a);
                lzn0 lzn0Var = ((h2z0) obj4).c;
                String str2 = nik1.U.a;
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                dwn0 dwn0Var = new dwn0(str2, "", false, false, 0, 0, false, null, null, tv80VarY != null ? new bwn0(tv80VarY) : null);
                Bundle bundle = new Bundle();
                bundle.putParcelable("quiz_sources_params", ykz0Var);
                lzn0Var.i(dwn0Var, bundle);
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str3 = ((y6d1) obj4).b;
                uwr uwrVar = cbx.a;
                uwo1.e(str3, nim0.a, cbx.d(b0kVar).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 48, 0, 2040);
                return rih1Var;
            case 2:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-1891842455);
                es41 es41Var = (es41) obj4;
                tob1 tob1VarB = z95.b(es41Var.h.b() ? 1.0f : 0.0f, irn1.o0(es41Var.h.b() ? 150 : 500, 0, (dlv) null, 6), (String) null, (iu30) null, x340Var, 0, 28);
                boolean zI = x340Var.i(es41Var) | x340Var.i(tob1VarB);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new j3y0(es41Var, tob1VarB, (byte) 4);
                    x340Var.s0(objT);
                }
                qim0 qim0VarS = exd0.s(qim0Var, (iu30) objT);
                x340Var.r(false);
                return qim0VarS;
            case 3:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                ewe eweVar = (ewe) obj4;
                ven0 ven0VarH = rwq.h(((i4z0) eweVar.d).X, x340Var2, 0);
                s0s s0sVar = ((tso) eweVar.g).a;
                hyy0 hyy0Var = (hyy0) eweVar.f;
                Integer numValueOf = Integer.valueOf(((o4z0) ven0VarH.getValue()).a);
                x340 x340Var3 = x340Var2;
                boolean zI2 = x340Var3.i(eweVar) | x340Var3.i(ven0VarH);
                Object objT2 = x340Var3.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new j3y0(eweVar, ven0VarH, (byte) 5);
                    x340Var3.s0(objT2);
                }
                qxd0.g(s0sVar, hyy0Var, numValueOf, (iu30) objT2, x340Var3);
                boolean zI3 = x340Var3.i(eweVar);
                Object objT3 = x340Var3.T();
                if (zI3 || objT3 == m4cVar) {
                    objT3 = new j4z0(eweVar, (byte) 0);
                    x340Var3.s0(objT3);
                }
                dgo1.c(rih1Var, (iu30) objT3, apo.r(1503738207, new y6w0(eweVar, (byte) 24), x340Var3), x340Var3, 390);
                return rih1Var;
            case 4:
                ((Number) obj3).intValue();
                m4z0 m4z0Var = (m4z0) obj4;
                gio1.f(m4z0Var.a, m4z0Var.b, (b0k) obj2, 0);
                return rih1Var;
            case 5:
                tqw tqwVar2 = (tqw) obj3;
                ou80VarY = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                hf2 hf2Var = (hf2) obj4;
                String str4 = (String) hf2Var.f;
                sb7 sb7Var = (sb7) hf2Var.e;
                if (ou80VarY != null) {
                    sb7Var.b(str4, ou80VarY);
                } else {
                    String strConcat = "spotify:assisted-curation?context=".concat(str4);
                    a1r0 a1r0Var = sb7Var.b;
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("AssistedCurationPageRouteParameters", new vb7(strConcat, str4, qb7.a));
                    a1r0.j(a1r0Var, strConcat, (String) null, bundle2, true, 2);
                }
                return rih1Var;
            case 6:
                String str5 = ((p9z0) obj2).c;
                if (str5 == null) {
                    return null;
                }
                x6h1 x6h1VarC = ((xrl0) ((q9z0) obj4).b.b).a.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("playback_source_label", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 7:
                ((Boolean) obj).getClass();
                yxb0 yxb0Var = (yxb0) obj4;
                SerialDisposable serialDisposable = (SerialDisposable) yxb0Var.f;
                Flowable flowable = (Flowable) yxb0Var.e;
                serialDisposable.a(ydh.f(flowable, flowable).Z(5L, TimeUnit.SECONDS, (FlowableError) null, Schedulers.b).B(new uqv0(yxb0Var, (byte) 12)).o(Functions.h).subscribe());
                return rih1Var;
            case 8:
                yrg0 yrg0Var = (yrg0) ((rwj) obj4).e;
                int iC = l1d.C(2);
                if (iC == 0 || iC == 1) {
                    fjl0 fjl0Var = (fjl0) yrg0Var.b;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("show_paywall", 1, Collections.singletonMap("paywalled_item", "Shuffle")), fjl0Var.c, fjl0Var.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 9:
                giz0 giz0Var = (giz0) obj;
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                Object obj5 = fkj0.X;
                iiz0 iiz0Var = (iiz0) obj4;
                gfi1 gfi1Var = giz0Var.a;
                if (gfi1Var instanceof efi1) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(1786943588);
                    boolean zI4 = x340Var5.i(iiz0Var) | x340Var5.i(giz0Var);
                    Object objT4 = x340Var5.T();
                    if (zI4 || objT4 == obj5) {
                        objT4 = new xw0(iiz0Var, giz0Var, (lnm) null, (byte) 9);
                        x340Var5.s0(objT4);
                    }
                    qxd0.t(rih1Var, x340Var5, (vu30) objT4);
                    x340Var5.r(false);
                    return rih1Var;
                }
                if (!(gfi1Var instanceof dfi1)) {
                    if (!(gfi1Var instanceof ffi1)) {
                        throw p3d1.k(x340Var4, 611832095, false);
                    }
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(1788230491);
                    ffi1 ffi1Var = (ffi1) gfi1Var;
                    String str6 = ffi1Var.a;
                    String str7 = ffi1Var.b;
                    int iC2 = l1d.C(ffi1Var.c);
                    if (iC2 == 0) {
                        i = 1;
                    } else if (iC2 == 1) {
                        i = 2;
                    } else {
                        eg.o();
                    }
                    fjz0 fjz0Var = new fjz0(str6, str7, i, iiz0Var.d.a, giz0Var.b);
                    Object objT5 = x340Var6.T();
                    if (objT5 == obj5) {
                        ojq ojqVar = (ojq) iiz0Var.c.a.c;
                        d0r d0rVar = (d0r) ojqVar.Y0.get();
                        lzn0 lzn0VarB = ((jiz0) ojqVar.b).b();
                        c8o.l(lzn0VarB);
                        objT5 = new jjz0(d0rVar, lzn0VarB, (xip) ojqVar.n1.get());
                        x340Var6.s0(objT5);
                    }
                    jlz0 jlz0Var = jlz0.i;
                    otw.c((jjz0) objT5, fjz0Var, (qim0) null, (ipb1) null, x340Var6, 0, 12);
                    x340Var6.r(false);
                    return rih1Var;
                }
                x340 x340Var7 = x340Var4;
                x340Var7.i0(1787496194);
                jlz0 jlz0Var2 = giz0Var.b;
                ilz0 ilz0Var = giz0Var.c;
                if (ilz0Var != null) {
                    mod.b(llz0.a.a(new klz0(jlz0Var2, ilz0Var)), apo.r(654726403, new kpw0(iiz0Var, giz0Var, (byte) 13), x340Var7), x340Var7, 56);
                    x340Var7.r(false);
                    return rih1Var;
                }
                eg.m("Required value was null.");
                return null;
            case 10:
                qmo1.h((c380) obj, ((qjz0) obj4).d, (b0k) obj2, ((Number) obj3).intValue() & 14);
                return rih1Var;
            case 11:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str8 = ((eka1) obj4).a;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str8, (qim0) null, cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, b0kVar2, 0, 0, 1714);
                return rih1Var;
            case 12:
                ((mtz0) obj4).a.invoke(Integer.valueOf(((ktz0) obj2).a));
                return rih1Var;
            case 13:
                juz0 juz0Var = (juz0) obj2;
                luz0 luz0Var = (luz0) obj4;
                if (juz0Var instanceof iuz0) {
                    luz0Var.a.invoke();
                    return rih1Var;
                }
                if (juz0Var instanceof huz0) {
                    luz0Var.b.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 14:
                lyz0 lyz0Var = (lyz0) obj;
                kyz0 kyz0Var = (kyz0) obj2;
                tqw tqwVar3 = (tqw) obj3;
                cm0 cm0Var = (cm0) obj4;
                c9n c9nVar = (c9n) cm0Var.g;
                lnm lnmVar = null;
                if (kyz0Var instanceof jyz0) {
                    fn31.T(c9nVar, (o8n) null, 0, new ian0(lyz0Var, cm0Var, lnmVar, (byte) 23), 3);
                    fn31.T(c9nVar, (q8n) cm0Var.h, 0, new glu0(lyz0Var, kyz0Var, cm0Var, (lnm) null, (byte) 23), 2);
                    return rih1Var;
                }
                if (kyz0Var instanceof iyz0) {
                    fn31.T(c9nVar, (o8n) null, 0, new glu0(cm0Var, lyz0Var, (tqwVar3 == null || (ou80Var = n3o1.y(tqwVar3).a) == null) ? null : ou80Var.a, (lnm) null, (byte) 24), 3);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 15:
                ((m601) obj4).a.invoke(Boolean.valueOf(((k601) obj2).a));
                return rih1Var;
            case 16:
                hsl1 hsl1Var = (hsl1) obj2;
                esl1 esl1Var = hsl1Var.a;
                int i2 = ((uc80) obj3).d;
                a901 a901Var = (a901) obj4;
                p901 p901Var = a901Var.e;
                if (p901Var.b) {
                    int i3 = esl1Var.i(519).d + i2;
                    View view = ((dtw) a901Var.i.getValue()).w;
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i3);
                }
                if (p901Var.b) {
                    int i4 = i2 + esl1Var.i(519).d;
                    FrameLayout frameLayout = a901Var.g;
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    if (layoutParams == null) {
                        bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = i4;
                    frameLayout.setLayoutParams(marginLayoutParams);
                }
                return hsl1Var;
            case 17:
                sb01 sb01Var = (sb01) obj;
                x340 x340Var8 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                vd01 vd01Var = (vd01) obj4;
                m4e0 m4e0Var = vd01Var.o;
                xd01 xd01Var = vd01Var.c;
                mr20 mr20VarU = rqt0.u(new ld2((mr20) m4e0Var.b, xd01Var.a, (byte) 24));
                Boolean bool = Boolean.FALSE;
                ven0 ven0VarG = rwq.g(mr20VarU, bool, (o8n) null, x340Var8, 48, 2);
                x340 x340Var9 = x340Var8;
                ven0 ven0VarG2 = rwq.g(((cir0) x340Var9.k(k2r0.a)).i(), bool, (o8n) null, x340Var9, 48, 2);
                Boolean bool2 = (Boolean) ven0VarG.getValue();
                bool2.getClass();
                boolean zI5 = x340Var9.i(ven0VarG) | x340Var9.i(vd01Var);
                Object objT6 = x340Var9.T();
                if (zI5 || objT6 == m4cVar2) {
                    objT6 = new xw0(vd01Var, ven0VarG, (lnm) null, (byte) 10);
                    x340Var9.s0(objT6);
                }
                qxd0.t(bool2, x340Var9, (vu30) objT6);
                Object objT7 = x340Var9.T();
                if (objT7 == m4cVar2) {
                    mnq mnqVar = vd01Var.s;
                    d0r d0rVar2 = vd01Var.r;
                    mnqVar.getClass();
                    objT7 = new md01(d0rVar2);
                    x340Var9.s0(objT7);
                }
                md01 md01Var = (md01) objT7;
                lzn0 lzn0Var2 = vd01Var.f;
                boolean zI6 = x340Var9.i(lzn0Var2);
                Object objT8 = x340Var9.T();
                if (zI6 || objT8 == m4cVar2) {
                    y52 y52Var = new y52(0, lzn0Var2, lzn0.class, "closeCurrentPage", "closeCurrentPage()V", 0, (byte) 19);
                    x340Var9.s0(y52Var);
                    objT8 = y52Var;
                }
                zc01.b(sb01Var, (Function0) objT8, vd01Var.d, vd01Var.e.c.c(), vd01Var.g, vd01Var.h, vd01Var.i, vd01Var.j, vd01Var.k, vd01Var.l, vd01Var.m, vd01Var.n, vd01Var.q, xd01Var.a, md01Var, ((Boolean) ven0VarG2.getValue()).booleanValue(), (qim0) null, x340Var9, iIntValue & 14);
                return rih1Var;
            case 18:
                if (!((wg01) obj2).equals(wg01.a)) {
                    eg.o();
                    return null;
                }
                yg01 yg01Var = (yg01) obj4;
                yg01Var.c.j(yg01Var.b);
                return rih1Var;
            case 19:
                if (((wh01) obj2) == wh01.a) {
                    ((Function0) ((a4f0) obj4).c).invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 20:
                ney0 ney0Var = (ney0) obj;
                tqw tqwVar4 = (tqw) obj3;
                String str9 = ney0Var.o;
                String str10 = ney0Var.k;
                uxy0 uxy0Var = (uxy0) obj4;
                int iY = ((mta) uxy0Var.c).y((d700) obj2, ney0Var);
                dp5 dp5Var = (dp5) uxy0Var.b;
                switch (l1d.C(iY)) {
                    case 0:
                        String str11 = ney0Var.a;
                        String str12 = ney0Var.k;
                        String str13 = ney0Var.l;
                        ou80VarY = tqwVar4 != null ? n3o1.y(tqwVar4).a : null;
                        String str14 = ney0Var.p;
                        String str15 = nik1.x0.a;
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        dp5Var.g(new ps01(str11, str12, str13, new st01(ou80VarY, str9, yon1.E4().a, str14, str15), ney0Var.s));
                        return rih1Var;
                    case 1:
                        uxy0Var.r(str10, tqwVar4);
                        return rih1Var;
                    case 2:
                        String str16 = ney0Var.u;
                        if (str16 == null) {
                            return rih1Var;
                        }
                        uxy0Var.r(str16, tqwVar4);
                        return rih1Var;
                    case 3:
                        de71 de71Var = ney0Var.y;
                        if (de71Var == null || (strA = de71Var.a()) == null) {
                            return rih1Var;
                        }
                        uxy0Var.r(strA, tqwVar4);
                        return rih1Var;
                    case 4:
                        yq01 yq01Var = ney0Var.m;
                        if (yq01Var == null || (str = yq01Var.a) == null) {
                            str = "";
                        }
                        dp5Var.g(new us01(str));
                        return rih1Var;
                    case 5:
                        tqwVar4.getClass();
                        dp5Var.g(new is01(str10, n3o1.y(tqwVar4)));
                        return rih1Var;
                    case 6:
                        if (tqwVar4 != null && (ou80Var2 = n3o1.y(tqwVar4).a) != null) {
                            ou80VarY = ou80Var2.a;
                        }
                        dp5Var.g(new hs01(str10, str9, ou80VarY));
                        return rih1Var;
                    case 7:
                        return rih1Var;
                    default:
                        eg.o();
                        return null;
                }
            case 21:
                zs01 zs01Var = (ct01) obj2;
                kls0 kls0Var = (kls0) obj4;
                if (zs01Var instanceof zs01) {
                    kls0Var.e(zs01Var.b, (br01) null);
                    return rih1Var;
                }
                if (zs01Var instanceof ys01) {
                    kls0Var.e((m9m) null, (br01) null);
                    return rih1Var;
                }
                if (zs01Var instanceof bt01) {
                    bt01 bt01Var = (bt01) zs01Var;
                    kls0Var.e(bt01Var.b, bt01Var.c);
                    return rih1Var;
                }
                if (zs01Var instanceof at01) {
                    kls0Var.e(((at01) zs01Var).b, (br01) null);
                    return rih1Var;
                }
                if (zs01Var instanceof xs01) {
                    kls0Var.e((m9m) null, (br01) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 22:
                eu01 eu01Var = (gu01) obj;
                x340 x340Var10 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                cm0 cm0Var2 = (cm0) obj4;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var10.g(eu01Var) ? 4 : 2;
                }
                x340 x340Var11 = x340Var10;
                if (!x340Var11.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var11.b0();
                } else if (eu01Var instanceof eu01) {
                    x340Var11.i0(-914115803);
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var11, 0);
                    int iHashCode = Long.hashCode(x340Var11.T);
                    xos0 xos0VarM = x340Var11.m();
                    qim0 qim0VarE = zr7.E(x340Var11, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var11.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var11.m0();
                    if (x340Var11.S) {
                        x340Var11.l(hmb0.t1);
                    } else {
                        x340Var11.v0();
                    }
                    nko1.H(mbhVarA, x340Var11, y580.O0);
                    nko1.H(xos0VarM, x340Var11, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var11, y580.R0);
                    nko1.F(x340Var11);
                    nko1.H(qim0VarE, x340Var11, y580.Y);
                    eu01 eu01Var2 = eu01Var;
                    cyo1.k(eu01Var2.a, (w460) cm0Var2.i, x340Var11, 64);
                    cyo1.f(eu01Var2.b, x340Var11, 0);
                    x340Var11.r(true);
                    x340Var11.r(false);
                } else if (eu01Var instanceof fu01) {
                    x340Var11.i0(-913873600);
                    x340Var11.r(false);
                } else {
                    if (!(eu01Var instanceof du01)) {
                        throw p3d1.k(x340Var11, -445130805, false);
                    }
                    x340Var11.i0(-913835222);
                    cyo1.j((du01) eu01Var, (d0r) cm0Var2.e, (bpb1) cm0Var2.f, (vfp) cm0Var2.c, (w460) cm0Var2.i, x340Var11, (iIntValue2 & 14) | 32768);
                    x340Var11.r(false);
                }
                return rih1Var;
            case 23:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                bv01 bv01Var = (bv01) obj4;
                ((fv01) bv01Var.a.get()).c((zu01) f4p1.k(((vu01) obj).Z, bv01Var.d, b0kVar3, 6).getValue(), b0kVar3, 0);
                return rih1Var;
            case 24:
                Boolean bool3 = (Boolean) obj2;
                boolean zBooleanValue = bool3.booleanValue();
                men0 men0Var = (men0) ((xaz0) obj4).b;
                if (!zBooleanValue) {
                    y711Var = y711.a;
                } else {
                    if (!zBooleanValue) {
                        eg.o();
                        return null;
                    }
                    y711Var = z711.a;
                }
                bma1 bma1Var = men0.c;
                for (Map.Entry entry : men0.d.entrySet()) {
                    int iIntValue3 = ((Number) entry.getKey()).intValue();
                    a811 a811Var = (a811) entry.getValue();
                    ou80 ou80VarValueOf = Integer.valueOf(iIntValue3);
                    if (!u890.j(a811Var, y711Var)) {
                        ou80VarValueOf = null;
                    }
                    if (ou80VarValueOf != null) {
                        ou80VarY = ou80VarValueOf;
                        if (ou80VarY != null) {
                            int iIntValue4 = ou80VarY.intValue();
                            hma1 hma1VarEdit = men0Var.a.edit();
                            hma1VarEdit.b(men0.c, iIntValue4);
                            hma1VarEdit.g();
                        }
                        return new it61(bool3);
                    }
                }
                if (ou80VarY != null) {
                    int iIntValue5 = ou80VarY.intValue();
                    hma1 hma1VarEdit2 = men0Var.a.edit();
                    hma1VarEdit2.b(men0.c, iIntValue5);
                    hma1VarEdit2.g();
                }
                return new it61(bool3);
            case 25:
                nd11 nd11Var = (nd11) obj2;
                ((u210) ((ngs0) obj4).d).c(((od11) obj).a, nd11Var.a, nd11Var.b);
                return rih1Var;
            case 26:
                if (!((be11) obj2).equals(be11.a)) {
                    eg.o();
                    return null;
                }
                kp00 kp00Var = ((de11) obj4).a;
                z300 z300Var = z300.a;
                if (z300Var.equals(z300Var)) {
                    ((Function0) ((az00) kp00Var.b).t.c).invoke();
                }
                ((iu30) kp00Var.c).invoke(z300Var);
                return rih1Var;
            case 27:
                em91 em91Var = (em91) obj2;
                boolean z = em91Var.d;
                sas sasVar = ((ti11) obj4).c;
                if (z) {
                    bil0 bil0VarH = sasVar.h();
                    x6h1 x6h1VarC3 = bil0VarH.b.c();
                    x6h1VarC3.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("shuffle_mode_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), bil0VarH.a, System.currentTimeMillis());
                }
                boolean z2 = em91Var.c instanceof lm91;
                if (!z2) {
                    bil0 bil0VarH2 = sasVar.h();
                    x6h1 x6h1VarC5 = bil0VarH2.b.c();
                    x6h1VarC5.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("shuffle_mode_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_shuffle_mode", 1, sqg0.J(new mmr0[]{new mmr0("previous_mode", "shuffle"), new mmr0("selected_mode", "linear")})), x6h1VarC6.a(), bil0VarH2.a, System.currentTimeMillis());
                } else {
                    if (!z2) {
                        eg.o();
                        return null;
                    }
                    bil0 bil0VarH3 = sasVar.h();
                    x6h1 x6h1VarC7 = bil0VarH3.b.c();
                    x6h1VarC7.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("shuffle_mode_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_shuffle_mode", 1, sqg0.J(new mmr0[]{new mmr0("previous_mode", "linear"), new mmr0("selected_mode", "shuffle")})), x6h1VarC8.a(), bil0VarH3.a, System.currentTimeMillis());
                }
                return w7h1Var;
            case 28:
                return new u3l0(new s3l0((w3l0) obj4, (byte) 1), Integer.valueOf(((Number) obj).intValue()), (String) obj2);
            default:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                bjg1 bjg1Var = (bjg1) obj4;
                hrr0 hrr0Var = ((mhg1) bjg1Var).d;
                int iOrdinal = ((rrt0) hrr0Var.getValue()).ordinal();
                if (iOrdinal == 0) {
                    rrt0Var = (rrt0) hrr0Var.getValue();
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    rrt0Var = (rrt0) hrr0Var.getValue();
                } else {
                    rrt0Var = (rrt0) ((mhg1) bjg1Var).a.P0();
                }
                u4p1.K(rrt0Var, b0kVar4, 0);
                return rih1Var;
        }
    }
}
