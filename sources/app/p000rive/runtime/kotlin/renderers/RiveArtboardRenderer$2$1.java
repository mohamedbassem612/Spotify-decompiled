package app.p000rive.runtime.kotlin.renderers;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.lyc;
import p.rih1;
import p.tv30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class RiveArtboardRenderer$2$1 extends tv30 implements Function0 {
    public RiveArtboardRenderer$2$1(Object obj) {
        super(0, obj, RiveArtboardRenderer.class, "start", "start()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m577invoke() {
        ((RiveArtboardRenderer) ((lyc) this).receiver).start();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m577invoke();
        return rih1.a;
    }
}
