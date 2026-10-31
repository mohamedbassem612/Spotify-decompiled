package p;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class r701 extends tv30 implements iu30 {
    public final /* synthetic */ ohd a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ p811 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r701(ohd ohdVar, AtomicBoolean atomicBoolean, p811 p811Var) {
        super(1, t890.class, "onResults", "fetchEpisodeTranscripts$lambda$0$onResults(Lkotlinx/coroutines/CancellableContinuation;Ljava/util/concurrent/atomic/AtomicBoolean;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/List;)V", 0);
        this.a = ohdVar;
        this.b = atomicBoolean;
        this.c = p811Var;
    }

    public final Object invoke(Object obj) {
        AtomicBoolean atomicBoolean = this.b;
        p811 p811Var = this.c;
        dxy.v(this.a, atomicBoolean, p811Var, (List) obj);
        return rih1.a;
    }
}
