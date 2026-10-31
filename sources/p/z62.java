package p;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.spotify.messaging.tooltipsimpl.TooltipContentView;
import com.spotify.nowplaying.uiusecases.carousel.horizontalvideo.ZoomableView;
import com.spotify.nowplayingmodes.adsmode.ui.overlay.AdsOverlayControlsLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z62 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z62(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void a(MotionEvent motionEvent) {
        iu30 iu30Var;
        w3c1 w3c1Var = (w3c1) this.b;
        float width = w3c1Var.getWidth() / 3.0f;
        float f = 2.0f * width;
        float x = motionEvent.getX();
        if (x <= width) {
            iu30 iu30Var2 = w3c1Var.b;
            if (iu30Var2 != null) {
                iu30Var2.invoke(m7c1.c);
                return;
            }
            return;
        }
        if (x < f || (iu30Var = w3c1Var.b) == null) {
            return;
        }
        iu30Var.invoke(m7c1.d);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                a(motionEvent);
                return true;
            case 2:
            default:
                return super.onDoubleTap(motionEvent);
            case 3:
                motionEvent.getX();
                motionEvent.getY();
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                if (motionEvent == null || motionEvent2.getY() - motionEvent.getY() <= 200.0f) {
                    return false;
                }
                iu30 iu30Var = ((w3c1) obj).b;
                if (iu30Var == null) {
                    return true;
                }
                iu30Var.invoke(m7c1.e);
                return true;
            case 2:
                if (motionEvent == null || motionEvent2.getY() - motionEvent.getY() <= 80.0f) {
                    return false;
                }
                Function0 function0 = ((TooltipContentView) obj).T0;
                if (function0 == null) {
                    return true;
                }
                function0.invoke();
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.spotify.nowplaying.uiusecases.carousel.horizontalvideo.ZoomableView] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 4:
                ?? r1 = (ZoomableView) this.b;
                View view = r1.W0;
                if (view == null || r1.X0 == 1.0f) {
                    return false;
                }
                r1.getParent().requestDisallowInterceptTouchEvent(true);
                view.setTranslationX(view.getTranslationX() - f);
                view.setTranslationY(view.getTranslationY() - f2);
                r1.y(view);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                AdsOverlayControlsLayout adsOverlayControlsLayout = (AdsOverlayControlsLayout) this.b;
                ivq0 ivq0Var = adsOverlayControlsLayout.W0;
                if (ivq0Var != ivq0.a && ivq0Var != ivq0.c) {
                    return true;
                }
                if (AdsOverlayControlsLayout.d(adsOverlayControlsLayout, adsOverlayControlsLayout.getLeft() + jch0.U(motionEvent.getX()), adsOverlayControlsLayout.getTop() + jch0.U(motionEvent.getY()))) {
                    return false;
                }
                View view = adsOverlayControlsLayout.R0;
                if (view == null || view.getVisibility() != 0) {
                    adsOverlayControlsLayout.c(true);
                    adsOverlayControlsLayout.e(false);
                    return true;
                }
                adsOverlayControlsLayout.a(true);
                adsOverlayControlsLayout.e(true);
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                a(motionEvent);
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
