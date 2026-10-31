package com.spotify.nowplaying.uiusecases.carousel.horizontalvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.g2t0;
import p.s4n1;
import p.wam1;
import p.yoi1;
import p.z62;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/spotify/nowplaying/uiusecases/carousel/horizontalvideo/ZoomableView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", "view", "Lp/rih1;", "setZoomingView", "(Landroid/view/View;)V", "Lp/g2t0;", "logger", "setPinchToZoomLogger", "(Lp/g2t0;)V", "Lkotlin/Function0;", "onZoomStart", "setOnZoomStartListener", "(Lkotlin/jvm/functions/Function0;)V", "src_main_java_com_spotify_nowplaying_uiusecases-uiusecases"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class ZoomableView extends ConstraintLayout {
    public g2t0 T0;
    public Function0 U0;
    public final GestureDetector V0;
    public View W0;
    public float X0;
    public final ScaleGestureDetector Y0;

    public ZoomableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U0 = wam1.X0;
        s4n1 s4n1Var = new s4n1(this);
        this.V0 = new GestureDetector(context, new z62(this, (byte) 4));
        this.X0 = 1.0f;
        this.Y0 = new ScaleGestureDetector(context, s4n1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super/*android.view.View*/.dispatchTouchEvent(motionEvent);
        if (motionEvent == null) {
            return true;
        }
        this.Y0.onTouchEvent(motionEvent);
        this.V0.onTouchEvent(motionEvent);
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            return this.Y0.onTouchEvent(motionEvent) || this.V0.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setOnZoomStartListener(Function0 onZoomStart) {
        this.U0 = onZoomStart;
    }

    public final void setPinchToZoomLogger(g2t0 logger) {
        this.T0 = logger;
    }

    public final void setZoomingView(View view) {
        this.W0 = view;
    }

    public final void y(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        float f = width;
        float f2 = this.X0;
        float f3 = ((f * f2) - f) / 2.0f;
        float f4 = height;
        float f5 = ((f2 * f4) - f4) / 2.0f;
        view.setTranslationX(yoi1.o(view.getTranslationX(), -f3, f3));
        view.setTranslationY(yoi1.o(view.getTranslationY(), -f5, f5));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ZoomableView(Context context) {
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ ZoomableView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
