package p;

import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bzd extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CarouselFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bzd(CarouselFragment carouselFragment, byte b) {
        super(2);
        this.a = b;
        this.b = carouselFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        CarouselFragment carouselFragment = this.b;
        switch (b) {
            case 0:
                carouselFragment.Y0().U(new myd((String) obj, ((Number) obj2).intValue()));
                break;
            case 1:
                carouselFragment.Y0().U(new nyd(((Number) obj).intValue(), ((Number) obj2).intValue()));
                break;
            case 2:
                carouselFragment.Y0().U(new myd((String) obj, ((Number) obj2).intValue()));
                break;
            default:
                carouselFragment.Y0().U(new nyd(((Number) obj).intValue(), ((Number) obj2).intValue()));
                break;
        }
        return rih1Var;
    }
}
