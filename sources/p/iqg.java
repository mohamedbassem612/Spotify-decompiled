package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iqg extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ lqg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqg(lqg lqgVar, onm onmVar) {
        super(onmVar);
        this.b = lqgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.e(this);
        return d9n.a;
    }
}
