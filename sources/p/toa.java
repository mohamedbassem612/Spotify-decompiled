package p;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class toa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoSurfaceView b;

    public /* synthetic */ toa(VideoSurfaceView videoSurfaceView, byte b) {
        this.a = b;
        this.b = videoSurfaceView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceView surfaceView;
        byte b = this.a;
        VideoSurfaceView videoSurfaceView = this.b;
        switch (b) {
            case 0:
                videoSurfaceView.setIsBuffering(false);
                if (videoSurfaceView.e1 && videoSurfaceView.p1 && (surfaceView = videoSurfaceView.c) != null) {
                    int width = surfaceView.getWidth();
                    int height = surfaceView.getHeight();
                    if (width > 0 && height > 0) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                        try {
                            PixelCopy.request(surfaceView, bitmapCreateBitmap, (PixelCopy.OnPixelCopyFinishedListener) new lp41(videoSurfaceView, bitmapCreateBitmap), videoSurfaceView.N0);
                        } catch (IllegalArgumentException unused) {
                            bitmapCreateBitmap.recycle();
                        }
                    }
                    break;
                }
                s2k1 s2k1Var = videoSurfaceView.i;
                if (s2k1Var != null) {
                    s2k1Var.d();
                    return;
                }
                return;
            case 1:
                ImageView imageView = videoSurfaceView.R0;
                if (imageView == null) {
                    u890.C("frozenFrameView");
                    throw null;
                }
                imageView.setVisibility(8);
                ImageView imageView2 = videoSurfaceView.R0;
                if (imageView2 == null) {
                    u890.C("frozenFrameView");
                    throw null;
                }
                imageView2.setImageBitmap(null);
                Bitmap bitmap = videoSurfaceView.S0;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                videoSurfaceView.S0 = null;
                return;
            case 2:
                videoSurfaceView.forceLayout();
                ViewParent parent = videoSurfaceView.getParent();
                if (parent != null) {
                    videoSurfaceView = parent;
                }
                videoSurfaceView.requestLayout();
                return;
            case 3:
                ProgressBar progressBar = videoSurfaceView.g;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    return;
                } else {
                    u890.C("throbber");
                    throw null;
                }
            case 4:
                if (videoSurfaceView.U0) {
                    ProgressBar progressBar2 = videoSurfaceView.g;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(0);
                        return;
                    } else {
                        u890.C("throbber");
                        throw null;
                    }
                }
                return;
            default:
                ProgressBar progressBar3 = videoSurfaceView.g;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(8);
                    return;
                } else {
                    u890.C("throbber");
                    throw null;
                }
        }
    }
}
