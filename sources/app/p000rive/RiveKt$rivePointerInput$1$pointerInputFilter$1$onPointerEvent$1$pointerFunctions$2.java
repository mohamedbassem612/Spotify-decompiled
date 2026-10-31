package app.p000rive;

import app.p000rive.core.CommandQueue;
import app.p000rive.core.StateMachineHandle;
import kotlin.Metadata;
import p.ev30;
import p.lyc;
import p.rih1;
import p.tv30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$2 extends tv30 implements ev30 {
    public RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$2(Object obj) {
        super(7, obj, CommandQueue.class, "pointerUp", "pointerUp-iHGrxBs(JLapp/rive/Fit;FFIFF)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        m87invokeiHGrxBs(((StateMachineHandle) obj).m440unboximpl(), (Fit) obj2, ((Number) obj3).floatValue(), ((Number) obj4).floatValue(), ((Number) obj5).intValue(), ((Number) obj6).floatValue(), ((Number) obj7).floatValue());
        return rih1.a;
    }

    /* JADX INFO: renamed from: invoke-iHGrxBs, reason: not valid java name */
    public final void m87invokeiHGrxBs(long j, Fit fit, float f, float f2, int i, float f3, float f4) {
        ((CommandQueue) ((lyc) this).receiver).m264pointerUpiHGrxBs(j, fit, f, f2, i, f3, f4);
    }
}
