package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bog extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ cog c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bog(cog cogVar, onm onmVar) {
        super(onmVar);
        this.c = cogVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
