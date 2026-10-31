package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kkv0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ mkv0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkv0(mkv0 mkv0Var, onm onmVar) {
        super(onmVar);
        this.c = mkv0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
