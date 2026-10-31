package p;

import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingGradientBackgroundView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class scs implements gah {
    public final /* synthetic */ tcs a;

    public scs(tcs tcsVar) {
        this.a = tcsVar;
    }

    public final void a(int i) {
        tcs tcsVar = this.a;
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = tcsVar.x1;
        if (overlayHidingGradientBackgroundView == null) {
            u890.C("modeRootView");
            throw null;
        }
        overlayHidingGradientBackgroundView.setColor(i);
        dtw dtwVar = tcsVar.D1;
        if (dtwVar != null) {
            dtwVar.f(new emk0(i));
        }
    }
}
