package com.spotify.nowplaying.uiusecases.overlay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDefer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.an90;
import p.b8k1;
import p.en90;
import p.hhg1;
import p.hlv;
import p.ivq0;
import p.nvq0;
import p.nwq0;
import p.oek1;
import p.ovq0;
import p.pvq0;
import p.rl1;
import p.tw20;
import p.wso0;
import p.yj1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003!\"#B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R/\u0010 \u001a\u001a\u0012\u0016\u0012\u0014 \u001b*\t\u0018\u00010\u0019¢\u0006\u0002\b\u001a0\u0019¢\u0006\u0002\b\u001a0\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;", "Landroid/widget/FrameLayout;", "Lp/pvq0;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/ivq0;", "overlayDisplayMode", "Lp/rih1;", "setOverlayDisplayMode", "(Lp/ivq0;)V", "Landroid/view/View;", "overlayLayout", "setOverlayView", "(Landroid/view/View;)V", "fadeDurationMs", "setFadeDuration", "(I)V", "Lio/reactivex/rxjava3/core/Flowable;", "Lp/nwq0;", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/rxjava3/core/Flowable;", "getOverlayState", "()Lio/reactivex/rxjava3/core/Flowable;", "overlayState", "p/nvq0", "p/rl1", "p/en90", "src_main_java_com_spotify_nowplaying_uiusecases-uiusecases"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public class OverlayHidingFrameLayout extends FrameLayout implements pvq0, ViewGroup.OnHierarchyChangeListener {
    public static final /* synthetic */ int U0 = 0;
    public ivq0 N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public final rl1 S0;
    public final rl1 T0;
    public final BehaviorProcessor a;
    public final FlowableDistinctUntilChanged b;
    public final GestureDetector c;
    public final an90 d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable g;
    public View h;
    public int i;
    public final short t;

    public OverlayHidingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        this.a = behaviorProcessor;
        Flowable flowableT = behaviorProcessor.T(new FlowableDefer(new yj1(this, (byte) 17)));
        flowableT.getClass();
        this.b = flowableT.t(Functions.a);
        this.c = new GestureDetector(getContext(), new en90(this));
        this.d = new an90(this, (byte) 17);
        this.e = context.getDrawable(2131233721);
        this.f = context.getDrawable(2131102463);
        Drawable background = getBackground();
        this.g = background == null ? context.getDrawable(2131233723) : background;
        this.i = 150;
        this.t = (short) 3500;
        this.N0 = ivq0.b;
        this.S0 = new rl1(this, new ovq0(this, (byte) 2), wso0.b1, (byte) 25);
        this.T0 = new rl1(this, new ovq0(this, (byte) 0), new ovq0(this, (byte) 1), (byte) 25);
        setOnHierarchyChangeListener(this);
    }

    public static boolean d(View view, int i, int i2) {
        if (view.getVisibility() == 0) {
            if (!view.isClickable() || i < view.getLeft() || i > view.getRight() || i2 < view.getTop() || i2 > view.getBottom()) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i3 = 0;
                    while (true) {
                        if (!(i3 < viewGroup.getChildCount())) {
                            break;
                        }
                        int i4 = i3 + 1;
                        View childAt = viewGroup.getChildAt(i3);
                        if (childAt == null) {
                            tw20.p();
                            break;
                        }
                        int left = i - viewGroup.getLeft();
                        int top = i2 - viewGroup.getTop();
                        if (left < 0 || top < 0 || !d(childAt, left, top)) {
                            i3 = i4;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p.pvq0
    public final void a(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        View view = this.h;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        if (!f(4, z)) {
            this.a.onNext(nwq0.b);
            return;
        }
        View view2 = this.h;
        if (view2 != null) {
            oek1 oek1VarC = b8k1.c(view2);
            oek1VarC.d(this.i);
            oek1VarC.e(hlv.c);
            oek1VarC.f(this.T0);
            oek1VarC.a(0.0f);
            oek1VarC.g();
        }
    }

    @Override // p.pvq0
    public final void b(boolean z) {
        this.Q0 = z;
        if (z) {
            h(this.P0 ? this.e : this.g, 20);
        } else {
            h(this.f, 200);
        }
    }

    @Override // p.pvq0
    public final void c(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        View view = this.h;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        g(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (this.h == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        an90 an90Var = this.d;
        removeCallbacks(an90Var);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.R0 = false;
        }
        if (actionMasked == 1 && this.N0 == ivq0.a) {
            removeCallbacks(an90Var);
            postDelayed(an90Var, this.t);
        }
        if (actionMasked == 0 && this.O0) {
            View view = this.h;
            if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
        } else if (!this.R0 && this.c.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        View view = this.h;
        return view != null && view.getVisibility() == 0;
    }

    public final boolean f(int i, boolean z) {
        View view = this.h;
        if (view == null || view.getVisibility() == i) {
            return false;
        }
        if (!z) {
            View view2 = this.h;
            if (view2 != null) {
                view2.setAlpha(i == 0 ? 1.0f : 0.0f);
            }
            View view3 = this.h;
            if (view3 != null) {
                view3.setVisibility(i);
            }
        }
        return z;
    }

    public final void g(boolean z) {
        if (this.N0 == ivq0.a) {
            an90 an90Var = this.d;
            removeCallbacks(an90Var);
            postDelayed(an90Var, this.t);
        }
        boolean z2 = this.P0;
        nwq0 nwq0Var = nwq0.a;
        BehaviorProcessor behaviorProcessor = this.a;
        if (z2) {
            this.P0 = false;
            behaviorProcessor.onNext(nwq0Var);
            b(this.Q0);
        } else {
            if (!f(0, z)) {
                behaviorProcessor.onNext(nwq0Var);
                return;
            }
            View view = this.h;
            if (view != null) {
                oek1 oek1VarC = b8k1.c(view);
                oek1VarC.d(this.i);
                oek1VarC.e(hlv.c);
                oek1VarC.f(this.S0);
                oek1VarC.a(1.0f);
                oek1VarC.g();
            }
        }
    }

    public final Flowable<nwq0> getOverlayState() {
        return this.b;
    }

    public final void h(Drawable drawable, int i) {
        View view = this.h;
        if (view != null) {
            Drawable background = view.getBackground();
            if (background == null) {
                background = this.f;
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{background, drawable});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(i);
            WeakHashMap weakHashMap = b8k1.a;
            view.setBackground(transitionDrawable);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        setOverlayView(view2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        super.onDetachedFromWindow();
        View view = this.h;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        removeCallbacks(null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nvq0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nvq0 nvq0Var = (nvq0) parcelable;
        super.onRestoreInstanceState(nvq0Var.getSuperState());
        this.N0 = nvq0Var.a;
        if (nvq0Var.b) {
            c(false);
        } else {
            a(false);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        nvq0 nvq0Var = new nvq0(super.onSaveInstanceState());
        nvq0Var.a = this.N0;
        nvq0Var.b = e();
        return nvq0Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.R0 = z;
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setFadeDuration(int fadeDurationMs) {
        this.i = fadeDurationMs;
    }

    @Override // p.pvq0
    public void setOverlayDisplayMode(ivq0 overlayDisplayMode) {
        this.N0 = overlayDisplayMode;
        if (this.h == null || overlayDisplayMode == ivq0.a) {
            return;
        }
        removeCallbacks(this.d);
    }

    public final void setOverlayView(View overlayLayout) {
        ViewParent parent = overlayLayout.getParent();
        while (parent != this) {
            parent = parent.getParent();
            if (parent == null) {
                hhg1.n("Overlay has to be a child of the container!");
                return;
            }
        }
        this.h = overlayLayout;
    }

    public OverlayHidingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OverlayHidingFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OverlayHidingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
