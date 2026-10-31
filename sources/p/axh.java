package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class axh extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bxh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axh(bxh bxhVar, onm onmVar) {
        super(onmVar);
        this.b = bxhVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d((String) null, this);
    }
}
