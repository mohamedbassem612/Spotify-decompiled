package p;

import android.widget.FrameLayout;
import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingGradientBackgroundView;
import com.spotify.nowplayingmodes.adsmode.ui.overlay.AdsOverlayControlsLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class w0y implements gah, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ w0y(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                ((OverlayHidingGradientBackgroundView) this.b).setColor(i);
                break;
            case 1:
                ((OverlayHidingGradientBackgroundView) this.b).setColor(i);
                break;
            case 2:
                ((OverlayHidingGradientBackgroundView) this.b).setColor(i);
                break;
            default:
                ((AdsOverlayControlsLayout) this.b).setColor(i);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof gah) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof gah) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof gah) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof gah) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new tv30(1, (OverlayHidingGradientBackgroundView) this.b, OverlayHidingGradientBackgroundView.class, "setColor", "setColor(I)V", 0);
            case 1:
                return new tv30(1, (OverlayHidingGradientBackgroundView) this.b, OverlayHidingGradientBackgroundView.class, "setColor", "setColor(I)V", 0);
            case 2:
                return new tv30(1, (OverlayHidingGradientBackgroundView) this.b, OverlayHidingGradientBackgroundView.class, "setColor", "setColor(I)V", 0);
            default:
                return new tv30(1, (AdsOverlayControlsLayout) this.b, AdsOverlayControlsLayout.class, "setColor", "setColor(I)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
