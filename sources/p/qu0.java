package p;

import com.spotify.nowplayingmodes.adsmode.ui.overlay.AdsOverlayControlsLayout;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qu0 {
    public final Scheduler a;
    public final Scheduler b;
    public final Observable c;
    public AdsOverlayControlsLayout e;
    public uu0 f;
    public final vku d = new vku();
    public nwq0 g = nwq0.c;
    public final pu0 h = new pu0(this);

    public qu0(Scheduler scheduler, Scheduler scheduler2, Observable observable) {
        this.a = scheduler;
        this.b = scheduler2;
        this.c = observable;
    }
}
