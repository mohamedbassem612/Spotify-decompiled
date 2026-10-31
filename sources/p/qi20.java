package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qi20 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ si20 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi20(si20 si20Var, onm onmVar) {
        super(onmVar);
        this.b = si20Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
