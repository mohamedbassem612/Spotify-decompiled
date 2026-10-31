package p;

import android.view.View;
import com.spotify.nowplayingmodes.adsmode.ui.overlay.AdsOverlayControlsLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a72 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AdsOverlayControlsLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a72(AdsOverlayControlsLayout adsOverlayControlsLayout, byte b) {
        super(0);
        this.a = b;
        this.b = adsOverlayControlsLayout;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        AdsOverlayControlsLayout adsOverlayControlsLayout = this.b;
        switch (b) {
            case 0:
                adsOverlayControlsLayout.g.onNext(nwq0.b);
                break;
            case 1:
                View view = adsOverlayControlsLayout.R0;
                if (view != null) {
                    view.setVisibility(4);
                }
                break;
            default:
                adsOverlayControlsLayout.g.onNext(nwq0.a);
                View view2 = adsOverlayControlsLayout.R0;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                break;
        }
        return rih1Var;
    }
}
