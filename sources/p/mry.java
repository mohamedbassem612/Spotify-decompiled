package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mry extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ pry b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mry(pry pryVar, onm onmVar) {
        super(onmVar);
        this.b = pryVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, null, null, null, this);
    }
}
