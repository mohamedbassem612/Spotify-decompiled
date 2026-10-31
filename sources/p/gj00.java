package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gj00 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ hj00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj00(hj00 hj00Var, onm onmVar) {
        super(onmVar);
        this.c = hj00Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
