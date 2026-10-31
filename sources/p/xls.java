package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xls extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ams b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xls(ams amsVar, onm onmVar) {
        super(onmVar);
        this.b = amsVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, null, this);
    }
}
