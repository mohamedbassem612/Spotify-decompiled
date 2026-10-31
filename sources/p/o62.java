package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.thumb.ThumbButtonView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplaying.scroll.view.PeekScrollView;
import com.spotify.nowplayingmodes.adsmode.ui.overlay.AdsOverlayControlsLayout;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o62 implements m4p0, iac0 {
    public final ynb0 N0;
    public final toj0 O0;
    public final dz0 P0;
    public final ynb0 Q0;
    public final ynb0 R0;
    public final dn4 S0;
    public final p2o0 T0;
    public final cp31 U0;
    public final a680 V0;
    public final kr60 W0;
    public final r791 X;
    public final ynb0 X0;
    public final ddo Y;
    public final ynb0 Y0;
    public final ynb0 Z;
    public final vxo Z0;
    public final xfx a;
    public final ynb0 a1;
    public final eyh0 b;
    public final i8h1 b1;
    public final yq0 c;
    public final l6h1 c1;
    public final ynb0 d;
    public final n7h1 d1;
    public final c62 e;
    public final n6r0 e1;
    public final ynb0 f;
    public final lik1 f1;
    public final j62 g;
    public final q2p0 g1;
    public final ynb0 h;
    public uu0 h1;
    public final an0 i;
    public List i1;
    public AdsOverlayControlsLayout j1;
    public u961 k1;
    public View l1;
    public final g2z m1;
    public h3p0 n1;
    public final tac0 o1 = new tac0(this, true);
    public final em0 t;

    public o62(xfx xfxVar, eyh0 eyh0Var, yq0 yq0Var, ynb0 ynb0Var, c62 c62Var, ynb0 ynb0Var2, j62 j62Var, ynb0 ynb0Var3, an0 an0Var, em0 em0Var, r791 r791Var, ddo ddoVar, ynb0 ynb0Var4, ynb0 ynb0Var5, toj0 toj0Var, dz0 dz0Var, ynb0 ynb0Var6, ynb0 ynb0Var7, dn4 dn4Var, p2o0 p2o0Var, cp31 cp31Var, a680 a680Var, kr60 kr60Var, ynb0 ynb0Var8, ynb0 ynb0Var9, FlowableDistinctUntilChanged flowableDistinctUntilChanged, rzo0 rzo0Var, vxo vxoVar, ynb0 ynb0Var10, i8h1 i8h1Var, l6h1 l6h1Var, n7h1 n7h1Var, n6r0 n6r0Var, lik1 lik1Var, q2p0 q2p0Var) {
        this.a = xfxVar;
        this.b = eyh0Var;
        this.c = yq0Var;
        this.d = ynb0Var;
        this.e = c62Var;
        this.f = ynb0Var2;
        this.g = j62Var;
        this.h = ynb0Var3;
        this.i = an0Var;
        this.t = em0Var;
        this.X = r791Var;
        this.Y = ddoVar;
        this.Z = ynb0Var4;
        this.N0 = ynb0Var5;
        this.O0 = toj0Var;
        this.P0 = dz0Var;
        this.Q0 = ynb0Var6;
        this.R0 = ynb0Var7;
        this.S0 = dn4Var;
        this.T0 = p2o0Var;
        this.U0 = cp31Var;
        this.V0 = a680Var;
        this.W0 = kr60Var;
        this.X0 = ynb0Var8;
        this.Y0 = ynb0Var9;
        this.Z0 = vxoVar;
        this.a1 = ynb0Var10;
        this.b1 = i8h1Var;
        this.c1 = l6h1Var;
        this.d1 = n7h1Var;
        this.e1 = n6r0Var;
        this.f1 = lik1Var;
        this.g1 = q2p0Var;
        this.m1 = rzo0.o(rzo0Var, flowableDistinctUntilChanged);
    }

    public static dtw b(xpw xpwVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, f6o1.A(xpwVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rih1.a, (ipb1) null, 112);
    }

    public static dtw c(wpw wpwVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, rih1.a, (ipb1) null, 112);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        xfx xfxVar = this.a;
        wfx wfxVar = xfxVar.c;
        View viewInflate = layoutInflater.inflate(2131624031, viewGroup, false);
        viewInflate.getClass();
        x9p1.p(viewInflate, this);
        Context context = viewInflate.getContext();
        this.o1.i(w8c0.b);
        op80 jp80Var = new jp80(viewInflate);
        op80 eq80Var = new eq80(new e3h1(this.c1, this.d1, this.b1));
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
        View viewN = b8k1.n(viewInflate, 2131430422);
        viewN.getClass();
        z8p1.l(viewN, 1);
        z8p1.l(b8k1.n(viewInflate, 2131430421), 2);
        Object objN = b8k1.n(viewInflate, 2131430320);
        ((PeekScrollView) objN).c(this.g1.l().e());
        View viewN2 = b8k1.n(viewInflate, 2131430262);
        ((AdsOverlayControlsLayout) viewN2).setContentDescription(context.getString(2131951860));
        this.j1 = (AdsOverlayControlsLayout) viewN2;
        uer uerVar = new uer(wfxVar.b);
        View viewN3 = b8k1.n(viewInflate, 2131427503);
        viewN3.getClass();
        eyh0 eyh0Var = this.b;
        Resources resources = (Resources) eyh0Var.c;
        boolean zA = ((zm4) eyh0Var.d).a();
        Observable observable = (Observable) eyh0Var.b;
        k8p1.o(viewN3, c(zA ? f6o1.A(new br0(observable, resources), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : new rt01(observable, resources, uerVar), (ViewGroup) viewN3.getParent()).w);
        View viewN4 = b8k1.n(viewInflate, 2131428234);
        viewN4.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewN4.getParent();
        an0 an0Var = this.i;
        k8p1.o(viewN4, c(an0Var, viewGroup2).w);
        View viewN5 = b8k1.n(viewInflate, 2131428103);
        viewN5.getClass();
        em0 em0Var = this.t;
        u601 u601Var = (u601) em0Var.i;
        ao0 ao0Var = (ao0) em0Var.f;
        boolean zA2 = ((zm4) em0Var.X).a();
        Observable observable2 = (Observable) em0Var.b;
        Flowable flowable = (Flowable) em0Var.c;
        Scheduler scheduler = (Scheduler) em0Var.d;
        k8p1.o(viewN5, c(zA2 ? f6o1.A(new cm0(observable2, flowable, scheduler, (a62) em0Var.e, ao0Var, (j62) em0Var.g, u601Var, (hnl) em0Var.t), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : new im0(observable2, flowable, scheduler, (a62) em0Var.e, ao0Var, (j62) em0Var.g, (xfx) em0Var.h, u601Var, (hnl) em0Var.t), (ViewGroup) viewN5.getParent()).w);
        g891 g891VarA = this.X.a(new q791(2));
        View viewN6 = b8k1.n(viewInflate, 2131430999);
        viewN6.getClass();
        k8p1.o(viewN6, b(g891VarA, (ViewGroup) viewN6.getParent()).w);
        View viewN7 = b8k1.n(viewInflate, 2131430408);
        viewN7.getClass();
        toj0 toj0Var = this.O0;
        boolean zA3 = ((zm4) toj0Var.g).a();
        Flowable flowable2 = (Flowable) toj0Var.b;
        FlowableMap flowableMap = (FlowableMap) toj0Var.c;
        w9u0 w9u0Var = (w9u0) toj0Var.d;
        k8p1.o(viewN7, c(zA3 ? f6o1.A(new tm(flowable2, flowableMap, w9u0Var, (j62) toj0Var.e), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : new bs0(flowable2, flowableMap, w9u0Var, (j62) toj0Var.e, (dfm) toj0Var.f), (ViewGroup) viewN7.getParent()).w);
        qzh qzhVarS = voo1.s(xfxVar);
        View viewFindViewById = viewInflate.findViewById(2131430492);
        viewFindViewById.setContentDescription(context.getString(2131960418));
        a680 a680Var = this.V0;
        boolean zA4 = ((zm4) a680Var.f).a();
        FlowableMap flowableMap2 = (FlowableMap) a680Var.a;
        Flowable flowable3 = (Flowable) a680Var.b;
        Flowable flowable4 = (Flowable) a680Var.c;
        View view = c(zA4 ? f6o1.A(new ex0(flowableMap2, flowable3, flowable4, (w9u0) a680Var.d, (j62) a680Var.e), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : new hx0(flowableMap2, flowable3, flowable4, (w9u0) a680Var.d, (j62) a680Var.e, qzhVarS), (ViewGroup) viewFindViewById.getParent()).w;
        k8p1.o(viewFindViewById, view);
        qzh qzhVarR = voo1.r(xfxVar);
        View viewFindViewById2 = viewInflate.findViewById(2131430141);
        viewFindViewById2.setContentDescription(context.getString(2131959124));
        View view2 = c(((zm4) this.W0.b).a() ? f6o1.A(new cx0((byte) 0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : new dx0(qzhVarR), (ViewGroup) viewFindViewById2.getParent()).w;
        k8p1.o(viewFindViewById2, view2);
        p2o0 p2o0Var = this.T0;
        boolean zA5 = ((zm4) p2o0Var.g).a();
        FlowableMap flowableMap3 = (FlowableMap) p2o0Var.b;
        FlowableDistinctUntilChanged flowableDistinctUntilChanged = (FlowableDistinctUntilChanged) p2o0Var.c;
        Flowable flowable5 = (Flowable) p2o0Var.d;
        w9u0 w9u0Var2 = (w9u0) p2o0Var.e;
        qtw qtwVarA = zA5 ? f6o1.A(new lw0(flowableMap3, flowableDistinctUntilChanged, flowable5, w9u0Var2, (j62) p2o0Var.f), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : new pw0(flowableMap3, flowableDistinctUntilChanged, flowable5, w9u0Var2, (j62) p2o0Var.f);
        ViewGroup viewGroup3 = (ViewGroup) viewInflate;
        View view3 = c(qtwVarA, viewGroup3).w;
        view3.setContentDescription(context.getString(2131961593));
        view3.setVisibility(8);
        k8p1.o(b8k1.n(viewInflate, 2131430899), view3);
        cp31 cp31Var = this.U0;
        boolean zA6 = ((zm4) cp31Var.f).a();
        FlowableMap flowableMap4 = (FlowableMap) cp31Var.a;
        FlowableDistinctUntilChanged flowableDistinctUntilChanged2 = (FlowableDistinctUntilChanged) cp31Var.b;
        Flowable flowable6 = (Flowable) cp31Var.c;
        w9u0 w9u0Var3 = (w9u0) cp31Var.d;
        View view4 = c(zA6 ? f6o1.A(new qw0(flowableMap4, flowableDistinctUntilChanged2, flowable6, w9u0Var3, (j62) cp31Var.e), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : new tw0(flowableMap4, flowableDistinctUntilChanged2, flowable6, w9u0Var3, (j62) cp31Var.e), viewGroup3).w;
        view4.setContentDescription(context.getString(2131961594));
        view4.setVisibility(8);
        k8p1.o(b8k1.n(viewInflate, 2131430903), view4);
        this.k1 = new u961(view, view2, view3, view4);
        PublishSubject publishSubject = new PublishSubject();
        PublishSubject publishSubject2 = new PublishSubject();
        ThumbButtonView thumbButtonViewN = b8k1.n(viewInflate, 2131431339);
        thumbButtonViewN.setContentDescription(context.getString(2131957324));
        ThumbButtonView thumbButtonView = thumbButtonViewN;
        ThumbButtonView thumbButtonViewN2 = b8k1.n(viewInflate, 2131431338);
        thumbButtonViewN2.setContentDescription(context.getString(2131954997));
        ThumbButtonView thumbButtonView2 = thumbButtonViewN2;
        vxo vxoVar = this.Z0;
        k8p1.o(thumbButtonView, c(vxoVar.a(true, publishSubject2, publishSubject), (ViewGroup) thumbButtonView.getParent()).w);
        k8p1.o(thumbButtonView2, c(vxoVar.a(false, publishSubject, publishSubject2), (ViewGroup) thumbButtonView2.getParent()).w);
        an0Var.Z = new m62(publishSubject, (byte) 0);
        an0Var.N0 = new m62(publishSubject2, (byte) 1);
        dvs dvsVar = new dvs(wfxVar.b);
        dvsVar.q(this.e);
        if (this.S0.c()) {
            View viewN8 = b8k1.n(viewInflate, 2131431465);
            im0 im0VarA = ekf1.a((ekf1) this.R0.get(), dvsVar);
            AdsOverlayControlsLayout adsOverlayControlsLayout = this.j1;
            if (adsOverlayControlsLayout == null) {
                u890.C("modeRootView");
                throw null;
            }
            k8p1.o(viewN8, c(im0VarA, adsOverlayControlsLayout).w);
        } else {
            k8p1.o(b8k1.n(viewInflate, 2131431465), dvsVar.a);
            this.n1 = new h3p0(dvsVar, ktf1.a((ktf1) this.Q0.get()));
        }
        AdsOverlayControlsLayout adsOverlayControlsLayout2 = this.j1;
        if (adsOverlayControlsLayout2 == null) {
            u890.C("modeRootView");
            throw null;
        }
        adsOverlayControlsLayout2.f(b8k1.n(viewInflate, 2131430259), b8k1.n(viewInflate, 2131427743));
        this.l1 = b8k1.n(viewInflate, 2131428247);
        ConstraintLayout constraintLayoutN = b8k1.n(viewInflate, 2131430421);
        View viewN9 = b8k1.n(viewInflate, 2131430422);
        View viewN10 = b8k1.n(viewInflate, 2131427507);
        View view5 = b(this.c.a(new uq0(rq0.a)), (ViewGroup) viewN10.getParent()).w;
        int dimensionPixelSize = view5.getResources().getDimensionPixelSize(2131167033);
        view5.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        k8p1.o(viewN10, view5);
        View viewN11 = b8k1.n(viewInflate, 2131431490);
        View view6 = b(this.P0.a(new ry0(oy0.a)), (ViewGroup) viewN11.getParent()).w;
        int dimensionPixelSize2 = view6.getResources().getDimensionPixelSize(2131166970);
        view6.setPadding(dimensionPixelSize2, view6.getResources().getDimensionPixelSize(2131167033), dimensionPixelSize2, dimensionPixelSize2);
        k8p1.o(viewN11, view6);
        View view7 = this.l1;
        if (view7 == null) {
            u890.C("controlsRow");
            throw null;
        }
        View viewN12 = b8k1.n(viewInflate, 2131428293);
        View view8 = b(this.Y.a(new ado(xco.a, (pxc) null)), (ViewGroup) viewN12.getParent()).w;
        int dimensionPixelSize3 = view8.getResources().getDimensionPixelSize(2131167033);
        view8.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        k8p1.o(viewN12, view8);
        this.h1 = new uu0(constraintLayoutN, viewN9, view5, view6, view7, view8);
        this.i1 = Collections.singletonList(b8k1.n(viewInflate, 2131427503));
        AdsOverlayControlsLayout adsOverlayControlsLayout3 = this.j1;
        if (adsOverlayControlsLayout3 == null) {
            u890.C("modeRootView");
            throw null;
        }
        View view9 = this.l1;
        if (view9 == null) {
            u890.C("controlsRow");
            throw null;
        }
        j7p1.x(adsOverlayControlsLayout3, new n62(this, (byte) 0));
        j7p1.x(viewN, new n62(this, (byte) 1));
        j7p1.x(view9, new n62(this, (byte) 2));
        return viewInflate;
    }

    public final void destroy() {
        this.o1.i(w8c0.a);
    }

    public final x8c0 getLifecycle() {
        return this.o1;
    }

    public final void start() {
        Flowable<nwq0> overlayState;
        Disposable disposableSubscribe;
        this.o1.i(w8c0.e);
        j62 j62Var = this.g;
        j62Var.f.b(j62Var.a.distinctUntilChanged().subscribe(new tg(j62Var, (byte) 12)));
        h3p0 h3p0Var = this.n1;
        if (h3p0Var != null) {
            h3p0Var.a();
        }
        i62 i62Var = (i62) this.f.get();
        i62Var.d.a(new ObservableFromPublisher(i62Var.a).switchMapSingle(new t7o0(i62Var, (byte) 10)).subscribe(new tg(i62Var, (byte) 11)));
        ww9 ww9Var = (ww9) this.h.get();
        AdsOverlayControlsLayout adsOverlayControlsLayout = this.j1;
        if (adsOverlayControlsLayout == null) {
            u890.C("modeRootView");
            throw null;
        }
        ww9Var.a(new w0y(adsOverlayControlsLayout, (byte) 3));
        ((tqq0) this.Y0.get()).a();
        ix0 ix0Var = (ix0) this.X0.get();
        u961 u961Var = this.k1;
        if (u961Var == null) {
            u890.C("playbackControls");
            throw null;
        }
        ix0Var.c.b(ix0Var.a.map(mpi1.d).distinctUntilChanged().observeOn(ix0Var.b).subscribe(new tg(ix0Var, u961Var)));
        AdsOverlayControlsLayout adsOverlayControlsLayout2 = this.j1;
        if (adsOverlayControlsLayout2 == null) {
            u890.C("modeRootView");
            throw null;
        }
        this.m1.J(adsOverlayControlsLayout2);
        qu0 qu0Var = (qu0) this.d.get();
        AdsOverlayControlsLayout adsOverlayControlsLayout3 = this.j1;
        if (adsOverlayControlsLayout3 == null) {
            u890.C("modeRootView");
            throw null;
        }
        uu0 uu0Var = this.h1;
        if (uu0Var == null) {
            u890.C("adOverlayGroup");
            throw null;
        }
        qu0Var.e = adsOverlayControlsLayout3;
        qu0Var.f = uu0Var;
        adsOverlayControlsLayout3.t.add(qu0Var.h);
        Disposable disposableSubscribe2 = qu0Var.c.distinctUntilChanged().switchMap(new lan1(qu0Var, (byte) 3)).observeOn(qu0Var.a).subscribe(new ou0(qu0Var, (byte) 0));
        vku vkuVar = qu0Var.d;
        vkuVar.a(disposableSubscribe2);
        AdsOverlayControlsLayout adsOverlayControlsLayout4 = qu0Var.e;
        if (adsOverlayControlsLayout4 != null && (overlayState = adsOverlayControlsLayout4.getOverlayState()) != null && (disposableSubscribe = overlayState.subscribe(new ou0(qu0Var, (byte) 1))) != null) {
            vkuVar.a(disposableSubscribe);
        }
        r9v r9vVar = (r9v) this.Z.get();
        List list = this.i1;
        if (list == null) {
            u890.C("dropShadowViews");
            throw null;
        }
        if (!r9vVar.b.a()) {
            r9vVar.d.b(r9vVar.a.map(xbp1.Z0).distinctUntilChanged().observeOn(r9vVar.c).subscribe(new cfs(r9vVar, list)));
        }
        mq0 mq0Var = (mq0) this.N0.get();
        AdsOverlayControlsLayout adsOverlayControlsLayout5 = this.j1;
        if (adsOverlayControlsLayout5 == null) {
            u890.C("modeRootView");
            throw null;
        }
        mq0Var.d.b(Observable.combineLatest(mq0Var.b.map(t9w.d).distinctUntilChanged(), new ObservableFromPublisher(adsOverlayControlsLayout5.getOverlayState().J(e4y.d)), mm10.i).subscribe(new tg(mq0Var, (byte) 7)));
        vp41 vp41Var = (vp41) this.a1.get();
        if (((zm4) vp41Var.d.get()).g()) {
            vp41Var.g.b(yoi1.i(vp41Var.e.a, vp41Var.f).switchMap(new up41(vp41Var, (byte) 0)).subscribe(new lyw0(vp41Var, (byte) 29)));
        }
    }

    public final void stop() {
        this.o1.i(w8c0.c);
        j62 j62Var = this.g;
        j62Var.g = null;
        j62Var.f.a();
        h3p0 h3p0Var = this.n1;
        if (h3p0Var != null) {
            h3p0Var.b();
        }
        ((i62) this.f.get()).d.c();
        ww9 ww9Var = (ww9) this.h.get();
        ww9Var.c.a();
        ww9Var.d = null;
        ((tqq0) this.Y0.get()).b();
        ((ix0) this.X0.get()).c.a();
        this.m1.K();
        qu0 qu0Var = (qu0) this.d.get();
        qu0Var.d.c();
        qu0Var.e = null;
        qu0Var.f = null;
        ((r9v) this.Z.get()).d.a();
        ((mq0) this.N0.get()).d.a();
        ((vp41) this.a1.get()).g.a();
    }
}
