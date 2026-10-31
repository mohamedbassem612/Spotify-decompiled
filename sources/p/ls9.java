package p;

import android.content.Context;
import android.widget.FrameLayout;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ls9 extends VideoSurfaceView {
    public final /* synthetic */ byte w1 = 0;
    public final Object x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ls9(mkj1 mkj1Var, Context context) {
        dlm dlmVar;
        y2k1 y2k1Var;
        super(context);
        this.x1 = mkj1Var;
        int iC = l1d.C(mkj1Var.b);
        if (iC == 0) {
            dlmVar = dlm.i;
        } else {
            if (iC != 1) {
                eg.o();
                throw null;
            }
            dlmVar = dlm.c;
        }
        setConfiguration(dlmVar);
        int iC2 = l1d.C(mkj1Var.c);
        if (iC2 == 0) {
            y2k1Var = y2k1.b;
        } else if (iC2 == 1) {
            y2k1Var = y2k1.c;
        } else {
            if (iC2 != 2) {
                eg.o();
                throw null;
            }
            y2k1Var = y2k1.d;
        }
        setPriority(y2k1Var);
        setRenderAsOverlay(mkj1Var.d);
        setScaleType(b3k1.b);
        setBufferingThrobberEnabled(false);
        setBackgroundColor(-16777216);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        byte b = this.w1;
        Object obj = this.x1;
        switch (b) {
            case 0:
                super/*android.view.View*/.onDetachedFromWindow();
                ((w2k1) obj).f(this);
                break;
            default:
                super/*android.view.View*/.onDetachedFromWindow();
                ((mkj1) obj).a.f(this);
                break;
        }
    }

    public final void onVisibilityAggregated(boolean z) {
        byte b = this.w1;
        Object obj = this.x1;
        switch (b) {
            case 0:
                super.onVisibilityAggregated(z);
                w2k1 w2k1Var = (w2k1) obj;
                if (!z) {
                    w2k1Var.f(this);
                } else {
                    w2k1Var.a(this);
                }
                break;
            default:
                super.onVisibilityAggregated(z);
                w2k1 w2k1Var2 = ((mkj1) obj).a;
                if (!z) {
                    w2k1Var2.f(this);
                } else {
                    w2k1Var2.a(this);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ls9(Context context, y2k1 y2k1Var, b3k1 b3k1Var, boolean z, w2k1 w2k1Var) {
        super(context);
        this.x1 = w2k1Var;
        setPriority(y2k1Var);
        setScaleType(b3k1Var);
        setBufferingThrobberEnabled(true);
        setBackgroundColor(-16777216);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setPlayablePredicate(vap1.X);
        setUseSurfaceView(true);
        setRenderAsOverlay(z);
        setConfiguration(new ks9());
    }
}
