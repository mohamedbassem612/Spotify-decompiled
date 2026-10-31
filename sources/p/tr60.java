package p;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.metadata.proto.Metadata$Episode;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.nowplaying.uiusecases.carousel.horizontalvideo.ZoomableView;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tr60 extends e711 implements xyd {
    public static final /* synthetic */ int y1 = 0;
    public final w2k1 U0;
    public final FlowableMap V0;
    public final Flowable W0;
    public final yjj1 X0;
    public final c3s Y0;
    public final Flowable Z0;
    public final suh1 a1;
    public final et90 b1;
    public final uym0 c1;
    public final iac0 d1;
    public final sn4 e1;
    public final Scheduler f1;
    public final Scheduler g1;
    public final ViewGroup h1;
    public final qr60 i1;
    public final iu30 j1;
    public final VideoSurfaceView k1;
    public final rku l1;
    public final rku m1;
    public final lag n1;
    public final rok0 o1;
    public final View p1;
    public final dtw q1;
    public final ZoomableView r1;
    public final FrameLayout s1;
    public final int t1;
    public final dtw u1;
    public final dtw v1;
    public final rjd w1;
    public iac0 x1;

    /* JADX WARN: Code duplicated, block: B:22:0x0181  */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View, android.view.ViewGroup, com.spotify.nowplaying.uiusecases.carousel.horizontalvideo.ZoomableView, java.lang.Object] */
    public tr60(w2k1 w2k1Var, FlowableMap flowableMap, Flowable flowable, yjj1 yjj1Var, c3s c3sVar, Flowable flowable2, pnd pndVar, uk51 uk51Var, suh1 suh1Var, et90 et90Var, uym0 uym0Var, qlb qlbVar, ewx ewxVar, iac0 iac0Var, sn4 sn4Var, Scheduler scheduler, Scheduler scheduler2, ViewGroup viewGroup, rr60 rr60Var, qr60 qr60Var, iu30 iu30Var, jjv0 jjv0Var, g2t0 g2t0Var) {
        rih1 rih1Var;
        boolean z;
        LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(viewGroup.getContext()).cloneInContext(viewGroup.getContext());
        layoutInflaterCloneInContext.setFactory2(ewxVar);
        View viewInflate = layoutInflaterCloneInContext.inflate(2131625080, viewGroup, false);
        super(viewInflate);
        this.U0 = w2k1Var;
        this.V0 = flowableMap;
        this.W0 = flowable;
        this.X0 = yjj1Var;
        this.Y0 = c3sVar;
        this.Z0 = flowable2;
        this.a1 = suh1Var;
        this.b1 = et90Var;
        this.c1 = uym0Var;
        this.d1 = iac0Var;
        this.e1 = sn4Var;
        this.f1 = scheduler;
        this.g1 = scheduler2;
        this.h1 = viewGroup;
        this.i1 = qr60Var;
        this.j1 = iu30Var;
        VideoSurfaceView videoSurfaceViewFindViewById = viewInflate.findViewById(2131431606);
        videoSurfaceViewFindViewById.setCaptureFrozenFrameOnDetach(false);
        this.k1 = videoSurfaceViewFindViewById;
        this.l1 = new rku();
        this.m1 = new rku();
        this.s1 = (FrameLayout) viewInflate.findViewById(2131430906);
        this.t1 = viewInflate.getContext().getResources().getDimensionPixelSize(2131167023);
        this.w1 = new rjd(this, (byte) 5);
        videoSurfaceViewFindViewById.setPriority(qr60Var.b);
        videoSurfaceViewFindViewById.setConfiguration(qr60Var.a);
        int i = -2;
        if (qr60Var.i) {
            smc0 smc0VarN = k4p1.n();
            boolean z2 = qr60Var.g;
            rih1 rih1Var2 = rih1.a;
            if (z2) {
                tka0 tka0Var = dtw.C;
                rih1Var = rih1Var2;
                smc0VarN.add(mhc.b(viewGroup.getContext(), viewGroup, pndVar, rih1Var2, (ipb1) null, 112).w);
            } else {
                rih1Var = rih1Var2;
            }
            if (qr60Var.h) {
                qtw qtwVarA = f6o1.A(uk51Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                tka0 tka0Var2 = dtw.C;
                smc0VarN.add(mhc.b(viewGroup.getContext(), viewGroup, qtwVarA, rih1Var, (ipb1) null, 112).w);
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(2131431230);
            linearLayout.removeAllViews();
            rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
            while (true) {
                rmc0 rmc0Var = rmc0VarListIterator;
                if (!rmc0Var.hasNext()) {
                    break;
                }
                View view = (View) rmc0Var.next();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
                layoutParams.setMarginStart(viewInflate.getContext().getResources().getDimensionPixelSize(2131167023));
                view.setLayoutParams(layoutParams);
                linearLayout.addView(view);
                i = -2;
            }
            if (!qr60Var.c) {
                z = false;
            } else if ((rr60Var != null ? rr60Var.a : null) != null) {
                View viewFindViewById = viewInflate.findViewById(2131428982);
                viewFindViewById.getClass();
                k8p1.o(viewFindViewById, K(f6o1.A(rr60Var.a, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewFindViewById.getParent(), new ur30(true)).w);
                z = true;
            } else {
                z = false;
            }
            if (!smc0VarK.isEmpty() || z) {
                View viewFindViewById2 = viewInflate.findViewById(2131431601);
                Resources resources = viewFindViewById2.getResources();
                ThreadLocal threadLocal = qx21.a;
                int color = resources.getColor(2131101505, null);
                GradientDrawable gradientDrawable = new GradientDrawable();
                int[] iArr = new int[Metadata$Episode.EPISODE_CONTENT_RATING_FIELD_NUMBER];
                int i2 = 0;
                for (int i3 = Metadata$Episode.EPISODE_CONTENT_RATING_FIELD_NUMBER; i2 < i3; i3 = Metadata$Episode.EPISODE_CONTENT_RATING_FIELD_NUMBER) {
                    float f = i2 / 102.0f;
                    double d = f;
                    iArr[i2] = uah.l(color, (int) ((d < 0.5d ? 2.0f * ((float) Math.pow(d, 2.0d)) : 1.0f - (2.0f * ((float) Math.pow(1.0f - f, 2.0d)))) * 102.0f));
                    i2++;
                }
                gradientDrawable.setColors(iArr);
                viewFindViewById2.setBackground(gradientDrawable);
                j7p1.y(viewFindViewById2, new th(viewFindViewById2, (byte) 3));
                this.o1 = new rok0(viewFindViewById2);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                Resources resources2 = viewFindViewById2.getResources();
                ThreadLocal threadLocal2 = qx21.a;
                gradientDrawable2.setColor(uah.l(resources2.getColor(2131100252, null), 137));
                viewFindViewById2.setBackground(gradientDrawable2);
                Barrier barrierFindViewById = viewInflate.findViewById(2131428208);
                ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
                if (layoutParams2 == null) {
                    bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    throw null;
                }
                qhl qhlVar = (qhl) layoutParams2;
                ((ViewGroup.MarginLayoutParams) qhlVar).height = 0;
                qhlVar.i = barrierFindViewById.getId();
                viewFindViewById2.setLayoutParams(qhlVar);
            }
        }
        ViewGroup viewGroupJ = J(this.h1);
        View viewFindViewById3 = viewGroupJ.findViewById(2131427919);
        View viewFindViewById4 = viewGroupJ.findViewById(2131427918);
        ?? r3 = (ZoomableView) ((w611) this).a.findViewById(2131428206);
        this.r1 = r3;
        r3.setPinchToZoomLogger(g2t0Var);
        r3.setOnZoomStartListener(new pr60(this, (byte) 0));
        if (this.i1.l) {
            tka0 tka0Var3 = dtw.C;
            dtw dtwVarD = mhc.d(((w611) this).a.getContext(), (ViewGroup) r3, f6o1.A(this.c1, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
            k8p1.o(r3.findViewById(2131430091), dtwVarD.w);
            this.v1 = dtwVarD;
        } else {
            r3.findViewById(2131430091).setVisibility(8);
        }
        viewFindViewById3.getClass();
        viewFindViewById4.getClass();
        this.n1 = new lag(viewFindViewById3, viewFindViewById4, this.h1, (Object) r3, (byte) 22);
        if (this.i1.j) {
            Barrier barrierFindViewById2 = r3.findViewById(2131428208);
            dtw dtwVarK = K(f6o1.A(this.b1, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), r3, new jpx0(null));
            View view2 = dtwVarK.w;
            view2.setId(View.generateViewId());
            qhl qhlVar2 = new qhl(-2, -2);
            qhlVar2.i = barrierFindViewById2.getId();
            qhlVar2.t = 0;
            int i4 = this.t1;
            ((ViewGroup.MarginLayoutParams) qhlVar2).topMargin = i4;
            qhlVar2.setMarginStart(i4);
            r3.addView(view2, qhlVar2);
            this.u1 = dtwVarK;
        }
        if (this.i1.k) {
            dtw dtwVarK2 = K(f6o1.A(qlbVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), r3, new i3k1((String) null, 5));
            View view3 = dtwVarK2.w;
            k8p1.o(r3.findViewById(2131431608), view3);
            view3.setVisibility(8);
            this.q1 = dtwVarK2;
        }
        View view4 = K(f6o1.A(this.a1, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), r3, new ojj1(new pr60(this, (byte) 1))).w;
        k8p1.o(r3.findViewById(2131431589), view4);
        view4.setVisibility(8);
        this.p1 = view4;
        if (this.i1.e) {
            k8p1.o(((w611) this).a.findViewById(2131430905), K(jjv0Var, this.h1, new un51(1)).w);
        }
        if (this.i1.f) {
            r3.setZoomingView(this.k1);
        }
        if (this.e1.f()) {
            return;
        }
        iac0 iac0Var2 = this.d1;
        this.x1 = iac0Var2;
        iac0Var2.getLifecycle().a(this.w1);
    }

    public static ViewGroup J(View view) {
        return u890.j(view.getTag(), 2131430188) ? (ViewGroup) view : J((ViewGroup) view.getParent());
    }

    public static dtw K(wpw wpwVar, ViewGroup viewGroup, Object obj) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, obj, (ipb1) null, 112);
    }

    public final void E(int i, Object obj) {
        ContextTrack contextTrack = (ContextTrack) obj;
        View view = ((w611) this).a;
        aiq0.a(view, new nx30(view, this, (byte) 25));
        this.k1.setPlayablePredicate(new vx40(contextTrack, this, (byte) 11));
        this.j1.invoke(new kdn(true, contextTrack.uri()));
        dtw dtwVar = this.q1;
        if (dtwVar != null) {
            dtwVar.f(new i3k1(contextTrack.uri(), 4));
        }
        dtw dtwVar2 = this.u1;
        if (dtwVar2 != null) {
            dtwVar2.f(new jpx0(contextTrack));
        }
        dtw dtwVar3 = this.v1;
        if (dtwVar3 != null) {
            qym0 qym0Var = new qym0(contextTrack.uri(), false);
            joa0 joa0Var = new joa0(contextTrack.uri());
            tka0 tka0Var = dtw.C;
            dtwVar3.k(qym0Var, joa0Var, (vu30) null);
        }
    }

    public final void G() {
        boolean zF = this.e1.f();
        View view = ((w611) this).a;
        if (zF && this.x1 == null) {
            iac0 iac0VarH = x9p1.h(view);
            if (iac0VarH == null) {
                n57.e("Carousel holder attached without a view-tree LifecycleOwner");
                iac0VarH = this.d1;
            }
            if (iac0VarH.getLifecycle().b() != w8c0.a) {
                this.x1 = iac0VarH;
                iac0VarH.getLifecycle().a(this.w1);
            }
        }
        il00 il00Var = new il00(this, (byte) 12);
        VideoSurfaceView videoSurfaceView = this.k1;
        videoSurfaceView.setVideoSurfaceCallback(il00Var);
        this.U0.a(videoSurfaceView);
        ((yyd) view.getTag(2131430298)).d = this;
        rok0 rok0Var = this.o1;
        if (rok0Var != null) {
            videoSurfaceView.setOnClickListener(new t230(this, rok0Var, (byte) 9));
        }
    }

    public final void H() {
        VideoSurfaceView videoSurfaceView = this.k1;
        videoSurfaceView.setVideoSurfaceCallback((s2k1) null);
        this.U0.f(videoSurfaceView);
        ((yyd) ((w611) this).a.getTag(2131430298)).d = null;
        videoSurfaceView.setOnClickListener(d37.c);
        this.m1.a();
    }

    public final void f() {
        VideoSurfaceView videoSurfaceView = this.k1;
        ezb1 ezb1Var = videoSurfaceView.T0;
        if (ezb1Var != null) {
            ezb1Var.j(videoSurfaceView);
        }
    }
}
