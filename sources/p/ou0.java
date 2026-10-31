package p;

import com.spotify.nowplayingmodes.adsmode.ui.overlay.AdsOverlayControlsLayout;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ou0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu0 b;

    public /* synthetic */ ou0(qu0 qu0Var, byte b) {
        this.a = b;
        this.b = qu0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        nwq0 nwq0Var = nwq0.b;
        qu0 qu0Var = this.b;
        switch (b) {
            case 0:
                uu0 uu0Var = qu0Var.f;
                if (uu0Var != null) {
                    uu0Var.p();
                }
                AdsOverlayControlsLayout adsOverlayControlsLayout = qu0Var.e;
                if (adsOverlayControlsLayout != null) {
                    adsOverlayControlsLayout.a(true);
                }
                qu0Var.g = nwq0Var;
                break;
            default:
                if (((nwq0) obj) == nwq0Var && qu0Var.g != nwq0Var) {
                    uu0 uu0Var2 = qu0Var.f;
                    if (uu0Var2 != null) {
                        uu0Var2.p();
                    }
                    qu0Var.g = nwq0Var;
                    break;
                }
                break;
        }
    }
}
