package p;

import app.p000rive.runtime.kotlin.renderers.Renderer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class kd21 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Renderer b;

    public /* synthetic */ kd21(Renderer renderer, byte b) {
        this.a = b;
        this.b = renderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Renderer renderer = this.b;
        switch (b) {
            case 0:
                Renderer.removeFrameCallback$lambda$6(renderer);
                break;
            default:
                Renderer.scheduleFrame$lambda$5(renderer);
                break;
        }
    }
}
