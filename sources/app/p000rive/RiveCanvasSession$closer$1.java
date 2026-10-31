package app.p000rive;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RiveCanvasSession$closer$1 extends hab0 implements Function0 {
    final /* synthetic */ RiveCanvasSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession$closer$1(RiveCanvasSession riveCanvasSession) {
        super(0);
        this.this$0 = riveCanvasSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m42invoke() {
        rih1 rih1Var = rih1.a;
        try {
            this.this$0.semanticsModeController.close();
            if (this.this$0.semanticsEnabled) {
                this.this$0.stateMachine.clearSemanticFocusForLifecycleCleanup$kotlin_release();
            }
        } finally {
            this.this$0.closeSignal.m0(rih1Var);
            this.this$0.renderBufferState.l((Object) null);
            HardwareRenderBuffer hardwareRenderBuffer = this.this$0.renderBuffer;
            this.this$0.renderBuffer = null;
            if (hardwareRenderBuffer != null) {
                hardwareRenderBuffer.close();
            }
            this.this$0.latestBitmap = null;
            this.this$0.renderRegion.setEmpty();
            this.this$0.isPlaying = false;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m42invoke();
        return rih1.a;
    }
}
