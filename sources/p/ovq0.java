package p;

import android.view.View;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ovq0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OverlayHidingFrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ovq0(OverlayHidingFrameLayout overlayHidingFrameLayout, byte b) {
        super(0);
        this.a = b;
        this.b = overlayHidingFrameLayout;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        OverlayHidingFrameLayout overlayHidingFrameLayout = this.b;
        switch (b) {
            case 0:
                overlayHidingFrameLayout.a.onNext(nwq0.b);
                break;
            case 1:
                View view = overlayHidingFrameLayout.h;
                if (view != null) {
                    view.setVisibility(4);
                }
                break;
            default:
                overlayHidingFrameLayout.a.onNext(nwq0.a);
                View view2 = overlayHidingFrameLayout.h;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                break;
        }
        return rih1Var;
    }
}
