package p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplaying.carousel.CarouselView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j2p0 implements Connectable {
    public final y5u N0;
    public final c1p0 O0;
    public final b2p0 P0;
    public final FrameLayout Q0;
    public final dtw R0;
    public final VideoSurfaceView S0;
    public final View T0;
    public final FrameLayout U0;
    public final dtw V0;
    public final dtw W0;
    public final zs21 X;
    public final l0x0 X0;
    public final Context Y;
    public final idd1 Y0;
    public final MotionLayout Z;
    public final dtw Z0;
    public final h2p0 a;
    public final dtw a1;
    public final w2k1 b;
    public final View b1;
    public final xzf c;
    public final rah c1;
    public final r1p0 d;
    public final tp7 d1;
    public final cr6 e;
    public r4u e1;
    public final r961 f;
    public final llm f1;
    public final i8h1 g;
    public final l6h1 h;
    public final h0p0 i;
    public final gh4 t;

    /* JADX WARN: Code duplicated, block: B:100:0x0425 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x040f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0295  */
    /* JADX WARN: Code duplicated, block: B:41:0x0356  */
    /* JADX WARN: Code duplicated, block: B:43:0x035c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0366  */
    /* JADX WARN: Code duplicated, block: B:49:0x038d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0395  */
    /* JADX WARN: Code duplicated, block: B:53:0x039b A[LOOP:0: B:47:0x0387->B:53:0x039b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x0415  */
    /* JADX WARN: Code duplicated, block: B:69:0x0449 A[LOOP:2: B:67:0x0443->B:69:0x0449, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x047a  */
    /* JADX WARN: Code duplicated, block: B:74:0x047e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0484  */
    /* JADX WARN: Code duplicated, block: B:78:0x0488  */
    /* JADX WARN: Code duplicated, block: B:83:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:86:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0569  */
    /* JADX WARN: Code duplicated, block: B:95:0x056d  */
    /* JADX WARN: Code duplicated, block: B:98:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x03ad A[SYNTHETIC] */
    public j2p0(LayoutInflater layoutInflater, ViewGroup viewGroup, h2p0 h2p0Var, w2k1 w2k1Var, xzf xzfVar, q8n q8nVar, xfx xfxVar, u27 u27Var, qtw qtwVar, qzo0 qzo0Var, r1p0 r1p0Var, dfm dfmVar, yl1 yl1Var, snr snrVar, for forVar, cr6 cr6Var, r961 r961Var, i8h1 i8h1Var, l6h1 l6h1Var, h0p0 h0p0Var, gh4 gh4Var, zs21 zs21Var, tjq tjqVar, ikj1 ikj1Var) {
        y5u y5uVar;
        int i;
        View view;
        View viewFindViewById;
        FrameLayout frameLayout;
        dtw dtwVar;
        ViewGroup.LayoutParams layoutParams;
        Integer num;
        h2p0 h2p0Var2;
        b2p0 b2p0Var;
        ViewGroup.LayoutParams layoutParams2;
        int iC;
        int iC2;
        ViewGroup viewGroup2;
        int i2;
        View viewFindViewById2;
        Iterator it;
        int iIntValue;
        kil kilVarC;
        Iterator it2;
        int i3;
        View childAt;
        ViewGroup.LayoutParams layoutParams3;
        boolean z = h2p0Var.a;
        this.a = h2p0Var;
        this.b = w2k1Var;
        this.c = xzfVar;
        this.d = r1p0Var;
        this.e = cr6Var;
        this.f = r961Var;
        this.g = i8h1Var;
        this.h = l6h1Var;
        this.i = h0p0Var;
        this.t = gh4Var;
        this.X = zs21Var;
        this.Y0 = new idd1(new ivn0(this, (byte) 17));
        this.f1 = i3a.k(q8nVar);
        MotionLayout motionLayoutFindViewById = layoutInflater.inflate(2131625318, viewGroup, false).findViewById(2131430186);
        this.Z = motionLayoutFindViewById;
        Context context = motionLayoutFindViewById.getContext();
        this.Y = context;
        if (gh4Var.h()) {
            y5uVar = new y5u((byte) 2);
            x9p1.p(motionLayoutFindViewById, y5uVar);
            y5uVar.b.i(w8c0.c);
        } else {
            y5uVar = null;
        }
        this.N0 = y5uVar;
        View viewFindViewById3 = motionLayoutFindViewById.findViewById(2131428272);
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(viewFindViewById3.getContext(), (ViewGroup) viewFindViewById3.getParent(), u27Var.a(Flowable.I(Boolean.TRUE)), (drw) null, 24);
        View view2 = dtwVarD.w;
        this.R0 = dtwVarD;
        k8p1.o(viewFindViewById3, view2);
        View viewFindViewById4 = motionLayoutFindViewById.findViewById(2131428145);
        FrameLayout frameLayout2 = (FrameLayout) viewFindViewById4;
        frameLayout2.getClass();
        dtw dtwVarE = e(qtwVar, frameLayout2, new pin0(nin0.a));
        this.V0 = dtwVarE;
        frameLayout2.addView(dtwVarE.w);
        this.U0 = (FrameLayout) viewFindViewById4;
        boolean zJ = gh4Var.j();
        rih1 rih1Var = rih1.a;
        if (zJ) {
            int i4 = z ? 2 : 1;
            boolean zI = gh4Var.i();
            w2k1 w2k1Var2 = (w2k1) ikj1Var.b;
            yjj1 yjj1Var = (yjj1) ikj1Var.c;
            c3s c3sVar = (c3s) ikj1Var.d;
            bv4 bv4Var = (bv4) ikj1Var.f;
            qtw qtwVarA = f6o1.A(new mkj1(w2k1Var2, 2, i4, zI, yjj1Var, c3sVar, bv4Var.a() ? (qlb) ikj1Var.e : null, (FlowableMap) ikj1Var.a, bv4Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            View viewFindViewById5 = motionLayoutFindViewById.findViewById(2131431606);
            View view3 = e(qtwVarA, (ViewGroup) viewFindViewById5.getParent(), rih1Var).w;
            view3.setBackground(view3.getContext().getDrawable(2131233720));
            view3.setClipToOutline(true);
            view3.setVisibility(8);
            k8p1.o(viewFindViewById5, view3);
            this.S0 = null;
            this.T0 = view3;
        } else {
            VideoSurfaceView videoSurfaceViewFindViewById = motionLayoutFindViewById.findViewById(2131431606);
            videoSurfaceViewFindViewById.setConfiguration(dlm.c);
            videoSurfaceViewFindViewById.setRenderAsOverlay(gh4Var.i());
            if (z) {
                videoSurfaceViewFindViewById.setPriority(y2k1.c);
            }
            this.S0 = videoSurfaceViewFindViewById;
            this.T0 = videoSurfaceViewFindViewById;
        }
        RecyclerView recyclerView = (CarouselView) motionLayoutFindViewById.findViewById(2131431491);
        dtw dtwVarE2 = e(qzo0Var, (ViewGroup) recyclerView.getParent(), new izo0(h2p0Var.d, hzo0.b, h2p0Var.f));
        this.W0 = dtwVarE2;
        k8p1.o(recyclerView, dtwVarE2.w);
        ProgressBar progressBar = (ProgressBar) motionLayoutFindViewById.findViewById(2131430530);
        this.X0 = new l0x0(progressBar);
        View viewFindViewById6 = motionLayoutFindViewById.findViewById(2131430407);
        viewFindViewById6.getClass();
        View view4 = e(dfmVar, (ViewGroup) viewFindViewById6.getParent(), new jpt0(hpt0.a, 2)).w;
        int iC3 = c(2131167033);
        view4.setPadding(iC3, iC3, iC3, iC3);
        k8p1.o(viewFindViewById6, view4);
        View viewFindViewById7 = motionLayoutFindViewById.findViewById(2131427521);
        if (h2p0Var.c || gh4Var.d()) {
            viewFindViewById7.setVisibility(8);
        } else {
            viewFindViewById7.getClass();
            k8p1.o(viewFindViewById7, e(yl1Var.a(voo1.i(xfxVar)), (ViewGroup) viewFindViewById7.getParent(), new sl1(false)).w);
        }
        View viewFindViewById8 = motionLayoutFindViewById.findViewById(2131431000);
        g891 g891VarA = ((i44) r961Var.c).e() ? ((r791) r961Var.b).a(new q791(1)) : null;
        if (g891VarA != null) {
            ViewGroup viewGroup3 = (ViewGroup) viewFindViewById8.getParent();
            i = 2131431000;
            view = mhc.b(viewGroup3.getContext(), viewGroup3, f6o1.A(g891VarA, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rih1Var, (ipb1) null, 112).w;
            if (view != null) {
                k8p1.o(viewFindViewById8, view);
            }
            this.b1 = view;
            viewFindViewById = motionLayoutFindViewById.findViewById(2131428181);
            this.Z0 = e(f6o1.A(snrVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewFindViewById.getParent(), new w1l());
            frameLayout = new FrameLayout(viewFindViewById.getContext());
            dtwVar = this.Z0;
            if (dtwVar != null) {
                u890.C("connectButtonVH");
                throw null;
            }
            frameLayout.addView(dtwVar.w, new FrameLayout.LayoutParams(-1, -1));
            k8p1.o(viewFindViewById, frameLayout);
            View viewFindViewById9 = motionLayoutFindViewById.findViewById(2131428190);
            dtw dtwVarE3 = e(f6o1.A(forVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewFindViewById9.getParent(), new u3l(true));
            this.a1 = dtwVarE3;
            k8p1.o(viewFindViewById9, dtwVarE3.w);
            ViewGroup viewGroup4 = (ViewGroup) motionLayoutFindViewById.findViewById(2131428466);
            View viewFindViewById10 = motionLayoutFindViewById.findViewById(2131428190);
            View viewFindViewById11 = motionLayoutFindViewById.findViewById(2131430543);
            FlowableFilter flowableFilter = (FlowableFilter) tjqVar.b;
            gh4 gh4Var2 = (gh4) tjqVar.c;
            q8n q8nVar2 = (q8n) tjqVar.a;
            l0x0 l0x0Var = (l0x0) tjqVar.d;
            this.d1 = new tp7(viewGroup4, viewFindViewById10, viewFindViewById11, flowableFilter, gh4Var2, q8nVar2, new imx0((cbv) l0x0Var.b, (i8h1) l0x0Var.c, (h0p0) l0x0Var.d), (cbv) tjqVar.e);
            this.c1 = new rah(Color.parseColor("#ff282828"), new tym0(this, (byte) 8));
            this.e1 = a();
            fg fgVar = fg.g;
            b8k1.m(motionLayoutFindViewById, fgVar, context.getString(2131951778), (sh) null);
            b8k1.m(view2, fgVar, context.getString(2131951778), (sh) null);
            if (z) {
                layoutParams2 = motionLayoutFindViewById.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = c(2131165383);
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams.setMarginStart(0);
                        marginLayoutParams.setMarginEnd(0);
                    }
                }
                iC = c(2131165384);
                iC2 = c(2131165382);
                viewGroup2 = (ViewGroup) motionLayoutFindViewById.findViewById(2131428212);
                i2 = 0;
                while (i2 < viewGroup2.getChildCount()) {
                    i3 = i2 + 1;
                    childAt = viewGroup2.getChildAt(i2);
                    if (childAt != null) {
                        tw20.p();
                        throw null;
                    }
                    layoutParams3 = childAt.getLayoutParams();
                    if (layoutParams3 != null) {
                        bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        throw null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams2.setMarginStart(iC);
                    marginLayoutParams2.topMargin = 0;
                    marginLayoutParams2.setMarginEnd(0);
                    marginLayoutParams2.bottomMargin = iC2;
                    childAt.setLayoutParams(marginLayoutParams2);
                    i2 = i3;
                }
                progressBar.setPadding(0, progressBar.getPaddingTop(), 0, progressBar.getPaddingBottom());
                viewFindViewById2 = motionLayoutFindViewById.findViewById(2131428190);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setPadding(viewFindViewById2.getPaddingLeft(), viewFindViewById2.getPaddingTop(), viewFindViewById2.getPaddingRight(), iC2);
                }
                View viewFindViewById12 = motionLayoutFindViewById.findViewById(2131431491);
                viewFindViewById12.setPadding(viewFindViewById12.getPaddingLeft(), viewFindViewById12.getPaddingTop(), viewFindViewById12.getPaddingRight(), iC2);
                it = p7h.M(new Integer[]{2131428425, 2131429727}).iterator();
                while (it.hasNext()) {
                    iIntValue = ((Number) it.next()).intValue();
                    kilVarC = motionLayoutFindViewById.C(iIntValue);
                    if (kilVarC != null) {
                        it2 = p7h.M(new Integer[]{2131428181, Integer.valueOf(i), 2131427521, 2131430407}).iterator();
                        while (it2.hasNext()) {
                            kilVarC.u(((Number) it2.next()).intValue(), 4, iC2);
                        }
                        motionLayoutFindViewById.N(iIntValue, kilVarC);
                    }
                }
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(2130968768, typedValue, true);
                motionLayoutFindViewById.getBackground().setTint(context.getColor(typedValue.resourceId));
            } else if (h2p0Var.e) {
                layoutParams = motionLayoutFindViewById.getLayoutParams();
                if (layoutParams != null) {
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
                    }
                    layoutParams.height = c(2131165383);
                    motionLayoutFindViewById.setLayoutParams(layoutParams);
                }
                progressBar.setPadding(c(2131166767), progressBar.getPaddingTop(), c(2131166767), progressBar.getPaddingBottom());
            }
            num = this.a.b;
            if (num != null) {
                int iIntValue2 = num.intValue();
                rah rahVar = this.c1;
                int color = this.Y.getColor(iIntValue2);
                rahVar.b.c(color);
                rahVar.a = color;
            }
            MotionLayout motionLayout = this.Z;
            xhk1.c(motionLayout, j6p1.k(j6p1.k(new jp80(motionLayout), new eq80(new e3h1(this.h, (n7h1) null, this.g))), new h3h1(new g2p0(this, (byte) 1))));
            if (this.X.a) {
                FrameLayout frameLayout3 = new FrameLayout(this.Y);
                frameLayout3.setAlpha(0.0f);
                frameLayout3.setBackground(frameLayout3.getContext().getDrawable(2131233719));
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -1);
                int i5 = -c(2131166047);
                marginLayoutParams3.setMargins(i5, i5, i5, i5);
                frameLayout3.setLayoutParams(marginLayoutParams3);
                this.Q0 = frameLayout3;
                c1p0 c1p0Var = new c1p0(this.Y);
                c1p0Var.addView(frameLayout3);
                c1p0Var.addView(this.Z);
                this.O0 = c1p0Var;
            }
            h2p0Var2 = this.a;
            if (!h2p0Var2.a || h2p0Var2.e) {
                b2p0Var = null;
            } else {
                b2p0Var = new b2p0(this.Z, this.Q0, this.Y, this.t, this.T0, new g2p0(this, (byte) 0));
            }
            this.P0 = b2p0Var;
        }
        i = 2131431000;
        view = null;
        this.b1 = view;
        viewFindViewById = motionLayoutFindViewById.findViewById(2131428181);
        this.Z0 = e(f6o1.A(snrVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewFindViewById.getParent(), new w1l());
        frameLayout = new FrameLayout(viewFindViewById.getContext());
        dtwVar = this.Z0;
        if (dtwVar != null) {
            u890.C("connectButtonVH");
            throw null;
        }
        frameLayout.addView(dtwVar.w, new FrameLayout.LayoutParams(-1, -1));
        k8p1.o(viewFindViewById, frameLayout);
        View viewFindViewById13 = motionLayoutFindViewById.findViewById(2131428190);
        dtw dtwVarE4 = e(f6o1.A(forVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (ViewGroup) viewFindViewById13.getParent(), new u3l(true));
        this.a1 = dtwVarE4;
        k8p1.o(viewFindViewById13, dtwVarE4.w);
        ViewGroup viewGroup5 = (ViewGroup) motionLayoutFindViewById.findViewById(2131428466);
        View viewFindViewById14 = motionLayoutFindViewById.findViewById(2131428190);
        View viewFindViewById15 = motionLayoutFindViewById.findViewById(2131430543);
        FlowableFilter flowableFilter2 = (FlowableFilter) tjqVar.b;
        gh4 gh4Var3 = (gh4) tjqVar.c;
        q8n q8nVar3 = (q8n) tjqVar.a;
        l0x0 l0x0Var2 = (l0x0) tjqVar.d;
        this.d1 = new tp7(viewGroup5, viewFindViewById14, viewFindViewById15, flowableFilter2, gh4Var3, q8nVar3, new imx0((cbv) l0x0Var2.b, (i8h1) l0x0Var2.c, (h0p0) l0x0Var2.d), (cbv) tjqVar.e);
        this.c1 = new rah(Color.parseColor("#ff282828"), new tym0(this, (byte) 8));
        this.e1 = a();
        fg fgVar2 = fg.g;
        b8k1.m(motionLayoutFindViewById, fgVar2, context.getString(2131951778), (sh) null);
        b8k1.m(view2, fgVar2, context.getString(2131951778), (sh) null);
        if (z) {
            layoutParams2 = motionLayoutFindViewById.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = c(2131165383);
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams4.setMarginStart(0);
                    marginLayoutParams4.setMarginEnd(0);
                }
            }
            iC = c(2131165384);
            iC2 = c(2131165382);
            viewGroup2 = (ViewGroup) motionLayoutFindViewById.findViewById(2131428212);
            i2 = 0;
            while (i2 < viewGroup2.getChildCount()) {
                i3 = i2 + 1;
                childAt = viewGroup2.getChildAt(i2);
                if (childAt != null) {
                    tw20.p();
                    throw null;
                }
                layoutParams3 = childAt.getLayoutParams();
                if (layoutParams3 != null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    throw null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams5.setMarginStart(iC);
                marginLayoutParams5.topMargin = 0;
                marginLayoutParams5.setMarginEnd(0);
                marginLayoutParams5.bottomMargin = iC2;
                childAt.setLayoutParams(marginLayoutParams5);
                i2 = i3;
            }
            progressBar.setPadding(0, progressBar.getPaddingTop(), 0, progressBar.getPaddingBottom());
            viewFindViewById2 = motionLayoutFindViewById.findViewById(2131428190);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setPadding(viewFindViewById2.getPaddingLeft(), viewFindViewById2.getPaddingTop(), viewFindViewById2.getPaddingRight(), iC2);
            }
            View viewFindViewById16 = motionLayoutFindViewById.findViewById(2131431491);
            viewFindViewById16.setPadding(viewFindViewById16.getPaddingLeft(), viewFindViewById16.getPaddingTop(), viewFindViewById16.getPaddingRight(), iC2);
            it = p7h.M(new Integer[]{2131428425, 2131429727}).iterator();
            while (it.hasNext()) {
                iIntValue = ((Number) it.next()).intValue();
                kilVarC = motionLayoutFindViewById.C(iIntValue);
                if (kilVarC != null) {
                    it2 = p7h.M(new Integer[]{2131428181, Integer.valueOf(i), 2131427521, 2131430407}).iterator();
                    while (it2.hasNext()) {
                        kilVarC.u(((Number) it2.next()).intValue(), 4, iC2);
                    }
                    motionLayoutFindViewById.N(iIntValue, kilVarC);
                }
            }
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(2130968768, typedValue2, true);
            motionLayoutFindViewById.getBackground().setTint(context.getColor(typedValue2.resourceId));
        } else if (h2p0Var.e) {
            layoutParams = motionLayoutFindViewById.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
                }
                layoutParams.height = c(2131165383);
                motionLayoutFindViewById.setLayoutParams(layoutParams);
            }
            progressBar.setPadding(c(2131166767), progressBar.getPaddingTop(), c(2131166767), progressBar.getPaddingBottom());
        }
        num = this.a.b;
        if (num != null) {
            int iIntValue3 = num.intValue();
            rah rahVar2 = this.c1;
            int color2 = this.Y.getColor(iIntValue3);
            rahVar2.b.c(color2);
            rahVar2.a = color2;
        }
        MotionLayout motionLayout2 = this.Z;
        xhk1.c(motionLayout2, j6p1.k(j6p1.k(new jp80(motionLayout2), new eq80(new e3h1(this.h, (n7h1) null, this.g))), new h3h1(new g2p0(this, (byte) 1))));
        if (this.X.a) {
            FrameLayout frameLayout4 = new FrameLayout(this.Y);
            frameLayout4.setAlpha(0.0f);
            frameLayout4.setBackground(frameLayout4.getContext().getDrawable(2131233719));
            ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-1, -1);
            int i6 = -c(2131166047);
            marginLayoutParams6.setMargins(i6, i6, i6, i6);
            frameLayout4.setLayoutParams(marginLayoutParams6);
            this.Q0 = frameLayout4;
            c1p0 c1p0Var2 = new c1p0(this.Y);
            c1p0Var2.addView(frameLayout4);
            c1p0Var2.addView(this.Z);
            this.O0 = c1p0Var2;
        }
        h2p0Var2 = this.a;
        if (h2p0Var2.a) {
            b2p0Var = null;
        } else {
            b2p0Var = null;
        }
        this.P0 = b2p0Var;
    }

    public static void b(View view) {
        if (view instanceof o6) {
            ((o6) view).l();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                b(viewGroup.getChildAt(i));
            }
        }
    }

    public static dtw e(wpw wpwVar, ViewGroup viewGroup, Object obj) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, obj, (ipb1) null, 112);
    }

    public final Connection L(Consumer consumer) {
        xab1 xab1VarU;
        pee0 pee0Var = new pee0(consumer, this.e, (byte) 2);
        boolean z = this.a.d;
        MotionLayout motionLayout = this.Z;
        if (z) {
            motionLayout.setOnClickListener(new iqd0(pee0Var, (byte) 2));
        } else {
            motionLayout.setOnClickListener(null);
        }
        this.R0.w.setOnClickListener(new iqd0(pee0Var, (byte) 3));
        this.T0.setOnClickListener(new iqd0(pee0Var, (byte) 4));
        VideoSurfaceView videoSurfaceView = this.S0;
        if (videoSurfaceView != null) {
            this.b.a(videoSurfaceView);
        }
        this.e1 = a();
        if (this.b1 == null) {
            xab1VarU = null;
        } else {
            xab1VarU = l4p1.u(this.f1, new fu20(rqt0.u(new wzv0((tu41) this.f.d, (byte) 26)), new i2p0(this, null, (byte) 0), (byte) 1));
        }
        c1p0 c1p0Var = this.O0;
        if (c1p0Var != null) {
            c1p0Var.setOnEvent(new j9n0(this, pee0Var, (byte) 21));
        }
        tp7 tp7Var = this.d1;
        q8n q8nVar = (q8n) tp7Var.g;
        j0d1 j0d1VarB = guo1.B();
        q8nVar.getClass();
        tp7Var.j = fn31.T(smo1.e(flo1.l(q8nVar, j0d1VarB)), (o8n) null, 0, new n1o(tp7Var, (lnm) null, (byte) 27), 3);
        return new pee0(this, xab1VarU, (byte) 3);
    }

    public final r4u a() {
        return r4u.c(new r4u[]{r4u.d(f610.R0, r4u.a(new zud0(this, (byte) 23))), r4u.d(o610.S0, r4u.a(new mre0(this, (byte) 18))), r4u.d(c710.R0, r4u.a(new m4e0(this, (byte) 19))), r4u.d(d710.S0, r4u.a(new ruc0((Object) this, (byte) 25))), r4u.d(e710.S0, r4u.a(new qkn0(this, (byte) 4))), r4u.d(bk20.Q0, r4u.a(new ewn0((Object) this, (byte) 6))), r4u.d(b610.R0, r4u.a(new e5l0(this, (byte) 10)))});
    }

    public final int c(int i) {
        return this.Y.getResources().getDimensionPixelSize(i);
    }

    public final int d(boolean z) {
        b2p0 b2p0Var = this.P0;
        if (b2p0Var != null) {
            return (int) ((z ? b2p0Var.c.getResources().getDimensionPixelSize(2131166766) : b2p0Var.b()) / this.Y.getResources().getDisplayMetrics().density);
        }
        return 0;
    }

    public final void f(doj0 doj0Var, boolean z) {
        boolean z2 = false;
        this.d.a.m((Object) null, Boolean.valueOf(z && doj0Var == doj0.b));
        if (z && doj0Var == doj0.a) {
            z2 = true;
        }
        idd1 idd1Var = this.Y0;
        if (z2 || idd1Var.isInitialized()) {
            ((dtw) idd1Var.getValue()).f(new smd0(z2, z2));
        }
    }

    public final void g(boolean z) {
        FrameLayout frameLayout = this.Q0;
        if (frameLayout == null) {
            return;
        }
        frameLayout.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).start();
    }

    public final void h(boolean z) {
        b2p0 b2p0Var = this.P0;
        if (b2p0Var != null) {
            float f = z ? 1.0f : 0.0f;
            float progress = b2p0Var.a.getProgress();
            ValueAnimator valueAnimator = b2p0Var.f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (progress == f) {
                b2p0Var.a(f);
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(progress, f);
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new kb5(b2p0Var, (byte) 14));
            valueAnimatorOfFloat.start();
            b2p0Var.f = valueAnimatorOfFloat;
        }
    }
}
