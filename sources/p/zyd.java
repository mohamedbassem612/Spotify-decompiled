package p;

import androidx.compose.ui.platform.ComposeView;
import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zyd implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CarouselFragment b;

    public /* synthetic */ zyd(CarouselFragment carouselFragment, byte b) {
        this.a = b;
        this.b = carouselFragment;
    }

    public final void b(Object obj) {
        xok0 xok0Var;
        byte b = this.a;
        CarouselFragment carouselFragment = this.b;
        switch (b) {
            case 0:
                po41 po41Var = (po41) obj;
                po41Var.getClass();
                if (po41Var.equals(po41.d)) {
                    return;
                }
                if (carouselFragment.K1) {
                    edr0 edr0Var = carouselFragment.N1;
                    if (edr0Var == null) {
                        u890.C("sessionIdProvider");
                        throw null;
                    }
                    xok0Var = new xok0(po41Var.c, edr0Var.b(of61.a));
                } else {
                    xok0Var = null;
                }
                ComposeView composeView = carouselFragment.P1;
                if (composeView != null) {
                    composeView.setContent(new j2i(-891949738, new czd(carouselFragment, po41Var, xok0Var, (byte) 3), true));
                    return;
                } else {
                    u890.C("composeView");
                    throw null;
                }
            default:
                if (((Boolean) obj).booleanValue()) {
                    carouselFragment.Y0().U(pyd.a);
                    return;
                }
                return;
        }
    }
}
