package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f6b extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fta b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6b(fta ftaVar, onm onmVar) {
        super(onmVar);
        this.b = ftaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.q(null, null, this);
    }
}
