package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplaying.uiusecases.pager.TrackCarouselNowPlaying;
import com.spotify.nowplayingmini.uicomponents.seekbar.FadingSeekBarView;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lsj0 implements m4p0, iac0 {
    public FadingSeekBarView N0;
    public h3p0 O0;
    public dtw P0;
    public final Object S0;
    public final Object T0;
    public final Object U0;
    public final t9h1 V0;
    public final i8h1 X;
    public final l6h1 Y;
    public final FlowableMap Z;
    public final xfx b;
    public final ktf1 c;
    public final d4p0 d;
    public final z611 e;
    public final s880 f;
    public final gh10 g;
    public final dfm h;
    public final k691 i;
    public final aor t;
    public final /* synthetic */ byte a = 1;
    public final rku Q0 = new rku();
    public final tac0 R0 = new tac0(this, true);

    public lsj0(xfx xfxVar, ktf1 ktf1Var, d4p0 d4p0Var, z611 z611Var, s880 s880Var, gh10 gh10Var, yl1 yl1Var, s691 s691Var, dfm dfmVar, k691 k691Var, c21 c21Var, aor aorVar, i8h1 i8h1Var, l6h1 l6h1Var, pdl0 pdl0Var, FlowableMap flowableMap) {
        this.b = xfxVar;
        this.c = ktf1Var;
        this.d = d4p0Var;
        this.e = z611Var;
        this.f = s880Var;
        this.g = gh10Var;
        this.S0 = yl1Var;
        this.T0 = s691Var;
        this.h = dfmVar;
        this.i = k691Var;
        this.U0 = c21Var;
        this.t = aorVar;
        this.X = i8h1Var;
        this.Y = l6h1Var;
        this.V0 = pdl0Var;
        this.Z = flowableMap;
    }

    public static dtw b(wpw wpwVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, rih1.a, (ipb1) null, 112);
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View, com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView, java.lang.Object] */
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view;
        View view2;
        byte b = this.a;
        i8h1 i8h1Var = this.X;
        l6h1 l6h1Var = this.Y;
        aor aorVar = this.t;
        Object obj = this.S0;
        Object obj2 = this.T0;
        s880 s880Var = this.f;
        ktf1 ktf1Var = this.c;
        z611 z611Var = this.e;
        d4p0 d4p0Var = this.d;
        switch (b) {
            case 0:
                View viewInflate = layoutInflater.inflate(2131625329, viewGroup, false);
                viewInflate.getClass();
                x9p1.p(viewInflate, this);
                TrackCarouselNowPlaying trackCarouselNowPlaying = (TrackCarouselNowPlaying) sto1.i(viewInflate.findViewById(2131431465));
                trackCarouselNowPlaying.q(d4p0Var);
                trackCarouselNowPlaying.getView().l(z611Var);
                this.O0 = new h3p0(trackCarouselNowPlaying, ktf1.a(ktf1Var));
                this.N0 = (FadingSeekBarView) viewInflate.findViewById(2131430902);
                ?? r2 = (TrackInfoView) viewInflate.findViewById(2131431475);
                r2.getClass();
                cpf1 cpf1VarF = s880Var.f(new ver(r2));
                tka0 tka0Var = dtw.C;
                dtw dtwVarD = mhc.d(r2.getContext(), (ViewGroup) r2.getParent(), cpf1VarF, (drw) null, 24);
                this.P0 = dtwVarD;
                View view3 = dtwVarD.w;
                k8p1.o((View) r2, view3);
                View viewFindViewById = viewInflate.findViewById(2131427580);
                xfx xfxVar = this.b;
                tfx tfxVar = xfxVar.a;
                ver verVar = new ver(tfxVar.a, (byte) 0);
                AddToButtonView addToButtonView = (AddToButtonView) verVar.b;
                int dimensionPixelSize = addToButtonView.getResources().getDimensionPixelSize(2131165293);
                addToButtonView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                rt01 rt01VarA = ((yl1) obj).a(verVar);
                ViewGroup viewGroup2 = (ViewGroup) viewFindViewById.getParent();
                View view4 = mhc.b(viewGroup2.getContext(), viewGroup2, rt01VarA, new sl1(false), (ipb1) null, 112).w;
                k8p1.o(viewFindViewById, view4);
                View viewFindViewById2 = viewInflate.findViewById(2131430492);
                if (viewFindViewById2 != null) {
                    qzh qzhVarS = voo1.s(xfxVar);
                    ((whs) qzhVarS).a.setPadding(0, 0, 0, 0);
                    View view5 = b(((s691) obj2).a(qzhVarS), (ViewGroup) viewFindViewById2.getParent()).w;
                    k8p1.o(viewFindViewById2, view5);
                    view = view5;
                } else {
                    view = null;
                }
                View viewFindViewById3 = viewInflate.findViewById(2131430407);
                ViewGroup viewGroup3 = (ViewGroup) viewFindViewById3.getParent();
                View view6 = mhc.b(viewGroup3.getContext(), viewGroup3, this.h, new jpt0((ipt0) null, 3), (ipb1) null, 112).w;
                k8p1.o(viewFindViewById3, view6);
                View viewFindViewById4 = viewInflate.findViewById(2131430141);
                qzh qzhVarR = voo1.r(xfxVar);
                ((gcs) qzhVarR).a.setPadding(0, 0, 0, 0);
                View view7 = b(this.i.a(qzhVarR), (ViewGroup) viewFindViewById4.getParent()).w;
                k8p1.o(viewFindViewById4, view7);
                View viewFindViewById5 = viewInflate.findViewById(2131427956);
                if (viewFindViewById5 != null) {
                    c21 c21Var = (c21) this.U0;
                    k8p1.o(viewFindViewById5, b(new bfe((joe) c21Var.b, (xee) c21Var.c, (Flowable) c21Var.d, (FlowableMap) c21Var.e, (mr20) c21Var.f, new plr(tfxVar.a), (vz80) c21Var.g, (q8n) c21Var.h, (mr4) c21Var.i, (a1r0) c21Var.t), (ViewGroup) viewFindViewById5.getParent()).w);
                }
                ViewStub viewStub = (ViewStub) viewInflate.findViewById(2131428189);
                viewStub.getClass();
                qtw qtwVarA = f6o1.A(aorVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                ViewGroup viewGroup4 = (ViewGroup) viewStub.getParent();
                k8p1.o(viewStub, mhc.b(viewGroup4.getContext(), viewGroup4, qtwVarA, new f3l(0.0f, 4031, view != null), (ipb1) null, 112).w);
                List listM = p7h.M(new View[]{view3, view4});
                List listI0 = f46.i0(new View[]{view, view6, view7});
                op80 jp80Var = new jp80(viewInflate);
                op80 eq80Var = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var));
                op80 wchVar = q6x.b;
                if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                    jp80Var = wchVar;
                } else if (jp80Var.equals(wchVar)) {
                    jp80Var = eq80Var;
                } else if (!eq80Var.equals(wchVar)) {
                    wchVar = new wch(jp80Var, eq80Var);
                    jp80Var = wchVar;
                }
                xhk1.c(viewInflate, jp80Var);
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    j7p1.y((View) it.next(), new ksj0(this, (byte) 0));
                }
                Iterator it2 = listI0.iterator();
                while (it2.hasNext()) {
                    j7p1.y((View) it2.next(), new ksj0(this, (byte) 1));
                }
                return viewInflate;
            default:
                View viewInflate2 = layoutInflater.inflate(2131625331, viewGroup, false);
                viewInflate2.getClass();
                x9p1.p(viewInflate2, this);
                TrackCarouselNowPlaying trackCarouselNowPlaying2 = (TrackCarouselNowPlaying) sto1.i(viewInflate2.findViewById(2131431465));
                trackCarouselNowPlaying2.q(d4p0Var);
                trackCarouselNowPlaying2.getView().l(z611Var);
                trackCarouselNowPlaying2.getView().setClipToOutline(true);
                this.O0 = new h3p0(trackCarouselNowPlaying2, ktf1.a(ktf1Var));
                this.N0 = (FadingSeekBarView) viewInflate2.findViewById(2131430902);
                ConstraintLayout constraintLayout = (TrackInfoView) viewInflate2.findViewById(2131431475);
                constraintLayout.getClass();
                cpf1 cpf1VarF2 = s880Var.f(new fcs(constraintLayout, (byte) 15));
                tka0 tka0Var2 = dtw.C;
                dtw dtwVarD2 = mhc.d(constraintLayout.getContext(), (ViewGroup) constraintLayout.getParent(), cpf1VarF2, (drw) null, 24);
                this.P0 = dtwVarD2;
                View view8 = dtwVarD2.w;
                k8p1.o(constraintLayout, view8);
                View viewFindViewById6 = viewInflate2.findViewById(2131430899);
                rih1 rih1Var = rih1.a;
                if (viewFindViewById6 != null) {
                    ViewGroup viewGroup5 = (ViewGroup) viewFindViewById6.getParent();
                    view2 = mhc.b(viewGroup5.getContext(), viewGroup5, (am51) obj2, rih1Var, (ipb1) null, 112).w;
                    view2.setPadding(0, 0, 0, 0);
                    k8p1.o(viewFindViewById6, view2);
                } else {
                    view2 = null;
                }
                View viewFindViewById7 = viewInflate2.findViewById(2131430407);
                ViewGroup viewGroup6 = (ViewGroup) viewFindViewById7.getParent();
                View view9 = mhc.b(viewGroup6.getContext(), viewGroup6, this.h, new jpt0((ipt0) null, 1), (ipb1) null, 112).w;
                k8p1.o(viewFindViewById7, view9);
                View viewFindViewById8 = viewInflate2.findViewById(2131430903);
                wpw wpwVarT = ((dxy) obj).t(new psj0(this, (byte) 0), new psj0(this, (byte) 1), 2);
                ViewGroup viewGroup7 = (ViewGroup) viewFindViewById8.getParent();
                View view10 = mhc.b(viewGroup7.getContext(), viewGroup7, wpwVarT, rih1Var, (ipb1) null, 112).w;
                k8p1.o(viewFindViewById8, view10);
                ViewStub viewStub2 = (ViewStub) viewInflate2.findViewById(2131428189);
                viewStub2.getClass();
                qtw qtwVarA2 = f6o1.A(aorVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                ViewGroup viewGroup8 = (ViewGroup) viewStub2.getParent();
                k8p1.o(viewStub2, mhc.b(viewGroup8.getContext(), viewGroup8, qtwVarA2, new f3l(0.0f, 4031, view2 != null), (ipb1) null, 112).w);
                List listSingletonList = Collections.singletonList(view8);
                List listI1 = f46.i0(new View[]{view2, view9, view10});
                op80 jp80Var2 = new jp80(viewInflate2);
                op80 eq80Var2 = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var));
                op80 wchVar2 = q6x.b;
                if (jp80Var2.equals(wchVar2) && eq80Var2.equals(wchVar2)) {
                    jp80Var2 = wchVar2;
                } else if (jp80Var2.equals(wchVar2)) {
                    jp80Var2 = eq80Var2;
                } else if (!eq80Var2.equals(wchVar2)) {
                    wchVar2 = new wch(jp80Var2, eq80Var2);
                    jp80Var2 = wchVar2;
                }
                xhk1.c(viewInflate2, jp80Var2);
                Iterator it3 = listSingletonList.iterator();
                while (it3.hasNext()) {
                    j7p1.y((View) it3.next(), new psj0(this, (byte) 2));
                }
                Iterator it4 = listI1.iterator();
                while (it4.hasNext()) {
                    j7p1.y((View) it4.next(), new psj0(this, (byte) 3));
                }
                return viewInflate2;
        }
    }

    public final x8c0 getLifecycle() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.R0;
    }

    public final void start() {
        byte b = this.a;
        FlowableMap flowableMap = this.Z;
        rku rkuVar = this.Q0;
        gh10 gh10Var = this.g;
        w8c0 w8c0Var = w8c0.e;
        tac0 tac0Var = this.R0;
        switch (b) {
            case 0:
                tac0Var.i(w8c0Var);
                h3p0 h3p0Var = this.O0;
                if (h3p0Var == null) {
                    u890.C("trackCarouselElement");
                    throw null;
                }
                h3p0Var.a();
                FadingSeekBarView fadingSeekBarView = this.N0;
                if (fadingSeekBarView == null) {
                    u890.C("seekbarView");
                    throw null;
                }
                gh10Var.b(fadingSeekBarView);
                rkuVar.b(flowableMap.t(si10.P0).subscribe(new lrj0(this, (byte) 2)));
                return;
            default:
                tac0Var.i(w8c0Var);
                h3p0 h3p0Var2 = this.O0;
                if (h3p0Var2 == null) {
                    u890.C("trackCarouselElement");
                    throw null;
                }
                h3p0Var2.a();
                FadingSeekBarView fadingSeekBarView2 = this.N0;
                if (fadingSeekBarView2 == null) {
                    u890.C("seekbarView");
                    throw null;
                }
                gh10Var.b(fadingSeekBarView2);
                rkuVar.b(flowableMap.t(fj10.O0).subscribe(new lrj0(this, (byte) 3)));
                return;
        }
    }

    public final void stop() {
        byte b = this.a;
        gh10 gh10Var = this.g;
        rku rkuVar = this.Q0;
        w8c0 w8c0Var = w8c0.c;
        tac0 tac0Var = this.R0;
        switch (b) {
            case 0:
                tac0Var.i(w8c0Var);
                rkuVar.a();
                h3p0 h3p0Var = this.O0;
                if (h3p0Var == null) {
                    u890.C("trackCarouselElement");
                    throw null;
                }
                h3p0Var.b();
                gh10Var.c();
                return;
            default:
                tac0Var.i(w8c0Var);
                rkuVar.a();
                h3p0 h3p0Var2 = this.O0;
                if (h3p0Var2 == null) {
                    u890.C("trackCarouselElement");
                    throw null;
                }
                h3p0Var2.b();
                gh10Var.c();
                return;
        }
    }

    public lsj0(xfx xfxVar, ktf1 ktf1Var, d4p0 d4p0Var, z611 z611Var, s880 s880Var, gh10 gh10Var, dxy dxyVar, am51 am51Var, dfm dfmVar, rt01 rt01Var, k691 k691Var, aor aorVar, i8h1 i8h1Var, l6h1 l6h1Var, pdl0 pdl0Var, FlowableMap flowableMap) {
        this.b = xfxVar;
        this.c = ktf1Var;
        this.d = d4p0Var;
        this.e = z611Var;
        this.f = s880Var;
        this.g = gh10Var;
        this.S0 = dxyVar;
        this.T0 = am51Var;
        this.h = dfmVar;
        this.U0 = rt01Var;
        this.i = k691Var;
        this.t = aorVar;
        this.X = i8h1Var;
        this.Y = l6h1Var;
        this.V0 = pdl0Var;
        this.Z = flowableMap;
    }
}
