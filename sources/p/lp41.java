package p;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import android.widget.ImageView;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lp41 implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ Object c;

    public lp41(Bitmap bitmap, ohd ohdVar) {
        this.b = bitmap;
        this.c = ohdVar;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        byte b = this.a;
        Object obj = this.c;
        Bitmap bitmap = this.b;
        switch (b) {
            case 0:
                if (i != 0) {
                    bitmap.recycle();
                    bitmap = null;
                }
                ((ohd) obj).f(bitmap, krz0.S0);
                return;
            default:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                if (i != 0) {
                    bitmap.recycle();
                    return;
                }
                Bitmap bitmap2 = videoSurfaceView.S0;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                videoSurfaceView.S0 = bitmap;
                ImageView imageView = videoSurfaceView.R0;
                if (imageView == null) {
                    u890.C("frozenFrameView");
                    throw null;
                }
                imageView.setImageBitmap(bitmap);
                ImageView imageView2 = videoSurfaceView.R0;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    return;
                } else {
                    u890.C("frozenFrameView");
                    throw null;
                }
        }
    }

    public lp41(VideoSurfaceView videoSurfaceView, Bitmap bitmap) {
        this.c = videoSurfaceView;
        this.b = bitmap;
    }
}
