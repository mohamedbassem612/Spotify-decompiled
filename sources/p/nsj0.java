package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplaying.uiusecases.pager.TrackCarouselNowPlaying;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nsj0 implements m4p0 {
    public final i8h1 N0;
    public final l6h1 O0;
    public final yok0 P0;
    public final FlowableMap Q0;
    public p0s R0;
    public final rku S0 = new rku();
    public final ArrayList T0 = new ArrayList();
    public final k691 X;
    public final aor Y;
    public final ns10 Z;
    public final xfx a;
    public final ktf1 b;
    public final bf50 c;
    public final wp20 d;
    public final z611 e;
    public final yl1 f;
    public final upd0 g;
    public final ppd0 h;
    public final dfm i;
    public final s691 t;

    public nsj0(xfx xfxVar, ktf1 ktf1Var, bf50 bf50Var, wp20 wp20Var, z611 z611Var, yl1 yl1Var, upd0 upd0Var, ppd0 ppd0Var, dfm dfmVar, s691 s691Var, k691 k691Var, aor aorVar, ns10 ns10Var, i8h1 i8h1Var, l6h1 l6h1Var, yok0 yok0Var, FlowableMap flowableMap) {
        this.a = xfxVar;
        this.b = ktf1Var;
        this.c = bf50Var;
        this.d = wp20Var;
        this.e = z611Var;
        this.f = yl1Var;
        this.g = upd0Var;
        this.h = ppd0Var;
        this.i = dfmVar;
        this.t = s691Var;
        this.X = k691Var;
        this.Y = aorVar;
        this.Z = ns10Var;
        this.N0 = i8h1Var;
        this.O0 = l6h1Var;
        this.P0 = yok0Var;
        this.Q0 = flowableMap;
    }

    public static dtw b(wpw wpwVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, rih1.a, (ipb1) null, 112);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view;
        View viewInflate = layoutInflater.inflate(2131625330, viewGroup, false);
        xfx xfxVar = this.a;
        wfx wfxVar = xfxVar.c;
        this.R0 = new p0s(wfxVar.b, (byte) 1);
        View viewN = b8k1.n(viewInflate, 2131431475);
        p0s p0sVar = this.R0;
        if (p0sVar == null) {
            u890.C("trackInfo");
            throw null;
        }
        k8p1.o(viewN, p0sVar.b);
        TrackCarouselNowPlaying trackCarouselNowPlaying = (TrackCarouselNowPlaying) sto1.i(viewInflate.findViewById(2131431465));
        trackCarouselNowPlaying.q(this.c);
        trackCarouselNowPlaying.getView().l(this.e);
        View viewFindViewById = viewInflate.findViewById(2131427521);
        if (viewFindViewById != null) {
            rt01 rt01VarA = this.f.a(voo1.i(xfxVar));
            ViewGroup viewGroup2 = (ViewGroup) viewFindViewById.getParent();
            sl1 sl1Var = new sl1(true);
            tka0 tka0Var = dtw.C;
            view = mhc.b(viewGroup2.getContext(), viewGroup2, rt01VarA, sl1Var, (ipb1) null, 112).w;
            k8p1.o(viewFindViewById, view);
        } else {
            view = null;
        }
        View viewFindViewById2 = viewInflate.findViewById(2131431488);
        if (viewFindViewById2 != null) {
            k8p1.o(viewFindViewById2, b(this.g, (ViewGroup) viewFindViewById2.getParent()).w);
        }
        b6s b6sVar = new b6s(wfxVar.b, (byte) 0);
        View viewFindViewById3 = viewInflate.findViewById(2131429814);
        if (viewFindViewById3 != null) {
            k8p1.o(viewFindViewById3, b6sVar.b);
        }
        View viewFindViewById4 = viewInflate.findViewById(2131430492);
        View view2 = b(this.t.a(voo1.s(xfxVar)), (ViewGroup) viewFindViewById4.getParent()).w;
        k8p1.o(viewFindViewById4, view2);
        View viewFindViewById5 = viewInflate.findViewById(2131430407);
        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById5.getParent();
        jpt0 jpt0Var = new jpt0((ipt0) null, 3);
        tka0 tka0Var2 = dtw.C;
        View view3 = mhc.b(viewGroup3.getContext(), viewGroup3, this.i, jpt0Var, (ipb1) null, 112).w;
        k8p1.o(viewFindViewById5, view3);
        View viewFindViewById6 = viewInflate.findViewById(2131430141);
        View view4 = b(this.X.a(voo1.r(xfxVar)), (ViewGroup) viewFindViewById6.getParent()).w;
        k8p1.o(viewFindViewById6, view4);
        ViewStub viewStub = (ViewStub) viewInflate.findViewById(2131428189);
        if (viewStub != null) {
            qtw qtwVarA = f6o1.A(this.Y, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            ViewGroup viewGroup4 = (ViewGroup) viewStub.getParent();
            k8p1.o(viewStub, mhc.b(viewGroup4.getContext(), viewGroup4, qtwVarA, new f3l(0.0f, 4095, false), (ipb1) null, 112).w);
        }
        this.T0.addAll(p7h.M(new h3p0[]{new h3p0(trackCarouselNowPlaying, ktf1.a(this.b)), new h3p0(b6sVar, this.h)}));
        p0s p0sVar2 = this.R0;
        if (p0sVar2 == null) {
            u890.C("trackInfo");
            throw null;
        }
        List listI0 = f46.i0(new View[]{p0sVar2.b, view});
        List listM = p7h.M(new View[]{view2, view3, view4});
        op80 jp80Var = new jp80(viewInflate);
        op80 eq80Var = new eq80(new e3h1(this.O0, (n7h1) null, this.N0));
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
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            j7p1.y((View) it.next(), new msj0(this, (byte) 0));
        }
        Iterator it2 = listM.iterator();
        while (it2.hasNext()) {
            j7p1.y((View) it2.next(), new msj0(this, (byte) 1));
        }
        return viewInflate;
    }

    public final void start() {
        p0s p0sVar = this.R0;
        if (p0sVar == null) {
            u890.C("trackInfo");
            throw null;
        }
        lbc0 lbc0Var = new lbc0(1, p0sVar, p0s.class, "render", "render(Ljava/lang/Object;)V", 0, (byte) 24);
        p0s p0sVar2 = this.R0;
        if (p0sVar2 == null) {
            u890.C("trackInfo");
            throw null;
        }
        lbc0 lbc0Var2 = new lbc0(1, p0sVar2, p0s.class, "onEvent", "onEvent(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 25);
        wp20 wp20Var = this.d;
        lbc0Var2.invoke(new u830(wp20Var, (byte) 27));
        ((vku) wp20Var.e).a(((FlowableMap) wp20Var.a).J(new hwb(wp20Var, (byte) 12)).t(Functions.a).L((Scheduler) wp20Var.d).subscribe(new od30(lbc0Var, (byte) 13)));
        this.Z.a();
        Iterator it = this.T0.iterator();
        while (it.hasNext()) {
            ((h3p0) it.next()).a();
        }
        this.S0.b(this.Q0.subscribe(new vrk1(this, (byte) 21)));
    }

    public final void stop() {
        this.S0.a();
        ((vku) this.d.e).c();
        this.Z.d.c();
        Iterator it = this.T0.iterator();
        while (it.hasNext()) {
            ((h3p0) it.next()).b();
        }
    }
}
