package app.p000rive;

import kotlin.Metadata;
import p.iu30;
import p.lyc;
import p.rih1;
import p.tv30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class RiveCanvasSession$semanticsModeController$1 extends tv30 implements iu30 {
    public RiveCanvasSession$semanticsModeController$1(Object obj) {
        super(1, obj, RiveCanvasSession.class, "setSemanticsEnabled", "setSemanticsEnabled(Z)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return rih1.a;
    }

    public final void invoke(boolean z) {
        ((RiveCanvasSession) ((lyc) this).receiver).setSemanticsEnabled(z);
    }
}
