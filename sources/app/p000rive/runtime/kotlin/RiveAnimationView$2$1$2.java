package app.p000rive.runtime.kotlin;

import app.p000rive.runtime.kotlin.core.File;
import app.p000rive.runtime.kotlin.core.errors.StateMachineException;
import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lapp/rive/runtime/kotlin/core/File;", "it", "Lp/rih1;", "invoke", "(Lapp/rive/runtime/kotlin/core/File;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RiveAnimationView$2$1$2 extends hab0 implements iu30 {
    final /* synthetic */ RiveAnimationView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveAnimationView$2$1$2(RiveAnimationView riveAnimationView) {
        super(1);
        this.this$0 = riveAnimationView;
    }

    public final void invoke(File file) throws StateMachineException {
        this.this$0.getController().setFile(file);
        this.this$0.getController().setupScene$kotlin_release(this.this$0.getRendererAttributes());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws StateMachineException {
        invoke((File) obj);
        return rih1.a;
    }
}
