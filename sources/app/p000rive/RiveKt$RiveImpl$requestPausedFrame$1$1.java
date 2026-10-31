package app.p000rive;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.hdn0;
import p.rih1;
import p.tob1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RiveKt$RiveImpl$requestPausedFrame$1$1 extends hab0 implements Function0 {
    final /* synthetic */ tob1 $currentPlaying$delegate;
    final /* synthetic */ hdn0 $pausedFrameGeneration$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$RiveImpl$requestPausedFrame$1$1(tob1 tob1Var, hdn0 hdn0Var) {
        super(0);
        this.$currentPlaying$delegate = tob1Var;
        this.$pausedFrameGeneration$delegate = hdn0Var;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m75invoke() {
        if (RiveKt.RiveImpl$lambda$4(this.$currentPlaying$delegate)) {
            return;
        }
        RiveKt.RiveImpl$lambda$3(this.$pausedFrameGeneration$delegate, RiveKt.RiveImpl$lambda$2(this.$pausedFrameGeneration$delegate) + 1);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m75invoke();
        return rih1.a;
    }
}
