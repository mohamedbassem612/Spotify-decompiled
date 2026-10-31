package app.p000rive;

import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lapp/rive/RiveTextureView;", "textureView", "Lp/rih1;", "invoke", "(Lapp/rive/RiveTextureView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RiveKt$RiveSurfaceHost$3$2 extends hab0 implements iu30 {
    final /* synthetic */ RiveFrameRate $frameRate;
    final /* synthetic */ boolean $isSettled;
    final /* synthetic */ boolean $playing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$RiveSurfaceHost$3$2(RiveFrameRate riveFrameRate, boolean z, boolean z2) {
        super(1);
        this.$frameRate = riveFrameRate;
        this.$playing = z;
        this.$isSettled = z2;
    }

    public final void invoke(RiveTextureView riveTextureView) {
        View.applyRequestedFrameRateHint(riveTextureView, this.$frameRate, this.$playing && !this.$isSettled);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RiveTextureView) obj);
        return rih1.a;
    }
}
