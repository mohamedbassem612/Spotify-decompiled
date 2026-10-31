package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplaying.uiusecases.pager.TrackCarouselNowPlaying;
import com.spotify.nowplayingmini.uicomponents.seekbar.FadingSeekBarView;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gsj0 implements m4p0, iac0 {
    public final yok0 N0;
    public FadingSeekBarView O0;
    public h3p0 P0;
    public final rku Q0 = new rku();
    public final tac0 R0 = new tac0(this, true);
    public final FlowableMap X;
    public final i8h1 Y;
    public final l6h1 Z;
    public final xfx a;
    public final ktf1 b;
    public final d4p0 c;
    public final z611 d;
    public final ymm0 e;
    public final gh10 f;
    public final s691 g;
    public final dfm h;
    public final k691 i;
    public final aor t;

    public gsj0(xfx xfxVar, ktf1 ktf1Var, d4p0 d4p0Var, z611 z611Var, ymm0 ymm0Var, gh10 gh10Var, s691 s691Var, dfm dfmVar, k691 k691Var, aor aorVar, FlowableMap flowableMap, i8h1 i8h1Var, l6h1 l6h1Var, yok0 yok0Var) {
        this.a = xfxVar;
        this.b = ktf1Var;
        this.c = d4p0Var;
        this.d = z611Var;
        this.e = ymm0Var;
        this.f = gh10Var;
        this.g = s691Var;
        this.h = dfmVar;
        this.i = k691Var;
        this.t = aorVar;
        this.X = flowableMap;
        this.Y = i8h1Var;
        this.Z = l6h1Var;
        this.N0 = yok0Var;
    }

    public static dtw b(wpw wpwVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, rih1.a, (ipb1) null, 112);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [android.view.View, com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView, java.lang.Object] */
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view;
        View viewInflate = layoutInflater.inflate(2131625326, viewGroup, false);
        viewInflate.getClass();
        x9p1.p(viewInflate, this);
        TrackCarouselNowPlaying trackCarouselNowPlaying = (TrackCarouselNowPlaying) sto1.i(viewInflate.findViewById(2131431465));
        trackCarouselNowPlaying.q(this.c);
        trackCarouselNowPlaying.getView().l(this.d);
        this.P0 = new h3p0(trackCarouselNowPlaying, ktf1.a(this.b));
        this.O0 = (FadingSeekBarView) viewInflate.findViewById(2131430902);
        ?? r3 = (TrackInfoView) viewInflate.findViewById(2131431475);
        r3.getClass();
        View view2 = b(new dx0((FlowableMap) this.e.b, new lkr((TrackInfoView) r3)), (ViewGroup) r3.getParent()).w;
        k8p1.o((View) r3, view2);
        View viewFindViewById = viewInflate.findViewById(2131430492);
        xfx xfxVar = this.a;
        if (viewFindViewById != null) {
            qzh qzhVarS = voo1.s(xfxVar);
            ((whs) qzhVarS).a.setPadding(0, 0, 0, 0);
            view = b(this.g.a(qzhVarS), (ViewGroup) viewFindViewById.getParent()).w;
            k8p1.o(viewFindViewById, view);
        } else {
            view = null;
        }
        View viewFindViewById2 = viewInflate.findViewById(2131430407);
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2.getParent();
        jpt0 jpt0Var = new jpt0((ipt0) null, 3);
        tka0 tka0Var = dtw.C;
        View view3 = mhc.b(viewGroup2.getContext(), viewGroup2, this.h, jpt0Var, (ipb1) null, 112).w;
        k8p1.o(viewFindViewById2, view3);
        View viewFindViewById3 = viewInflate.findViewById(2131430141);
        qzh qzhVarR = voo1.r(xfxVar);
        ((gcs) qzhVarR).a.setPadding(0, 0, 0, 0);
        View view4 = b(this.i.a(qzhVarR), (ViewGroup) viewFindViewById3.getParent()).w;
        k8p1.o(viewFindViewById3, view4);
        ViewStub viewStub = (ViewStub) viewInflate.findViewById(2131428189);
        viewStub.getClass();
        qtw qtwVarA = f6o1.A(this.t, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        ViewGroup viewGroup3 = (ViewGroup) viewStub.getParent();
        k8p1.o(viewStub, mhc.b(viewGroup3.getContext(), viewGroup3, qtwVarA, new f3l(0.0f, 4031, view != null), (ipb1) null, 112).w);
        List listSingletonList = Collections.singletonList(view2);
        List listI0 = f46.i0(new View[]{view, view3, view4});
        op80 jp80Var = new jp80(viewInflate);
        op80 eq80Var = new eq80(new e3h1(this.Z, (n7h1) null, this.Y));
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
        Iterator it = listSingletonList.iterator();
        while (it.hasNext()) {
            j7p1.y((View) it.next(), new fsj0(this, (byte) 0));
        }
        Iterator it2 = listI0.iterator();
        while (it2.hasNext()) {
            j7p1.y((View) it2.next(), new fsj0(this, (byte) 1));
        }
        return viewInflate;
    }

    public final x8c0 getLifecycle() {
        return this.R0;
    }

    public final void start() {
        this.R0.i(w8c0.e);
        h3p0 h3p0Var = this.P0;
        if (h3p0Var == null) {
            u890.C("trackCarouselElement");
            throw null;
        }
        h3p0Var.a();
        FadingSeekBarView fadingSeekBarView = this.O0;
        if (fadingSeekBarView == null) {
            u890.C("seekbarView");
            throw null;
        }
        this.f.b(fadingSeekBarView);
        this.Q0.b(this.X.subscribe(new vrk1(this, (byte) 20)));
    }

    public final void stop() {
        this.R0.i(w8c0.c);
        this.Q0.a();
        h3p0 h3p0Var = this.P0;
        if (h3p0Var == null) {
            u890.C("trackCarouselElement");
            throw null;
        }
        h3p0Var.b();
        this.f.c();
    }
}
