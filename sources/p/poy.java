package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class poy extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ qoy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poy(qoy qoyVar, onm onmVar) {
        super(onmVar);
        this.c = qoyVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
