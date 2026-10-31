package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q1r extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ s1r b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1r(s1r s1rVar, onm onmVar) {
        super(onmVar);
        this.b = s1rVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
