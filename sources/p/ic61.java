package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ic61 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ res b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic61(res resVar, onm onmVar) {
        super(onmVar);
        this.b = resVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.t(null, null, this);
    }
}
