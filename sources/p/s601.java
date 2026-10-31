package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s601 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ t601 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s601(t601 t601Var, onm onmVar) {
        super(onmVar);
        this.b = t601Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
