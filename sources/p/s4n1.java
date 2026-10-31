package p;

import android.view.ScaleGestureDetector;
import android.view.View;
import com.spotify.nowplaying.uiusecases.carousel.horizontalvideo.ZoomableView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s4n1 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public iu30 a = tsm1.Q0;
    public final /* synthetic */ ZoomableView b;

    public s4n1(ZoomableView zoomableView) {
        this.b = zoomableView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ZoomableView zoomableView = this.b;
        View view = zoomableView.W0;
        if (view == null) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() * zoomableView.X0;
        zoomableView.X0 = scaleFactor;
        float fMax = Math.max(1.0f, Math.min(scaleFactor, 5.0f));
        zoomableView.X0 = fMax;
        view.setScaleX(fMax);
        view.setScaleY(zoomableView.X0);
        zoomableView.y(view);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.spotify.nowplaying.uiusecases.carousel.horizontalvideo.ZoomableView, java.lang.Object] */
    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ?? r0 = this.b;
        this.a = new r4n1(r0, (int) r0.X0, (byte) 0);
        r0.U0.invoke();
        r0.getParent().requestDisallowInterceptTouchEvent(true);
        return super.onScaleBegin(scaleGestureDetector);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.spotify.nowplaying.uiusecases.carousel.horizontalvideo.ZoomableView] */
    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        super.onScaleEnd(scaleGestureDetector);
        iu30 iu30Var = this.a;
        ?? r0 = this.b;
        iu30Var.invoke(Integer.valueOf((int) r0.X0));
        this.a = tsm1.P0;
        r0.getParent().requestDisallowInterceptTouchEvent(false);
    }
}
