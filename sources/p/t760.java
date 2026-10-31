package p;

import android.view.View;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t760 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ t760(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ((iu30) ven0Var.getValue()).invoke((VideoSurfaceView) view);
                break;
            default:
                ((iu30) ven0Var.getValue()).invoke((VideoSurfaceView) view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ((iu30) ven0Var.getValue()).invoke((Object) null);
                break;
            default:
                ((iu30) ven0Var.getValue()).invoke((Object) null);
                break;
        }
    }
}
