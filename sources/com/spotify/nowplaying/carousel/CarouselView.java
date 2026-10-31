package com.spotify.nowplaying.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.eg;
import p.kba;
import p.l1d;
import p.lo9;
import p.rqa;
import p.t8d0;
import p.v5j1;
import p.w5j1;
import p.xrc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/spotify/nowplaying/carousel/CarouselView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "disallowScrollLeft", "Lp/rih1;", "setDisallowScrollLeft", "(Z)V", "disallowScrollRight", "setDisallowScrollRight", "src_main_java_com_spotify_nowplaying_carousel-carousel"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class CarouselView extends RecyclerView {
    public static final /* synthetic */ int r2 = 0;
    public final t8d0 l2;
    public Function0 m2;
    public Function0 n2;
    public Function0 o2;
    public Function0 p2;
    public w5j1 q2;

    public CarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m2 = xrc.T0;
        this.n2 = xrc.S0;
        this.o2 = xrc.Q0;
        this.p2 = xrc.P0;
        setHasFixedSize(true);
        setLayoutManager(new LinearLayoutManager() { // from class: com.spotify.nowplaying.carousel.CarouselView.1
            {
                super(0);
            }

            public final boolean q() {
                int i2 = CarouselView.r2;
                AccessibilityManager accessibilityManager = (AccessibilityManager) CarouselView.this.getContext().getSystemService("accessibility");
                return !((accessibilityManager == null || accessibilityManager.isEnabled()) && (accessibilityManager == null || accessibilityManager.isTouchExplorationEnabled()));
            }
        });
        t8d0 t8d0Var = new t8d0();
        t8d0Var.b(this);
        t8d0Var.k = new kba((Object) this, (byte) 11);
        t8d0Var.l = new lo9(this, (byte) 13);
        this.l2 = t8d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        w5j1 w5j1Var = this.q2;
        if (w5j1Var == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        ViewParent parent = getParent();
        rqa rqaVar = new rqa(this, motionEvent, (byte) 23);
        int action = motionEvent.getAction();
        if (action == 0) {
            w5j1Var.b = motionEvent.getX();
            w5j1Var.c = motionEvent.getY();
            w5j1Var.d = 0;
            rqaVar.invoke();
            return false;
        }
        if (action == 1) {
            z = w5j1Var.d == 1;
            w5j1Var.b = Float.NaN;
            w5j1Var.c = Float.NaN;
            w5j1Var.d = 0;
            if (z) {
                return ((Boolean) rqaVar.invoke()).booleanValue();
            }
        } else if (action != 2) {
            if (action != 3) {
                return ((Boolean) rqaVar.invoke()).booleanValue();
            }
            if (w5j1Var.d == 1) {
            }
            w5j1Var.b = Float.NaN;
            w5j1Var.c = Float.NaN;
            w5j1Var.d = 0;
            if (z) {
                return ((Boolean) rqaVar.invoke()).booleanValue();
            }
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i = w5j1Var.d;
            if (i == 0) {
                if (Float.isNaN(w5j1Var.b) || Float.isNaN(w5j1Var.c)) {
                    i = 0;
                } else {
                    float fAbs = Math.abs(x - w5j1Var.b);
                    float fAbs2 = Math.abs(y - w5j1Var.c);
                    if (fAbs > 10.0f || fAbs2 > 10.0f) {
                        w5j1Var.d = fAbs > fAbs2 ? 1 : 2;
                    }
                    i = w5j1Var.d;
                }
            }
            int i2 = i == 0 ? -1 : v5j1.a[l1d.C(i)];
            if (i2 != -1) {
                if (i2 == 1) {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    return ((Boolean) rqaVar.invoke()).booleanValue();
                }
                if (i2 != 2) {
                    eg.o();
                    return false;
                }
                if (motionEvent.getY() - w5j1Var.c > 50.0f) {
                    w5j1Var.a.invoke();
                    w5j1Var.b = Float.NaN;
                    w5j1Var.c = Float.NaN;
                    w5j1Var.d = 0;
                    return false;
                }
            }
        }
        return false;
    }

    public final void setDisallowScrollLeft(boolean disallowScrollLeft) {
        this.l2.h = disallowScrollLeft;
    }

    public final void setDisallowScrollRight(boolean disallowScrollRight) {
        this.l2.i = disallowScrollRight;
    }

    public final void u0(int i) {
        super.u0(i);
        this.l2.g = i;
    }

    public final void y0(int i) {
        super.y0(i);
        this.l2.g = i;
    }

    public CarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CarouselView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CarouselView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
