package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class x241 extends tv30 implements iu30 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ o8n b;
    public final /* synthetic */ Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x241(AtomicReference atomicReference, o8n o8nVar, Runnable runnable) {
        super(1, t890.class, "task", "scheduleTask$task(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = atomicReference;
        this.b = o8nVar;
        this.c = runnable;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        o8n o8nVar = this.b;
        Runnable runnable = this.c;
        return w0h1.G(this.a, o8nVar, runnable, (lnm) obj);
    }
}
