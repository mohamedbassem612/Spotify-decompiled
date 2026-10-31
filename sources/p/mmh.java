package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mmh extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ nmh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmh(nmh nmhVar, onm onmVar) {
        super(onmVar);
        this.b = nmhVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f((frd1) null, this);
    }
}
