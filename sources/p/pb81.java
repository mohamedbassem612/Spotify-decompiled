package p;

import com.spotify.pam.showvalue.CarouselAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class pb81 {
    public static eb81 a(CarouselAction carouselAction) {
        return new eb81(carouselAction.getTitle(), carouselAction.p() ? carouselAction.o() : null, carouselAction.getUri());
    }
}
