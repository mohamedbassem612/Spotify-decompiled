package p;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vc21 {
    public RenderEffect a;

    public final RenderEffect a() {
        RenderEffect renderEffect = this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.a = renderEffectB;
        return renderEffectB;
    }

    public abstract RenderEffect b();
}
