package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gkw extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jkw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkw(jkw jkwVar, onm onmVar) {
        super(onmVar);
        this.c = jkwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
