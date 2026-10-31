package p;

import android.view.accessibility.CaptioningManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dtg extends CaptioningManager.CaptioningChangeListener {
    public final /* synthetic */ etg a;

    public dtg(etg etgVar) {
        this.a = etgVar;
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z) {
        etg etgVar = this.a;
        etgVar.N0 = null;
        etgVar.invalidate();
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onFontScaleChanged(float f) {
        etg etgVar = this.a;
        etgVar.N0 = null;
        etgVar.invalidate();
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onUserStyleChanged(CaptioningManager.CaptionStyle captionStyle) {
        etg etgVar = this.a;
        etgVar.N0 = null;
        etgVar.invalidate();
    }
}
