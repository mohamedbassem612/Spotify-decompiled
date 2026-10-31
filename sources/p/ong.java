package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ong extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ qng b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ong(qng qngVar, onm onmVar) {
        super(onmVar);
        this.b = qngVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, this);
    }
}
