package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ioe extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ joe b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioe(joe joeVar, onm onmVar) {
        super(onmVar);
        this.b = joeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((String) null, this);
    }
}
