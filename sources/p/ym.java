package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.watchfeed.uiusecases.element.watchfeedpagerindicator.WatchFeedPagerIndicatorView;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ym extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(int i, yzp0 yzp0Var, c9c c9cVar) {
        super(1);
        this.a = (byte) 27;
        this.b = i;
        this.c = yzp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[PHI: r0
      0x0046: PHI (r0v99 double) = (r0v97 double), (r0v100 double) binds: [B:18:0x0051, B:14:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object invoke(Object obj) {
        int i;
        double d;
        double d2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                an anVar = (an) obj2;
                ((qp) anVar.g).invoke(Integer.valueOf(i2), ((List) anVar.e).get(i2));
                return rih1Var;
            case 1:
                au auVar = (au) obj;
                fr frVar = (fr) obj2;
                frVar.getClass();
                ev evVar = auVar.a;
                List list = auVar.b;
                return new li81(new er(this.b, evVar, list != null ? mqo1.A(list) : null, auVar.d, auVar.e), frVar);
            case 2:
                cas casVar = (a7m0) obj;
                casVar.b = RxEventSources.a(new ObservableSource[]{((f06) obj2).a.scan(new kr60(new vx1(i2, 1 == true ? 1 : 0), (byte) 12)).map(new ij81(i2, (byte) 3))});
                casVar.d = ou1.W0;
                casVar.e = ou1.X0;
                return rih1Var;
            case 3:
                sxg sxgVar = (sxg) obj2;
                z6a1 z6a1Var = sxgVar.b;
                int i3 = (int) z6a1Var.a;
                int i4 = (int) z6a1Var.b;
                String str = sxgVar.a.a;
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((jo70) it.next()).a);
                }
                return new um6(i3, i4, this.b, str, arrayList);
            case 4:
                ((vu30) ((lcb0) obj2).g).invoke((uc7) obj, Integer.valueOf(i2));
                return rih1Var;
            case 5:
                e261 e261Var = (e261) obj;
                Context context = ((fp7) obj2).a;
                int iC = l1d.C(i2);
                if (iC != 2) {
                    i = iC != 3 ? 2131952612 : 2131952609;
                } else {
                    i = 2131952610;
                }
                b261.n(e261Var, context.getString(i));
                return rih1Var;
            case 6:
                return new ls9((Context) obj, y2k1.d, i2 == 2 ? b3k1.b : b3k1.c, false, (w2k1) obj2);
            case 7:
                ((y9e1[]) obj2)[i2] = (y9e1) obj;
                return rih1Var;
            case 8:
                ((hdn0) obj2).t((int) (i2 - nho1.n((elb0) obj, true).d));
                return rih1Var;
            case 9:
                h3h1 h3h1Var = new h3h1(new zwj((txj) obj2, (byte) 2));
                k3h1 k3h1Var = new k3h1(i2);
                wch wchVar = q6x.b;
                if (!h3h1Var.equals(wchVar) || !k3h1Var.equals(wchVar)) {
                    if (h3h1Var.equals(wchVar)) {
                        return k3h1Var;
                    }
                    if (k3h1Var.equals(wchVar)) {
                        return h3h1Var;
                    }
                    wchVar = new wch(h3h1Var, k3h1Var);
                }
                return wchVar;
            case 10:
                return ((z2k) obj2).i(i2 + ((Number) obj).intValue());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ceo ceoVar = (ceo) obj2;
                return ((xa5) obj).a(hm5.P(xay.e(2, irn1.o0(i2, 0, ceoVar, 2)), xay.f(2, irn1.o0(i2, 0, ceoVar, 2))), hm5.h(1, new du0(i2, (Object) ceoVar, (byte) 16)));
            case grn1.d /* 12 */:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, String.valueOf(i2));
                b261.y(e261Var2, ((l811) obj2).a);
                return rih1Var;
            case 13:
                r390 r390Var = (r390) obj2;
                yo00 yo00Var = r390Var.Z0;
                if (yo00Var != null) {
                    int iC2 = l1d.C(i2);
                    if (iC2 == 0) {
                        yo00Var.g(r390Var.g1);
                        r390Var.M0(new Integer[]{1}, false);
                    } else if (iC2 == 1) {
                        r390Var.M0(new Integer[]{1}, true);
                    } else {
                        if (iC2 != 2) {
                            eg.o();
                            return null;
                        }
                        yo00Var.g(0.0f);
                        r390Var.M0(new Integer[]{1}, false);
                    }
                }
                return rih1Var;
            case 14:
                exs exsVar = (exs) obj2;
                yws ywsVarD = exsVar.d();
                ((j0g1) ywsVarD).d = i2;
                exsVar.p(new zws(ywsVarD));
                return rih1Var;
            case 15:
                b261.l((e261) obj, new f4h(((k9e) obj2).e, i2));
                return rih1Var;
            case 16:
                kcb0 kcb0Var = (kcb0) obj;
                lcb0 lcb0Var = (lcb0) obj2;
                o3n0 o3n0Var = (o3n0) lcb0Var.f;
                String str2 = kcb0Var.a.a;
                boolean z = kcb0Var.b;
                i8h1 i8h1Var = o3n0Var.a;
                zbl0 zbl0Var = o3n0Var.b;
                Integer numValueOf = Integer.valueOf(i2);
                zbl0Var.getClass();
                x6h1 x6h1VarC = zbl0Var.a.c();
                x6h1VarC.i.add(new a7h1("language_row", str2, numValueOf, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("language_switch", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(!z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_interest", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_interest", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                ocb0 ocb0Var = (ocb0) lcb0Var.g;
                if (ocb0Var != null) {
                    return (Boolean) ocb0Var.invoke(kcb0Var);
                }
                u890.C("listener");
                throw null;
            case 17:
                ((qhl) obj).setMarginEnd(i2);
                ((View) obj2).setPadding(i2, i2, i2, i2);
                return rih1Var;
            case 18:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                j2p0 j2p0Var = ((o0p0) obj2).Q1;
                if (j2p0Var != null) {
                    MotionLayout motionLayout = j2p0Var.O0;
                    if (motionLayout == null) {
                        motionLayout = j2p0Var.Z;
                    }
                    if (motionLayout != null) {
                        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
                        if (layoutParams == null) {
                            bhn0.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            return null;
                        }
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.topMargin = zBooleanValue ? i2 : 0;
                        motionLayout.setLayoutParams(layoutParams2);
                    }
                }
                return rih1Var;
            case 19:
                WatchFeedPagerIndicatorView watchFeedPagerIndicatorView = (WatchFeedPagerIndicatorView) obj;
                watchFeedPagerIndicatorView.a(i2);
                watchFeedPagerIndicatorView.setColor((Integer) obj2);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return k5u0.b((k5u0) obj, 0L, null, null, false, 0.0f, false, null, null, null, (jgc1) obj2, this.b, false, false, 27647);
            case 21:
                hjf1 hjf1Var = (hjf1) obj;
                obz0 obz0Var = (obz0) obj2;
                obz0Var.X.remove(i2);
                g8z0 g8z0Var = new g8z0(hjf1Var.f, hjf1Var.h);
                ((z511) obz0Var).a.f(i2, 1);
                obz0Var.h.invoke(g8z0Var);
                return rih1Var;
            case 22:
                ((Number) obj).intValue();
                ksk0 ksk0Var = (ksk0) obj2;
                Integer numValueOf2 = Integer.valueOf(i2);
                x6h1 x6h1VarC3 = ksk0Var.c.c();
                x6h1VarC3.i.add(new a7h1("section", "upcoming-listening-parties", numValueOf2, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = ksk0Var.b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var2.a);
                arrayList2.add(y6h1VarA2);
                return new r6h1(arrayList2, r6h1Var2.b);
            case 23:
                pxg1 pxg1VarO0 = irn1.o0(i2, 0, ((jhx) ((cwx) obj2).a.d).a, 2);
                return ((Boolean) ((xa5) obj).b()).booleanValue() ? hm5.P(xay.m(pxg1VarO0, wu51.S0), xay.q(pxg1VarO0, wu51.T0)) : hm5.P(xay.m(pxg1VarO0, wu51.U0), xay.q(pxg1VarO0, wu51.V0));
            case 24:
                kl1 kl1Var = ((jkr0) ((kes) obj2)).d;
                float fAbs = Math.abs(((drr0) kl1Var.d).s() + (((err0) kl1Var.c).s() - i2));
                ilv.a.getClass();
                ((kd31) obj).b(1.0f - (flv.i.a(yoi1.o(fAbs, 0.0f, 1.0f)) * 0.6f));
                return rih1Var;
            case 25:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                cyd1 cyd1Var = (cyd1) obj2;
                fyd1 fyd1Var = (fyd1) cyd1Var.A(i2);
                fyd1 fyd1Var2 = new fyd1(fyd1Var.a, fyd1Var.b, zBooleanValue2);
                ArrayList arrayList3 = new ArrayList(((emc0) cyd1Var).d.f);
                arrayList3.set(i2, fyd1Var2);
                cyd1Var.C(arrayList3);
                return rih1Var;
            case 26:
                b261.y((e261) obj, i2 == ((iie1) obj2).f.s());
                return rih1Var;
            case 27:
                double dDoubleValue = ((Number) obj).doubleValue();
                yzp0 yzp0Var = (yzp0) obj2;
                double d3 = yzp0Var.a;
                int iC3 = l1d.C(i2);
                if (iC3 == 0) {
                    d = d3 - dDoubleValue;
                    d2 = 0.0d;
                    if (d < 0.0d) {
                        d = d2;
                    }
                } else {
                    if (iC3 != 1) {
                        eg.o();
                        return null;
                    }
                    d = d3 + dDoubleValue;
                    d2 = 1.0d;
                    if (d > 1.0d) {
                        d = d2;
                    }
                }
                return c9c.s(c9c.w(yzp0Var, d));
            default:
                err0 err0Var = (err0) obj2;
                int i5 = ((int) (((yr80) obj).a & 4294967295L)) - i2;
                err0Var.t(i5 >= 0 ? i5 : 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ym(int i, Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ym(Object obj, int i, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
