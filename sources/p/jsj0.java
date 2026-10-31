package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplaying.uiusecases.pager.TrackCarouselNowPlaying;
import com.spotify.nowplayingmini.uicomponents.seekbar.FadingSeekBarView;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jsj0 implements m4p0, iac0 {
    public final aor N0;
    public final i8h1 O0;
    public final l6h1 P0;
    public final pdl0 Q0;
    public final qv4 R0;
    public final FlowableMap S0;
    public FadingSeekBarView T0;
    public h3p0 U0;
    public dtw V0;
    public final dxy X;
    public final am51 Y;
    public final rt01 Z;
    public final xfx a;
    public final ktf1 b;
    public final d4p0 c;
    public final z611 d;
    public final s880 e;
    public final gh10 f;
    public final yl1 g;
    public final s691 h;
    public final dfm i;
    public final k691 t;
    public final rku W0 = new rku();
    public final tac0 X0 = new tac0(this, true);

    public jsj0(xfx xfxVar, ktf1 ktf1Var, d4p0 d4p0Var, z611 z611Var, s880 s880Var, gh10 gh10Var, yl1 yl1Var, s691 s691Var, dfm dfmVar, k691 k691Var, dxy dxyVar, am51 am51Var, rt01 rt01Var, aor aorVar, i8h1 i8h1Var, l6h1 l6h1Var, pdl0 pdl0Var, qv4 qv4Var, FlowableMap flowableMap) {
        this.a = xfxVar;
        this.b = ktf1Var;
        this.c = d4p0Var;
        this.d = z611Var;
        this.e = s880Var;
        this.f = gh10Var;
        this.g = yl1Var;
        this.h = s691Var;
        this.i = dfmVar;
        this.t = k691Var;
        this.X = dxyVar;
        this.Y = am51Var;
        this.Z = rt01Var;
        this.N0 = aorVar;
        this.O0 = i8h1Var;
        this.P0 = l6h1Var;
        this.Q0 = pdl0Var;
        this.R0 = qv4Var;
        this.S0 = flowableMap;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [android.view.View, com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView, java.lang.Object] */
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view;
        int i;
        laa laaVarA;
        laa laaVarA2;
        View viewInflate = layoutInflater.inflate(2131625327, viewGroup, false);
        viewInflate.getClass();
        x9p1.p(viewInflate, this);
        TrackCarouselNowPlaying trackCarouselNowPlaying = (TrackCarouselNowPlaying) sto1.i(viewInflate.findViewById(2131431465));
        trackCarouselNowPlaying.q(this.c);
        trackCarouselNowPlaying.getView().l(this.d);
        trackCarouselNowPlaying.getView().setClipToOutline(true);
        this.U0 = new h3p0(trackCarouselNowPlaying, ktf1.a(this.b));
        this.T0 = (FadingSeekBarView) viewInflate.findViewById(2131430902);
        ?? r3 = (TrackInfoView) viewInflate.findViewById(2131431475);
        r3.getClass();
        cpf1 cpf1VarF = this.e.f(new isj0(r3, (byte) 0));
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(r3.getContext(), (ViewGroup) r3.getParent(), cpf1VarF, (drw) null, 24);
        this.V0 = dtwVarD;
        View view2 = dtwVarD.w;
        k8p1.o((View) r3, view2);
        View viewFindViewById = viewInflate.findViewById(2131427580);
        xfx xfxVar = this.a;
        qzh qzhVarI = voo1.i(xfxVar);
        AddToButtonView addToButtonView = (AddToButtonView) ((ver) qzhVarI).b;
        int dimensionPixelSize = addToButtonView.getResources().getDimensionPixelSize(2131165293);
        addToButtonView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        rt01 rt01VarA = this.g.a(qzhVarI);
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById.getParent();
        View view3 = mhc.b(viewGroup2.getContext(), viewGroup2, rt01VarA, new sl1(false), (ipb1) null, 112).w;
        k8p1.o(viewFindViewById, view3);
        View viewFindViewById2 = viewInflate.findViewById(2131430492);
        rih1 rih1Var = rih1.a;
        dxy dxyVar = this.X;
        qv4 qv4Var = this.R0;
        if (viewFindViewById2 != null) {
            if (qv4Var.a()) {
                laaVarA2 = dxyVar.t(new hsj0(this, (byte) 2), new hsj0(this, (byte) 3), 3);
            } else {
                qzh qzhVarS = voo1.s(xfxVar);
                ((whs) qzhVarS).a.setPadding(0, 0, 0, 0);
                laaVarA2 = this.h.a(qzhVarS);
            }
            ViewGroup viewGroup3 = (ViewGroup) viewFindViewById2.getParent();
            View view4 = mhc.b(viewGroup3.getContext(), viewGroup3, laaVarA2, rih1Var, (ipb1) null, 112).w;
            k8p1.o(viewFindViewById2, view4);
            view = view4;
        } else {
            view = null;
        }
        View viewFindViewById3 = viewInflate.findViewById(2131430407);
        ViewGroup viewGroup4 = (ViewGroup) viewFindViewById3.getParent();
        View view5 = mhc.b(viewGroup4.getContext(), viewGroup4, this.i, new jpt0((ipt0) null, 1), (ipb1) null, 112).w;
        k8p1.o(viewFindViewById3, view5);
        View viewFindViewById4 = viewInflate.findViewById(2131430141);
        if (qv4Var.a()) {
            i = 3;
            laaVarA = dxyVar.t(new hsj0(this, (byte) 0), new hsj0(this, (byte) 1), 3);
        } else {
            i = 3;
            qzh qzhVarR = voo1.r(xfxVar);
            ((gcs) qzhVarR).a.setPadding(0, 0, 0, 0);
            laaVarA = this.t.a(qzhVarR);
        }
        laa laaVar = laaVarA;
        ViewGroup viewGroup5 = (ViewGroup) viewFindViewById4.getParent();
        View view6 = mhc.b(viewGroup5.getContext(), viewGroup5, laaVar, rih1Var, (ipb1) null, 112).w;
        k8p1.o(viewFindViewById4, view6);
        ViewStub viewStub = (ViewStub) viewInflate.findViewById(2131428189);
        viewStub.getClass();
        qtw qtwVarA = f6o1.A(this.N0, (ViewGroup.LayoutParams) null, (ScrollCardType) null, i);
        ViewGroup viewGroup6 = (ViewGroup) viewStub.getParent();
        k8p1.o(viewStub, mhc.b(viewGroup6.getContext(), viewGroup6, qtwVarA, new f3l(0.0f, 4031, view != null), (ipb1) null, 112).w);
        List listM = p7h.M(new View[]{view2, view3});
        List listI0 = f46.i0(new View[]{view, view5, view6});
        op80 jp80Var = new jp80(viewInflate);
        op80 eq80Var = new eq80(new e3h1(this.P0, (n7h1) null, this.O0));
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
            j7p1.y((View) it.next(), new hsj0(this, (byte) 4));
        }
        Iterator it2 = listI0.iterator();
        while (it2.hasNext()) {
            j7p1.y((View) it2.next(), new hsj0(this, (byte) 5));
        }
        return viewInflate;
    }

    public final x8c0 getLifecycle() {
        return this.X0;
    }

    public final void start() {
        this.X0.i(w8c0.e);
        h3p0 h3p0Var = this.U0;
        if (h3p0Var == null) {
            u890.C("trackCarouselElement");
            throw null;
        }
        h3p0Var.a();
        FadingSeekBarView fadingSeekBarView = this.T0;
        if (fadingSeekBarView == null) {
            u890.C("seekbarView");
            throw null;
        }
        this.f.b(fadingSeekBarView);
        this.W0.b(this.S0.t(mi10.P0).subscribe(new lrj0(this, (byte) 1)));
    }

    public final void stop() {
        this.X0.i(w8c0.c);
        this.W0.a();
        h3p0 h3p0Var = this.U0;
        if (h3p0Var == null) {
            u890.C("trackCarouselElement");
            throw null;
        }
        h3p0Var.b();
        this.f.c();
    }
}
