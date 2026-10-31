package com.spotify.nowplaying.scroll.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnLifecycle;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.an90;
import p.foz0;
import p.fza;
import p.hhg1;
import p.jxc;
import p.nq41;
import p.ruz0;
import p.z2a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/spotify/nowplaying/scroll/view/PeekScrollView;", "Lcom/spotify/nowplaying/scroll/view/NowPlayingScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "peekHeight", "Lp/rih1;", "setPeekHeight", "(I)V", "Lp/nq41;", "animation", "setScrollAnimation", "(Lp/nq41;)V", "src_main_java_com_spotify_nowplaying_scroll-scroll"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class PeekScrollView extends NowPlayingScrollView {
    public final FullScreenLayout m1;
    public final ViewGroup n1;
    public final TouchBlockingFrameLayout o1;
    public int p1;
    public int q1;
    public final int r1;
    public nq41 s1;

    /* JADX WARN: Multi-variable type inference failed */
    public PeekScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s1 = new fza((byte) 7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, foz0.a, 0, 0);
        this.p1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.r1 = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(2131167116);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(2131625369, (ViewGroup) this);
        this.n1 = (ViewGroup) findViewById(2131430706);
        this.m1 = (FullScreenLayout) findViewById(2131428983);
        this.o1 = (TouchBlockingFrameLayout) findViewById(2131431461);
    }

    public static void F(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = -(i == 0 ? 0 : i + i2);
        if (marginLayoutParams.topMargin != i3) {
            marginLayoutParams.topMargin = i3;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final void E(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view.getId() == 2131430706) {
            super.addView(view, i, layoutParams);
            return;
        }
        FullScreenLayout fullScreenLayout = this.m1;
        if (fullScreenLayout.getChildCount() == 0) {
            fullScreenLayout.addView(view, 0, layoutParams);
            return;
        }
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.o1;
        if (touchBlockingFrameLayout.getChildCount() == 0) {
            touchBlockingFrameLayout.addView(view, 0, layoutParams);
            F(touchBlockingFrameLayout, this.p1, this.q1);
        } else {
            this.n1.addView(view, i - 1, layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addView(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        ((ViewGroup.LayoutParams) layoutParamsGenerateDefaultLayoutParams).width = i;
        ((ViewGroup.LayoutParams) layoutParamsGenerateDefaultLayoutParams).height = i2;
        E(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // p.j6p0
    public final Flowable b() {
        return this.m1.a;
    }

    @Override // p.j6p0
    public final void c(boolean z) {
        this.m1.setFillScreenHeight(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean fitSystemWindows(Rect rect) {
        if (rect == null) {
            return super/*android.view.View*/.fitSystemWindows(rect);
        }
        boolean fitsSystemWindows = getFitsSystemWindows();
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.o1;
        if (!fitsSystemWindows) {
            int i = rect.bottom;
            this.q1 = i;
            F(touchBlockingFrameLayout, this.p1, i);
            return super/*android.view.View*/.fitSystemWindows(rect);
        }
        boolean zFitSystemWindows = super/*android.view.View*/.fitSystemWindows(rect);
        if (!zFitSystemWindows) {
            int i2 = rect.bottom;
            this.q1 = i2;
            F(touchBlockingFrameLayout, this.p1, i2);
        }
        return zFitSystemWindows;
    }

    @Override // com.spotify.nowplaying.scroll.view.NowPlayingScrollView, p.j6p0
    public final Flowable m() {
        TouchBlockingFrameLayout touchBlockingFrameLayout = this.o1;
        touchBlockingFrameLayout.getClass();
        FlowableDoOnLifecycle flowableDoOnLifecycleW = new jxc(touchBlockingFrameLayout, (byte) 2).toFlowable(BackpressureStrategy.c).w(new z2a1(touchBlockingFrameLayout, (byte) 18));
        ruz0 ruz0Var = new ruz0(touchBlockingFrameLayout, (byte) 21);
        Consumer consumer = Functions.d;
        LongConsumer longConsumer = Functions.g;
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Objects.requireNonNull(longConsumer, "onRequest is null");
        return new FlowableDoOnLifecycle(flowableDoOnLifecycleW, consumer, longConsumer, ruz0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.nowplaying.scroll.view.NowPlayingScrollView, p.j6p0
    public final void n() {
        int iMin = Math.min(Math.min(this.o1.getHeight() - this.p1, getHeight() - this.p1), this.r1);
        this.s1.getClass();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "scrollY", iMin);
        objectAnimatorOfInt.setDuration(500L);
        objectAnimatorOfInt.setInterpolator(new PathInterpolator(0.3f, 0.0f, 0.0f, 1.0f));
        objectAnimatorOfInt.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.nowplaying.scroll.view.NowPlayingScrollView, p.j6p0
    public final void o() {
        post(new an90(this, (byte) 19));
    }

    public final void setPeekHeight(int peekHeight) {
        if (peekHeight < 0) {
            hhg1.n("Peek height must be >=0");
        } else {
            this.p1 = peekHeight;
            F(this.o1, peekHeight, this.q1);
        }
    }

    public final void setScrollAnimation(nq41 animation) {
        this.s1 = animation;
    }

    public final void addView(View view, int i) {
        E(view, i, null);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        E(view, -1, layoutParams);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        E(view, i, layoutParams);
    }

    public final void addView(View view) {
        E(view, -1, null);
    }

    public PeekScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PeekScrollView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PeekScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
