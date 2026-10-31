package app.p000rive.runtime.kotlin.renderers;

import android.os.Trace;
import app.p000rive.runtime.kotlin.core.StateMachineInstance;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RiveArtboardRenderer$resizeArtboard$applyLayout$1 extends hab0 implements Function0 {
    final /* synthetic */ RiveArtboardRenderer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveArtboardRenderer$resizeArtboard$applyLayout$1(RiveArtboardRenderer riveArtboardRenderer) {
        super(0);
        this.this$0 = riveArtboardRenderer;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m579invoke() {
        RiveArtboardRenderer riveArtboardRenderer = this.this$0;
        Trace.beginSection("Rive/Layout/AdvanceStateMachines");
        try {
            Iterator<T> it = riveArtboardRenderer.controller.getStateMachines().iterator();
            while (it.hasNext()) {
                riveArtboardRenderer.controller.resolveStateMachineAdvance$kotlin_release((StateMachineInstance) it.next(), 0.0f);
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m579invoke();
        return rih1.a;
    }
}
