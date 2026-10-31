package com.spotify.nowplayingmodes.adsmode.ui.overlay;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a72;
import p.b8k1;
import p.hhg1;
import p.hlv;
import p.ivq0;
import p.nwq0;
import p.oek1;
import p.ou1;
import p.pu0;
import p.pvq0;
import p.qu0;
import p.rl1;
import p.s10;
import p.tw20;
import p.uu0;
import p.y62;
import p.yj1;
import p.z62;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004!\"#$B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R2\u0010 \u001a\u001a\u0012\u0016\u0012\u0014 \u001b*\t\u0018\u00010\u0019¢\u0006\u0002\b\u001a0\u0019¢\u0006\u0002\b\u001a0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/spotify/nowplayingmodes/adsmode/ui/overlay/AdsOverlayControlsLayout;", "Landroid/widget/FrameLayout;", "Lp/pvq0;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lp/rih1;", "setColor", "(I)V", "Lp/ivq0;", "overlayDisplayMode", "setOverlayDisplayMode", "(Lp/ivq0;)V", "Landroid/view/View;", "overlayLayout", "setOverlayView", "(Landroid/view/View;)V", "Lio/reactivex/rxjava3/core/Flowable;", "Lp/nwq0;", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/rxjava3/core/Flowable;", "getOverlayState", "()Lio/reactivex/rxjava3/core/Flowable;", "overlayState", "p/y62", "p/rl1", "p/z62", "p/pu0", "src_main_java_com_spotify_nowplayingmodes_adsmode-adsmode"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class AdsOverlayControlsLayout extends FrameLayout implements pvq0, ViewGroup.OnHierarchyChangeListener {
    public final s10 N0;
    public final Drawable O0;
    public final GradientDrawable P0;
    public final GradientDrawable Q0;
    public View R0;
    public View S0;
    public View T0;
    public final short U0;
    public final short V0;
    public ivq0 W0;
    public boolean X0;
    public final rl1 Y0;
    public final rl1 Z0;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final BehaviorProcessor g;
    public final FlowableDistinctUntilChanged h;
    public final GestureDetector i;
    public final HashSet t;

    public AdsOverlayControlsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context.getColor(2131102459);
        int color = context.getColor(2131102457);
        this.b = color;
        this.c = context.getColor(2131102456);
        int color2 = context.getColor(2131102455);
        this.d = context.getColor(2131100257);
        int color3 = context.getColor(2131102454);
        this.e = color3;
        int color4 = context.getColor(2131102452);
        int color5 = context.getColor(2131102463);
        this.f = color5;
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        this.g = behaviorProcessor;
        Flowable flowableT = behaviorProcessor.T(new FlowableDefer(new yj1(this, (byte) 1)));
        flowableT.getClass();
        this.h = flowableT.t(Functions.a);
        this.i = new GestureDetector(getContext(), new z62(this, (byte) 0));
        this.t = new HashSet();
        this.N0 = new s10(this, (byte) 1);
        this.O0 = context.getDrawable(2131102463);
        int color6 = context.getColor(2131100238);
        int color7 = context.getColor(2131100237);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{color6, color7});
        this.P0 = gradientDrawable;
        this.Q0 = new GradientDrawable(orientation, new int[]{color, color2, color3, color5, color5, color4, color5, color5, color5, color5});
        this.U0 = (short) 300;
        this.V0 = (short) 3500;
        this.W0 = ivq0.b;
        this.Y0 = new rl1(this, new a72(this, (byte) 2), ou1.g, (byte) 1);
        this.Z0 = new rl1(this, new a72(this, (byte) 0), new a72(this, (byte) 1), (byte) 1);
        setOnHierarchyChangeListener(this);
        WeakHashMap weakHashMap = b8k1.a;
        setBackground(gradientDrawable);
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

    private final void setOverlayView(View overlayLayout) {
        ViewParent parent = overlayLayout.getParent();
        while (parent != this) {
            parent = parent.getParent();
            if (parent == null) {
                hhg1.n("Overlay has to be a child of the container!");
                return;
            }
        }
        this.R0 = overlayLayout;
    }

    @Override // p.pvq0
    public final void a(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        View view = this.R0;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        if (!g(4, z)) {
            this.g.onNext(nwq0.b);
            return;
        }
        View view2 = this.R0;
        if (view2 != null) {
            oek1 oek1VarC = b8k1.c(view2);
            oek1VarC.d(this.U0);
            oek1VarC.e(hlv.c);
            oek1VarC.f(this.Z0);
            oek1VarC.a(0.0f);
            oek1VarC.g();
        }
    }

    @Override // p.pvq0
    public final void b(boolean z) {
        View view = this.T0;
        if (z) {
            if (view != null) {
                view.setVisibility(0);
            }
            i(this.Q0, 20);
        } else {
            if (view != null) {
                view.setVisibility(8);
            }
            i(this.O0, 200);
        }
    }

    @Override // p.pvq0
    public final void c(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        View view = this.R0;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        h(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (this.R0 == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        s10 s10Var = this.N0;
        removeCallbacks(s10Var);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.W0 == ivq0.a) {
            removeCallbacks(s10Var);
            postDelayed(s10Var, this.V0);
        }
        if (actionMasked == 0 && this.X0) {
            View view = this.R0;
            if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
        } else if (this.i.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(boolean z) {
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            qu0 qu0Var = ((pu0) it.next()).a;
            if (!z && qu0Var.g == nwq0.b) {
                uu0 uu0Var = qu0Var.f;
                if (uu0Var != null) {
                    uu0Var.t(true);
                }
                qu0Var.g = nwq0.a;
            }
        }
    }

    public final void f(View view, View view2) {
        setOverlayView(view);
        this.S0 = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        int i = this.e;
        int i2 = this.f;
        view2.setBackground(new GradientDrawable(orientation, new int[]{this.a, this.b, this.c, this.d, i, i2, i2, i2, i2, i2, i2, i2}));
        this.T0 = view2;
    }

    public final boolean g(int i, boolean z) {
        View view = this.R0;
        if (view == null || view.getVisibility() == i) {
            return false;
        }
        if (!z) {
            View view2 = this.R0;
            if (view2 != null) {
                view2.setAlpha(i == 0 ? 1.0f : 0.0f);
            }
            View view3 = this.R0;
            if (view3 != null) {
                view3.setVisibility(i);
            }
        }
        return z;
    }

    public Flowable<nwq0> getOverlayState() {
        return this.h;
    }

    public final void h(boolean z) {
        if (this.W0 == ivq0.a) {
            s10 s10Var = this.N0;
            removeCallbacks(s10Var);
            postDelayed(s10Var, this.V0);
        }
        if (!g(0, z)) {
            this.g.onNext(nwq0.a);
            return;
        }
        View view = this.R0;
        if (view != null) {
            oek1 oek1VarC = b8k1.c(view);
            oek1VarC.d(this.U0);
            oek1VarC.e(hlv.c);
            oek1VarC.f(this.Y0);
            oek1VarC.a(1.0f);
            oek1VarC.g();
        }
    }

    public final void i(Drawable drawable, int i) {
        View view = this.S0;
        if (view != null) {
            Drawable background = view.getBackground();
            if (background == null) {
                background = this.O0;
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
        super.onDetachedFromWindow();
        removeCallbacks(null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y62)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y62 y62Var = (y62) parcelable;
        super.onRestoreInstanceState(y62Var.getSuperState());
        this.W0 = y62Var.a;
        if (y62Var.b) {
            c(false);
        } else {
            a(false);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        y62 y62Var = new y62(super.onSaveInstanceState());
        y62Var.a = this.W0;
        View view = this.R0;
        boolean z = false;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        }
        y62Var.b = z;
        return y62Var;
    }

    public final void setColor(int color) {
        if (color == -16777216) {
            WeakHashMap weakHashMap = b8k1.a;
            setBackground(null);
            setBackgroundColor(-16777216);
        } else {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(color, PorterDuff.Mode.DST_OVER);
            GradientDrawable gradientDrawable = this.P0;
            gradientDrawable.setColorFilter(porterDuffColorFilter);
            WeakHashMap weakHashMap2 = b8k1.a;
            setBackground(gradientDrawable);
        }
    }

    @Override // p.pvq0
    public void setOverlayDisplayMode(ivq0 overlayDisplayMode) {
        this.W0 = overlayDisplayMode;
        if (this.R0 == null || overlayDisplayMode == ivq0.a) {
            return;
        }
        removeCallbacks(this.N0);
    }

    public AdsOverlayControlsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AdsOverlayControlsLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AdsOverlayControlsLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
