package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w2r extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jmq c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2r(jmq jmqVar, onm onmVar) {
        super(onmVar);
        this.c = jmqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(false, this);
    }
}
