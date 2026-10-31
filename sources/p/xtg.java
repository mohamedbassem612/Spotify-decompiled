package p;

import android.graphics.Rect;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class xtg extends tv30 implements iu30 {
    public static final xtg a = new xtg(1, dug.class, "visibleArea", "visibleArea(Lcom/spotify/betamax/player/VideoSurfaceView;)I", 1);

    public final Object invoke(Object obj) {
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
        int iHeight = 0;
        if (videoSurfaceView.isShown() && videoSurfaceView.getWindowVisibility() == 0) {
            Rect rect = new Rect();
            if (videoSurfaceView.getGlobalVisibleRect(rect)) {
                iHeight = rect.height() * rect.width();
            }
        }
        return Integer.valueOf(iHeight);
    }
}
