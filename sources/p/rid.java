package p;

import android.content.Context;
import androidx.compose.ui.geometry.Offset;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rid extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rid(boolean z, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setSupportsSurfaceView(z);
                videoSurfaceView.setUseSurfaceView(z);
                iu30Var.invoke(videoSurfaceView);
                return videoSurfaceView;
            case 1:
                l1f1 l1f1Var = (l1f1) obj;
                if (z) {
                    iu30Var.invoke(new r9y(l1f1Var));
                }
                return rih1Var;
            default:
                elb0 elb0Var = (elb0) obj;
                if (z) {
                    iu30Var.invoke(new Offset(elb0Var.p(0L)));
                }
                return rih1Var;
        }
    }
}
