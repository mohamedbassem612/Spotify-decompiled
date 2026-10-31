package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lze extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ mze c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lze(mze mzeVar, onm onmVar) {
        super(onmVar);
        this.c = mzeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
