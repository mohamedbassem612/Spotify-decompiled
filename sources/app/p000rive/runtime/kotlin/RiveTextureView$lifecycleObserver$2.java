package app.p000rive.runtime.kotlin;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.hac0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/hac0;", "invoke", "()Lp/hac0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RiveTextureView$lifecycleObserver$2 extends hab0 implements Function0 {
    final /* synthetic */ RiveTextureView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextureView$lifecycleObserver$2(RiveTextureView riveTextureView) {
        super(0);
        this.this$0 = riveTextureView;
    }

    public final hac0 invoke() {
        return this.this$0.createObserver();
    }
}
