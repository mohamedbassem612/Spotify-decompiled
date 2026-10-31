package app.p000rive.core;

import android.view.Choreographer;
import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lp/rih1;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$1 extends hab0 implements iu30 {
    final /* synthetic */ Choreographer $choreographer;
    final /* synthetic */ Choreographer.FrameCallback $onFrameCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$1(Choreographer choreographer, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.$choreographer = choreographer;
        this.$onFrameCallback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return rih1.a;
    }

    public final void invoke(Throwable th) {
        this.$choreographer.removeFrameCallback(this.$onFrameCallback);
    }
}
