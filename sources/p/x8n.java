package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x8n extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ y8n b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8n(y8n y8nVar, onm onmVar) {
        super(onmVar);
        this.b = y8nVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.o(this);
        return rih1.a;
    }
}
