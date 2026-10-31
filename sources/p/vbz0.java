package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.nowplayingqueue.bottomsheet.view.JamHeaderContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.QueueInteractionLayout;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vbz0 implements i8l {
    public final flq a;
    public final los b;
    public final hrr0 c = v8r.q((Object) null);
    public final hrr0 d = v8r.q((Object) null);
    public gu2 e;

    public vbz0(flq flqVar, los losVar) {
        this.a = flqVar;
        this.b = losVar;
    }

    public final h8l a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b(context, layoutInflater, viewGroup, new dxy(v9z0.h, h0x0.Z0, h0x0.a1, h0x0.b1, h0x0.c1, (Object) null, (byte) 20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, com.spotify.nowplayingqueue.bottomsheet.view.QueueInteractionLayout] */
    public final wbz0 b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, dxy dxyVar) {
        View viewInflate = layoutInflater.inflate(2131625122, viewGroup, false);
        int i = 2131429698;
        JamHeaderContainerView jamHeaderContainerView = (JamHeaderContainerView) m5n1.t(viewInflate, 2131429698);
        if (jamHeaderContainerView != null) {
            i = 2131430566;
            ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131430566);
            if (constraintLayoutT != null) {
                i = 2131430567;
                ComposeView composeViewT = m5n1.t(viewInflate, 2131430567);
                if (composeViewT != null) {
                    i = 2131430568;
                    RecyclerView recyclerViewT = m5n1.t(viewInflate, 2131430568);
                    if (recyclerViewT != null) {
                        i = 2131430569;
                        if (((LinearLayout) m5n1.t(viewInflate, 2131430569)) != null) {
                            ?? r7 = (QueueInteractionLayout) viewInflate;
                            mnb0 mnb0Var = new mnb0(r7, jamHeaderContainerView, constraintLayoutT, composeViewT, recyclerViewT);
                            r7.setMinimumHeight(context.getResources().getDisplayMetrics().heightPixels);
                            r7.setOnUserInteraction((Function0) dxyVar.e);
                            String str = (String) dxyVar.g;
                            if (str != null) {
                                b8k1.r((View) r7, str);
                            }
                            CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context);
                            coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            coordinatorLayout.setImportantForAccessibility(2);
                            coordinatorLayout.addOnAttachStateChangeListener(new yxg0((byte) 1));
                            mnb0 mnb0Var2 = new mnb0(mnb0Var);
                            h2y0 h2y0Var = new h2y0(this, (byte) 23);
                            iu30 iu30Var = (iu30) dxyVar.b;
                            Function0 function0 = (Function0) dxyVar.f;
                            uw0 uw0Var = (uw0) this.a.a.c;
                            Resources resourcesI = uw0Var.I();
                            tbz0 tbz0Var = (tbz0) uw0Var.d;
                            kly0 kly0Var = tbz0Var.o;
                            xfx xfxVar = (xfx) kly0Var.get();
                            c8o.l(xfxVar);
                            eh4 eh4VarB = uw0Var.b();
                            xfx xfxVar2 = (xfx) kly0Var.get();
                            c8o.l(xfxVar2);
                            gtc1 gtc1Var = new gtc1(xfxVar2);
                            d0r d0rVarC = cwl1.C((q7r0) uw0Var.e);
                            xfx xfxVar3 = (xfx) kly0Var.get();
                            c8o.l(xfxVar3);
                            q8n q8nVar = (q8n) tbz0Var.L.get();
                            c8o.l(q8nVar);
                            obz0 obz0Var = new obz0(resourcesI, xfxVar, eh4VarB, gtc1Var, new bno(d0rVarC, xfxVar3, q8nVar), (ykq) uw0Var.g);
                            tbz0 tbz0Var2 = (tbz0) uw0Var.d;
                            tbz0 tbz0Var3 = (tbz0) uw0Var.d;
                            w9z0 w9z0Var = (w9z0) tbz0Var2.p.get();
                            c8o.l(w9z0Var);
                            kly0 kly0Var2 = tbz0Var3.A;
                            kly0 kly0Var3 = tbz0Var3.K;
                            kly0 kly0Var4 = tbz0Var3.S;
                            kly0 kly0Var5 = tbz0Var3.a;
                            Context context2 = (Context) kly0Var5.get();
                            c8o.l(context2);
                            jtl1 jtl1VarA = tbz0Var3.a();
                            c8o.l(jtl1VarA);
                            eh4 eh4VarB2 = uw0Var.b();
                            hj91 hj91VarM = uw0Var.M();
                            Flowable flowable = (Flowable) ((jly0) uw0Var.t).get();
                            xyl1 xyl1Var = (xyl1) tbz0Var3.c0.get();
                            c8o.l(xyl1Var);
                            up41 up41Var = new up41(xyl1Var, (byte) 12);
                            kt91 kt91Var = (kt91) kly0Var4.get();
                            c8o.l(kt91Var);
                            dm91 dm91Var = new dm91(hj91VarM, flowable, up41Var, new a78(kt91Var));
                            uip0 uip0Var = new uip0(new dx0((Flowable) ((jly0) uw0Var.t).get(), (xbu0) ((cyp) ((jly0) uw0Var.h).get()).c()), (byte) 29);
                            vqv0 vqv0VarF = uw0Var.F();
                            kdy0 kdy0VarG = uw0Var.G();
                            x6h1 x6h1VarC = ((xrl0) ((jly0) uw0Var.c).get()).a.c();
                            x6h1VarC.i.add(new a7h1("session_modifiers", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC.j = false;
                            y6h1 y6h1VarA = x6h1VarC.a();
                            r6h1 r6h1Var = r6h1.c;
                            yrg0 yrg0Var = new yrg0(new fjl0(new r6h1(kk0.l(y6h1VarA), (u8h1) null), (byte) 0), (byte) 10);
                            mwn0 mwn0Var = (mwn0) tbz0Var3.y.get();
                            c8o.l(mwn0Var);
                            jtl1 jtl1VarA2 = tbz0Var3.a();
                            c8o.l(jtl1VarA2);
                            kdy0 kdy0Var = new kdy0(kdy0VarG, yrg0Var, mwn0Var, jtl1VarA2, (byte) 5);
                            jtl1 jtl1VarA3 = tbz0Var3.a();
                            c8o.l(jtl1VarA3);
                            Flowable flowable2 = (Flowable) ((jly0) uw0Var.t).get();
                            xrc0 xrc0Var = (xrc0) tbz0Var3.G.get();
                            c8o.l(xrc0Var);
                            q8n q8nVar2 = (q8n) kly0Var3.get();
                            c8o.l(q8nVar2);
                            yu3 yu3Var = new yu3(flowable2, xrc0Var, q8nVar2);
                            jjk0 jjk0Var = (jjk0) tbz0Var3.H.get();
                            c8o.l(jjk0Var);
                            zwz0 zwz0Var = (zwz0) tbz0Var3.M.get();
                            c8o.l(zwz0Var);
                            kt91 kt91Var2 = (kt91) kly0Var4.get();
                            c8o.l(kt91Var2);
                            q8n q8nVar3 = (q8n) kly0Var3.get();
                            c8o.l(q8nVar3);
                            wmy wmyVar = new wmy(jtl1VarA3, yu3Var, jjk0Var, zwz0Var, kt91Var2, q8nVar3);
                            jtl1 jtl1VarA4 = tbz0Var3.a();
                            c8o.l(jtl1VarA4);
                            sb7 sb7Var = (sb7) tbz0Var3.a0.get();
                            c8o.l(sb7Var);
                            sun sunVar = new sun(context2, jtl1VarA, eh4VarB2, dm91Var, uip0Var, vqv0VarF, kdy0Var, wmyVar, new uxy0(jtl1VarA4, sb7Var, (byte) 1));
                            Context context3 = (Context) kly0Var5.get();
                            c8o.l(context3);
                            pta1 pta1Var = (pta1) kly0Var2.get();
                            c8o.l(pta1Var);
                            Observable map = pta1Var.a().map(o9x0.d);
                            FlowableMap flowableMapF = f2u0.f((Flowable) ((jly0) uw0Var.t).get());
                            pta1 pta1Var2 = (pta1) kly0Var2.get();
                            c8o.l(pta1Var2);
                            ynb0 ynb0VarA = xqu.a((ykq) uw0Var.Y);
                            luk lukVar = (luk) tbz0Var3.C.get();
                            c8o.l(lukVar);
                            n0v0 n0v0Var = new n0v0(new bs0(map, flowableMapF, pta1Var2, ynb0VarA, lukVar), (byte) 15);
                            vqv0 vqv0VarF2 = uw0Var.F();
                            jtl1 jtl1VarA5 = tbz0Var3.a();
                            c8o.l(jtl1VarA5);
                            eh4 eh4VarB3 = uw0Var.b();
                            jtl1 jtl1VarA6 = tbz0Var3.a();
                            c8o.l(jtl1VarA6);
                            sb7 sb7Var2 = (sb7) tbz0Var3.a0.get();
                            c8o.l(sb7Var2);
                            hur hurVar = new hur(sunVar, new tzo(context3, n0v0Var, vqv0VarF2, jtl1VarA5, eh4VarB3, new uxy0(jtl1VarA6, sb7Var2, (byte) 1)), (byte) 16);
                            eh4 eh4VarB4 = uw0Var.b();
                            ruz ruzVarA = ((cyp) ((jly0) uw0Var.h).get()).a();
                            gn10 gn10Var = mno1.P;
                            FlowableMap flowableMapF2 = f2u0.f((Flowable) ((jly0) uw0Var.t).get());
                            Flowable flowableJ = ((Flowable) ((jly0) uw0Var.t).get()).j(mo9.O0);
                            Flowable flowableJ2 = ((Flowable) ((jly0) uw0Var.t).get()).j(mo9.N0);
                            FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) ((jly0) uw0Var.t).get());
                            pe peVar = (pe) tbz0Var3.E.get();
                            c8o.l(peVar);
                            luk lukVar2 = (luk) tbz0Var3.C.get();
                            c8o.l(lukVar2);
                            dfm dfmVar = new dfm(ruzVarA, gn10Var, flowableMapF2, flowableJ, flowableJ2, flowableDistinctUntilChangedD, peVar, new qmr(new in4(lukVar2)));
                            Flowable flowable3 = (Flowable) ((jly0) uw0Var.t).get();
                            bnj0 bnj0VarY = uw0Var.y();
                            Resources resourcesI2 = uw0Var.I();
                            q8n q8nVar4 = (q8n) tbz0Var3.J.get();
                            c8o.l(q8nVar4);
                            Flowable flowableJ3 = flowable3.j(new lun0(bnj0VarY, resourcesI2, j5.a, q8nVar4));
                            cjs cjsVar = (cjs) tbz0Var3.d.get();
                            c8o.l(cjsVar);
                            lzn0 lzn0Var = (lzn0) tbz0Var3.e.get();
                            c8o.l(lzn0Var);
                            xrn0 xrn0Var = new xrn0(new u98(2, lzn0Var, lzn0.class, "navigateToUri", "navigateToUri(Ljava/lang/String;Lcom/spotify/ubi/logger/InteractionLoggingResult;Landroid/os/Bundle;)V", 0, (byte) 14), (byte) 2);
                            vqv0 vqv0Var = new vqv0((xrl0) ((jly0) uw0Var.c).get(), (byte) 10);
                            unr unrVar = (unr) tbz0Var3.g.get();
                            c8o.l(unrVar);
                            aor aorVar = (aor) tbz0Var3.h.get();
                            c8o.l(aorVar);
                            jtl1 jtl1VarA7 = tbz0Var3.a();
                            c8o.l(jtl1VarA7);
                            mzr0 mzr0Var = new mzr0(flowableJ3, cjsVar, xrn0Var, vqv0Var, unrVar, aorVar, jtl1VarA7);
                            r060 r060Var = new r060(xqu.a((ykq) uw0Var.Z), (byte) 1);
                            a4q0 a4q0Var = (a4q0) tbz0Var3.j.get();
                            c8o.l(a4q0Var);
                            cjs cjsVar2 = (cjs) tbz0Var3.d.get();
                            c8o.l(cjsVar2);
                            hyy0 hyy0Var = new hyy0(r060Var, new pux0(a4q0Var, cjsVar2, (byte) 8), (byte) 5);
                            xfx xfxVar4 = (xfx) tbz0Var3.o.get();
                            c8o.l(xfxVar4);
                            eaz0 eaz0Var = new eaz0(new rzo0((ykq) uw0Var.b, (xrl0) ((jly0) uw0Var.c).get()), (byte) 0);
                            m980 m980Var = new m980((byte) 1);
                            ln91 ln91Var = (ln91) tbz0Var3.l.get();
                            c8o.l(ln91Var);
                            kx21 kx21Var = (kx21) tbz0Var3.m.get();
                            c8o.l(kx21Var);
                            l0x0 l0x0Var = new l0x0(uw0Var.M(), ((cyp) ((jly0) uw0Var.h).get()).a(), (Flowable) ((jly0) uw0Var.t).get(), (byte) 15);
                            xrl0 xrl0Var = (xrl0) ((jly0) uw0Var.c).get();
                            d0r d0rVarC2 = cwl1.C((q7r0) uw0Var.e);
                            xfx xfxVar5 = (xfx) tbz0Var3.o.get();
                            c8o.l(xfxVar5);
                            q8n q8nVar5 = (q8n) tbz0Var3.L.get();
                            c8o.l(q8nVar5);
                            ccz0 ccz0Var = new ccz0(mnb0Var2, coordinatorLayout, h2y0Var, iu30Var, function0, obz0Var, w9z0Var, hurVar, eh4VarB4, dfmVar, mzr0Var, hyy0Var, xfxVar4, eaz0Var, m980Var, ln91Var, kx21Var, l0x0Var, xrl0Var, new bno(d0rVarC2, xfxVar5, q8nVar5));
                            View viewFindViewById = coordinatorLayout.findViewById(2131430670);
                            ViewParent parent = viewFindViewById != null ? viewFindViewById.getParent() : null;
                            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewFindViewById);
                            }
                            if (viewFindViewById != null) {
                                viewFindViewById.setPadding(0, 0, 0, 0);
                            }
                            this.d.setValue(viewFindViewById);
                            this.c.setValue(coordinatorLayout);
                            this.e = new gu2(viewFindViewById, context.getResources().getDimensionPixelSize(2131165695), recyclerViewT, (byte) 28);
                            return new wbz0(r7, ccz0Var, (Function0) dxyVar.c, (Function0) dxyVar.d);
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
