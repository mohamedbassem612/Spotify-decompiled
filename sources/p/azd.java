package p;

import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class azd extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CarouselFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ azd(CarouselFragment carouselFragment, byte b) {
        super(0);
        this.a = b;
        this.b = carouselFragment;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oyd oydVar = oyd.a;
        CarouselFragment carouselFragment = this.b;
        switch (b) {
            case 0:
                carouselFragment.Y0().U(oydVar);
                return rih1Var;
            case 1:
                carouselFragment.Y0().U(oydVar);
                return rih1Var;
            default:
                w1e w1eVar = carouselFragment.J1;
                if (w1eVar != null) {
                    return w1eVar;
                }
                u890.C("viewModelFactory");
                throw null;
        }
    }
}
