package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ufb extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ yfb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufb(yfb yfbVar, onm onmVar) {
        super(onmVar);
        this.b = yfbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(this);
    }
}
