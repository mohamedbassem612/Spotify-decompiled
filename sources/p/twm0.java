package p;

import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class twm0 extends vm70 {
    public final w2k1 w1;
    public String x1;

    public twm0(Context context, w2k1 w2k1Var) {
        super(context);
        this.w1 = w2k1Var;
        setPlayablePredicate(new swm0((Object) this, (byte) 0));
    }

    public String getIdentifier() {
        return this.x1;
    }

    public final void onAttachedToWindow() {
        super/*com.spotify.betamax.player.VideoSurfaceView*/.onAttachedToWindow();
        this.w1.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.w1.f(this);
    }

    public void setIdentifier(String str) {
        this.x1 = str;
        ezb1 ezb1Var = ((VideoSurfaceView) this).T0;
        if (ezb1Var != null) {
            ezb1Var.j(this);
        }
    }
}
