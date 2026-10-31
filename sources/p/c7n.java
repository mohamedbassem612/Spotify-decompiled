package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c7n extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ d7n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7n(d7n d7nVar, lnm lnmVar) {
        super(lnmVar);
        this.c = d7nVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
