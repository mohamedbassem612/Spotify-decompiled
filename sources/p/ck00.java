package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ck00 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ dk00 c;
    public r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck00(dk00 dk00Var, onm onmVar) {
        super(onmVar);
        this.c = dk00Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
