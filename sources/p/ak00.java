package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ak00 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bk00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak00(bk00 bk00Var, onm onmVar) {
        super(onmVar);
        this.c = bk00Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
