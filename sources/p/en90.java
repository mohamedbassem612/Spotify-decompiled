package p;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class en90 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public en90(fn90 fn90Var) {
        this.a = (byte) 0;
        this.c = fn90Var;
        this.b = true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        View viewN;
        w611 w611VarT;
        switch (this.a) {
            case 0:
                fn90 fn90Var = (fn90) this.c;
                if (this.b && (viewN = fn90Var.n(motionEvent)) != null && (w611VarT = fn90Var.Q0.T(viewN)) != null) {
                    dn90 dn90Var = fn90Var.Y;
                    RecyclerView recyclerView = fn90Var.Q0;
                    int iE = dn90Var.e(w611VarT);
                    WeakHashMap weakHashMap = b8k1.a;
                    if ((dn90.b(iE, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                        int pointerId = motionEvent.getPointerId(0);
                        int i = fn90Var.X;
                        if (pointerId == i) {
                            int iFindPointerIndex = motionEvent.findPointerIndex(i);
                            float x = motionEvent.getX(iFindPointerIndex);
                            float y = motionEvent.getY(iFindPointerIndex);
                            fn90Var.d = x;
                            fn90Var.e = y;
                            fn90Var.h = 0.0f;
                            fn90Var.g = 0.0f;
                            fn90Var.r(2, w611VarT);
                        }
                    }
                }
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                OverlayHidingFrameLayout overlayHidingFrameLayout = (OverlayHidingFrameLayout) this.c;
                BehaviorProcessor behaviorProcessor = overlayHidingFrameLayout.a;
                ivq0 ivq0Var = overlayHidingFrameLayout.N0;
                if (ivq0Var != ivq0.d || this.b) {
                    if (ivq0Var == ivq0.a || ivq0Var == ivq0.c) {
                        View view = overlayHidingFrameLayout.h;
                        if (view != null && view.getVisibility() == 4) {
                            overlayHidingFrameLayout.c(true);
                        } else {
                            if (this.b) {
                                return false;
                            }
                            if (overlayHidingFrameLayout.e()) {
                                overlayHidingFrameLayout.a(true);
                            } else {
                                overlayHidingFrameLayout.c(true);
                            }
                        }
                    }
                } else if (overlayHidingFrameLayout.P0) {
                    overlayHidingFrameLayout.P0 = false;
                    behaviorProcessor.onNext(nwq0.a);
                    overlayHidingFrameLayout.b(overlayHidingFrameLayout.Q0);
                } else {
                    overlayHidingFrameLayout.P0 = true;
                    behaviorProcessor.onNext(nwq0.c);
                    overlayHidingFrameLayout.b(overlayHidingFrameLayout.Q0);
                }
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                OverlayHidingFrameLayout overlayHidingFrameLayout = (OverlayHidingFrameLayout) this.c;
                int i = OverlayHidingFrameLayout.U0;
                this.b = OverlayHidingFrameLayout.d(overlayHidingFrameLayout, overlayHidingFrameLayout.getLeft() + jch0.U(motionEvent.getX()), overlayHidingFrameLayout.getTop() + jch0.U(motionEvent.getY()));
                return false;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }

    public en90(OverlayHidingFrameLayout overlayHidingFrameLayout) {
        this.a = (byte) 1;
        this.c = overlayHidingFrameLayout;
    }
}
