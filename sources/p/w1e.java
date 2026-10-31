package p;

import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w1e extends v9 {
    public final oxd c;
    public final Scheduler d;
    public final Scheduler e;

    public w1e(oxd oxdVar, Scheduler scheduler, Scheduler scheduler2, CarouselFragment carouselFragment) {
        super(carouselFragment);
        this.c = oxdVar;
        this.d = scheduler;
        this.e = scheduler2;
    }

    public final xbk1 e(fe41 fe41Var) {
        return new r1e(new v1e(this), fe41Var);
    }
}
